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
        switch(event.getName().toString()) {
            case "wildnature:first":
                WNCombinedFeature.generateTrees(event, WNTreeEnum.FIR); break;
            case "minecraft:forest":
                WNCombinedFeature.generateTrees(event, WNTreeEnum.ASPEN); break;
            case "wildnature:second":
                WNCombinedFeature.generateTrees(event, WNTreeEnum.CHERRY_PINK);
                WNCombinedFeature.generateTrees(event, WNTreeEnum.CHERRY_WHITE); break;
            case "wildnature:beach":
                WNCombinedFeature.generateTrees(event, WNTreeEnum.PALM); break;
            default: break;
        }
        //WNCombinedFeature.generateTrees(event, WNTreeConfig.ASPEN);
        //WNCombinedFeature.generateTrees(event, WNTreeConfig.CHERRY);
        //WNCombinedFeature.generateTrees(event, WNTreeConfig.FIR);
    }
}