package net.matez.wildnature.common.registry.biomes;

import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
import net.matez.wildnature.common.objects.features.WNCombinedFeature;
import net.matez.wildnature.common.objects.features.WNFlowerEnum;
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
            case "wildnature:cold_blue":
                WNCombinedFeature.generateFlowers(event, WNFlowerEnum.MOSS);
                WNCombinedFeature.generateTrees(event, WNSaplingType.FORSYTHIA); break;
            case "wildnature:hot_red":
                WNCombinedFeature.generateFlowers(event, WNFlowerEnum.BUSH);
                WNCombinedFeature.generateTrees(event, WNSaplingType.PALM); break;
            default: break;
        }
    }
}