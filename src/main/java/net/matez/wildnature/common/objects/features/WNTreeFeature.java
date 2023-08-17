/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.features;

import com.mojang.serialization.Codec;
import net.matez.wildnature.common.objects.structures.WNStructurePlacement;
import net.matez.wildnature.common.util.WNUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;


public class WNTreeFeature extends Feature<NoneFeatureConfiguration> {

    public WNTreeFeature(Codec<NoneFeatureConfiguration> p_65360_, WNStructurePlacement placement) {
        super(p_65360_);
        this.placement= placement;
    }
    private final WNStructurePlacement placement;
    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {

        this.placement.load();
        var placement = this.placement.get(context.random());
        if (placement == null) {
            return false;
        }

        BlockState baseBlock = context.level().getBlockState(context.origin().below(1));
        if (!(baseBlock.is(BlockTags.AZALEA_GROWS_ON)||baseBlock.is(Blocks.CLAY))) {

            return false;
        }

        var structure = placement.structure();
        var height = structure.getMax().getY() + 1;

        for (int i = 1; i < height; i += 4) {
            BlockPos checkPos = context.origin().above(i);
            if (!context.level().getBlockState(checkPos).isAir()) {
                return false;
            }
        }

        structure.place(context.level(), context.origin().below(), Rotation.values()[WNUtil.rint(0, 3, context.random())], placement.config(), context.random(), 19);

        //Generates support for trees
        BlockState wood = context.level().getBlockState(context.origin().above(2));
        if (context.level().getBlockState(context.origin().north()).is(BlockTags.LOGS)
        ||  context.level().getBlockState(context.origin().east()).is(BlockTags.LOGS)
        ||  context.level().getBlockState(context.origin().west()).is(BlockTags.LOGS)
        ||  context.level().getBlockState(context.origin().south()).is(BlockTags.LOGS)){
            for (int i = -3; i < 4; i++) {
                for (int j = -3; j < 4; j++) {
                    //Checks if there are logs above before placing blocks below
                    BlockPos root = context.origin().east(i).north(j);
                    for (int k = 1; k < 8 && context.level().getBlockState(root).canOcclude(); k++) {
                        if (!context.level().getBlockState(root.below(k)).canOcclude()) {
                            context.level().setBlock(root.below(k), wood, 19);
                        }
                        else {
                            context.level().setBlock(root.below(k), Blocks.ROOTED_DIRT.defaultBlockState(), 19);
                            break;
                        }
                    }
                }
            }
        }
/*
        int rad = 3; //Set scan range.
        BlockPos blockRoot = context.origin();
        BlockPos.MutableBlockPos blockPos;
        for (int dx = -rad; dx <= rad; dx++) {
            for (int dz = -rad; dz <= rad; dz++) {

                //Set x/z coord
                blockPos = blockRoot.mutable();
                blockPos.move(dx, 0, dz);

                //Iterate down till we hit non-air
                while (context.level().getBlockState(blockPos).isAir()) {
                    context.level().setBlock(blockPos, block, 3);
                    blockPos.move(0, -1, 0);
                }
                context.level().setBlock(blockPos, Blocks.ROOTED_DIRT.defaultBlockState(), 3);
                //Finished x/z iteration
            }
        }*/

        return true;
    }
}