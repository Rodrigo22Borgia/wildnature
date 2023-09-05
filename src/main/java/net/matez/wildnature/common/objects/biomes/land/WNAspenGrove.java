package net.matez.wildnature.common.objects.biomes.land;

import net.matez.wildnature.common.objects.blocks.leaves.LeafType;
import net.matez.wildnature.common.objects.blocks.plant.FlowerType;
import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
import net.matez.wildnature.common.objects.features.WNExtraTrees;
import net.matez.wildnature.common.objects.features.WNFallenTrees;
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

public class WNAspenGrove extends WNBiome {
    public WNAspenGrove() {
        super(WNBiomes.AspenGrove, Biome.Precipitation.RAIN, Biome.BiomeCategory.FOREST, 0.4F, 0.8F, NORMAL_MUSIC,10602272, 0xFFEA00);
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
        addTree(event, WNFallenTrees.SPRUCE, 0,0.5F,1);

        addTree(event, WNExtraTrees.SPRUCE, 0,0.5F,1);
        addTree(event, WNSaplingType.ASPEN, 6,1F,0);
        addTree(event, WNSaplingType.FIR, 0,0.5F,2);
        addTree(event, WNSaplingType.PINE, 1,1F,0);

        addShrub(event, Blocks.BIRCH_LOG, WNBlocks.LEAVES.get(LeafType.ASPEN),4,0.5F,2);

// -- PLANTS
        addPlant(event, FlowerType.HEATHER_YELLOW, 6);
        addPlant(event, FlowerType.HEATHER_WHITE, 12);
        addPlant(event, FlowerType.HEATHER_PINK, 6);
        addPlant(event, FlowerType.HEATH_PURPLE, 6);
        addPlant(event, FlowerType.PASQUE_YELLOW, 4);
        addPlant(event, FlowerType.GERANIUM_WHITE, 12);
        addPlant(event, FlowerType.CHRYSANTHEMUM_LIGHT_YELLOW, 4);
        addPlant(event, FlowerType.CLOVER, 4);

    }


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return null;
    }
}
