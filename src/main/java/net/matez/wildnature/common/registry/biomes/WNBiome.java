package net.matez.wildnature.common.registry.biomes;

import net.matez.wildnature.common.objects.blocks.fruit_bush.leaves.FruitBushType;
import net.matez.wildnature.common.objects.blocks.fruit_bush.plants.FruitPlantType;
import net.matez.wildnature.common.objects.blocks.mushrooms.Mushroom;
import net.matez.wildnature.common.objects.blocks.plant.BushType;
import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
import net.matez.wildnature.common.objects.blocks.setup.WNBlock;
import net.matez.wildnature.common.objects.features.WNTreeRegistry;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.Music;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import javax.annotation.Nullable;

import static net.matez.wildnature.common.objects.blocks.plant.flowering.WNAnemoneFlowerBlock.STAGE;
import static net.matez.wildnature.common.objects.blocks.plant.flowering.WNFloweringBushBlock.FLOWERING;

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
    public static BlockState flowering(WNBlock flower) {
        if (flower.defaultBlockState().hasProperty(FLOWERING))
        {return flower.defaultBlockState().setValue(FLOWERING, true);}
        else if (flower.defaultBlockState().hasProperty(STAGE))
        {return flower.defaultBlockState().setValue(STAGE, 3);}

        else {return flower.defaultBlockState();}
    }

    protected static void addTrees(final BiomeLoadingEvent event, WNSaplingType tree, int perChunk, float extraChance, int extra) {
        String rLocation = tree.toString().toLowerCase() + perChunk + "_" + extraChance + "_" + extra;
            event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(PlacementUtils.register("p" + rLocation,
            FeatureUtils.register("c" + rLocation, WNTreeRegistry.TREE_FEATURES.get(tree).get()),
            VegetationPlacements.treePlacement(PlacementUtils.countExtra(perChunk, extraChance, extra))));
    }
    public static void addBushes(final BiomeLoadingEvent event, BushType bush, int getTries, int getXZ, int getY) {
        String rLocation = bush.toString().toLowerCase() + getTries + "_" + getXZ + "_" + getY;
            event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(PlacementUtils.register("p" + rLocation,
            FeatureUtils.register("c" + rLocation,
            Feature.FLOWER, new RandomPatchConfiguration(getTries, getXZ, getY, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(WNBlocks.BUSHES.get(bush)))))), InSquarePlacement.spread(),
            PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
    }
    public static void addFruitPlants(final BiomeLoadingEvent event, FruitPlantType plant, int getTries, int getXZ, int getY) {
        String rLocation = plant.toString().toLowerCase() + getTries + "_" + getXZ + "_" + getY;
            event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(PlacementUtils.register("p" + rLocation,
            FeatureUtils.register("c" + rLocation,
            Feature.FLOWER, new RandomPatchConfiguration(getTries, getXZ, getY, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(WNBlocks.FRUIT_BUSH_PLANTS.get(plant)))))), InSquarePlacement.spread(),
            PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
    }
        public static void addFruitBushes(final BiomeLoadingEvent event, FruitBushType bush, int getTries, int getXZ, int getY) {
        String rLocation = bush.toString().toLowerCase() + getTries + "_" + getXZ + "_" + getY;
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(PlacementUtils.register("p" + rLocation,
            FeatureUtils.register("c" + rLocation,
            Feature.FLOWER, new RandomPatchConfiguration(getTries, getXZ, getY, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(WNBlocks.FRUIT_BUSH_LEAVES.get(bush)))))), InSquarePlacement.spread(),
            PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
    }
    public static void addMushrooms(final BiomeLoadingEvent event, Mushroom mushroom, int getTries, int getXZ, int getY) {
        String rLocation = mushroom.toString().toLowerCase() + getTries + "_" + getXZ + "_" + getY;
            event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(PlacementUtils.register("p" + rLocation,
            FeatureUtils.register("c" + rLocation,
            Feature.FLOWER, new RandomPatchConfiguration(getTries, getXZ, getY, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
            new SimpleBlockConfiguration(BlockStateProvider.simple(WNBlocks.MUSHROOMS.get(mushroom)))))), InSquarePlacement.spread(),
            PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
    }
}
