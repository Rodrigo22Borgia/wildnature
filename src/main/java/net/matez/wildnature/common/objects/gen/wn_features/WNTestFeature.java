/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.gen.wn_features;

import com.mojang.serialization.Codec;
import net.matez.wildnature.common.objects.blocks.leaves.LeafType;
import net.matez.wildnature.common.objects.features.WNFeature;
import net.matez.wildnature.common.objects.features.flower.WNFlowerFeature;
import net.matez.wildnature.common.objects.structures.WNStructureFolders;
import net.matez.wildnature.common.objects.structures.WNStructurePlacement;
import net.matez.wildnature.common.objects.structures.configs.WNTreeConfig;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.matez.wildnature.common.util.WNUtil;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.feature.ChorusPlantFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WNTestFeature extends Feature<NoneFeatureConfiguration> {
    public WNTestFeature(Codec<NoneFeatureConfiguration> p_65360_) {
        super(p_65360_);
    }

    private final WNStructurePlacement placement = (WNStructurePlacement.make(
                    WNStructureFolders.TREE_CHERRY
            )
            .with(1, "cherry_1")
            .with(1, "cherry_2")
            .with(1, "cherry_3"));

    //public WNTestFeature(WNStructurePlacement placement) {
    //    this.placement = placement;

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        this.placement.load();
        var placement = this.placement.get(context.random());
        if (placement == null) {
            return false;
        }
        BlockPos baseBlock = context.origin().below(1);
        if (!context.level().getBlockState(baseBlock).is(BlockTags.DIRT)) {
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

        return true;
    }
}