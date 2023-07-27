package net.matez.wildnature.common.objects.features;

import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
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

    public static final Map<WNSaplingType, RegistryObject<Feature<NoneFeatureConfiguration>>> TREE_FEATURES = new EnumMap<>(WNSaplingType.class);


    static {
        for (WNSaplingType treeType : WNSaplingType.values()) {
            String registryName = "r_" + treeType.toString().toLowerCase();
            RegistryObject<Feature<NoneFeatureConfiguration>> registryObject = FEATURES.register(
                    registryName,
                    () -> new WNTreeFeature(NoneFeatureConfiguration.CODEC, treeType.getPlacement())
            );
            TREE_FEATURES.put(treeType, registryObject);
        }
    }

    public static void init(final IEventBus modEventBus) {
        FEATURES.register(modEventBus);
    }
}
