package net.matez.wildnature.common.objects.gen.wn_features;

import java.util.Arrays;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Set;

public class WN_CombinedFeature {
    public static void generateTrees(final BiomeLoadingEvent event, final Trees Trees) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (Arrays.stream(Trees.getBiome()).anyMatch(key::equals)) {
            List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            RegistryObject<Feature<NoneFeatureConfiguration>> treeFeature = FeatureRegistry.TREE_FEATURES.get(Trees);

            base.add(PlacementUtils.register(Trees.toString().toLowerCase() + "_placed",
                    FeatureUtils.register(Trees.toString().toLowerCase() + "_tree", treeFeature.get()),
                    VegetationPlacements.treePlacement(PlacementUtils.countExtra(Trees.getPerChunk(), Trees.getExtraChance(), Trees.getExtra()))));
        }
    }

    /** public static void generateTrees(final BiomeLoadingEvent event, final Trees Trees) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(Trees.getBiome())) {
            List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            RegistryObject<Feature<NoneFeatureConfiguration>> treeFeature = FeatureRegistry.TREE_FEATURES.get(Trees);

            base.add(PlacementUtils.register(Trees.toString().toLowerCase() + "_placed",
                    FeatureUtils.register(Trees.toString().toLowerCase() + "_tree", treeFeature.get()),
                    VegetationPlacements.treePlacement(PlacementUtils.countExtra(Trees.getPerChunk(), Trees.getExtraChance(), Trees.getExtra()))));
        }
    } **/


    /**public static void generateCherry(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(Trees.CHERRY.getBiome())) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(PlacementUtils.register("cherry_placed",
                    FeatureUtils.register("cherry_tree",
                            FeatureRegistry.TREE_FEATURES.get(Trees.CHERRY).get()), VegetationPlacements.treePlacement(
                            PlacementUtils.countExtra(3, 0.1f, 2))));
        }
    }
    public static void generateBaobab(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(Trees.ASPEN.getBiome())) {
                        List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(PlacementUtils.register("aspen_placed",
                    FeatureUtils.register("aspen_tree",
                            FeatureRegistry.TREE_FEATURES.get(Trees.ASPEN).get()), VegetationPlacements.treePlacement(
                            PlacementUtils.countExtra(3, 0.1f, 2))));
        }
    }
    public static void generateFir(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (types.contains(Trees.FIR.getBiome())) {
            List<Holder<PlacedFeature>> base =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base.add(PlacementUtils.register("fir_placed",
                    FeatureUtils.register("fir_tree",
                            FeatureRegistry.TREE_FEATURES.get(Trees.FIR).get()), VegetationPlacements.treePlacement(
                            PlacementUtils.countExtra(Trees.FIR.getPerChunk(), Trees.FIR.getExtraChance(), Trees.FIR.getExtra()))));
        }
    }**/
}