package net.matez.wildnature.common.objects.surface;

import net.matez.wildnature.common.objects.blocks.grass.GrassType;
import net.matez.wildnature.common.objects.blocks.grass.OvergrownGrassType;
import net.matez.wildnature.common.objects.blocks.rocks.RockType;
import net.matez.wildnature.common.objects.blocks.water_plants.WaterPlant;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;

import static net.minecraft.world.level.levelgen.SurfaceRules.ON_FLOOR;

public class WNSurface {
    public static final SurfaceRules.RuleSource PODZOL =
            SurfaceRules.sequence(
                    SurfaceRules.ifTrue(ON_FLOOR,
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.35D, 0.9D),
                                    makeStateRule(Blocks.PODZOL))),
                    SurfaceRules.ifTrue(ON_FLOOR,
                            makeStateRule(Blocks.GRASS_BLOCK)));
    private static final SurfaceRules.RuleSource OVERGROWN_STONE = makeStateRule(WNBlocks.OVERGROWN_STONES.get(OvergrownGrassType.OVERGROWN_STONE));
    private static final SurfaceRules.RuleSource MOSS = makeStateRule(Blocks.MOSS_BLOCK);
    public static final SurfaceRules.RuleSource SURFACE_MOSSY =
            SurfaceRules.sequence(
                    SurfaceRules.ifTrue(ON_FLOOR,
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.35D, 0.9D),
                                    OVERGROWN_STONE)),
                    SurfaceRules.ifTrue(ON_FLOOR,
                            MOSS));


    // --------------------------
    private static final SurfaceRules.ConditionSource IS_UNDER_WATER = SurfaceRules.waterBlockCheck(-1, 0);

    // --------------------------
    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
