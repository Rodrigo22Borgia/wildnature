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

public class WNSnowyCracowGorge extends WNBiome { 
    public WNSnowyCracowGorge() { 
        super(WNBiomes.SnowyCracowGorge, Biome.Precipitation.SNOW, Biome.BiomeCategory.EXTREME_HILLS, -0.73F, 0.9F, NORMAL_MUSIC, 0x81BF53 /*0x72C248*/, 0xFBFF00 /*0xFFEA00*/);
    }

    @Override
    public MobSpawnSettings.Builder buildMobSpawn() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 4, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 2, 3, 4));
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
        addTree(event, WNExtraTrees.BEECH, 3, 0.5F, 2);
        addTree(event, WNExtraTrees.LEAFY_BEECH_, 3, 0.5F, 2);
        addTree(event, WNExtraTrees.ROWAN, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.THIN_PINE, 2, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_FIR, 8, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_LARCH, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_PINE, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_TAIGA, 7, 0.5F, 2);

        // -- FLOWERS
        //addPlant(event, FlowerType.BROWN_PODZOL, 4);
        //addPlant(event, FlowerType.GRANITE_COBBLE_MOSSY, 12);
        addPlant(event, FlowerType.BLUEBELL, 12);
        addPlant(event, FlowerType.CROCUS_WHITE, 6);
        addPlant(event, FlowerType.FIREWEED, 12);
        addPlant(event, FlowerType.HEATHER_PINK, 6);
        addPlant(event, FlowerType.HEATHER_YELLOW, 6);
        addPlant(event, FlowerType.HEATH_PURPLE, 12);
        addPlant(event, FlowerType.PASQUE_PURPLE, 6);
        addPlant(event, FlowerType.PRIMROSE_PINK, 6);
}


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return WNSurface.PODZOL_DIRT_GRAVEL_CONFIG;
    }
}