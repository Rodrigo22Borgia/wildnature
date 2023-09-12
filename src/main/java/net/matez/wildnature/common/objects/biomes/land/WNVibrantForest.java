package net.matez.wildnature.common.objects.biomes.land;

import net.matez.wildnature.common.objects.blocks.plant.FlowerType;
import net.matez.wildnature.common.objects.features.WNExtraTrees;
import net.matez.wildnature.common.objects.surface.WNSurface;
import net.matez.wildnature.common.registry.biomes.WNBiome;
import net.matez.wildnature.common.registry.biomes.WNBiomes;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class WNVibrantForest extends WNBiome { 
    public WNVibrantForest() { 
        super(WNBiomes.VibrantForest, Biome.Precipitation.RAIN, Biome.BiomeCategory.FOREST, 0.45F, 0.8F, NORMAL_MUSIC, 0x7EC948 /*0xA7D549*/);
    }

    @Override
    public MobSpawnSettings.Builder buildMobSpawn() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 10, 1, 1));

        return spawnBuilder;
    }

    @Override
    public BiomeGenerationSettings.Builder buildBiome() {
        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder();
        globalOverworldGeneration(biomeBuilder);
        BiomeDefaultFeatures.addForestGrass(biomeBuilder);

        return biomeBuilder;
    }


    @Override
    public void applyCustomFeatures(BiomeLoadingEvent event) {
        // -- TREES
        addTree(event, WNExtraTrees.APPLE, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.BRANCHY_OAK_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.CHERRY, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.CYPRESS, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.FORSYTHIA, 5, 0.5F, 2);
        addTree(event, WNExtraTrees.MAGNOLIA, 5, 0.5F, 2);
        addTree(event, WNExtraTrees.OAKLANDS_SHRUB, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.OAKLANDS_SMALLSHRUB, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.PEAR, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.POINTY_BIRCH, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.POINTY_OAK_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.ROWAN, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.SMALL_REDWOOD, 2, 0.5F, 2);
        addTree(event, WNExtraTrees.SPIKY_BIRCH_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_OAK, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.WEEPING_CEDAR_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.WILD_CHERRY, 2, 0.5F, 2);

        // -- FLOWERS
        addPlant(event, FlowerType.CATNIP_PURPLE, 4);
        addPlant(event, FlowerType.CHRYSANTHEMUM_PURPLE, 12);
        addPlant(event, FlowerType.CHRYSANTHEMUM_YELLOW, 12);
        addPlant(event, FlowerType.CLEMATIS_BLUE, 12);
        addPlant(event, FlowerType.CLEMATIS_PURPLE, 12);
        addPlant(event, FlowerType.CLOVER, 4);
        addPlant(event, FlowerType.GRASS_WHEAT, 3);
        addPlant(event, FlowerType.HYACINTH_DARK_BLUE, 12);
        addPlant(event, FlowerType.HYACINTH_PINK, 12);
        addPlant(event, FlowerType.HYACINTH_PURPLE, 12);
        addPlant(event, FlowerType.HYACINTH_RED, 12);
        addPlant(event, FlowerType.HYDRANGEA_BLUE, 12);
        addPlant(event, FlowerType.HYDRANGEA_PINK, 12);
        addPlant(event, FlowerType.HYDRANGEA_WHITE, 12);
        addPlant(event, FlowerType.MATTHIOLA_PINK, 6);
        addPlant(event, FlowerType.RHODODENDRON_PINK, 12);
        addPlant(event, FlowerType.RHODODENDRON_PURPLE, 12);
        addPlant(event, FlowerType.ROSEVINE_PINK, 0);
        addPlant(event, FlowerType.ROSEVINE_RED, 0);
        addPlant(event, FlowerType.ROSEVINE_YELLOW, 0);
        addPlant(event, FlowerType.SCOTCHBROOM_PURPLE, 12);
        addPlant(event, FlowerType.SCOTCHBROOM_YELLOW, 4);
        addPlant(event, FlowerType.TAMARISK, 12);
        addPlant(event, FlowerType.YEW_BUSH, 3);
        addPlant(event, FlowerType.YUCCA, 12);
}


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return SurfaceRules.sequence(WNSurface.GRASS_DIRT_GRAVEL_CONFIG, WNSurface.PODZOL_DIRT_GRAVEL_CONFIG);
    }
}