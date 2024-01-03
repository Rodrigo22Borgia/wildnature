package net.matez.wildnature.common.registry.biomes;

import net.matez.wildnature.common.objects.blocks.ores.BigSmallBlock;
import net.matez.wildnature.common.objects.blocks.ores.Ore;
import net.matez.wildnature.common.objects.blocks.plant.PlantFeature;
import net.matez.wildnature.common.objects.blocks.rocks.RockType;
import net.matez.wildnature.common.objects.features.WNExtraTrees;
import net.matez.wildnature.common.objects.features.WNFallenTrees;
import net.matez.wildnature.common.objects.features.WNStructureRegistry;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.CavePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Music;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BushFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import javax.annotation.Nullable;
import java.util.List;

import static net.matez.wildnature.common.objects.blocks.setup.WNBlockProperties.SIZE;
import static net.minecraft.data.worldgen.features.OreFeatures.*;

public abstract class WNBiome {
    // KEEP HERE SHARED VARIABLES FOR BIOMES
    public static final Holder<PlacedFeature> MARBLE       = PlacementUtils.register("marble_patch"      , FeatureUtils.register("marble_patch"      , Feature.ORE, new OreConfiguration(NATURAL_STONE, WNBlocks.ROCKS.get(RockType.MARBLE).defaultBlockState()      , 64)), commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
    public static final Holder<PlacedFeature> GNEISS       = PlacementUtils.register("gneiss_patch"      , FeatureUtils.register("gneiss_patch"      , Feature.ORE, new OreConfiguration(NATURAL_STONE, WNBlocks.ROCKS.get(RockType.GNEISS).defaultBlockState()      , 64)), commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
    public static final Holder<PlacedFeature> LIMESTONE    = PlacementUtils.register("limestone_patch"   , FeatureUtils.register("limestone_patch"   , Feature.ORE, new OreConfiguration(NATURAL_STONE, WNBlocks.ROCKS.get(RockType.LIMESTONE).defaultBlockState()   , 64)), commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
    public static final Holder<PlacedFeature> SLATE_BLUE   = PlacementUtils.register("slate_blue_patch"  , FeatureUtils.register("slate_blue_patch"  , Feature.ORE, new OreConfiguration(NATURAL_STONE, WNBlocks.ROCKS.get(RockType.SLATE_BLUE).defaultBlockState()  , 64)), commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
    public static final Holder<PlacedFeature> SLATE_PURPLE = PlacementUtils.register("slate_purple_patch", FeatureUtils.register("slate_purple_patch", Feature.ORE, new OreConfiguration(NATURAL_STONE, WNBlocks.ROCKS.get(RockType.SLATE_PURPLE).defaultBlockState(), 64)), commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
    public static final Holder<PlacedFeature> QUARTZITE    = PlacementUtils.register("quartzite_patch"   , FeatureUtils.register("quartzite_patch"   , Feature.ORE, new OreConfiguration(NATURAL_STONE, WNBlocks.ROCKS.get(RockType.QUARTZITE).defaultBlockState()   , 64)), commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
    public static final Holder<PlacedFeature> BASANITE     = PlacementUtils.register("basanite_patch"    , FeatureUtils.register("basanite_patch"    , Feature.ORE, new OreConfiguration(NATURAL_STONE, WNBlocks.ROCKS.get(RockType.BASANITE).defaultBlockState()    , 64)), commonOrePlacement(2, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));


    public static final Holder<PlacedFeature> AMBER_ORE  = PlacementUtils.register("ore_amber" , FeatureUtils.register("ore_amber" , Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, WNBlocks.ORES.get(Ore.AMBER_ORE).defaultBlockState()) , OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, Blocks.DEEPSLATE_IRON_ORE.defaultBlockState()))                  , 9)), commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32))));
    public static final Holder<PlacedFeature> SILVER_ORE = PlacementUtils.register("ore_silver", FeatureUtils.register("ore_silver", Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, WNBlocks.ORES.get(Ore.SILVER_ORE).defaultBlockState()), OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, WNBlocks.ORES.get(Ore.SILVER_DEEPSLATE_ORE).defaultBlockState())), 9)), commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(0))));
    public static final Holder<PlacedFeature> TIN_ORE    = PlacementUtils.register("ore_tin"   , FeatureUtils.register("ore_tin"   , Feature.ORE, new OreConfiguration(List.of(OreConfiguration.target(STONE_ORE_REPLACEABLES, WNBlocks.ORES.get(Ore.TIN_ORE).defaultBlockState())   , OreConfiguration.target(DEEPSLATE_ORE_REPLACEABLES, WNBlocks.ORES.get(Ore.TIN_DEEPSLATE_ORE).defaultBlockState()))   , 9)), commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(32) , VerticalAnchor.absolute(64))));

    public static final Holder<PlacedFeature> AMETHYST_GEODE = PlacementUtils.register("amethyst_geode", FeatureUtils.register("amethyst_geode", Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(Blocks.TINTED_GLASS), BlockStateProvider.simple(Blocks.BUDDING_AMETHYST)      , BlockStateProvider.simple(Blocks.PURPLE_CONCRETE)    , BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(WNBlocks.ORES.get(Ore.DARK_AMETHYST_FORMATION).defaultBlockState(), WNBlocks.ORES.get(Ore.DARK_AMETHYST_FORMATION).defaultBlockState().setValue(SIZE, BigSmallBlock.BIG)), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1)), RarityFilter.onAverageOnceEvery(48), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());
    public static final Holder<PlacedFeature> SAPPHIRE_GEODE = PlacementUtils.register("sapphire_geode", FeatureUtils.register("sapphire_geode", Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(Blocks.TINTED_GLASS), BlockStateProvider.simple(Blocks.DEEPSLATE_LAPIS_ORE)   , BlockStateProvider.simple(Blocks.BLUE_CONCRETE)      , BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(WNBlocks.ORES.get(Ore.SAPPHIRE_FORMATION).defaultBlockState()     , WNBlocks.ORES.get(Ore.SAPPHIRE_FORMATION).defaultBlockState().setValue(SIZE     , BigSmallBlock.BIG)), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1)), RarityFilter.onAverageOnceEvery(48), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());
    public static final Holder<PlacedFeature> RUBY_GEODE     = PlacementUtils.register("ruby_geode"    , FeatureUtils.register("ruby_geode"    , Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(Blocks.TINTED_GLASS), BlockStateProvider.simple(Blocks.DEEPSLATE_REDSTONE_ORE), BlockStateProvider.simple(Blocks.RED_CONCRETE)       , BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(WNBlocks.ORES.get(Ore.RUBY_FORMATION).defaultBlockState()         , WNBlocks.ORES.get(Ore.RUBY_FORMATION).defaultBlockState().setValue(SIZE         , BigSmallBlock.BIG)), BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1)), RarityFilter.onAverageOnceEvery(48), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());
    public static final Holder<PlacedFeature> TOPAZ_GEODE    = PlacementUtils.register("topaz_geode"   , FeatureUtils.register("topaz_geode"   , Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR), BlockStateProvider.simple(Blocks.TINTED_GLASS), BlockStateProvider.simple(Blocks.DEEPSLATE_DIAMOND_ORE) , BlockStateProvider.simple(Blocks.LIGHT_BLUE_CONCRETE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT), List.of(WNBlocks.ORES.get(Ore.TOPAZ_FORMATION).defaultBlockState())                                                                                                              , BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D), new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true, UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05D, 1)), RarityFilter.onAverageOnceEvery(48), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)), BiomeFilter.biome());

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

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
        //BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, SAPPHIRE_GEODE);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, RUBY_GEODE);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, AMETHYST_GEODE);
        builder.addFeature(GenerationStep.Decoration.LOCAL_MODIFICATIONS, TOPAZ_GEODE);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);

        BiomeDefaultFeatures.addDefaultOres(builder);
        BiomeDefaultFeatures.addDefaultSoftDisks(builder);
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_TALL_GRASS);
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_GRASS_NORMAL);
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_GRASS_SAVANNA);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, AMBER_ORE);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, SILVER_ORE);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, TIN_ORE);

        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, MARBLE);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, GNEISS);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, LIMESTONE);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, SLATE_BLUE);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, SLATE_PURPLE);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, QUARTZITE);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, BASANITE);
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

    protected static void addTree(final BiomeLoadingEvent event, WNFallenTrees tree, int perChunk, float extraChance, int extra) {
        String rLocation = "wildnature:fallen_" + tree.toString().toLowerCase() + "_" + perChunk + "f";
        String reg = "fallen_" + tree.toString().toLowerCase();
        placeTree(event, rLocation, reg, perChunk, extraChance, extra);
    }

    protected static void addTree(final BiomeLoadingEvent event, WNExtraTrees tree, int perChunk, float extraChance, int extra) {
        String rLocation = "wildnature:extra_" + tree.toString().toLowerCase() + "_" + perChunk + "_" + extraChance + "_" + extra;
        String reg = "extra_" + tree.toString().toLowerCase();
        placeTree(event, rLocation, reg, perChunk, extraChance, extra);
    }
    private static void placeTree(final BiomeLoadingEvent event, String rLocation, String reg, int perChunk, float extraChance, int extra) {
        if (!BuiltinRegistries.PLACED_FEATURE.containsKey(new ResourceLocation(rLocation))) {

            if (!BuiltinRegistries.CONFIGURED_FEATURE.containsKey(new ResourceLocation(reg))) {
            FeatureUtils.register(reg, WNStructureRegistry.WN_FEATURES.get(reg).get());
            }
            PlacementUtils.register(rLocation, BuiltinRegistries.CONFIGURED_FEATURE.getHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY,new ResourceLocation(reg))),
                    VegetationPlacements.treePlacement(PlacementUtils.countExtra(
                            perChunk,
                            extraChance,
                            extra
                    )));
        }
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(BuiltinRegistries.PLACED_FEATURE.getHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY,new ResourceLocation(rLocation))));

    }

    protected static void addShrub(final BiomeLoadingEvent event, Block log, Block leaves, int perChunk, float extraChance, int extra) {
        String txt = leaves.toString();
        String cLocation = "wildnature:" + txt.substring(txt.indexOf(58)+1,txt.indexOf(125));
        String pLocation =  cLocation + "_" + perChunk + "_" + extraChance + "_" + extra;


        if (!BuiltinRegistries.PLACED_FEATURE.containsKey(new ResourceLocation(pLocation))) {

            if (!BuiltinRegistries.CONFIGURED_FEATURE.containsKey(new ResourceLocation(cLocation))) {
                FeatureUtils.register(cLocation, Feature.TREE,  (new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(
                        log
                ), new StraightTrunkPlacer(1, 0, 0), BlockStateProvider.simple(
                        leaves
                ), new BushFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 2), new TwoLayersFeatureSize(0, 0, 0))).build());
            }
            PlacementUtils.register(pLocation, BuiltinRegistries.CONFIGURED_FEATURE.getHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY,new ResourceLocation(cLocation))), VegetationPlacements.treePlacement(PlacementUtils.countExtra(
                                    perChunk,
                                    extraChance,
                                    extra
                            ),
                            Blocks.AZALEA
                    ));
        }
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(BuiltinRegistries.PLACED_FEATURE.getHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY,new ResourceLocation(pLocation))));
    }

    protected static void addBush(final BiomeLoadingEvent event, PlantFeature plant, int everyXchunks) {
        String cLocation = "wildnature:" + plant.toString().toLowerCase() + "_";
        String pLocation = cLocation + everyXchunks;

        if (!BuiltinRegistries.PLACED_FEATURE.containsKey(new ResourceLocation(pLocation))) {

            if (!BuiltinRegistries.CONFIGURED_FEATURE.containsKey(new ResourceLocation(cLocation))) {
                FeatureUtils.register(cLocation, Feature.FLOWER, new RandomPatchConfiguration(
                        30,
                        5,
                        1,
                        PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(
                                plant.featureBlockState()
                        )), BlockPredicate.allOf(BlockPredicate.replaceable(), BlockPredicate.matchesTag(
                                BlockTags.AZALEA_GROWS_ON,
                                new BlockPos(0, -1, 0))))));
            }
            PlacementUtils.register(pLocation, BuiltinRegistries.CONFIGURED_FEATURE.getHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY,new ResourceLocation(cLocation))), RarityFilter.onAverageOnceEvery(everyXchunks), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE);
        }
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(BuiltinRegistries.PLACED_FEATURE.getHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY,new ResourceLocation(pLocation))));
    }
    protected static void addPlant(final BiomeLoadingEvent event, PlantFeature plant, int everyXchunks) {
        String cLocation = "wildnature:" + plant.toString().toLowerCase() + "_";
        String pLocation = cLocation + everyXchunks;

        if (!BuiltinRegistries.PLACED_FEATURE.containsKey(new ResourceLocation(pLocation))) {

            if (!BuiltinRegistries.CONFIGURED_FEATURE.containsKey(new ResourceLocation(cLocation))) {
                FeatureUtils.register(cLocation, Feature.FLOWER, new RandomPatchConfiguration(
                        30,
                        5,
                        1,
                        PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(
                                plant.featureBlockState()
                        )))));
            }
            PlacementUtils.register(pLocation, BuiltinRegistries.CONFIGURED_FEATURE.getHolderOrThrow(ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY,new ResourceLocation(cLocation))), RarityFilter.onAverageOnceEvery(everyXchunks), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE);
        }
        event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION).add(BuiltinRegistries.PLACED_FEATURE.getHolderOrThrow(ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY,new ResourceLocation(pLocation))));
    }
}
