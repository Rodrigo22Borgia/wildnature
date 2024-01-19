package net.matez.wildnature.common.objects.biomes.land;

import net.matez.wildnature.common.objects.blocks.leaves.LeafType;
import net.matez.wildnature.common.objects.blocks.plant.FlowerType;
import net.matez.wildnature.common.objects.features.WNExtraTrees;
import net.matez.wildnature.common.objects.features.WNFallenTrees;
import net.matez.wildnature.common.registry.biomes.WNBiome;
import net.matez.wildnature.common.registry.biomes.WNBiomes;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
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
        BiomeDefaultFeatures.commonSpawns(spawnBuilder);
        BiomeDefaultFeatures.farmAnimals(spawnBuilder);

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
        addTree(event, WNExtraTrees.TREE_SPRUCE_M, 0,0.5F,1);
        addTree(event, WNExtraTrees.ASPEN, 6,1F,0);
        addTree(event, WNExtraTrees.FIR, 0,0.5F,2);
        addTree(event, WNExtraTrees.PINE, 1,1F,0);

        addShrub(event, Blocks.BIRCH_LOG, WNBlocks.LEAVES.get(LeafType.ASPEN),4,0.5F,2);

// -- PLANTS
        addPlant(event, FlowerType.CHRYSANTHEMUM_LIGHT_YELLOW, 4);
        addPlant(event, FlowerType.CLOVER, 4);
        addPlant(event, FlowerType.GERANIUM_WHITE, 12);
        addPlant(event, FlowerType.HEATHER_PINK, 6);
        addPlant(event, FlowerType.HEATHER_WHITE, 12);
        addPlant(event, FlowerType.HEATHER_YELLOW, 6);
        addPlant(event, FlowerType.HEATH_PURPLE, 6);
        addPlant(event, FlowerType.PASQUE_YELLOW, 4);

    }


    @Override
    public SurfaceRules.RuleSource getSurface() {
        return null;
    }
}
