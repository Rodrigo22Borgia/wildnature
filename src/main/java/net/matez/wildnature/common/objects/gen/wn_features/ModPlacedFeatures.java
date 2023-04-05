package net.matez.wildnature.common.objects.gen.wn_features;

import net.matez.wildnature.common.objects.initializer.InitStage;
import net.matez.wildnature.common.objects.initializer.Initialize;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
//Diamond tree
    public static final Holder<PlacedFeature> DIA_PLACED = PlacementUtils.register("ebony_placed",
            ModConfiguredFeatures.DIA_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));
//Sapling patch
    public static final Holder<PlacedFeature> SAPLING_PATCH =
            PlacementUtils.register("sapling_patch", ModConfiguredFeatures.SAPLING_PATCH, InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());

//The fossil structure tree
    public static final Holder<PlacedFeature> NBT_TREE =
            PlacementUtils.register("tree_patch", ModConfiguredFeatures.NBT_TREE, InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
//WNFeature cherry
    public static final Holder<PlacedFeature> CHERRY_PLACED = PlacementUtils.register("ebony_placed",
            ModConfiguredFeatures.CHERRY_TREE, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)));
   }
