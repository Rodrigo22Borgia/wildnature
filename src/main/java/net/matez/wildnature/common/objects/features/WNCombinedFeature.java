package net.matez.wildnature.common.objects.features;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class WNCombinedFeature {
    public static void generateTrees(final BiomeLoadingEvent event, final WNTreeEnum tree) {
            List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            RegistryObject<Feature<NoneFeatureConfiguration>> treeFeature = FeatureRegistry.TREE_FEATURES.get(tree);

            base.add(PlacementUtils.register(tree.toString().toLowerCase() + "_placed",
                    FeatureUtils.register(tree.toString().toLowerCase() + "_tree", treeFeature.get()),
                    VegetationPlacements.treePlacement(PlacementUtils.countExtra(tree.getPerChunk(), tree.getExtraChance(), tree.getExtra()))));

    }

    public static void generateFlowers(final BiomeLoadingEvent event, WNFlowerEnum flower) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(PlacementUtils.register(flower.toString().toLowerCase()+"_flower_p",
                    FeatureUtils.register(flower.toString().toLowerCase()+"_flower",
                            Feature.FLOWER, new RandomPatchConfiguration(flower.getTries(), flower.getXZ(), flower.getY(), PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(flower.getState()))))), InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

    }

    /*public static void generateFlowers(final BiomeLoadingEvent event, final WNFlowerEnum flower) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

        RegistryObject<Feature<NoneFeatureConfiguration>> flowerFeature = FeatureRegistry.FLOWER_FEATURES.get(flower);

        base.add(PlacementUtils.register(flower.toString().toLowerCase() + "_placed",
                FeatureUtils.register(flower.toString().toLowerCase() + "_flower", flowerFeature.get()),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.4F, 2))));

    }*/
}