/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.features;

import com.mojang.serialization.Codec;
import net.matez.wildnature.common.objects.blocks.plant.WNBushBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import java.util.Random;

public class WNFlowerFeature extends Feature<NoneFeatureConfiguration> {

    public WNFlowerFeature(Codec<NoneFeatureConfiguration> p_65360_, WNFlowerEnum flower) {
        super(p_65360_);
        this.state = flower.getState().defaultBlockState();
        this.xzSpread = flower.getXZ();
        this.ySpread = flower.getY();
        this.tries = flower.getTries();
    }
    private final BlockState state;
    private final int xzSpread;
    private final int ySpread;
    private final int tries;
    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        Random random = context.random();
        BlockPos blockpos = context.origin();
        int i = 0;
        BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos();
        int j = xzSpread + 1;
        int k = ySpread + 1;

        for (int l = 0; l < tries; ++l) {
            mutable.setWithOffset(blockpos, random.nextInt(j) - random.nextInt(j), random.nextInt(k) - random.nextInt(k), random.nextInt(j) - random.nextInt(j));
            if (context.level().getBlockState(mutable).isAir()) {
                if (state.canSurvive(context.level(), mutable)) {
                    if (state.getBlock() instanceof WNBushBlock block) {
                        block.place(state, context.level(), mutable, 19);
                    } else {
                        if (state.getBlock() instanceof DoublePlantBlock) {
                            DoublePlantBlock.placeAt(context.level(), state, mutable, 19);
                        } else {
                            context.level().setBlock(mutable, state, 19);
                        }
                    }
                    i++;
                }
            }
        }

        return i > 0;
    }
}