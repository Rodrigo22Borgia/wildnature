/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.blocks.plant;

import net.matez.wildnature.common.objects.blocks.setup.WNBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;

public interface BushConstructor<T> {
    WNBlock get(T type, BlockBehaviour.Properties blockProperties, Item.Properties itemProperties);
}
