package net.matez.wildnature.common.objects.biomes.land;

import net.matez.wildnature.common.objects.blocks.fruit_bush.leaves.FruitBushType;
import net.matez.wildnature.common.objects.blocks.fruit_bush.plants.FruitPlantType;
import net.matez.wildnature.common.objects.blocks.mushrooms.Mushroom;
import net.matez.wildnature.common.objects.blocks.plant.BushType;
import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
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

public class WNBiomeSeasonalTaiga extends WNBiome {
    public WNBiomeSeasonalTaiga() {
        super(WNBiomes.SeasonalTaiga, Biome.Precipitation.SNOW, Biome.BiomeCategory.TAIGA, -1.0F, 0.5F, NORMAL_MUSIC);
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
        BiomeDefaultFeatures.addGiantTaigaVegetation(biomeBuilder);
        BiomeDefaultFeatures.addTaigaGrass(biomeBuilder);

        return biomeBuilder;
    }


    @Override
    public void applyCustomFeatures(BiomeLoadingEvent event) {

        // -- BUSHES
        addBushes(event, BushType.AZALEA_PINK,40,5,2);
        addFruitPlants(event, FruitPlantType.BLACKBERRY,40,5,2);
        addMushrooms(event, Mushroom.DEATH_CAP,40,5,2);
        addFruitBushes(event, FruitBushType.BLUEBERRY,40,5,2);
        // ---

        // -- FLOWERS
        // ---

        // -- TREES

        addTrees(event,WNSaplingType.METASEQUOIA_BROWN,1,0.5F,1);
        addTrees(event,WNSaplingType.METASEQUOIA_YELLOW,1,0.5F,1);
        addTrees(event,WNSaplingType.METASEQUOIA_RED,1,0.5F,1);
        addTrees(event,WNSaplingType.METASEQUOIA_GREEN,1,0.5F,1);
        addTrees(event,WNSaplingType.METASEQUOIA_ORANGE,1,0.5F,1);

        // ---
    }


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return WNSurface.SURFACE_MOSSY;
    }
}
