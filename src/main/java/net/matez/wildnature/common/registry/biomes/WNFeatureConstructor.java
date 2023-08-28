package net.matez.wildnature.common.registry.biomes;

import net.matez.wildnature.common.log.WNLogger;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;

@Mod.EventBusSubscriber(modid = WildNature.modid)
public class WNFeatureConstructor {
    private static final WNLogger log = WildNature.getLogger();

    //On Biome event triggers generation of specific feature
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        // loop over all the biomes, check if matches with current and register its features
        log.debug("Registering features for " + event.getName().toString() + " biome");

        for (Map.Entry<ResourceLocation, WNBiome> entry : WNBiomeRegistry.WN_BIOMES.entrySet()) {
            if (entry.getValue().getKey().location().toString().equals(event.getName().toString())) {
                entry.getValue().applyCustomFeatures(event);
                log.debug("Successfully registered features for " + event.getName().toString() + " biome");
                break;
            }
        }
    }
}