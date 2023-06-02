package net.matez.wildnature.common.objects.features;

import net.matez.wildnature.common.objects.blocks.plant.BushType;
import net.matez.wildnature.common.objects.blocks.rocks.RockType;
import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
import net.matez.wildnature.common.objects.blocks.setup.WNBlock;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class WNCombinedFeature {

    //Methods for each placed feature
    public static void generateTrees(final BiomeLoadingEvent event, final WNSaplingType tree) {
        List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
        base.add(TREE_PLACED.get(tree));

    }

    public static void generateFlowers(final BiomeLoadingEvent event, BushType flower) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);
        base.add(FLOWER_PLACED.get(flower));

    }

    //Placed features from all values in WNSaplingType & BushType
    public static final Map<WNSaplingType, Holder<PlacedFeature>> TREE_PLACED = new EnumMap<>(WNSaplingType.class);
    public static final Map<BushType, Holder<PlacedFeature>> FLOWER_PLACED = new EnumMap<>(BushType.class);

    static {
    WildNature.getLogger().progress("Registering features");

    for (WNSaplingType treeType : WNSaplingType.values()) {
        TREE_PLACED.put(treeType, PlacementUtils.register(treeType.toString().toLowerCase() + "_placed",
                FeatureUtils.register(treeType.toString().toLowerCase() + "_tree", FeatureRegistry.TREE_FEATURES.get(treeType).get()),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(treeType.getPerChunk(), treeType.getExtraChance(), treeType.getExtra()))));
        }
    for (BushType flower : BushType.values()) {
        FLOWER_PLACED.put(flower, PlacementUtils.register(flower.toString().toLowerCase()+"_placed",
                FeatureUtils.register(flower.toString().toLowerCase()+"_flower",
                        Feature.FLOWER, new RandomPatchConfiguration(flower.getTries(), flower.getXZ(), flower.getY(), PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                new SimpleBlockConfiguration(BlockStateProvider.simple(WNBlocks.BUSHES.get(flower)))))), InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        }
    WildNature.getLogger().success("Registered " + (TREE_PLACED.size()+FLOWER_PLACED.size()) + " features");
    }
}