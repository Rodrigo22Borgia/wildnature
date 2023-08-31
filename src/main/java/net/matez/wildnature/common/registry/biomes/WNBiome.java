package net.matez.wildnature.common.registry.biomes;

import net.matez.wildnature.common.objects.blocks.fruit_bush.leaves.FruitBushType;
import net.matez.wildnature.common.objects.blocks.fruit_bush.plants.FruitPlantType;
import net.matez.wildnature.common.objects.blocks.mushrooms.Mushroom;
import net.matez.wildnature.common.objects.blocks.plant.FlowerType;
import net.matez.wildnature.common.objects.blocks.plant.PlantFeature;
import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
import net.matez.wildnature.common.objects.blocks.setup.WNBlock;
import net.matez.wildnature.common.objects.blocks.water_plants.WaterPlant;
import net.matez.wildnature.common.objects.features.WNTreeRegistry;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.Music;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.registries.ForgeRegistryEntry;

import javax.annotation.Nullable;

import static net.matez.wildnature.common.objects.blocks.plant.flowering.WNAnemoneFlowerBlock.STAGE;
import static net.matez.wildnature.common.objects.blocks.plant.flowering.WNFloweringBushBlock.FLOWERING;
import static net.minecraft.data.worldgen.placement.VegetationPlacements.worldSurfaceSquaredWithCount;

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
    protected static void addTree(final BiomeLoadingEvent event, WNSaplingType tree, int perChunk, float extraChance, int extra) {
        String rLocation = tree.toString().toLowerCase() + perChunk + "_" + extraChance + "_" + extra;
            event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(
                    PlacementUtils.register(rLocation, FeatureUtils.register(rLocation, WNTreeRegistry.TREE_FEATURES.get(tree).get()),
                    VegetationPlacements.treePlacement(PlacementUtils.countExtra(perChunk, extraChance, extra))));
    }

    public static void addWaterPlant(final BiomeLoadingEvent event, WaterPlant plant, int tries, int XZ, int Y) {
        String rLocation = plant.toString().toLowerCase() + "_" + tries + "_" + XZ + "_" + Y;
            event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(
                    PlacementUtils.register(rLocation, FeatureUtils.register(rLocation,
                                    Feature.RANDOM_PATCH, new RandomPatchConfiguration(tries, XZ, Y, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                                    new SimpleBlockConfiguration(BlockStateProvider.simple(WNBlocks.WATER_PLANTS.get(plant)))))),
                    worldSurfaceSquaredWithCount(4)));
    }
    public static void addBush(final BiomeLoadingEvent event, PlantFeature plant, int chunkAverage) {
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

    public static void addPlant(final BiomeLoadingEvent event, PlantFeature plant, int chunkAverage) {
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
