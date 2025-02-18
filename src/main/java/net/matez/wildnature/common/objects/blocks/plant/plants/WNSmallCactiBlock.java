package net.matez.wildnature.common.objects.blocks.plant.plants;

import net.matez.wildnature.common.objects.blocks.plant.FlowerType;
import net.matez.wildnature.common.objects.blocks.plant.WNBushConfiguredBlock;
import net.matez.wildnature.common.util.WNUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class WNSmallCactiBlock extends WNBushConfiguredBlock {
    public WNSmallCactiBlock(ResourceLocation location, Properties properties, FlowerType type) {
        super(location, properties, type);
    }

    public WNSmallCactiBlock(ResourceLocation location, Properties properties, Item.Properties itemProperties, FlowerType type) {
        super(location, properties, itemProperties, type);
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        super.entityInside(state, level, pos, entity);
        if(WNUtil.rint(0,5) == 0){
            entity.hurt(DamageSource.CACTUS, 0.5F);
        }
    }
}
