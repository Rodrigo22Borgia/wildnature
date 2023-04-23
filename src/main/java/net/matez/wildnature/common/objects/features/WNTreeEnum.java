package net.matez.wildnature.common.objects.features;

import net.matez.wildnature.common.objects.blocks.leaves.LeafType;
import net.matez.wildnature.common.objects.structures.WNStructureConfig;
import net.matez.wildnature.common.objects.structures.WNStructureFolders;
import net.matez.wildnature.common.objects.structures.WNStructurePlacement;
import net.matez.wildnature.common.objects.structures.configs.WNTreeConfig;
import net.matez.wildnature.common.registry.blocks.WNBlocks;

public enum WNTreeEnum {
    //Tree config
     ASPEN(3, 0.1f, 2,
             WNStructurePlacement.make(
                     WNStructureFolders.TREE_ASPEN
             )
             .with(1, "aspen_1")
             .with(1, "aspen_2")
             .with(1, "aspen_3")),
     BAOBAB(3, 0.1f, 2,
             WNStructurePlacement.make(
                     WNStructureFolders.TREE_ASPEN
             )
             .with(1, "baobab_1")
             .with(1, "baobab_2")
             .with(1, "baobab_3")),
     FIR(1, 0.1f, 2,
             WNStructurePlacement.make(
                            WNStructureFolders.TREE_FIR
                    )
                    .with(1, "silver_fir_1")
                    .with(1, "silver_fir_2")
                    .with(1, "silver_fir_3")),
    CHERRY_PINK(3, 0.1f, 2,
             WNStructurePlacement.make(
                     WNStructureFolders.TREE_CHERRY
             )
             .with(1, "cherry_1", WNTreeConfig.CHERRY_PINK)
             .with(1, "cherry_2", WNTreeConfig.CHERRY_PINK)
             .with(1, "cherry_3", WNTreeConfig.CHERRY_PINK)),
    CHERRY_WHITE(3, 0.1f, 2,
            WNStructurePlacement.make(
                            WNStructureFolders.TREE_CHERRY
                    )
                    .with(1, "cherry_1", WNTreeConfig.CHERRY_WHITE)
                    .with(1, "cherry_2", WNTreeConfig.CHERRY_WHITE)
                    .with(1, "cherry_3", WNTreeConfig.CHERRY_WHITE)),
    PALM(0, 0.5f, 2,
            WNStructurePlacement.make(
                            WNStructureFolders.TREE_PALM
                    )
                    .with(1, "tree_palm_1")
                    .with(1, "tree_palm_2")
                    .with(1, "tree_palm_3"));
     protected WNStructurePlacement getPlacement() {
        return placement;
    }
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
     private final int perChunk;
     private final float extraChance;
     private final int extra;



     WNTreeEnum(int perChunk, float extraChance, int extra, WNStructurePlacement placement) {
          this.placement = placement;
         this.perChunk = perChunk;
         this.extraChance = extraChance;
         this.extra = extra;
     }
}
