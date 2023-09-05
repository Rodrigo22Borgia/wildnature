package net.matez.wildnature.common.objects.features;

import net.matez.wildnature.common.objects.structures.WNStructurePlacement;

public enum WNExtraTrees {
    SPRUCE(new WNStructurePlacement("wildnature:nature/trees/spruce/")
            .with(1, "spruce_1")
            .with(1, "spruce_2")
            .with(1, "spruce_3")
            .with(1, "spruce_4")
            .with(1, "tree_spruce_m_1")
            .with(1, "tree_spruce_m_2")
            .with(1, "tree_spruce_m_3")
            .with(1, "tree_spruce_m_4")
            .with(1, "tree_spruce_m_5")
            .with(1, "tree_spruce_m_6")
            .with(1, "tree_spruce_m_7")
            .with(1, "tree_spruce_m_8")
            .with(1, "tree_spruce_m_9")),
    
    OAK(new WNStructurePlacement("wildnature:nature/trees/oak/")
            .with(1, "tree_oak_21")
            .with(1, "tree_oak_22")
            .with(1, "tree_oak_24")
            .with(1, "tree_oak_20")
            .with(1, "tree_oak_15")
            .with(1, "tree_oak_17")
            .with(1, "tree_oak_19")
            .with(1, "tree_oak_29"));



    private WNStructurePlacement placement;

    WNExtraTrees(WNStructurePlacement placement) {
        this.placement = placement;
    }
    public WNStructurePlacement getPlacement() {
        return placement;
    }
}
