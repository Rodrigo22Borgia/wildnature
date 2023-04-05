package net.matez.wildnature.common.objects.gen.wn_features;

import net.matez.wildnature.common.objects.blocks.wood.LogType;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.ProcessorLists;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FossilFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;
public class ModConfiguredFeatures {
    //Generates diamond trees
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> DIA_TREE =
            FeatureUtils.register("ebony", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(Blocks.DIAMOND_BLOCK),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.simple(WNBlocks.STRIPPED_LOGS.get(LogType.CHERRY)),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> DIA_CHECKED = PlacementUtils.register("ebony_checked", DIA_TREE,
            PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> DIA_SPAWN =
            FeatureUtils.register("ebony_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(DIA_CHECKED,
                            0.5F)), DIA_CHECKED));

    //Generates a patch of saplings
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> SAPLING_PATCH =
            FeatureUtils.register("flower_swamp", Feature.FLOWER,
                    new RandomPatchConfiguration(64, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.SPRUCE_SAPLING)))));

    //Generates an nbt tree through fossil methods - places downwards on origin

    public static final Holder<ConfiguredFeature<FossilFeatureConfiguration, ?>> NBT_TREE =
            FeatureUtils.register("fossil_coal", Feature.FOSSIL,
                    new FossilFeatureConfiguration(List.of(new ResourceLocation("tectonic","aspen")),List.of(new ResourceLocation("tectonic","aspen")),
                            ProcessorLists.EMPTY, ProcessorLists.EMPTY, 4));

    //Generates a cherry tree from forge registration of the feature
    public static final Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CHERRY_TREE =
            FeatureUtils.register("cherry_tree", FeatureRegistry.FEATURE_TREE.get());
}
