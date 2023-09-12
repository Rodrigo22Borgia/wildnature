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

public class WNThujaShield extends WNBiome { 
    public WNThujaShield() { 
        super(WNBiomes.ThujaShield, Biome.Precipitation.RAIN, Biome.BiomeCategory.TAIGA, 0.201F, 0.9F, NORMAL_MUSIC, 0x6BC44E /*0xC0D457*/);
    }

    @Override
    public MobSpawnSettings.Builder buildMobSpawn() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(EntityType.BAT, 10, 8, 8));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.CHICKEN, 10, 4, 4));
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.FOX, 2, 1, 3));
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
        addTree(event, WNExtraTrees.BALD_HIGH_OAK_, 2, 0.5F, 2);
        addTree(event, WNExtraTrees.BIG_BIRCH_, 2, 0.5F, 2);
        addTree(event, WNExtraTrees.HIGH_BEECH_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.HIGH_OAK_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.LEAFY_BEECH_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.OAK, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.POINTY_BIRCH, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.ROWAN, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.SPIKY_BIRCH_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.SPRUCE, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_BPINE, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_LARCH, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.TREE_PINE, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.WEEPING_BEECH_, 1, 0.5F, 2);
        addTree(event, WNExtraTrees.SHRUB_TALL, 4, 0.5F,2);

        // -- FLOWERS
        addPlant(event, FlowerType.BLUEBELL, 6);
        addPlant(event, FlowerType.BOXWOOD, 4);
        addPlant(event, FlowerType.CHRYSANTHEMUM_LIGHT_YELLOW, 6);
        addPlant(event, FlowerType.CHRYSANTHEMUM_WHITE, 6);
        addPlant(event, FlowerType.CHRYSANTHEMUM_YELLOW, 6);
        addPlant(event, FlowerType.CLOVER, 4);
        addPlant(event, FlowerType.GRASS_WHEAT, 3);
        addPlant(event, FlowerType.HEATH_PINK, 12);
        addPlant(event, FlowerType.HEATH_PURPLE, 12);
        addPlant(event, FlowerType.PASQUE_YELLOW, 6);
        addPlant(event, FlowerType.PERENNIAL_BLUE, 12);
        addPlant(event, FlowerType.PERENNIAL_VIOLET, 12);
        addPlant(event, FlowerType.SHRUB, 3);
        addPlant(event, FlowerType.THUJA, 4);
        addPlant(event, FlowerType.THUJA_LARGE, 2);
        addPlant(event, FlowerType.THUJA_LIMEGREEN_LARGE, 2);
        addPlant(event, FlowerType.VIBURNUM_PINK, 6);
        addPlant(event, FlowerType.VIBURNUM_WHITE, 6);
        addPlant(event, FlowerType.YEW_BUSH, 3);
}


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return null;
    }
}