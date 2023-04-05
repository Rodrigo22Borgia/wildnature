package net.matez.wildnature.common.objects.gen.wn_features;

import net.matez.wildnature.common.objects.gen.wn_features.FeatureGeneration;
import net.matez.wildnature.setup.WildNature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WildNature.modid)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        FeatureGeneration.generateCherry(event);


    //    FeatureGeneration.generateTrees(event);
    //    FeatureGeneration.generateFlowers(event);
    //    FeatureGeneration.generateNBTrees(event);
    }
}