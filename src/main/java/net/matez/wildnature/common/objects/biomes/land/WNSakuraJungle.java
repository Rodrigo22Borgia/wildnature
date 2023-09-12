package net.matez.wildnature.common.objects.biomes.land;

import net.matez.wildnature.common.objects.blocks.plant.FlowerType;
import net.matez.wildnature.common.objects.features.WNExtraTrees;
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

public class WNSakuraJungle extends WNBiome { 
    public WNSakuraJungle() { 
        super(WNBiomes.SakuraJungle, Biome.Precipitation.RAIN, Biome.BiomeCategory.FOREST, 0.777F, 0.8F, NORMAL_MUSIC, 0x71CB00 /*0x75CB35*/);
    }

    @Override
    public MobSpawnSettings.Builder buildMobSpawn() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 20, 8, 8));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 8, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PARROT, 40, 1, 2));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 100, 4, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 10, 1, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.OCELOT, 2, 1, 1));
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
        addTree(event, WNExtraTrees.CITRUS, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.JUNGLE_BIG, 6, 0.5F, 2);
        addTree(event, WNExtraTrees.JUNGLE_MEDIUM, 4, 0.5F, 2);
        addTree(event, WNExtraTrees.JUNGLE_SMALL, 3, 0.5F, 2);
        addTree(event, WNExtraTrees.SAKURA, 2, 0.5F, 2);

        // -- FLOWERS
        addPlant(event, FlowerType.ANTHURIUM_PINK, 12);
        addPlant(event, FlowerType.ANTHURIUM_RED, 6);
        addPlant(event, FlowerType.BIRD_OF_PARADISE, 6);
        //addPlant(event, FlowerType.CHERRY_FLOWER, 6);
        addPlant(event, FlowerType.CHINESE_LANTERN_FLOWER, 12);
        addPlant(event, FlowerType.CHRYSANTHEMUM_LIGHT_YELLOW, 6);
        addPlant(event, FlowerType.CHRYSANTHEMUM_PURPLE, 6);
        addPlant(event, FlowerType.GERANIUM_PINK, 6);
        addPlant(event, FlowerType.GERANIUM_RED, 6);
        addPlant(event, FlowerType.ORCHID_PURPLE, 12);
        addPlant(event, FlowerType.PEACE_LILY, 12);
        addPlant(event, FlowerType.SCOTCHBROOM_PURPLE, 6);
        addPlant(event, FlowerType.TAMARISK, 12);
}


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return null;
    }
}