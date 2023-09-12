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

public class WNDaintreeCliffs extends WNBiome { 
    public WNDaintreeCliffs() { 
        super(WNBiomes.DaintreeCliffs, Biome.Precipitation.RAIN, Biome.BiomeCategory.JUNGLE, 0.90F, 0.8F, NORMAL_MUSIC, 0xB7CB65 /*0xA7CB27*/, 0x58C94C /*0x8BC949*/);
    }

    @Override
    public MobSpawnSettings.Builder buildMobSpawn() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PANDA, 3, 1, 2));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PARROT, 40, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.HUSK, 35, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 100, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 100, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 100, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITCH, 5, 1, 1));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 45, 4, 4));
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
        addTree(event, WNExtraTrees.EBONY_SHRUB, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.EUCALYPTUS_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.JUNGLE_BIG, 6, 0.5F, 2);
        addTree(event, WNExtraTrees.JUNGLE_MEDIUM, 4, 0.5F, 2);
        addTree(event, WNExtraTrees.JUNGLE_SMALL, 3, 0.5F, 2);
        addTree(event, WNExtraTrees.MAHOGANY, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.MAHOGANYSHRUB, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.OAK, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.ORANGE, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.PEACH, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.POMEGRANATE, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_PALM, 1, 0.5F, 2);

        // -- FLOWERS
        addPlant(event, FlowerType.ANTHURIUM_PINK, 12);
        addPlant(event, FlowerType.ANTHURIUM_RED, 6);
        addPlant(event, FlowerType.CANNA_BULB_ORANGE, 12);
        addPlant(event, FlowerType.CANNA_BULB_PINK, 12);
        addPlant(event, FlowerType.CANNA_BULB_RED, 12);
        addPlant(event, FlowerType.CANNA_BULB_YELLOW, 12);
        addPlant(event, FlowerType.ORCHID_PURPLE, 12);
}


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return WNSurface.PODZOL_DIRT_GRAVEL_CONFIG;
    }
}