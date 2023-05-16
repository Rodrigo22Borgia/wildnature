package net.matez.wildnature.common.objects.features;

import net.matez.wildnature.common.util.WeightedList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public enum WNFlowerEnum {
    //Tree config
     MOSS(32, 5, 2, Blocks.MOSS_CARPET),
     BUSH(32, 5, 2, Blocks.DEAD_BUSH);;

    protected Block getState() {
        return block;
    }
     /*protected WeightedList<BlockState> getWeightedList(WNFlowerEnum flower) {
         WeightedList<BlockState> flowers = new WeightedList<>();
         flowers.put(flower.blocks[0].defaultBlockState(), flower.weight[0]);
         flowers.put(flower.blocks[1].defaultBlockState(), flower.weight[1]);
         return flowers; }*/
     protected int getTries() {
        return tries;
    }
     protected int getXZ() {
        return xzSpread;
    }
     protected int getY() {
        return ySpread;
    }

     private final Block block;
     private final int tries;
     private final int xzSpread;
     private final int ySpread;



     WNFlowerEnum(int tries, int xzSpread, int ySpread, Block block) {
         this.block = block;
         this.tries = tries;
         this.xzSpread = xzSpread;
         this.ySpread = ySpread;
     }
}
