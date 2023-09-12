package net.matez.wildnature.common.objects.biomes.land;

import net.matez.wildnature.common.objects.blocks.leaves.LeafType;
import net.matez.wildnature.common.objects.blocks.plant.FlowerType;
import net.matez.wildnature.common.objects.features.WNExtraTrees;
import net.matez.wildnature.common.objects.surface.WNSurface;
import net.matez.wildnature.common.registry.biomes.WNBiome;
import net.matez.wildnature.common.registry.biomes.WNBiomes;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class WNSnowyAspenGrove extends WNBiome { 
    public WNSnowyAspenGrove() { 
        super(WNBiomes.SnowyAspenGrove, Biome.Precipitation.SNOW, Biome.BiomeCategory.FOREST, -0.3F, 0.8F, NORMAL_MUSIC, 0xA1C720 /*0x74BD20*/, 0xFBFF00 /*0xFFEA00*/);
    }

    @Override
    public MobSpawnSettings.Builder buildMobSpawn() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
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
        addTree(event, WNExtraTrees.ASPEN, 6, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_FIR, 2, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_PINE, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_TAIGA, 2, 0.5F, 2);

        addShrub(event, Blocks.BIRCH_LOG, WNBlocks.LEAVES.get(LeafType.ASPEN), 4, 0.5F, 2);

        // -- FLOWERS
        addPlant(event, FlowerType.CLOVER, 4);
        addPlant(event, FlowerType.HEATHER_PINK, 6);
        //addPlant(event, FlowerType.HEATHER_PURPLE, 4);
        addPlant(event, FlowerType.HEATHER_WHITE, 12);
        addPlant(event, FlowerType.HEATH_PINK, 4);
        addPlant(event, FlowerType.HEATH_PURPLE, 4);
        addPlant(event, FlowerType.PASQUE_YELLOW, 12);
        addPlant(event, FlowerType.PERENNIAL_PINK, 3);
}


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return WNSurface.GRASS_DIRT_GRAVEL_CONFIG;
    }
}