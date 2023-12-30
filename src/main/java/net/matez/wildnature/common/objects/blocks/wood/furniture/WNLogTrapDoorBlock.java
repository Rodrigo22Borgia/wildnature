/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.blocks.wood.furniture;

import net.matez.wildnature.common.objects.blocks.basic.WNTrapDoorBlock;
import net.matez.wildnature.common.objects.blocks.setup.WNBlock;
import net.matez.wildnature.common.objects.blocks.wood.ILog;
import net.matez.wildnature.common.objects.blocks.wood.LogType;
import net.matez.wildnature.common.objects.tags.WNTags;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.matez.wildnature.data.block_models.WNBlockModel_TrapdoorBottom;
import net.matez.wildnature.data.block_models.WNBlockModel_TrapdoorOpen;
import net.matez.wildnature.data.block_models.WNBlockModel_TrapdoorTop;
import net.matez.wildnature.data.blockstates.WNBlockstate_Trapdoor;
import net.matez.wildnature.data.item_models.WNItemModel_BlockParent;
import net.matez.wildnature.data.setup.base.WNResource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

public class WNLogTrapDoorBlock extends WNTrapDoorBlock implements ILog {
    protected final LogType logType;

    public WNLogTrapDoorBlock(ResourceLocation location, Properties properties, LogType logType) {
        super(location, properties);
        this.logType = logType;
    }

    public WNLogTrapDoorBlock(ResourceLocation location, Properties properties, Item.Properties itemProperties, LogType logType) {
        super(location, properties, itemProperties);
        this.logType = logType;
    }

    public WNBlock getPlanks(){
        WNBlock plank = WNBlocks.PLANKS.get(logType);
        return plank == null ? WNBlocks.DEV_STRUCTURE_CENTER : plank;
    }

    @Override
    public WNResource getBlockstate() {
        return new WNBlockstate_Trapdoor(this.getRegistryName());
    }

    @Override
    public ModelList getBlockModels() {
        String texture = this.getTextureName("trees/" + logType.getBaseOrParent());
        return new ModelList().with(
                new WNBlockModel_TrapdoorBottom(this.getRegName() + "_bottom").with("texture",texture),
                new WNBlockModel_TrapdoorOpen(this.getRegName() + "_open").with("texture",texture),
                new WNBlockModel_TrapdoorTop(this.getRegName() + "_top").with("texture",texture)
        );
    }

    @Nullable
    @Override
    public WNResource getItemModel(){
        return new WNItemModel_BlockParent(getRegName()).with("parent",this.getRegName() + "_bottom");
    }

    @Nullable
    @Override
    public WNTags.TagList getWNTags() {
        return new WNTags.TagList(
                WNTags.TRAPDOORS, WNTags.WOODEN_TRAPDOORS, WNTags.MINEABLE_AXE
        );
    }
}
