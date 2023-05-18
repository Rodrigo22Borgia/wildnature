/**
 * Copyright (C) Glitchfiend
 * <p>
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package net.matez.wildnature.common.registry.biomes;

import net.matez.wildnature.common.objects.blocks.grass.GrassType;
import net.matez.wildnature.common.objects.blocks.grass.OvergrownGrassType;
import net.matez.wildnature.common.objects.blocks.rocks.RockType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.matez.wildnature.common.registry.blocks.WNBlocks;

import static net.minecraft.world.level.levelgen.SurfaceRules.*;

public class TestSurfaceRuleData
{
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource STONE = makeStateRule(Blocks.STONE);
    private static final SurfaceRules.RuleSource LIMESTONE = makeStateRule(WNBlocks.ROCKS.get(RockType.LIMESTONE));
    private static final SurfaceRules.RuleSource OVERGROWN_STONE = makeStateRule(WNBlocks.OVERGROWN_STONES.get(OvergrownGrassType.OVERGROWN_STONE));
    private static final SurfaceRules.RuleSource MOSSY_STONE = makeStateRule(WNBlocks.MOSSY_STONE);

    private static final SurfaceRules.RuleSource TROPICAL_GRASS = makeStateRule(WNBlocks.GRASSES.get(GrassType.TROPICAL));
    private static final SurfaceRules.RuleSource TROPICAL_DIRT = makeStateRule(WNBlocks.DIRTS.get(GrassType.TROPICAL));

    public static SurfaceRules.RuleSource makeRules()
    {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);
        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);
        SurfaceRules.RuleSource overgrown = SurfaceRules.sequence(SurfaceRules.ifTrue(ON_FLOOR, OVERGROWN_STONE), STONE);

        return SurfaceRules.sequence(
            SurfaceRules.ifTrue(SurfaceRules.isBiome(WNBiomes.HOT_RED), SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),SurfaceRules.sequence(
                    SurfaceRules.ifTrue(ON_FLOOR,TROPICAL_GRASS),SurfaceRules.ifTrue(UNDER_FLOOR,TROPICAL_DIRT),SurfaceRules.ifTrue(DEEP_UNDER_FLOOR,LIMESTONE)
            ))),
            SurfaceRules.ifTrue(SurfaceRules.isBiome(WNBiomes.COLD_BLUE), SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),SurfaceRules.sequence(
                    SurfaceRules.ifTrue(ON_FLOOR,SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.POWDER_SNOW, 0.35D, 0.6D),OVERGROWN_STONE)), SurfaceRules.ifTrue(ON_FLOOR,MOSSY_STONE)
            ))),

            // Default to a grass and dirt surface
            SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),SurfaceRules.sequence(
                SurfaceRules.ifTrue(ON_FLOOR,GRASS_BLOCK),SurfaceRules.ifTrue(UNDER_FLOOR,DIRT)
                )), STONE
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
