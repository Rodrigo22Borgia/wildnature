package net.matez.wildnature.common.objects.gen.wn_features;

import net.matez.wildnature.setup.WildNature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.Map;

public class FeatureRegistry {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, WildNature.modid);

    public static final Map<Trees, RegistryObject<Feature<NoneFeatureConfiguration>>> TREE_FEATURES = new EnumMap<>(Trees.class);

    static {
        for (Trees treeType : Trees.values()) {
            String registryName = "wn_" + treeType.toString().toLowerCase();
            RegistryObject<Feature<NoneFeatureConfiguration>> registryObject = FEATURES.register(
                    registryName,
                    () -> new WNTestFeature(NoneFeatureConfiguration.CODEC, treeType.getPlacement())
            );
            TREE_FEATURES.put(treeType, registryObject);
        }
    }

    public static void init(final IEventBus modEventBus) {
        FEATURES.register(modEventBus);
    }

    //////



}
/**public class FeatureRegistry {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, WildNature.modid);

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> FEATURE_TREE = FEATURES.register("wn_cherry", () -> new WNTestFeature(NoneFeatureConfiguration.CODEC, Trees.CHERRY.getPlacement()));
    public static final RegistryObject<Feature<NoneFeatureConfiguration>> FEATURE_TREE2 = FEATURES.register("wn_baobab", () -> new WNTestFeature(NoneFeatureConfiguration.CODEC, Trees.ASPEN.getPlacement()));

    public static void init(final IEventBus modEventBus) {FEATURES.register(modEventBus);}
}
**/