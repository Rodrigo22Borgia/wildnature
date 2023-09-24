package net.matez.wildnature.common.objects.features;

import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;

public class WNStructureRegistry {

    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, WildNature.modid);

    public static final Map<String, RegistryObject<Feature<NoneFeatureConfiguration>>> WN_FEATURES = new HashMap<>();


    static {
        for (WNExtraTrees treeType : WNExtraTrees.values()) {
            String registryName = "extra_" + treeType.toString().toLowerCase();
            RegistryObject<Feature<NoneFeatureConfiguration>> registryObject = FEATURES.register(
                    registryName,
                    () -> new WNTreeFeature(NoneFeatureConfiguration.CODEC, treeType.getPlacement())
            );
            WN_FEATURES.put(registryName, registryObject);
        }
        for (WNFallenTrees treeType : WNFallenTrees.values()) {
            String registryName = "fallen_" + treeType.toString().toLowerCase();
            RegistryObject<Feature<NoneFeatureConfiguration>> registryObject = FEATURES.register(
                    registryName,
                    () -> new WNFallenTreeFeature(NoneFeatureConfiguration.CODEC, treeType.getPlacement())
            );
            WN_FEATURES.put(registryName, registryObject);
        }
    }

    public static void init(final IEventBus modEventBus) {
        FEATURES.register(modEventBus);
    }
}
