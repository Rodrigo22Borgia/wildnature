/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.blocks.wood.building;

import net.matez.wildnature.common.objects.blocks.basic.WNButtonBlock;
import net.matez.wildnature.common.objects.blocks.setup.WNBlock;
import net.matez.wildnature.common.objects.blocks.wood.ILog;
import net.matez.wildnature.common.objects.blocks.wood.LogType;
import net.matez.wildnature.common.objects.tags.WNTags;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.matez.wildnature.data.block_models.WNBlockModel_Button;
import net.matez.wildnature.data.block_models.WNBlockModel_ButtonInventory;
import net.matez.wildnature.data.block_models.WNBlockModel_ButtonPressed;
import net.matez.wildnature.data.blockstates.WNBlockstate_Button;
import net.matez.wildnature.data.item_models.WNItemModel_BlockParent;
import net.matez.wildnature.data.setup.base.WNResource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

public class WNPlanksButton extends WNButtonBlock implements ILog {
    protected final LogType logType;

    public WNPlanksButton(ResourceLocation location, Properties properties, LogType logType) {
        super(location, true, properties);
        this.logType = logType;
    }

    public WNPlanksButton(ResourceLocation location, Properties properties, Item.Properties itemProperties, LogType logType) {
        super(location, true, properties, itemProperties);
        this.logType = logType;
    }

    protected SoundEvent getSound(boolean click) {
        return click ? SoundEvents.WOODEN_BUTTON_CLICK_ON : SoundEvents.WOODEN_BUTTON_CLICK_OFF;
    }

    public WNBlock getPlanks(){
        return WNBlocks.PLANKS.get(logType);
    }

    @Override
    public WNResource getBlockstate() {
        return new WNBlockstate_Button(this.getRegistryName());
    }

    @Override
    public ModelList getBlockModels() {
        WNBlock planks = getPlanks();
        String texture = planks.getTextureName("trees/" + logType.getBaseOrParent());
        return new ModelList().with(
                new WNBlockModel_Button(this.getRegName()).with("texture",texture),
                new WNBlockModel_ButtonPressed(this.getRegName() + "_pressed").with("texture",texture),
                new WNBlockModel_ButtonInventory(this.getRegName() + "_inventory").with("texture",texture)
        );
    }

    @Nullable
    @Override
    public WNResource getItemModel(){
        return new WNItemModel_BlockParent(getRegName()).with("parent",this.getRegName() + "_inventory");
    }

    @Nullable
    @Override
    public WNTags.TagList getWNTags() {
        return new WNTags.TagList(
                WNTags.BUTTONS, WNTags.WOODEN_BUTTONS, WNTags.MINEABLE_AXE
        );
    }
}
