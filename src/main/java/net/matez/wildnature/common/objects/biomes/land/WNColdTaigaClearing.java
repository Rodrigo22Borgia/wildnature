package net.matez.wildnature.common.objects.biomes.land;

import net.matez.wildnature.common.objects.blocks.fruit_bush.plants.FruitPlantType;
import net.matez.wildnature.common.objects.blocks.plant.FlowerType;
import net.matez.wildnature.common.objects.features.WNExtraTrees;
import net.matez.wildnature.common.objects.features.WNFallenTrees;
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

public class WNColdTaigaClearing extends WNBiome { 
    public WNColdTaigaClearing() { 
        super(WNBiomes.ColdTaigaClearing, Biome.Precipitation.SNOW, Biome.BiomeCategory.TAIGA, -0.5F, 0.5F, NORMAL_MUSIC, 0x5DB259 /*0x7FBC70*/);
    }

    @Override
    public MobSpawnSettings.Builder buildMobSpawn() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 2, 1, 3));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 2, 1, 3));
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
        addTree(event, WNFallenTrees.BIRCH, 1, 0.5F, 2);
        addTree(event, WNFallenTrees.SPRUCE, 2, 0.5F, 2);
        addTree(event, WNExtraTrees.MINI_PINE, 2, 0.5F, 2);

        // -- FLOWERS
        addPlant(event, FlowerType.BLUEBELL, 6);
        //addPlant(event, FlowerType.BROWN_GRASS_BLOCK, 4);
        addPlant(event, FruitPlantType.WILD_BLUEBERRY, 12);
        addPlant(event, FlowerType.CLOVER, 4);
        addPlant(event, FlowerType.FORGET_ME_NOT_BLUE, 12);
        addPlant(event, FlowerType.FERNSPROUT, 6);
        addPlant(event, FlowerType.GRASS_WHEAT, 3);
        addPlant(event, FlowerType.HEATHER_WHITE, 12);
        addPlant(event, FlowerType.HEATH_WHITE, 12);
        addPlant(event, FlowerType.PERENNIAL_BLUE, 12);
        addPlant(event, FlowerType.PRIMROSE_BLUE, 12);
        addPlant(event, FlowerType.PRIMROSE_WHITE, 12);
        addPlant(event, FlowerType.THUJA, 12);
        addPlant(event, FlowerType.THUJA_LARGE, 12);
        addPlant(event, FlowerType.VIBURNUM_WHITE, 6);
        addPlant(event, FlowerType.YEW_BUSH, 3);
}


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return null;
    }
}