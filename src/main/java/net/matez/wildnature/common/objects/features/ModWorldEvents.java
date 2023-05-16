package net.matez.wildnature.common.objects.features;

import net.matez.wildnature.setup.WildNature;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WildNature.modid)
public class ModWorldEvents {

    //On Biome event triggers generation of specific tree
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        switch(event.getName().toString()) {
            case "minecraft:old_growth_spruce_taiga":
                WNCombinedFeature.generateFlowers(event, WNFlowerEnum.MOSS);
                WNCombinedFeature.generateTrees(event, WNTreeEnum.FIR); break;
            default: break;
        }
        //WNCombinedFeature.generateTrees(event, WNTreeConfig.ASPEN);
        //WNCombinedFeature.generateTrees(event, WNTreeConfig.CHERRY);
        //WNCombinedFeature.generateTrees(event, WNTreeConfig.FIR);
    }
}