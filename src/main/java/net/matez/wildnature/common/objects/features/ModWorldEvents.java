package net.matez.wildnature.common.objects.features;

import net.matez.wildnature.setup.WildNature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WildNature.modid)
public class ModWorldEvents {

    //On Biome event triggers generation of specific tree
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        WNCombinedFeature.generateTrees(event, WNTreeConfig.ASPEN);
        WNCombinedFeature.generateTrees(event, WNTreeConfig.CHERRY);
        WNCombinedFeature.generateTrees(event, WNTreeConfig.FIR);
    }
}