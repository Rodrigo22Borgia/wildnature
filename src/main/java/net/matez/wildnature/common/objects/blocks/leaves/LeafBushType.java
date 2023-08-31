package net.matez.wildnature.common.objects.blocks.leaves;

import net.matez.wildnature.common.objects.blocks.plant.PlantFeature;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MaterialColor;

public enum LeafBushType implements PlantFeature {
    LARGE_BUSH("large"),
    DENSE_BUSH("dense"),
    SMALL_BUSH("small");

    private final String idBase;
    private MaterialColor color = MaterialColor.PLANT;

    LeafBushType(String idBase){
        this.idBase = idBase;
    }
    LeafBushType(String idBase, MaterialColor color){
        this.idBase = idBase;
        this.color = color;
    }

    public String getIdBase() {
        return idBase;
    }

    public MaterialColor getColor() {
        return color;
    }

    @Override
    public BlockState featureBlockState() {
        return WNBlocks.BUSH_LEAVES.get(this).defaultBlockState();
    }
}
