package net.matez.wildnature.common.objects.gen.wn_features;

import net.matez.wildnature.common.objects.structures.WNStructureFolders;
import net.matez.wildnature.common.objects.structures.WNStructurePlacement;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;

public enum Trees {
     ASPEN(3, 0.1f, 2,
             new ResourceKey[]{Biomes.FOREST, Biomes.BIRCH_FOREST},
             WNStructurePlacement.make(
                     WNStructureFolders.TREE_ASPEN
             )
             .with(1, "aspen_1")
             .with(1, "aspen_2")
             .with(1, "aspen_3")),
     BAOBAB(3, 0.1f, 2,
             new ResourceKey[]{Biomes.DESERT},
             WNStructurePlacement.make(
                     WNStructureFolders.TREE_ASPEN
             )
             .with(1, "baobab_1")
             .with(1, "baobab_2")
             .with(1, "baobab_3")),
     FIR(1, 0.1f, 2,
             new ResourceKey[]{Biomes.TAIGA, Biomes.SNOWY_TAIGA},
             WNStructurePlacement.make(
                            WNStructureFolders.TREE_FIR
                    )
                    .with(1, "silver_fir_1")
                    .with(1, "silver_fir_2")
                    .with(1, "silver_fir_3")),
     CHERRY(3, 0.1f, 2,
             new ResourceKey[]{Biomes.PLAINS,Biomes.FLOWER_FOREST},
             WNStructurePlacement.make(
                     WNStructureFolders.TREE_CHERRY
             )
             .with(1, "cherry_1")
             .with(1, "cherry_2")
             .with(1, "cherry_3"));


     protected WNStructurePlacement getPlacement() {
        return placement;
    }
     protected ResourceKey<Biome>[] getBiome() {return biome;}

     protected int getPerChunk() {
        return perChunk;
    }
     protected float getExtraChance() {
        return extraChance;
    }
     protected int getExtra() {
        return extra;
    }

     private final WNStructurePlacement placement;
     private final ResourceKey<Biome>[] biome;
     private final int perChunk;
     private final float extraChance;
     private final int extra;



     Trees(int perChunk, float extraChance, int extra, ResourceKey<Biome>[] biome,  WNStructurePlacement placement) {
          this.placement = placement;
         this.perChunk = perChunk;
         this.extraChance = extraChance;
         this.extra = extra;
         this.biome = biome;
     }
}
