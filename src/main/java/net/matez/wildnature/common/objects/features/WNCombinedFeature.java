package net.matez.wildnature.common.objects.features;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class WNCombinedFeature {
    public static void generateTrees(final BiomeLoadingEvent event, final WNTreeEnum WNTreeEnum) {
            List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            RegistryObject<Feature<NoneFeatureConfiguration>> treeFeature = FeatureRegistry.TREE_FEATURES.get(WNTreeEnum);

            base.add(PlacementUtils.register(WNTreeEnum.toString().toLowerCase() + "_placed",
                    FeatureUtils.register(WNTreeEnum.toString().toLowerCase() + "_tree", treeFeature.get()),
                    VegetationPlacements.treePlacement(PlacementUtils.countExtra(WNTreeEnum.getPerChunk(), WNTreeEnum.getExtraChance(), WNTreeEnum.getExtra()))));

    }
}