package net.matez.wildnature.common.objects.biomes.land;

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

public class WNSnowyDenseTucholaForest extends WNBiome { 
    public WNSnowyDenseTucholaForest() { 
        super(WNBiomes.SnowyDenseTucholaForest, Biome.Precipitation.SNOW, Biome.BiomeCategory.TAIGA, -0.5F, 0.3F, NORMAL_MUSIC);
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
        // -- TREES

        // ---

        // -- BUSHES

        // ---

        // -- FLOWERS

        // ---
    }


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return null;
    }
}