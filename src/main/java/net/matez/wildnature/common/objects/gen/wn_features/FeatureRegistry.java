package net.matez.wildnature.common.objects.gen.wn_features;

import net.matez.wildnature.common.objects.features.tree.WNTestFeature;
import net.matez.wildnature.common.objects.initializer.InitStage;
import net.matez.wildnature.common.objects.initializer.Initialize;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FeatureRegistry {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, WildNature.modid);
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> FEATURE_TREE = FEATURES.register("wn_trees", () -> new WNTestFeature(NoneFeatureConfiguration.CODEC));

    public static void init(final IEventBus modEventBus)
    {
        FEATURES.register(modEventBus);
    }
}
