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

import net.matez.wildnature.common.log.WNLogger;
import net.matez.wildnature.common.objects.blocks.grass.GrassType;
import net.matez.wildnature.common.objects.blocks.grass.OvergrownGrassType;
import net.matez.wildnature.common.objects.blocks.rocks.RockType;
import net.matez.wildnature.common.objects.blocks.water_plants.WaterPlant;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import static net.minecraft.world.level.levelgen.SurfaceRules.*;

public class WNSurfaceConstructor {
    private static final WNLogger log = WildNature.getLogger();

    private static final SurfaceRules.RuleSource AIR = makeStateRule(Blocks.AIR);

    private static final SurfaceRules.RuleSource POND_WEED = makeStateRule(WNBlocks.WATER_PLANTS.get(WaterPlant.POND_WEED));
    private static final SurfaceRules.RuleSource WATER = makeStateRule(Blocks.WATER);
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource STONE = makeStateRule(Blocks.STONE);
    private static final SurfaceRules.RuleSource LIMESTONE = makeStateRule(WNBlocks.ROCKS.get(RockType.LIMESTONE));
    private static final SurfaceRules.RuleSource OVERGROWN_STONE = makeStateRule(WNBlocks.OVERGROWN_STONES.get(OvergrownGrassType.OVERGROWN_STONE));
    private static final SurfaceRules.RuleSource MOSSY_STONE = makeStateRule(WNBlocks.MOSSY_STONE);
    private static final SurfaceRules.RuleSource MOSS = makeStateRule(Blocks.MOSS_BLOCK);
    private static final SurfaceRules.RuleSource BARREN_DIRT = makeStateRule(WNBlocks.DIRTS.get(GrassType.BARREN));
    private static final SurfaceRules.RuleSource TROPICAL_GRASS = makeStateRule(WNBlocks.GRASSES.get(GrassType.TROPICAL));
    private static final SurfaceRules.RuleSource TROPICAL_DIRT = makeStateRule(WNBlocks.DIRTS.get(GrassType.TROPICAL));
    private static final SurfaceRules.RuleSource MUD = makeStateRule(WNBlocks.MUD);

    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isUnderWater = SurfaceRules.waterBlockCheck(-1, 0);

        var biomesSequence = new ArrayList<RuleSource>();

        log.progress("Registering surface rules");
        AtomicInteger reg = new AtomicInteger();

        // loop over all the biomes and get their surface settings
        WNBiomeRegistry.WN_BIOMES.forEach((key, biome) -> {
            var surface = biome.getSurface();
            if (surface != null) {
                biomesSequence.add(surface);
                reg.getAndIncrement();
            }
        });

        log.success("Registered surface rules for " + reg.get() + " biomes");

        // Default to a grass and dirt surface
        biomesSequence.add(SurfaceRules.ifTrue(isUnderWater, SurfaceRules.sequence(
                SurfaceRules.ifTrue(ON_FLOOR, GRASS_BLOCK), SurfaceRules.ifTrue(UNDER_FLOOR, DIRT)
        )));
        biomesSequence.add(STONE);

        return SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(), SurfaceRules.sequence(
                biomesSequence.toArray(new RuleSource[0]))
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
