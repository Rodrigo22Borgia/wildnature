package net.matez.wildnature.common.objects.blocks.basic;

import net.matez.wildnature.common.objects.blocks.setup.WNBlock;
import net.matez.wildnature.common.objects.items.setup.WNBlockItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public abstract class WNAbstractDirtPathBlock extends WNBlock {
   protected static final VoxelShape SHAPE = WNAbstractFarmBlock.SHAPE;

   public WNAbstractDirtPathBlock(ResourceLocation location, Properties properties) {
      super(location, properties);
   }

   public WNAbstractDirtPathBlock(ResourceLocation location, Properties properties, Item.Properties itemProperties) {
      super(location, properties, itemProperties);
   }

   public WNAbstractDirtPathBlock(ResourceLocation location, Properties properties, WNBlockItem item) {
      super(location, properties, item);
   }


   public boolean useShapeForLightOcclusion(BlockState p_153159_) {
      return true;
   }

   public BlockState getStateForPlacement(BlockPlaceContext p_153131_) {
      return !this.defaultBlockState().canSurvive(p_153131_.getLevel(), p_153131_.getClickedPos()) ? Block.pushEntitiesUp(this.defaultBlockState(), Blocks.DIRT.defaultBlockState(), p_153131_.getLevel(), p_153131_.getClickedPos()) : super.getStateForPlacement(p_153131_);
   }

   public BlockState updateShape(BlockState p_153152_, Direction p_153153_, BlockState p_153154_, LevelAccessor p_153155_, BlockPos p_153156_, BlockPos p_153157_) {
      if (p_153153_ == Direction.UP && !p_153152_.canSurvive(p_153155_, p_153156_)) {
         p_153155_.scheduleTick(p_153156_, this, 1);
      }

      return super.updateShape(p_153152_, p_153153_, p_153154_, p_153155_, p_153156_, p_153157_);
   }

   public void tick(BlockState p_153133_, ServerLevel p_153134_, BlockPos p_153135_, Random p_153136_) {
      WNAbstractFarmBlock.turnToDirt(getDirt(),p_153133_, p_153134_, p_153135_);
   }

   public boolean canSurvive(BlockState p_153148_, LevelReader p_153149_, BlockPos p_153150_) {
      BlockState blockstate = p_153149_.getBlockState(p_153150_.above());
      return !blockstate.getMaterial().isSolid() || blockstate.getBlock() instanceof FenceGateBlock;
   }

   public VoxelShape getShape(BlockState p_153143_, BlockGetter p_153144_, BlockPos p_153145_, CollisionContext p_153146_) {
      return SHAPE;
   }

   public boolean isPathfindable(BlockState p_153138_, BlockGetter p_153139_, BlockPos p_153140_, PathComputationType p_153141_) {
      return false;
   }

   public Block getDirt(){
      return Blocks.DIRT;
   }
}