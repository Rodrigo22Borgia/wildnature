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

import static net.minecraft.world.level.levelgen.SurfaceRules.*;

public class WNSurface {
    public static final SurfaceRules.RuleSource BROWN_PODZOL =
            SurfaceRules.ifTrue(ON_FLOOR,
                    makeStateRule(WNBlocks.PODZOLS.get(GrassType.BARREN)));

    public static final SurfaceRules.RuleSource OVERGROWN_STONE =
            SurfaceRules.ifTrue(ON_FLOOR,
                    makeStateRule(WNBlocks.OVERGROWN_STONES.get(OvergrownGrassType.OVERGROWN_STONE)));

    public static final SurfaceRules.RuleSource BROWN_GRASS_BLOCK =
            SurfaceRules.ifTrue(UNDER_FLOOR,
                    makeStateRule(WNBlocks.MOSSY_STONE));
    public static final SurfaceRules.RuleSource GRANITE_COBBLE_MOSSY =
            SurfaceRules.ifTrue(UNDER_FLOOR,
                    makeStateRule(Blocks.GRANITE));
    public static final SurfaceRules.RuleSource SAND_CONFIG =
            SurfaceRules.sequence(
                    SurfaceRules.ifTrue(UNDER_FLOOR,
                            makeStateRule(Blocks.SAND)),
                    SurfaceRules.ifTrue(DEEP_UNDER_FLOOR,
                            makeStateRule(Blocks.SANDSTONE))
            );
    public static final SurfaceRules.RuleSource STONE_STONE_GRAVEL_CONFIG =
            SurfaceRules.ifTrue(ON_FLOOR,
                    SurfaceRules.sequence(
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.5D, 1.0D),
                                    makeStateRule(Blocks.ANDESITE)),
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, -1.0D, -0.5D),
                                    makeStateRule(Blocks.GRAVEL)),
                            makeStateRule(WNBlocks.OVERGROWN_STONES.get(OvergrownGrassType.OVERGROWN_STONE))));

    public static final SurfaceRules.RuleSource SAND_SAND_GRAVEL_CONFIG =
            SurfaceRules.sequence(
                    SurfaceRules.ifTrue(ON_FLOOR,
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, -1.0D, -0.5D),
                                    makeStateRule(Blocks.GRAVEL))),
                    SurfaceRules.ifTrue(UNDER_FLOOR,makeStateRule(Blocks.SAND)));
    public static final SurfaceRules.RuleSource RED_SAND_WHITE_TERRACOTTA_GRAVEL_CONFIG =
            SurfaceRules.ifTrue(ON_FLOOR,
                    SurfaceRules.sequence(
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.5D, 1.0D),
                                    makeStateRule(Blocks.WHITE_TERRACOTTA)),
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, -1.0D, -0.5D),
                                    makeStateRule(Blocks.GRAVEL)),
                            makeStateRule(Blocks.RED_SAND)));
    public static final SurfaceRules.RuleSource BADLANDS =
            SurfaceRules.ifTrue(UNDER_FLOOR,
                    makeStateRule(WNBlocks.DIRTS.get(GrassType.BARREN)));
    public static final SurfaceRules.RuleSource SWAMP =
            SurfaceRules.ifTrue(ON_FLOOR,makeStateRule(WNBlocks.DIRTS.get(GrassType.BARREN)));

    public static final SurfaceRules.RuleSource PODZOL =
                    SurfaceRules.ifTrue(ON_FLOOR,
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.35D, 0.9D),
                                    makeStateRule(Blocks.PODZOL)));
    public static final SurfaceRules.RuleSource PODZOL_DIRT_GRAVEL_CONFIG =
            SurfaceRules.ifTrue(ON_FLOOR,
                    SurfaceRules.sequence(
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.0D, 0.5D),
                                    makeStateRule(Blocks.PODZOL)),
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.5D, 1.0D),
                                    makeStateRule(Blocks.COARSE_DIRT)),
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, -1.0D, -0.5D),
                                    makeStateRule(Blocks.GRAVEL))));
    public static final SurfaceRules.RuleSource GRASS_DIRT_GRAVEL_CONFIG =
            SurfaceRules.ifTrue(ON_FLOOR,
                    SurfaceRules.sequence(
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, 0.5D, 1.0D),
                                    makeStateRule(Blocks.COARSE_DIRT)),
                            SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.SWAMP, -1.0D, -0.5D),
                                    makeStateRule(Blocks.GRAVEL))));


    // --------------------------
    private static final SurfaceRules.ConditionSource IS_UNDER_WATER = SurfaceRules.waterBlockCheck(-1, 0);

    // --------------------------
    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
