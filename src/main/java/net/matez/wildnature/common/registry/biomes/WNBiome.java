package net.matez.wildnature.common.registry.biomes;

import net.matez.wildnature.common.objects.blocks.leaves.LeafType;
import net.matez.wildnature.common.objects.blocks.plant.PlantFeature;
import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
import net.matez.wildnature.common.objects.blocks.wood.LogType;
import net.matez.wildnature.common.objects.features.WNExtraTrees;
import net.matez.wildnature.common.objects.features.WNFallenTrees;
import net.matez.wildnature.common.objects.features.WNStructureRegistry;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.Music;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.AzaleaBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BushFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import javax.annotation.Nullable;

public abstract class WNBiome {
    // KEEP HERE SHARED VARIABLES FOR BIOMES
    @Nullable
    protected static final Music NORMAL_MUSIC = null;
    private ResourceKey<Biome> resourceKey;
    private Biome biome;
    // ---

    public WNBiome(ResourceKey<Biome> resourceKey, Biome.Precipitation precipitation, Biome.BiomeCategory category, float temperature, float downfall, @Nullable Music music) {
        this.resourceKey = resourceKey;
        this.biome = WNBiomeBuilder.makeBiome(precipitation, category, temperature, downfall, buildMobSpawn(), buildBiome(), music);
        this.biome.setRegistryName(resourceKey.location());
    }

    public WNBiome(ResourceKey<Biome> resourceKey, Biome.Precipitation precipitation, Biome.BiomeCategory category, float temperature, float downfall, @Nullable Music music, int... colors) {
        this.resourceKey = resourceKey;
        this.biome = WNBiomeBuilder.makeBiome(precipitation, category, temperature, downfall, buildMobSpawn(), buildBiome(), music, colors);
        this.biome.setRegistryName(resourceKey.location());
    }

    // ------------------------------------
    // KEEP HERE SHARED FUNCTIONS FOR BIOMES
    protected static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }

    public abstract MobSpawnSettings.Builder buildMobSpawn();

    public abstract BiomeGenerationSettings.Builder buildBiome();

    public abstract void applyCustomFeatures(final BiomeLoadingEvent event);

    public abstract SurfaceRules.RuleSource getSurface();

    public Biome build() {
        // here you can add additional final steps before registration
        return this.biome;
    }

    public ResourceKey<Biome> getKey() {
        return this.resourceKey;
    }

    public Biome getBiome() {
        return this.biome;
    }

    //Features:
    private static void placeFeature(final BiomeLoadingEvent event, String rLocation, String reg, int perChunk, float extraChance, int extra) {
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(PlacementUtils.register(rLocation, FeatureUtils.register(rLocation,
                        WNStructureRegistry.WN_FEATURES.get(reg).get()),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(
                        perChunk,
                        extraChance,
                        extra
                ))));
    }
    //FeatureUtils.register("jungle_bush", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.JUNGLE_LOG), new StraightTrunkPlacer(1, 0, 0), BlockStateProvider.simple(Blocks.OAK_LEAVES), new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2), new TwoLayersFeatureSize(0, 0, 0))).build());
    protected static void addTree(final BiomeLoadingEvent event, WNFallenTrees tree, int perChunk, float extraChance, int extra) {
        String rLocation = tree.toString().toLowerCase() + "_" + perChunk + "f";
        String reg = "fallen_" + tree.toString().toLowerCase();
        placeFeature(event, rLocation, reg, perChunk, extraChance, extra);
    }

    /*protected static void addTree(final BiomeLoadingEvent event, WNSaplingType tree, int perChunk, float extraChance, int extra) {
        String rLocation = "tree_" + tree.toString().toLowerCase() + "_" + perChunk;
        String reg = "tree_" + tree.toString().toLowerCase();
        placeFeature(event, rLocation, reg, perChunk, extraChance, extra);
    }*/

    protected static void addTree(final BiomeLoadingEvent event, WNExtraTrees tree, int perChunk, float extraChance, int extra) {
        String rLocation = "extra_" + tree.toString().toLowerCase() + "_" + perChunk + "_" + extraChance + "_" + extra;
        String reg = "extra_" + tree.toString().toLowerCase();
        placeFeature(event, rLocation, reg, perChunk, extraChance, extra);
    }

    protected static void addShrub(final BiomeLoadingEvent event, Block log, Block leaves, int perChunk, float extraChance, int extra) {
        String txt = leaves.toString();
        String rLocation = txt.substring(txt.indexOf(58)+1,txt.indexOf(125)) + "_" + perChunk;
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(PlacementUtils.register(rLocation, FeatureUtils.register(rLocation, Feature.TREE,  (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(
                log
        ), new StraightTrunkPlacer(1, 0, 0), BlockStateProvider.simple(
                leaves
        ), new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2), new TwoLayersFeatureSize(0, 0, 0))).build()), VegetationPlacements.treePlacement(PlacementUtils.countExtra(
                perChunk,
                extraChance,
                extra
        ),
                Blocks.AZALEA)
        ));
    }

    protected static void addBush(final BiomeLoadingEvent event, PlantFeature plant, int chunkAverage) {
        String rLocation = plant.toString().toLowerCase() + "_" + chunkAverage;
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(PlacementUtils.register(rLocation, FeatureUtils.register(rLocation, Feature.FLOWER, new RandomPatchConfiguration(
                        30,
                        5,
                        1,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(
                        plant.featureBlockState()
                )), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.matchesTag(
                        BlockTags.AZALEA_GROWS_ON,
                new BlockPos(0, -1, 0)))))), RarityFilter.onAverageOnceEvery(chunkAverage), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE));
    }

    protected static void addPlant(final BiomeLoadingEvent event, PlantFeature plant, int chunkAverage) {
        String rLocation = plant.toString().toLowerCase() + "_" + chunkAverage;

        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(PlacementUtils.register(rLocation, FeatureUtils.register(rLocation, Feature.FLOWER, new RandomPatchConfiguration(
                        30,
                        5,
                        1,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(
                        plant.featureBlockState()
                ))))), RarityFilter.onAverageOnceEvery(chunkAverage), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE));
    }
}
