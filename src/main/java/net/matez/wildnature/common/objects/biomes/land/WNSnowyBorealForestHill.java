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

public class WNSnowyBorealForestHill extends WNBiome { 
    public WNSnowyBorealForestHill() { 
        super(WNBiomes.SnowyBorealForestHill, Biome.Precipitation.RAIN, Biome.BiomeCategory.TAIGA, -0.5F, 0.3F, NORMAL_MUSIC, 0x2E8545 /*0x307D31*/, 0xFBFF00 /*0xFFEA00*/);
    }

    @Override
    public MobSpawnSettings.Builder buildMobSpawn() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 5, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.PIG, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SHEEP, 12, 4, 4));
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
        addTree(event, WNExtraTrees.TREE_LARCH, 1, 0.5F, 1);
        addTree(event, WNExtraTrees.TREE_SPRUCE_M, 1, 0.5F, 1);
        addTree(event, WNExtraTrees.PINE, 2, 0.5F, 2);

        // -- FLOWERS
        addPlant(event, FlowerType.BLUEBELL, 12);
        addPlant(event, FlowerType.HEATHER_PINK, 12);
        //addPlant(event, FlowerType.HEATHER_PURPLE, 12);
        addPlant(event, FlowerType.HEATHER_WHITE, 12);
        addPlant(event, FlowerType.PERENNIAL_BLUE, 6);
        addPlant(event, FlowerType.PERENNIAL_PINK, 6);
        addPlant(event, FlowerType.PERENNIAL_VIOLET, 6);
}


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return null;
    }
}