/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.blocks.water_plants;

import net.matez.wildnature.data.block_models.plants.WNBlockModel_ParrotsFeatherPlant;
import net.matez.wildnature.data.blockstates.WNBlockstate_RandomlyRotatedCube;
import net.matez.wildnature.data.item_models.WNItemModel_Generated;
import net.matez.wildnature.data.setup.base.WNResource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

public class WNParrotsFeatherPlantBlock extends WNWaterlilyBlock {
    public WNParrotsFeatherPlantBlock(ResourceLocation location, Properties properties, WaterPlant waterPlant) {
        super(location, properties, waterPlant);
    }

    public WNParrotsFeatherPlantBlock(ResourceLocation location, Properties properties, Item.Properties itemProperties, WaterPlant waterPlant) {
        super(location, properties, itemProperties, waterPlant);
    }

    @Override
    public WNResource getBlockstate() {
        return new WNBlockstate_RandomlyRotatedCube(this.getRegistryName());
    }

    @Nullable
    @Override
    public WNResource getItemModel() {
        return new WNItemModel_Generated(this.getRegName()).with("texture",this.getTextureName("plants/water/" + getRegName()));
    }

    @Override
    public ModelList getBlockModels() {
        return new ModelList().with(
                new WNBlockModel_ParrotsFeatherPlant(this.getRegName()).with("texture",this.getTextureName("plants/water/" + getRegName()))
        );
    }
}
