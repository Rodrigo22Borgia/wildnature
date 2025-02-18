/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.blocks.wood.vanilla.building;

import net.matez.wildnature.common.objects.blocks.basic.WNStairBlock;
import net.matez.wildnature.common.objects.blocks.setup.WNBlock;
import net.matez.wildnature.common.objects.blocks.wood.vanilla.VanillaLogType;
import net.matez.wildnature.common.objects.tags.WNTags;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.matez.wildnature.data.block_models.WNBlockModel_Stairs;
import net.matez.wildnature.data.block_models.WNBlockModel_StairsInner;
import net.matez.wildnature.data.block_models.WNBlockModel_StairsOuter;
import net.matez.wildnature.data.blockstates.WNBlockstate_Stairs;
import net.matez.wildnature.data.setup.base.WNResource;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class WNVanillaPlanksStairBlock extends WNStairBlock {
    protected final VanillaLogType logType;

    public WNVanillaPlanksStairBlock(ResourceLocation location, Supplier<BlockState> state, Properties properties, VanillaLogType logType) {
        super(location, state, properties);
        this.logType = logType;
    }

    public WNVanillaPlanksStairBlock(ResourceLocation location, Supplier<BlockState> state, Properties properties, Item.Properties itemProperties, VanillaLogType logType) {
        super(location, state, properties, itemProperties);
        this.logType = logType;
    }

    public WNBlock getPlanks(){
        return WNBlocks.VANILLA_PARQUET.get(this.logType);
    }

    @Override
    public WNResource getBlockstate() {
        return new WNBlockstate_Stairs(this.getRegistryName());
    }

    @Override
    public ModelList getBlockModels() {
        WNBlock planks = getPlanks();
        String texture = planks.getTextureName("trees/" + logType.getName());
        return new ModelList().with(
                new WNBlockModel_Stairs(this.getRegName()).with("texture",texture),
                new WNBlockModel_StairsInner(this.getRegName() + "_inner").with("texture",texture),
                new WNBlockModel_StairsOuter(this.getRegName() + "_outer").with("texture",texture)
        );
    }

    @Nullable
    @Override
    public WNTags.TagList getWNTags() {
        return new WNTags.TagList(
                WNTags.STAIRS, WNTags.WOODEN_STAIRS, WNTags.MINEABLE_AXE
        );
    }


    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 5;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 20;
    }
}
