package net.matez.wildnature.common.objects.features;

import net.matez.wildnature.common.objects.structures.WNStructurePlacement;

public enum WNFallenTrees {
    BIRCH(new WNStructurePlacement("wildnature:nature/fallen_trees/birch/")
            .with(1,"fallen_birch_1")
            .with(1,"fallen_birch_2")
            .with(1,"fallen_birch_3")
            .with(1,"fallen_birch_4")),
    SPRUCE(new WNStructurePlacement("wildnature:nature/fallen_trees/spruce/")
            .with(1, "fallen_spruce_1")
            .with(1, "fallen_spruce_2")
            .with(1, "fallen_spruce_3")
            .with(1, "fallen_spruce_4"));



    private WNStructurePlacement placement;

    WNFallenTrees(WNStructurePlacement placement) {
        this.placement = placement;
    }
    public WNStructurePlacement getPlacement() {
        return placement;
    }
}
