/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.blocks.leaves;

import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
import net.matez.wildnature.common.objects.blocks.wood.LogType;
import net.matez.wildnature.common.objects.items.fruits.Fruit;
import net.matez.wildnature.common.objects.items.setup.WNBlockItem;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.matez.wildnature.common.registry.items.WNItems;
import net.matez.wildnature.common.registry.tabs.WNTabs;
import net.matez.wildnature.data.block_models.WNBlockModel_BushLeaves;
import net.matez.wildnature.data.block_models.WNBlockModel_BushLeavesFlower;
import net.matez.wildnature.data.item_models.WNItemModel_BlockParent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MaterialColor;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public enum LeafType {
    APPLE("apple","apple",MaterialColor.PLANT, false,
            new LeafConfig(7,true)
                .with(2,() -> Items.APPLE,1,1)
                .with(3,() -> Items.APPLE,1,1)
                .with(4,() -> Items.APPLE,1,1)
                .with(5,() -> WNItems.FRUITS.get(Fruit.GREEN_APPLE),1,1)
                .with(6,() -> WNItems.FRUITS.get(Fruit.GREEN_APPLE),1,1)
                .with(7,() -> WNItems.FRUITS.get(Fruit.GREEN_APPLE),1,1),
    WNSaplingType.APPLE),
    PARADISE_APPLE("paradise_apple","apple",MaterialColor.COLOR_RED, false,
            new LeafConfig(7,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.PARADISE_APPLE),3,3)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.PARADISE_APPLE),2,2)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.PARADISE_APPLE),1,1)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.PARADISE_APPLE),1,1)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.PARADISE_APPLE),2,2)
                    .with(7,() -> WNItems.FRUITS.get(Fruit.PARADISE_APPLE),2,2),
            WNSaplingType.APPLE),
    ASPEN("aspen","aspen",MaterialColor.COLOR_RED, true, LeafConfig.SIMPLE.get(), WNSaplingType.ASPEN),
    BAOBAB("baobab","baobab",MaterialColor.PLANT, true, LeafConfig.SIMPLE.get(), WNSaplingType.BAOBAB),
    BEECH("beech","beech",MaterialColor.PLANT, true, LeafConfig.SIMPLE.get(), WNSaplingType.BEECH),
    PURPLE_BEECH("purple_beech","beech",MaterialColor.PLANT, false, LeafConfig.SIMPLE.get(), WNSaplingType.PURPLE_BEECH),
    CEDAR("cedar","cedar",MaterialColor.PLANT, true, LeafConfig.SIMPLE.get(), WNSaplingType.CEDAR),
    CHERRY("cherry","cherry", MaterialColor.PLANT, false,
            new LeafConfig(6,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.CHERRY),2,2)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.CHERRY),1,1)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.CHERRY),2,2)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.CHERRY),2,2)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.CHERRY),1,1),
    WNSaplingType.CHERRY),
    WILD_CHERRY("wild_cherry","cherry",MaterialColor.PLANT, false,
            new LeafConfig(6,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.CHERRY),1,1)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.CHERRY),3,3)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.CHERRY),2,2)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.CHERRY),1,1)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.CHERRY),2,2),
    WNSaplingType.CHERRY),
    CHERRY_PINK("cherry_pink","cherry",MaterialColor.TERRACOTTA_WHITE, false,
            new LeafConfig(6,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.CHERRY),3,3)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.CHERRY),2,2)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.CHERRY),1,1)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.CHERRY),1,1)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.CHERRY),2,2),
    WNSaplingType.CHERRY_PINK),
    CHERRY_WHITE("cherry_white","cherry",MaterialColor.COLOR_PINK, false,
            new LeafConfig(6,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.CHERRY),3,3)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.CHERRY),2,2)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.CHERRY),1,1)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.CHERRY),1,1)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.CHERRY),2,2),
    WNSaplingType.CHERRY_WHITE),
    BANANA("banana","citrus",MaterialColor.PLANT, false, LeafConfig.SIMPLE.get(), WNSaplingType.BANANA),
    LEMON("lemon","citrus",MaterialColor.PLANT, false,
            new LeafConfig(7,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.LEMON),3,3)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.LEMON),2,2)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.LEMON),3,3)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.LEMON),2,2)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.LEMON),1,1)
                    .with(7,() -> WNItems.FRUITS.get(Fruit.LEMON),1,1),
    WNSaplingType.LEMON),
    LIME("lime","citrus",MaterialColor.PLANT, false,
            new LeafConfig(8,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.LIME),3,3)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.LIME),2,2)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.LIME),2,2)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.LIME),1,1)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.LIME),1,1)
                    .with(7,() -> WNItems.FRUITS.get(Fruit.LIME),3,3)
                    .with(8,() -> WNItems.FRUITS.get(Fruit.LIME),2,2),
    WNSaplingType.LIME),
    ORANGE("orange","citrus",MaterialColor.PLANT, false,
            new LeafConfig(7,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.ORANGE),3,3)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.ORANGE),2,2)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.ORANGE),1,1)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.ORANGE),1,1)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.ORANGE),2,2)
                    .with(7,() -> WNItems.FRUITS.get(Fruit.ORANGE),2,2),
    WNSaplingType.ORANGE),
    GRAPEFRUIT("grapefruit","citrus",MaterialColor.PLANT, false,
            new LeafConfig(7,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.GRAPEFRUIT),3,3)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.GRAPEFRUIT),2,2)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.GRAPEFRUIT),1,1)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.GRAPEFRUIT),1,1)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.GRAPEFRUIT),3,3)
                    .with(7,() -> WNItems.FRUITS.get(Fruit.GRAPEFRUIT),2,2),
    WNSaplingType.GRAPEFRUIT),
    POMEGRANATE("pomegranate","citrus",MaterialColor.PLANT, false,
            new LeafConfig(8,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.POMEGRANATE),2,2)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.POMEGRANATE),2,2)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.POMEGRANATE),1,1)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.POMEGRANATE),1,1)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.POMEGRANATE),2,2)
                    .with(7,() -> WNItems.FRUITS.get(Fruit.POMEGRANATE),1,1)
                    .with(8,() -> WNItems.FRUITS.get(Fruit.POMEGRANATE),3,3),
    WNSaplingType.POMEGRANATE),
    PEACH("peach","citrus",MaterialColor.PLANT, false,
            new LeafConfig(8,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.PEACH),2,2)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.PEACH),2,2)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.PEACH),1,1)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.PEACH),3,3)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.PEACH),2,2)
                    .with(7,() -> WNItems.FRUITS.get(Fruit.PEACH),3,3)
                    .with(8,() -> WNItems.FRUITS.get(Fruit.PEACH),2,2)
            , WNSaplingType.PEACH),
    MANGO("mango","citrus",MaterialColor.PLANT, false,
            new LeafConfig(8,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.MANGO),3,3)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.MANGO),2,2)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.MANGO),1,1)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.MANGO),3,3)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.MANGO),2,2)
                    .with(7,() -> WNItems.FRUITS.get(Fruit.MANGO),2,2)
                    .with(8,() -> WNItems.FRUITS.get(Fruit.MANGO),1,1)
            , WNSaplingType.MANGO),
    OLIVE("olive","citrus",MaterialColor.PLANT, false,
            new LeafConfig(8,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.OLIVES),3,3)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.OLIVES),3,3)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.OLIVES),2,2)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.OLIVES),3,3)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.OLIVES),2,2)
                    .with(7,() -> WNItems.FRUITS.get(Fruit.OLIVES),1,1)
                    .with(8,() -> WNItems.FRUITS.get(Fruit.OLIVES),1,1)
            , WNSaplingType.OLIVE),
    EBONY("ebony","ebony",MaterialColor.PLANT, false, LeafConfig.SIMPLE.get(), WNSaplingType.EBONY),
    EUCALYPTUS("eucalyptus","eucalyptus",MaterialColor.PLANT, false, LeafConfig.SIMPLE.get(), WNSaplingType.EUCALYPTUS),
    FIR("fir","fir",MaterialColor.PLANT, false,
            new LeafConfig(6,false)
            , WNSaplingType.FIR),
    SILVER_FIR("silver_fir","fir",MaterialColor.PLANT, false,
            new LeafConfig(5, false)
            , WNSaplingType.SILVER_FIR),
    FORSYTHIA("forsythia", "forsythia", MaterialColor.COLOR_YELLOW, false, LeafConfig.SIMPLE.get().model((block) -> {
        if (block instanceof WNLeavesTypedBlock leaf) {
            return new WNBlockModel_BushLeaves(block.getRegName())
                    .with("texture", block.getTextureName("trees/" + leaf.getLeafType().getFolder()) + "_flower")
                    .with("branch", block.getTextureName("trees/" + leaf.getLeafType().getFolder()) + "_branch");
        }
        return null;
    }), WNSaplingType.FORSYTHIA),
    GINKGO("ginkgo", "ginkgo", MaterialColor.PLANT, false, LeafConfig.SIMPLE.get(), WNSaplingType.GINKGO),
    HORNBEAM("hornbeam", "hornbeam", MaterialColor.PLANT, true, LeafConfig.SIMPLE.get(), WNSaplingType.HORNBEAM),
    HAZEL("hazel", "hazel", MaterialColor.PLANT, false, LeafConfig.SIMPLE.get(), WNSaplingType.HAZEL),
    JACARANDA("jacaranda", "jacaranda", MaterialColor.COLOR_PURPLE, false,
            new LeafConfig(3, false)
            , WNSaplingType.JACARANDA),
    RED_JACARANDA("red_jacaranda", "jacaranda", MaterialColor.COLOR_RED, false, LeafConfig.SIMPLE.get(), WNSaplingType.RED_JACARANDA),
    LARCH("larch", "larch", MaterialColor.PLANT, false, new LeafConfig(6, false), WNSaplingType.LARCH),
    MAHOGANY("mahogany", "mahogany", MaterialColor.PLANT, true, LeafConfig.SIMPLE.get(), WNSaplingType.MAHOGANY),
    MANGROVE("mangrove", "mangrove", MaterialColor.PLANT, true, LeafConfig.SIMPLE.get(), WNSaplingType.MANGROVE),
    MAPLE("maple", "maple", MaterialColor.PLANT, true, LeafConfig.SIMPLE.get(), WNSaplingType.MAPLE),
    MAPLE_RED("maple_red","maple",MaterialColor.COLOR_RED, false, LeafConfig.SIMPLE.get(), WNSaplingType.MAPLE_RED),
    MAPLE_ORANGE("maple_orange","maple",MaterialColor.COLOR_ORANGE, false, LeafConfig.SIMPLE.get(), WNSaplingType.MAPLE_ORANGE),
    MAPLE_YELLOW("maple_yellow","maple",MaterialColor.COLOR_YELLOW, false, LeafConfig.SIMPLE.get(), WNSaplingType.MAPLE_YELLOW),
    MAPLE_BROWN("maple_brown","maple",MaterialColor.COLOR_BROWN, false, LeafConfig.SIMPLE.get(), WNSaplingType.MAPLE_BROWN),
    MAGNOLIA("magnolia","magnolia",MaterialColor.COLOR_PINK,true,LeafConfig.SIMPLE.get().model((block) -> {
        if(block instanceof WNLeavesTypedBlock leaf) {
            return new WNBlockModel_BushLeavesFlower(block.getRegName())
                    .with("texture", block.getTextureName("trees/" + leaf.getLeafType().getFolder()))
                    .with("branch", block.getTextureName("trees/" + leaf.getLeafType().getFolder()) + "_branch")
                    .with("flower", block.getTextureName("trees/" + leaf.getLeafType().getFolder()) + "_flower");
        }
        return null;
    }).model((block) -> {
        if(block instanceof WNLeavesTypedBlock leaf) {
            return new WNBlockModel_BushLeavesFlower(block.getRegName() + "_inventory")
                    .with("texture", block.getTextureName("trees/" + leaf.getLeafType().getFolder()) + "_tinted")
                    .with("branch", block.getTextureName("trees/" + leaf.getLeafType().getFolder()) + "_branch")
                    .with("flower", block.getTextureName("trees/" + leaf.getLeafType().getFolder()) + "_flower");
        }
        return null;
    }).itemModel((block) -> new WNItemModel_BlockParent(block.getRegName()).with("parent",block.getRegName() + "_inventory")), WNSaplingType.MAGNOLIA),
    METASEQUOIA_GREEN("metasequoia_green","metasequoia",MaterialColor.PLANT, false, LeafConfig.SIMPLE.get(), WNSaplingType.METASEQUOIA_GREEN),
    METASEQUOIA_RED("metasequoia_red","metasequoia",MaterialColor.COLOR_RED, false, LeafConfig.SIMPLE.get(), WNSaplingType.METASEQUOIA_RED),
    METASEQUOIA_ORANGE("metasequoia_orange","metasequoia",MaterialColor.COLOR_ORANGE, false, LeafConfig.SIMPLE.get(), WNSaplingType.METASEQUOIA_ORANGE),
    METASEQUOIA_YELLOW("metasequoia_yellow","metasequoia",MaterialColor.COLOR_YELLOW, false, LeafConfig.SIMPLE.get(), WNSaplingType.METASEQUOIA_YELLOW),
    METASEQUOIA_BROWN("metasequoia_brown","metasequoia",MaterialColor.COLOR_BROWN, false, LeafConfig.SIMPLE.get(), WNSaplingType.METASEQUOIA_BROWN),
    NUYTSIA("nuytsia","nuytsia",MaterialColor.COLOR_ORANGE, false, LeafConfig.SIMPLE.get(), WNSaplingType.NUYTSIA),
    PALM("palm","palm",MaterialColor.PLANT, true, LeafConfig.SIMPLE.get(), WNSaplingType.PALM),
    PEAR("pear","pear",MaterialColor.PLANT, false, LeafConfig.SIMPLE.get(), null),
    PINE("pine","pine",MaterialColor.PLANT, false,
            new LeafConfig(3,false)
            , WNSaplingType.PINE),
    PLUM("plum","plum",MaterialColor.PLANT, false,
            new LeafConfig(6,true)
                    .with(2,() -> WNItems.FRUITS.get(Fruit.PLUM),3,3)
                    .with(3,() -> WNItems.FRUITS.get(Fruit.PLUM),3,3)
                    .with(4,() -> WNItems.FRUITS.get(Fruit.PLUM),2,2)
                    .with(5,() -> WNItems.FRUITS.get(Fruit.PLUM),1,1)
                    .with(6,() -> WNItems.FRUITS.get(Fruit.PLUM),2,2)
                    , null),
    MIRABELLE_PLUM("mirabelle_plum","plum",MaterialColor.PLANT, false,
            new LeafConfig(7, true)
                    .with(2, () -> WNItems.FRUITS.get(Fruit.MIRABELLE_PLUM), 2, 2)
                    .with(3, () -> WNItems.FRUITS.get(Fruit.MIRABELLE_PLUM), 3, 3)
                    .with(4, () -> WNItems.FRUITS.get(Fruit.MIRABELLE_PLUM), 3, 3)
                    .with(5, () -> WNItems.FRUITS.get(Fruit.MIRABELLE_PLUM), 2, 2)
                    .with(6, () -> WNItems.FRUITS.get(Fruit.MIRABELLE_PLUM), 1, 1)
                    .with(7, () -> WNItems.FRUITS.get(Fruit.MIRABELLE_PLUM), 1, 1)
                    ,null),
    POPLAR("poplar", "poplar", MaterialColor.PLANT, true, LeafConfig.SIMPLE.get(), null),
    REDWOOD("redwood", "redwood", MaterialColor.PLANT, false, LeafConfig.SIMPLE.get(), WNSaplingType.REDWOOD),
    ROWAN("rowan", "rowan", MaterialColor.PLANT, false,
            new LeafConfig(6, false)
                    .with(1, () -> WNItems.FRUITS.get(Fruit.ORANGE_ROWANBERRIES_CLUSTER), 2, 2)
                    .with(2, () -> WNItems.FRUITS.get(Fruit.RED_ROWANBERRIES_CLUSTER), 2, 2)
                    .with(3, () -> WNItems.FRUITS.get(Fruit.ORANGE_ROWANBERRIES_CLUSTER), 3, 3)
                    .with(4, () -> WNItems.FRUITS.get(Fruit.RED_ROWANBERRIES_CLUSTER), 3, 3)
                    .with(5, () -> WNItems.FRUITS.get(Fruit.ORANGE_ROWANBERRIES_CLUSTER), 1, 1)
                    .with(6, () -> WNItems.FRUITS.get(Fruit.RED_ROWANBERRIES_CLUSTER), 1, 1)
            , WNSaplingType.ROWAN),
    WILLOW("willow", "willow", MaterialColor.PLANT, true, LeafConfig.SIMPLE.get(), WNSaplingType.WILLOW),
    GLOWING_CAVE_OAK("glowing_cave_oak", "glowing_cave_oak", MaterialColor.PLANT, false, LeafConfig.SIMPLE.get(), null),
    ;
    //?------------------------------

    private final String idBase;
    private final String folder;
    private final MaterialColor color;
    private final boolean tinted;
    private final LeafConfig config;

    private final WNSaplingType sapling; //if null, get from the WNBlocks.SAPLINGS list
    private static final CreativeModeTab tab = WNTabs.TAB_SURFACE_PLANTS;

    LeafType(String idBase, String folder, MaterialColor color, boolean tinted, LeafConfig config, WNSaplingType sapling){
        this.idBase = idBase;
        this.folder = folder;
        this.color = color;
        this.tinted = tinted;
        this.sapling = sapling;
        this.config = config;
    }

    public String getIdBase() {
        return idBase;
    }

    public String getFolder() {
        return folder;
    }

    public MaterialColor getColor() {
        return color;
    }

    public LeafConfig getConfig() {
        return config;
    }

    @Nullable
    public WNSaplingType getSapling() {
        return sapling;
    }

    public Item getSaplingItem() {
        if (sapling == null) {
         return Items.STICK;
        }
        return WNBlocks.LEAVES.get(sapling.getLeafType()).asItem();
    }
    public Supplier<Block> getLog() {
        return getSapling().getLogType();
    }


    public boolean isTinted() {
        return tinted;
    }

    public CreativeModeTab getTab() {
        return tab;
    }
}