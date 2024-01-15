package net.matez.wildnature.common.objects.features;

import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
import net.matez.wildnature.common.objects.structures.WNStructureFolders;
import net.matez.wildnature.common.objects.structures.WNStructurePlacement;
import net.matez.wildnature.common.objects.structures.configs.WNTreeConfig;

public enum WNExtraTrees {
    HIGH_BIRCH_(new WNStructurePlacement("wildnature:nature/trees/birch/")
            .with(1, "high_birch_1")
            .with(1, "high_birch_2")),
    MEGA_OAK_(new WNStructurePlacement("wildnature:nature/trees/oak/")
            .with(1, "mega_oak_1")
            .with(1, "mega_oak_2")
            .with(1, "mega_oak_3")
            .with(1, "mega_oak_4")
            .with(1, "mega_oak_5")
            .with(1, "mega_oak_6")
            .with(1, "mega_oak_7")),
    CITRUS(new WNStructurePlacement("wildnature:nature/trees/citrus/")
            .with(1, "citrus_1")
            .with(1, "citrus_2")
            .with(1, "citrus_3")
            .with(1, "citrus_4")
            .with(1, "citrus_5")
            .with(1, "citrus_6")),
    SAKURA(new WNStructurePlacement("wildnature:nature/trees/cherry/")
            .with(1, "sakura_1")
            .with(1, "sakura_2")
            .with(1, "sakura_3")
            .with(1, "sakura_4")
            .with(1, "sakura_5")
            .with(1, "sakura_6")
            .with(1, "sakura_7")),
    ACACIA(new WNStructurePlacement("wildnature:nature/trees/acacia/")
            .with(1, "acacia_1")
            .with(1, "acacia_2")
            .with(1, "acacia_3")
            .with(1, "acacia_4")
            .with(1, "acacia_5")),
    APPLE(WNSaplingType.APPLE.getPlacement()),
    ASPEN(WNSaplingType.ASPEN.getPlacement()),
    BALD_HIGH_OAK_(new WNStructurePlacement("wildnature:nature/trees/oak/")
            .with(1, "bald_high_oak_1")
            .with(1, "bald_high_oak_2")),
    BALD_OAK_(new WNStructurePlacement("wildnature:nature/trees/oak/")
            .with(1, "bald_oak_1")
            .with(1, "bald_oak_2")
            .with(1, "bald_oak_3")
            .with(1, "bald_oak_4")),

    BANANA(WNSaplingType.BANANA.getPlacement()),
    BAOBAB(WNSaplingType.BAOBAB.getPlacement()),
    BEECH(WNSaplingType.BEECH.getPlacement()),
    BIG_ACACIA(new WNStructurePlacement("wildnature:nature/trees/acacia/")
            .with(1, "big_acacia_1")
            .with(1, "big_acacia_2")),
    BIG_BIRCH_(new WNStructurePlacement("wildnature:nature/trees/birch/")
            .with(1, "big_birch_1")
            .with(1, "big_birch_2")
            .with(1, "big_birch_3")
            .with(1, "big_birch_4")
            .with(1, "big_birch_5")
            .with(1, "big_birch_6")),
    BIG_EUCALYPTUS(WNSaplingType.EUCALYPTUS.getBigPlacement()),
    BIRCH(new WNStructurePlacement("wildnature:nature/trees/birch/")
            .with(1, "birch_1")
            .with(1, "birch_2")
            .with(1, "birch_3")
            .with(1, "birch_4")
            .with(1, "birch_5")
            .with(1, "birch_6")
            .with(1, "birch_7")
            .with(1, "birch_8")),
    BRANCHY_OAK_(new WNStructurePlacement("wildnature:nature/trees/oak/")
            .with(1, "branchy_oak_1")
            .with(1, "branchy_oak_2")
            .with(1, "branchy_oak_3")
            .with(1, "branchy_oak_4")
            .with(1, "branchy_oak_5")),
    CHERRY(WNSaplingType.CHERRY.getPlacement()),

    CYPRESS(new WNStructurePlacement("wildnature:nature/trees/cypress/")
            .with(1, "cypress_1")
            .with(1, "cypress_2")
            .with(1, "cypress_3")
            .with(1, "cypress_4")),
    DARK_HIGH_OAK_(new WNStructurePlacement("wildnature:nature/trees/oak/")
            .with(1, "dark_high_oak_1")
            .with(1, "dark_high_oak_2")
            .with(1, "dark_high_oak_3")
            .with(1, "dark_high_oak_4")),
    EBONY_SHRUB(new WNStructurePlacement("wildnature:nature/trees/ebony/")
            .with(1, "ebony_shrub_1")
            .with(1, "ebony_shrub_2")),
    EUCALYPTUS(WNSaplingType.EUCALYPTUS.getPlacement()),
    EUCALYPTUS_(WNSaplingType.EUCALYPTUS.getPlacement()),
    EUCALYPTUS_SHRUB(new WNStructurePlacement("wildnature:nature/trees/eucalyptus/")
            .with(1, "eucalyptus_shrub_1")
            .with(1, "eucalyptus_shrub_2")
            .with(1, "eucalyptus_shrub_3")
            .with(1, "eucalyptus_shrub_4")
            .with(1, "eucalyptus_shrub_5")
            .with(1, "eucalyptus_shrub_6")
            .with(1, "eucalyptus_shrub_7")
            .with(1, "eucalyptus_shrub_8")),
    FIR(WNSaplingType.FIR.getPlacement()),
    FORSYTHIA(WNSaplingType.FORSYTHIA.getPlacement()),
    GIANT_BAOBAB(WNSaplingType.BAOBAB.getBigPlacement()),
    GRAPEFRUIT(WNSaplingType.GRAPEFRUIT.getPlacement()),
    GREENWOOD(new WNStructurePlacement("wildnature:nature/trees/greenwood/")
            .with(1, "greenwood_1")
            .with(1, "greenwood_2")
            .with(1, "greenwood_3")
            .with(1, "greenwood_4")),
    HAZEL(WNSaplingType.HAZEL.getPlacement()),
    HIGH_BEECH_(new WNStructurePlacement("wildnature:nature/trees/beech/")
            .with(1, "high_beech_1")
            .with(1, "high_beech_2")
            .with(1, "high_beech_3")
            .with(1, "high_beech_4")
            .with(1, "high_beech_5")),
    HIGH_OAK_(new WNStructurePlacement("wildnature:nature/trees/oak/")
            .with(1, "high_oak_1")
            .with(1, "high_oak_2")
            .with(1, "high_oak_3")
            .with(1, "high_oak_4")),
    JACARANDA(WNSaplingType.JACARANDA.getPlacement()),

    JUNGLE_BIG(new WNStructurePlacement("wildnature:nature/trees/jungle/")
            .with(1, "jungle_big_1")
            .with(1, "jungle_big_2")
            .with(1, "jungle_big_3")),
    JUNGLE_MEDIUM(new WNStructurePlacement("wildnature:nature/trees/jungle/")
            .with(1, "jungle_medium_1")
            .with(1, "jungle_medium_2")
            .with(1, "jungle_medium_3")),
    JUNGLE_SMALL(new WNStructurePlacement("wildnature:nature/trees/jungle/")
            .with(1, "jungle_small_1")
            .with(1, "jungle_small_2")
            .with(1, "jungle_small_3")),
    LEAFY_BEECH_(new WNStructurePlacement("wildnature:nature/trees/beech/")
            .with(1, "leafy_beech_1")
            .with(1, "leafy_beech_2")
            .with(1, "leafy_beech_3")),
    MAGNOLIA(new WNStructurePlacement("wildnature:nature/trees/magnolia/")
            .with(1, "magnolia_1")
            .with(1, "magnolia_2")
            .with(1, "magnolia_3")
            .with(1, "magnolia_4")
            .with(1, "magnolia_5")),
    MAHOGANY(WNSaplingType.MAHOGANY.getPlacement()),
    MAHOGANYSHRUB(new WNStructurePlacement("wildnature:nature/trees/mahogany/")
            .with(1, "mahogany_shrub_1")
            .with(1, "mahogany_shrub_2")),
    MANGROVE(WNSaplingType.MANGROVE.getPlacement()),
    MANGROVE_SHRUB(new WNStructurePlacement("wildnature:nature/trees/mangrove/")
            .with(1, "mangrove_shrub_1")
            .with(1, "mangrove_shrub_2")
            .with(1, "mangrove_shrub_3")
            .with(1, "mangrove_shrub_4")),
    MAPLE(WNSaplingType.MAPLE.getPlacement()),
    MAPLE_BROWN(WNSaplingType.MAPLE_BROWN.getPlacement()),
    MAPLE_ORANGE(WNSaplingType.MAPLE_ORANGE.getPlacement()),
    MAPLE_RED(WNSaplingType.MAPLE_RED.getPlacement()),
    MAPLE_YELLOW(WNSaplingType.MAPLE_YELLOW.getPlacement()),
    MINI_BALD_PINE(new WNStructurePlacement("wildnature:nature/trees/pine/")
            .with(1, "thin_pine_1")
            .with(1, "thin_pine_2")
            .with(1, "thin_pine_3")
            .with(1, "thin_pine_4")),
    MINI_PINE(new WNStructurePlacement("wildnature:nature/trees/pine/")
            .with(1, "thin_pine_1")
            .with(1, "thin_pine_2")
            .with(1, "thin_pine_3")
            .with(1, "thin_pine_4")),
    NUYTSIA(WNSaplingType.NUYTSIA.getPlacement()),
    NUYTSIA_SHRUB(new WNStructurePlacement("wildnature:nature/trees/nuytsia/")
            .with(1, "nuytsia_shrub_1")
            .with(1, "nuytsia_shrub_2")
            .with(1, "nuytsia_shrub_3")
            .with(1, "nuytsia_shrub_4")
            .with(1, "nuytsia_shrub_5")
            .with(1, "nuytsia_shrub_6")),
    OAK(new WNStructurePlacement("wildnature:nature/trees/oak/")
            .with(1, "tree_oak_21")
            .with(1, "tree_oak_22")
            .with(1, "tree_oak_24")
            .with(1, "tree_oak_20")
            .with(1, "tree_oak_15")
            .with(1, "tree_oak_17")
            .with(1, "tree_oak_19")),
    OAKLANDS_OAK(new WNStructurePlacement("wildnature:nature/trees/oaklands/")
            .with(1, "oaklands_oak_1")
            .with(1, "oaklands_oak_2")
            .with(1, "oaklands_oak_3")
            .with(1, "oaklands_oak_4")
            .with(1, "oaklands_oak_5")
            .with(1, "oaklands_oak_6")
            .with(1, "oaklands_oak_7")
            .with(1, "oaklands_oak_8")),
    OAKLANDS_SHRUB(new WNStructurePlacement("wildnature:nature/trees/oaklands/")
            .with(1, "oaklands_shrub_1")
            .with(1, "oaklands_shrub_2")
            .with(1, "oaklands_shrub_3")
            .with(1, "oaklands_shrub_4")
            .with(1, "oaklands_shrub_5")
            .with(1, "oaklands_shrub_6")
            .with(1, "oaklands_shrub_7")
            .with(1, "oaklands_shrub_8")),
    OAKLANDS_SMALLSHRUB(new WNStructurePlacement("wildnature:nature/trees/oaklands/")
            .with(1, "oaklands_small_shrub_1")
            .with(1, "oaklands_small_shrub_2")
            .with(1, "oaklands_small_shrub_3")),
    OLIVE(WNSaplingType.OLIVE.getPlacement()),
    ORANGE(WNSaplingType.ORANGE.getPlacement()),
    PALM(WNSaplingType.PALM.getPlacement()),
    PEACH(WNSaplingType.PEACH.getPlacement()),
    PEAR(new WNStructurePlacement("wildnature:nature/trees/pear/")
            .with(1, "pear_1")
            .with(1, "pear_2")
            .with(1, "pear_3")),
    PINE(WNSaplingType.PINE.getPlacement()),
    POINTY_BIRCH(new WNStructurePlacement("wildnature:nature/trees/birch/")
            .with(1, "pointy_birch_1")
            .with(1, "pointy_birch_2")
            .with(1, "pointy_birch_3")
            .with(1, "pointy_birch_4")),
    POINTY_OAK_(new WNStructurePlacement("wildnature:nature/trees/oak/")
            .with(1, "pointy_oak_1")
            .with(1, "pointy_oak_2")
            .with(1, "pointy_oak_3")
            .with(1, "pointy_oak_4")
            .with(1, "pointy_oak_5")),
    POINTY_WILLOW_(new WNStructurePlacement("wildnature:nature/trees/willow/")
            .with(1, "pointy_willow_1")
            .with(1, "pointy_willow_2")
            .with(1, "pointy_willow_3")
            .with(1, "pointy_willow_4")),
    POMEGRANATE(WNSaplingType.POMEGRANATE.getPlacement()),
    ROWAN(WNSaplingType.ROWAN.getPlacement()),
    SCRUBLAND_SHRUB(new WNStructurePlacement("wildnature:nature/trees/shrubs/")
            .with(1, "scrubland_shrub_1")
            .with(1, "scrubland_shrub_2")
            .with(1, "scrubland_shrub_3")
            .with(1, "scrubland_shrub_4")),
    SEASONAL_BIRCH(new WNStructurePlacement("wildnature:nature/trees/birch/")
            .with(1, "seasonal_birch_1")
            .with(1, "seasonal_birch_2")
            .with(1, "seasonal_birch_3")
            .with(1, "seasonal_birch_4")),
    SEQUOIA(new WNStructurePlacement(WNStructureFolders.TREE_SEQUOIA)
            .with(1, "sequoia_1")
            .with(1, "sequoia_2")
            .with(1, "sequoia_3")
            .with(1, "sequoia_4")
            .with(1, "sequoia_5")
            .with(1, "sequoia_6")),
    SHRUB_TALL(new WNStructurePlacement("wildnature:nature/trees/shrubs/")
            .with(1, "giant_bush_1")
            .with(1, "giant_bush_2")
            .with(1, "giant_bush_3")
            .with(1, "giant_bush_4")),
    SILVER_FIR(WNSaplingType.SILVER_FIR.getPlacement()),
    SMALL_REDWOOD(new WNStructurePlacement("wildnature:nature/trees/redwood/")
            .with(1, "small_redwood_1")
            .with(1, "small_redwood_2")
            .with(1, "small_redwood_3")
            .with(1, "small_redwood_4")
            .with(1, "small_redwood_5")
            .with(1, "small_redwood_6")),
    SMALL_WILLOW(new WNStructurePlacement("wildnature:nature/trees/willow/")
            .with(1, "small_willow_1")
            .with(1, "small_willow_2")
            .with(1, "small_willow_3")
            .with(1, "small_willow_4")),
    SPIKY_BIRCH_(new WNStructurePlacement("wildnature:nature/trees/birch/")
            .with(1, "spiky_birch_1")
            .with(1, "spiky_birch_2")
            .with(1, "spiky_birch_3")
            .with(1, "spiky_birch_4")),
    SPOOKY(new WNStructurePlacement("wildnature:nature/trees/spooky/")
            .with(1, "spooky_1")
            .with(1, "spooky_2")
            .with(1, "spooky_3")
            .with(1, "spooky_4")
            .with(1, "spooky_5")
            .with(1, "spooky_6")
            .with(1, "spooky_7")
            .with(1, "spooky_8")
            .with(1, "spooky_9")
            .with(1, "spooky_10")
            .with(1, "spooky_11")
            .with(1, "spooky_12")
            .with(1, "spooky_13")
            .with(1, "spooky_14")
            .with(1, "spooky_15")),
    SPOOKY_BIG(new WNStructurePlacement("wildnature:nature/trees/spooky/")
            .with(1, "spooky_big_1")
            .with(1, "spooky_big_2")
            .with(1, "spooky_big_3")
            .with(1, "spooky_big_4")
            .with(1, "spooky_big_5")
            .with(1, "spooky_big_6")
            .with(1, "spooky_big_7")
            .with(1, "spooky_big_8")),
    SPRUCE(new WNStructurePlacement("wildnature:nature/trees/spruce/")
            .with(1, "spruce_1")
            .with(1, "spruce_2")
            .with(1, "spruce_3")
            .with(1, "spruce_4")),
    TALL_PINE(WNSaplingType.PINE.getPlacement()),
    THICK_BEECH(new WNStructurePlacement("wildnature:nature/trees/beech/")
            .with(1, "thick_beech_1")
            .with(1, "thick_beech_2")
            .with(1, "thick_beech_3")
            .with(1, "thick_beech_4")),
    THIN_BIRCH(new WNStructurePlacement("wildnature:nature/trees/birch/")
            .with(1, "thin_birch_1")
            .with(1, "thin_birch_2")
            .with(1, "thin_birch_3")
            .with(1, "thin_birch_4")),
    THIN_PINE(new WNStructurePlacement("wildnature:nature/trees/pine/")
            .with(1, "thin_pine_1")
            .with(1, "thin_pine_2")
            .with(1, "thin_pine_3")
            .with(1, "thin_pine_4")),
    TREE_BIALOWIEZA(new WNStructurePlacement("wildnature:nature/trees/bialowieza/")
            .with(1, "bialowieza_1")
            .with(1, "bialowieza_2")
            .with(1, "bialowieza_3")
            .with(1, "bialowieza_4")
            .with(1, "bialowieza_5")
            .with(1, "bialowieza_6")),
    TREE_BIRCH(new WNStructurePlacement("wildnature:nature/trees/birch/")
            .with(1, "tree_birch_1")
            .with(1, "tree_birch_2")
            .with(1, "tree_birch_3")
            .with(1, "tree_birch_4")
            .with(1, "tree_birch_5")
            .with(1, "tree_birch_6")
            .with(1, "tree_birch_7")
            .with(1, "tree_birch_8")
            .with(1, "tree_birch_9")
            .with(1, "tree_birch_10")
            .with(1, "tree_birch_11")
            .with(1, "tree_birch_12")),
    TREE_BPINE(WNSaplingType.PINE.getBigPlacement()),
    TREE_FIR(WNSaplingType.FIR.getPlacement()),
    TREE_HORNBEAM(WNSaplingType.HORNBEAM.getPlacement()),
    TREE_LARCH(WNSaplingType.LARCH.getPlacement()),
    TREE_OAK(new WNStructurePlacement("wildnature:nature/trees/oak/")
            .with(1, "tree_oak_1")
            .with(1, "tree_oak_2")
            .with(1, "tree_oak_3")
            .with(1, "tree_oak_4")
            .with(1, "tree_oak_5")
            .with(1, "tree_oak_6")
            .with(1, "tree_oak_7")
            .with(1, "tree_oak_8")
            .with(1, "tree_oak_9")
            .with(1, "tree_oak_10")),
    TREE_PALM(WNSaplingType.PALM.getPlacement()),
    TREE_PINE(WNSaplingType.PINE.getPlacement()),
    TREE_REDWOOD(WNSaplingType.REDWOOD.getPlacement()),
    TREE_SPRUCE_BIG(new WNStructurePlacement("wildnature:nature/trees/spruce/")
            .with(1, "tree_spruce_big_1")
            .with(1, "tree_spruce_big_2")
            .with(1, "tree_spruce_big_3")
            .with(1, "tree_spruce_big_4")),
    TREE_SPRUCE_M(new WNStructurePlacement("wildnature:nature/trees/spruce/")
            .with(1, "tree_spruce_m_1")
            .with(1, "tree_spruce_m_2")
            .with(1, "tree_spruce_m_3")
            .with(1, "tree_spruce_m_4")
            .with(1, "tree_spruce_m_5")
            .with(1, "tree_spruce_m_6")
            .with(1, "tree_spruce_m_7")
            .with(1, "tree_spruce_m_8")
            .with(1, "tree_spruce_m_9")),
    TREE_TAIGA(WNSaplingType.SILVER_FIR.getPlacement()),
    WEEPING_BEECH_(new WNStructurePlacement("wildnature:nature/trees/beech/")
            .with(1, "weeping_beech_1")
            .with(1, "weeping_beech_2")
            .with(1, "weeping_beech_3")
            .with(1, "weeping_beech_4")),
    WEEPING_CEDAR_(new WNStructurePlacement("wildnature:nature/trees/cedar/")
            .with(1, "weeping_cedar_1")
            .with(1, "weeping_cedar_2")
            .with(1, "weeping_cedar_3")
            .with(1, "weeping_cedar_4")
            .with(1, "weeping_cedar_5")
            .with(1, "weeping_cedar_6")),
    LEMON(new WNStructurePlacement("wildnature:nature/trees/citrus/")
            .with(1, "lemon_1")
            .with(1, "lemon_2")
            .with(1, "lemon_3")),
    LIME(new WNStructurePlacement("wildnature:nature/trees/citrus/")
            .with(1, "lime_1")
            .with(1, "lime_2")
            .with(1, "lime_3")),
    CEDAR(new WNStructurePlacement("wildnature:nature/trees/cedar/")
            .with(1,"cedar_1")
            .with(1,"cedar_2")
            .with(1,"cedar_3")
            .with(1,"cedar_4")
            .with(1,"cedar_5")
            .with(1,"cedar_6")
            .with(1,"cedar_7")
            .with(1,"cedar_8")),
    WILD_CHERRY(new WNStructurePlacement(WNStructureFolders.TREE_CHERRY)
            .with(1, "wild_cherry_1")
            .with(1, "wild_cherry_2")
            .with(1, "wild_cherry_3")
            .with(1, "wild_cherry_4"));


    private WNStructurePlacement placement;

    WNExtraTrees(WNStructurePlacement placement) {
        this.placement = placement;
    }

    public WNStructurePlacement getPlacement() {
        return placement;
    }
}
