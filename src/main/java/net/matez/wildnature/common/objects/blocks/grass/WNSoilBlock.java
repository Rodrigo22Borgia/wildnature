/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.blocks.grass;

import net.matez.wildnature.common.objects.blockentities.soil.WNSoilBlockEntity;
import net.matez.wildnature.common.objects.blocks.basic.WNBaseEntityBlock;
import net.matez.wildnature.common.objects.tags.WNTags;
import net.matez.wildnature.data.block_models.WNBlockModel_CubeAll;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class WNSoilBlock extends WNBaseEntityBlock {
    public WNSoilBlock(ResourceLocation location, Properties properties) {
        super(location, properties);
    }

    public WNSoilBlock(ResourceLocation location, Properties properties, Item.Properties itemProperties) {
        super(location, properties, itemProperties);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, Random random) {
        BlockState up = level.getBlockState(pos.above());
        if (isRandomlyTicking(up) && up.is(BlockTags.FLOWERS) || up.is(BlockTags.SAPLINGS) || up.is(BlockTags.BEE_GROWABLES)) {
            up.getBlock().randomTick(up, level, pos.above(), random);
        }
    }

    public BlockState updateShape(BlockState p_58014_, Direction p_58015_, BlockState p_58016_, LevelAccessor p_58017_, BlockPos p_58018_, BlockPos p_58019_) {
        if (p_58015_ == Direction.UP && p_58016_.isAir() && p_58017_.getBlockEntity(p_58018_) instanceof WNSoilBlockEntity soil) {
            soil.destroy();
        }
        return p_58014_;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WNSoilBlockEntity(pos, state);
    }

    public ModelList getBlockModels() {
        return new ModelList()
                .with(new WNBlockModel_CubeAll(this.getRegName()).with("texture", this.getTextureName("grass/misc")));
    }

    @Nullable
    @Override
    public WNTags.TagList getWNTags() {
        return new WNTags.TagList(
                WNTags.ENDERMAN_HOLDABLE, WNTags.MOSS_REPLACEABLE, WNTags.AZALEA_GROWS_ON, WNTags.FORGE_DIRT,
                WNTags.BAMBOO_PLANTABLE_ON, WNTags.AZALEA_ROOT_REPLACEABLE,
                WNTags.BIG_DRIPLEAF_REPLACEABLE, WNTags.DRIPSTONE_REPLACEABLE_BLOCKS, WNTags.LUSH_GROUND_REPLACEABLE, WNTags.MINEABLE_SHOVEL, WNTags.DIRT
        );
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState state2, boolean p_60519_) {
        if (!state.is(state2.getBlock()) && level instanceof ServerLevel) {
            BlockEntity blockentity = level.getBlockEntity(pos);
            if (blockentity instanceof WNSoilBlockEntity soil) {
                soil.destroy();
            }
        }
        super.onRemove(state, level, pos, state2, p_60519_);
    }
}
