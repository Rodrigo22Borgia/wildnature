package net.matez.wildnature.common.objects.blocks.plant.flowering;

import net.matez.wildnature.common.objects.blocks.plant.FlowerType;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class WNThistleBlock extends WNFloweringBushBlock{
    public WNThistleBlock(ResourceLocation location, Properties properties, FlowerType type) {
        super(location, properties, type);
    }

    public WNThistleBlock(ResourceLocation location, Properties properties, Item.Properties itemProperties, FlowerType type) {
        super(location, properties, itemProperties, type);
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        super.entityInside(state, level, pos, entity);
        if(!level.isClientSide()){
            if(state.getValue(FLOWERING)){
                entity.hurt(DamageSource.SWEET_BERRY_BUSH,2);//todo new damage source for thistle
                level.setBlock(pos,state.setValue(FLOWERING,false),2);
            }
        }
    }
}
