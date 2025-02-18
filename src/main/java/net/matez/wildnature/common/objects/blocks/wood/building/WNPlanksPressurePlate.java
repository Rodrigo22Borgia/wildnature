/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.blocks.wood.building;

import net.matez.wildnature.common.objects.blocks.basic.WNPressurePlateBlock;
import net.matez.wildnature.common.objects.blocks.setup.WNBlock;
import net.matez.wildnature.common.objects.blocks.wood.ILog;
import net.matez.wildnature.common.objects.blocks.wood.LogType;
import net.matez.wildnature.common.objects.tags.WNTags;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.matez.wildnature.data.block_models.WNBlockModel_PressurePlate;
import net.matez.wildnature.data.block_models.WNBlockModel_PressurePlateDown;
import net.matez.wildnature.data.blockstates.WNBlockstate_PressurePlate;
import net.matez.wildnature.data.setup.base.WNResource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

public class WNPlanksPressurePlate extends WNPressurePlateBlock implements ILog {
    protected final LogType logType;

    public WNPlanksPressurePlate(ResourceLocation location, Properties properties, LogType logType) {
        super(location, Sensitivity.EVERYTHING, properties);
        this.logType = logType;
    }

    public WNPlanksPressurePlate(ResourceLocation location, Properties properties, Item.Properties itemProperties, LogType logType) {
        super(location, Sensitivity.EVERYTHING, properties, itemProperties);
        this.logType = logType;
    }

    public WNBlock getPlanks(){
        return WNBlocks.PLANKS.get(logType);
    }

    @Override
    public WNResource getBlockstate() {
        return new WNBlockstate_PressurePlate(this.getRegistryName());
    }

    @Override
    public ModelList getBlockModels() {
        WNBlock planks = getPlanks();
        String texture = planks.getTextureName("trees/" + logType.getBaseOrParent());
        return new ModelList().with(
                new WNBlockModel_PressurePlate(this.getRegName()).with("texture",texture),
                new WNBlockModel_PressurePlateDown(this.getRegName() + "_down").with("texture",texture)
        );
    }


    @Nullable
    @Override
    public WNTags.TagList getWNTags() {
        return new WNTags.TagList(
                WNTags.PRESSURE_PLATES, WNTags.WOODEN_PRESSURE_PLATES, WNTags.WALL_POST_OVERRIDE, WNTags.MINEABLE_AXE
        );
    }
}
