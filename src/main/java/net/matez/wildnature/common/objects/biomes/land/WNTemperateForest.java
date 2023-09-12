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

public class WNTemperateForest extends WNBiome { 
    public WNTemperateForest() { 
        super(WNBiomes.TemperateForest, Biome.Precipitation.RAIN, Biome.BiomeCategory.FOREST, 0.4F, 0.8F, NORMAL_MUSIC, 0x97DC00 /*0x78D100*/, 0x7FCE0D /*0x9CD818*/);
    }

    @Override
    public MobSpawnSettings.Builder buildMobSpawn() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 2, 1, 3));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 95, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));

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
        addTree(event, WNExtraTrees.BALD_HIGH_OAK_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.BIG_BIRCH_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.FORSYTHIA, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.HIGH_BEECH_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.HIGH_BIRCH_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.HIGH_OAK_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.MEGA_OAK_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.OAKLANDS_SHRUB, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.OAKLANDS_SMALLSHRUB, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.ROWAN, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_BIRCH, 6, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_OAK, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.WEEPING_CEDAR_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.WILD_CHERRY, 1, 0.5F, 2);

        // -- FLOWERS
        addPlant(event, FlowerType.CLOVER, 4);
        addPlant(event, FlowerType.GRASS_WHEAT, 3);
        addPlant(event, FlowerType.IRIS_PINK, 12);
        addPlant(event, FlowerType.IRIS_PURPLE, 12);
        addPlant(event, FlowerType.ROSEVINE_RED, 0);
        addPlant(event, FlowerType.ROSEVINE_WHITE, 0);
        addPlant(event, FlowerType.SCOTCHBROOM_PURPLE, 12);
        addPlant(event, FlowerType.SCOTCHBROOM_YELLOW, 6);
        addPlant(event, FlowerType.YEW_BUSH, 3);
}


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return SurfaceRules.sequence(WNSurface.GRASS_DIRT_GRAVEL_CONFIG, WNSurface.PODZOL_DIRT_GRAVEL_CONFIG);
    }
}