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

public class WNAutumnalMapleForest extends WNBiome {
    public WNAutumnalMapleForest() {
        super(WNBiomes.AutumnalMapleForest, Biome.Precipitation.RAIN, Biome.BiomeCategory.FOREST, 0.5F, 0.8F, NORMAL_MUSIC, 12166233);
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

        // -- BUSHES

        // ---

        // -- FLOWERS

        // ---

        // -- TREES


        addTree(event, WNExtraTrees.OAK, 1,0.5F,1);
        addTree(event, WNExtraTrees.MAPLE, 1,1F,0);
        addTree(event, WNExtraTrees.MAPLE_BROWN, 1,1F,0);
        addTree(event, WNExtraTrees.MAPLE_ORANGE, 1,1F,0);
        addTree(event, WNExtraTrees.MAPLE_RED, 1,1F,0);
        addTree(event, WNExtraTrees.MAPLE_YELLOW, 1,1F,0);
        // ---
        addPlant(event, FlowerType.HEATHER_WHITE, 6);
        addPlant(event, FlowerType.HEATHER_YELLOW, 6);
        addPlant(event, FlowerType.YEW_BUSH, 3);
    }


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return WNSurface.PODZOL;
    }
}
