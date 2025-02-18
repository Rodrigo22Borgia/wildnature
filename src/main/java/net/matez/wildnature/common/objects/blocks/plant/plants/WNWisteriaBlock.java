/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.blocks.plant.plants;

import net.matez.wildnature.common.objects.blocks.plant.FlowerType;
import net.matez.wildnature.data.block_models.plants.wisteria.WNBlockModel_WisteriaBottom;
import net.matez.wildnature.data.block_models.plants.wisteria.WNBlockModel_WisteriaSide;
import net.matez.wildnature.data.blockstates.plants.WNBlockstate_Wisteria;
import net.matez.wildnature.data.setup.base.WNResource;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Map;

public class WNWisteriaBlock extends WNVerticalBushBlock{
    public static Map<Direction, VoxelShape> SHAPE = createFacingShape(16,3);

    public WNWisteriaBlock(ResourceLocation location, Properties properties, FlowerType type) {
        super(location, properties, type);
    }

    public WNWisteriaBlock(ResourceLocation location, Properties properties, Item.Properties itemProperties, FlowerType type) {
        super(location, properties, itemProperties, type);
    }

    @Override
    public boolean isDirectionAllowed(BlockPlaceContext context, Direction direction) {
        return direction != Direction.UP;
    }

    @Override
    public WNResource getBlockstate() {
        return new WNBlockstate_Wisteria(this.getRegistryName());
    }

    @Override
    public ModelList getBlockModels() {
        return new ModelList().with(
                new WNBlockModel_WisteriaBottom(this.getRegName() + "_bottom")
                    .with("texture",this.getTextureName(this.getType().getVariant().getPath())),
                new WNBlockModel_WisteriaSide(this.getRegName() + "_side")
                    .with("texture",this.getTextureName(this.getType().getVariant().getPath()))
        );
    }

    @Override
    public OffsetType getOffsetType() {
        return OffsetType.NONE;
    }

    //TODO fix animateTick()
    /*@Override
    public void animateTick(BlockState state, Level level, BlockPos pos, Random random) {
        super.animateTick(state, level, pos, random);
        if(WNUtil.rint(0,6,random) == 0){
            double delta = 0.05;
            level.addParticle(ParticleTypes.CRIMSON_SPORE*//*WNParticles.WISTERIA_PINK*//*, pos.getX() + 0.5 + WNUtil.rdoub(-0.3,0.3), pos.getY() + WNUtil.rdoub(-1,1), pos.getZ() + 0.5 + WNUtil.rdoub(-0.3,0.3), WNUtil.rdoub(-delta,delta), 0.01, WNUtil.rdoub(-delta,delta));
        }
    }*/
}
