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
import net.matez.wildnature.setup.WildNature;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.material.Material;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Random;

public class WNTreeStructure extends WNStructure {
    private BlockPos minLeaf, maxLeaf;
    private BlockState leafBlock, baseBlock;

    public WNTreeStructure(ResourceLocation location) {
        super(location);
    }

    @Override
    protected void onLoad() {
        super.onLoad();
        //this.loadMaxLeaf();
        this.loadMinLeaf();
        //this.loadLeafBlock();
    }

    private void loadMinLeaf() {
        BlockPos min = null;
        BlockPos max = null;
        for (Map.Entry<BlockPos, BlockState> entry : blocks.entrySet()) {
            BlockPos   blockPos   = entry.getKey();
            BlockState BlockState = entry.getValue();
            if (BlockState.is(BlockTags.LEAVES)) {
                if (min == null) {
                    min = blockPos;
                    max = blockPos;
                    leafBlock = BlockState;
                } else {
                    min = new BlockPos(Math.min(blockPos.getX(), min.getX()), Math.min(blockPos.getY(), min.getY()), Math.min(blockPos.getZ(), min.getZ()));
                    max = new BlockPos(Math.max(blockPos.getX(), max.getX()), Math.max(blockPos.getY(), max.getY()), Math.max(blockPos.getZ(), max.getZ()));
                }
            }
            if (baseBlock == null && BlockState.is(BlockTags.LOGS)) {
                baseBlock = BlockState;
            }
        }
        if (baseBlock == null) {
            baseBlock = Blocks.ROOTED_DIRT.defaultBlockState();
        }
        minLeaf = min;
        maxLeaf = max;
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
        Integer[] X = {-1, 1, 0,1};
        Integer[] Z = { 0, 1,-2,1};

        BlockPos.MutableBlockPos root  = new BlockPos.MutableBlockPos(pos.getX(),pos.getY()+1,pos.getZ());

        for (int p = 0; p<4 ;p++) {
            root.setX(root.getX()+X[p]);
            root.setZ(root.getZ()+Z[p]);
            BlockState M = level.getBlockState(root);

            if (M.canOcclude() && M.getMaterial().isFlammable()) {
                root.setX(pos.getX()-4);

                for (int i = 0; i < 7; i++) {
                    root.setX(root.getX()+1);
                    root.setZ(pos .getZ()-3);

                    for (int j = 0; j < 7; j++) {
                        root.setZ(root.getZ()+1);
                        root.setY(pos. getY()+1);

                        M = level.getBlockState(root);
                        if (M.canOcclude() && M.getMaterial().isFlammable()) {
                            for (int k = 0; k < 7; k++) {
                                if (!level.getBlockState(root.setY(root.getY()-1)).canOcclude()) {
                                    level.setBlock(root, baseBlock, 2);
                                } else {
                                    level.setBlock(root, Blocks.ROOTED_DIRT.defaultBlockState(), 2);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            }
        }

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
            try {
                var min = this.getMinLeaf().rotate(rotation);
                var max = this.getMaxLeaf().rotate(rotation);

                soil.min = new BlockPos(Math.min(min.getX(), max.getX()), Math.min(min.getY(), max.getY()), Math.min(min.getZ(), max.getZ()));
                soil.max = new BlockPos(Math.max(min.getX(), max.getX()), Math.max(min.getY(), max.getY()), Math.max(min.getZ(), max.getZ()));

            BlockState state = this.leafBlock;
            if (config != null) {
                state = config.processState(level, state, pos, level.getRandom(), rotation);
            }

            if (state != null) {
                soil.leaf = state.getBlock();
            }

            } catch (NullPointerException e) {
            WildNature.getLogger().error(super.location.toString() + " does not have leaf bounding box");}
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
