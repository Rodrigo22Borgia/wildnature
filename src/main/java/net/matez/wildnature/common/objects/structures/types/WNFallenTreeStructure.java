/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.structures.types;

import net.matez.wildnature.common.objects.structures.WNStructure;
import net.matez.wildnature.common.objects.structures.WNStructureConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Tuple;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluids;

import javax.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Random;

public class WNFallenTreeStructure extends WNStructure {
    public WNFallenTreeStructure(ResourceLocation location) {
        super(location);
    }

    @Override
    public BlockState processState(LevelAccessor level, BlockState state, BlockPos pos, Random random, @Nullable Rotation rotation) {
        if (state.hasProperty(BlockStateProperties.PERSISTENT)) {
            state = state.setValue(BlockStateProperties.PERSISTENT, true);
        }

        return state;
    }

    private Integer[][] idk(BlockPos pos, LevelAccessor level) {
        BlockPos.MutableBlockPos block = new BlockPos.MutableBlockPos(pos.getX()+min.getX(), pos.getY(), pos.getZ()+min.getZ());
        int X = max.getX()-min.getX();
        int Z = max.getZ()-min.getZ();
        System.out.println(X+":"+Z);

        Integer[][] test = new Integer[X][Z];

        for (int x = 0; x < X; x++) {
            for (int z = 0; z < Z; z++) {
                while (!level.getBlockState(block).canOcclude()) {
                    block.setY(block.getY()-1);

                } while (level.getBlockState(block).canOcclude()) {
                    block.setY(block.getY()+1);
                }
                test[x][z] = block.getY() - pos.getY();
                System.out.print(block.getY() - pos.getY() + " ");

                block.setY(pos.getY());
                block.setZ(block.getZ()+1);
            }
            System.out.println();
            block.setX(block.getX()+1);
        }
        return test;
    }

    @Override
    public void place(LevelAccessor level, BlockPos pos, @Nullable Rotation rotation, @Nullable WNStructureConfig config, Random random, int placeData) {
        LinkedHashMap<BlockPos, BlockState> secondary = new LinkedHashMap<>();
        for (Tuple<BlockPos, BlockState>[] array: blocks) {
            Integer Yoffset = null;
            for (Tuple<BlockPos, BlockState> block : array) {
                BlockPos newPos;
                BlockState newState = block.getB();

                if (rotation != null) {
                    newPos = block.getA().rotate(rotation).offset(pos);
                    newState = newState.rotate(level, newPos, rotation);
                } else {
                    newPos = block.getA().offset(pos);
                }
                if (Yoffset == null) {
                    Yoffset = 0;
                    while (!level.getBlockState(newPos.above(Yoffset)).canOcclude()) {Yoffset--;}
                    while ( level.getBlockState(newPos.above(Yoffset)).canOcclude()) {Yoffset++;}
                }
                newPos = newPos.above(Yoffset);

                BlockState onPos = level.getBlockState(newPos);
                if (onPos.canOcclude()) {
                    continue;
                }

                if (newState.hasProperty(BlockStateProperties.WATERLOGGED) && onPos.getFluidState().is(Fluids.WATER)) {

                    newState = newState.setValue(BlockStateProperties.WATERLOGGED, true);
                }

                if (config != null) {
                    newState = config.processState(level, newState, newPos, random, rotation);
                }

                newState = processState(level, newState, newPos, random, rotation);

                if (newState.canSurvive(level, newPos)) {
                    level.setBlock(newPos, newState, placeData);
                } else {
                    secondary.put(newPos, newState);
                }
            }
        }

        secondary.forEach((blockPos, blockState) -> {
            level.setBlock(blockPos, blockState, placeData);
        });
    }
}
