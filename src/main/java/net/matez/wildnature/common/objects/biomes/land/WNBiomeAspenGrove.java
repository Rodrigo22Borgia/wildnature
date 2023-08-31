package net.matez.wildnature.common.objects.biomes.land;

import net.matez.wildnature.common.objects.blocks.plant.FlowerType;
import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
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

public class WNBiomeAspenGrove extends WNBiome {
    public WNBiomeAspenGrove() {
        super(WNBiomes.AspenGrove, Biome.Precipitation.RAIN, Biome.BiomeCategory.FOREST, 0.4F, 0.8F, NORMAL_MUSIC);
    }

    @Override
    public MobSpawnSettings.Builder buildMobSpawn() {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.GOAT, 5, 1, 3));
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);

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

        // -- PLANTS
        addPlant(event, FlowerType.HEATHER_YELLOW, 2);
        addPlant(event, FlowerType.HEATHER_WHITE, 1);
        addPlant(event, FlowerType.HEATHER_PINK, 2);
        addPlant(event, FlowerType.HEATH_PURPLE, 2);
        addPlant(event, FlowerType.PASQUE_YELLOW, 3);
        addPlant(event, FlowerType.GERANIUM_WHITE, 2);
        addPlant(event, FlowerType.CHRYSANTHEMUM_LIGHT_YELLOW, 3);
        addPlant(event, FlowerType.CLOVER, 3);

        // -- TREES

        addTree(event, WNSaplingType.ASPEN, 6,1F,0);
        addTree(event, WNSaplingType.FIR, 0,0.5F,2);
        addTree(event, WNSaplingType.PINE, 1,1F,0);
        // ---
    }


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return null;
    }
}
