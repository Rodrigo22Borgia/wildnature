package net.matez.wildnature.common.objects.features;

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

public class WNCombinedFeature {
    //Tests biome of the triggering event and places selected tree on match
    public static void generateTrees(final BiomeLoadingEvent event, final WNTreeConfig WNTreeConfig) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if (Arrays.stream(WNTreeConfig.getBiome()).anyMatch(key::equals)) {
            List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            RegistryObject<Feature<NoneFeatureConfiguration>> treeFeature = FeatureRegistry.TREE_FEATURES.get(WNTreeConfig);

            base.add(PlacementUtils.register(WNTreeConfig.toString().toLowerCase() + "_placed",
                    FeatureUtils.register(WNTreeConfig.toString().toLowerCase() + "_tree", treeFeature.get()),
                    VegetationPlacements.treePlacement(PlacementUtils.countExtra(WNTreeConfig.getPerChunk(), WNTreeConfig.getExtraChance(), WNTreeConfig.getExtra()))));
        }
    }
}