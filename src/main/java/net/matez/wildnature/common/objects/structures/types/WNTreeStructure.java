/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.structures.types;

import net.matez.wildnature.common.objects.blockentities.soil.WNSoilBlockEntity;
import net.matez.wildnature.common.objects.blocks.basic.WNBaseEntityBlock;
import net.matez.wildnature.common.objects.structures.WNStructure;
import net.matez.wildnature.common.objects.structures.WNStructureConfig;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.chunk.LevelChunk;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Random;

public class WNTreeStructure extends WNStructure {
    private BlockPos minLeaf, maxLeaf;
    private BlockState leafBlock;

    public WNTreeStructure(ResourceLocation location) {
        super(location);
    }

    @Override
    protected void onLoad() {
        super.onLoad();
        this.loadMaxLeaf();
        this.loadMinLeaf();
        this.loadLeafBlock();
    }

    private void loadMinLeaf() {
        BlockPos min = null;
        for (Map.Entry<BlockPos, BlockState> entry : this.blocks.entrySet()) {
            BlockPos blockPos = entry.getKey();
            if (entry.getValue().is(BlockTags.LEAVES)) {
                if (min == null) {
                    min = blockPos;
                } else {
                    min = new BlockPos(Math.min(blockPos.getX(), min.getX()), Math.min(blockPos.getY(), min.getY()), Math.min(blockPos.getZ(), min.getZ()));
                }
            }
        }
        this.minLeaf = min;
    }

    public void loadMaxLeaf() {
        BlockPos max = null;
        for (Map.Entry<BlockPos, BlockState> entry : this.blocks.entrySet()) {
            BlockPos blockPos = entry.getKey();
            if (entry.getValue().is(BlockTags.LEAVES)) {
                if (max == null) {
                    max = blockPos;
                } else {
                    max = new BlockPos(Math.max(blockPos.getX(), max.getX()), Math.max(blockPos.getY(), max.getY()), Math.max(blockPos.getZ(), max.getZ()));
                }
            }
        }
        this.maxLeaf = max;
    }

    private void loadLeafBlock() {
        int max = -1;
        BlockState value = null;
        for (Map.Entry<BlockState, Integer> entry : getBlockOccurrences((state) -> state.is(BlockTags.LEAVES)).entrySet()) {
            if (value == null || entry.getValue() > max) {
                max = entry.getValue();
                value = entry.getKey();
            }
        }

        this.leafBlock = value;
    }

    public BlockPos getMaxLeaf() {
        return maxLeaf;
    }

    public BlockPos getMinLeaf() {
        return minLeaf;
    }

    public BlockState getLeafBlock() {
        return leafBlock;
    }

    @Override
    public void place(LevelAccessor level, BlockPos pos, @org.jetbrains.annotations.Nullable Rotation rotation, @org.jetbrains.annotations.Nullable WNStructureConfig config, Random random, int placeData) {
        super.place(level, pos, rotation, config, random, placeData);

        level.setBlock(pos, WNBlocks.SOIL.defaultBlockState(), placeData | 3);
        BlockEntity entity;
        var iChunk = level.getChunk(pos);
        if (iChunk instanceof LevelChunk chunk) {
            entity = chunk.getBlockEntity(pos, LevelChunk.EntityCreationType.IMMEDIATE);
        } else {
            entity = ((WNBaseEntityBlock) WNBlocks.SOIL).newBlockEntity(pos, WNBlocks.SOIL.defaultBlockState());
            assert entity != null;
            iChunk.setBlockEntity(entity);
            iChunk.setBlockEntityNbt(entity.serializeNBT());
        }
        if (entity instanceof WNSoilBlockEntity soil) {
            //Moved the method from the entity itself, because it did not trigger during generation
            var min = this.getMinLeaf();
            var max = this.getMaxLeaf();
            if (rotation != null) {
                min = min.rotate(rotation);
                max = max.rotate(rotation);
            }

            soil.min = new BlockPos(Math.min(min.getX(), max.getX()), Math.min(min.getY(), max.getY()), Math.min(min.getZ(), max.getZ()));
            soil.max = new BlockPos(Math.max(min.getX(), max.getX()), Math.max(min.getY(), max.getY()), Math.max(min.getZ(), max.getZ()));

            var state = this.getLeafBlock();
            if (config != null) {
                state = config.processState(level, state, pos, level.getRandom(), rotation);
            }

            if (state != null) {
                soil.leaf = state.getBlock();
            }
        }
    }

    @Override
    public BlockState processState(LevelAccessor level, BlockState state, BlockPos pos, Random random, @Nullable Rotation rotation) {
        state = super.processState(level, state, pos, random, rotation);
        if (state.hasProperty(BlockStateProperties.PERSISTENT)) {
            state = state.setValue(BlockStateProperties.PERSISTENT, true);
        }

        return state;
    }
}
