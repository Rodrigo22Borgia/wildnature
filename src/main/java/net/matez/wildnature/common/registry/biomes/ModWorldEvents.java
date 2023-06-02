package net.matez.wildnature.common.registry.biomes;

import net.matez.wildnature.common.objects.blocks.plant.BushType;
import net.matez.wildnature.common.objects.blocks.saplings.WNSaplingType;
import net.matez.wildnature.common.objects.features.WNCombinedFeature;
import net.matez.wildnature.setup.WildNature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WildNature.modid)
public class ModWorldEvents {

    //Adds features into any biome by their string name
    //Order of trees/flowers doesn't seem to matter
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        switch(event.getName().toString()) {
            case "wildnature.orchard":
                WNCombinedFeature.generateFlowers(event, BushType.ANEMONE);
                WNCombinedFeature.generateTrees(event, WNSaplingType.APPLE);
                WNCombinedFeature.generateTrees(event, WNSaplingType.PEACH);
                //WNCombinedFeature.generateTrees(event, WNSaplingType.PEAR);
                WNCombinedFeature.generateTrees(event, WNSaplingType.CHERRY);break;
            case "wildnature:aspen_grove":
                WNCombinedFeature.generateTrees(event, WNSaplingType.ASPEN);
                WNCombinedFeature.generateFlowers(event, BushType.ANTHURIUM_PINK);break;
            case "wildnature:baobab_savanna":
                WNCombinedFeature.generateTrees(event, WNSaplingType.BAOBAB); break;
            case "wildnature:beech_forest":
                WNCombinedFeature.generateTrees(event, WNSaplingType.BEECH);
                WNCombinedFeature.generateTrees(event, WNSaplingType.PURPLE_BEECH); break;
            case "wildnature:cedar_fields":
                WNCombinedFeature.generateTrees(event, WNSaplingType.CEDAR); break;
            case "wildnature:cherry_paradise":
                WNCombinedFeature.generateTrees(event, WNSaplingType.CHERRY_PINK);
                WNCombinedFeature.generateTrees(event, WNSaplingType.CHERRY_WHITE);break;
            case "wildnature:banana_thicket":
                WNCombinedFeature.generateTrees(event, WNSaplingType.BANANA); break;
            case "wildnature:citrus_orchard":
                WNCombinedFeature.generateTrees(event, WNSaplingType.LEMON);
                WNCombinedFeature.generateTrees(event, WNSaplingType.LIME);
                WNCombinedFeature.generateTrees(event, WNSaplingType.GRAPEFRUIT);
                WNCombinedFeature.generateTrees(event, WNSaplingType.ORANGE); break;
            case "wildnature:shrublands":
                WNCombinedFeature.generateTrees(event, WNSaplingType.POMEGRANATE); break;
            case "wildnature:rainforest":
                WNCombinedFeature.generateTrees(event, WNSaplingType.MANGO); break;
            case "wildnature:olive_grove":
                WNCombinedFeature.generateTrees(event, WNSaplingType.OLIVE); break;
            case "wildnature:rainforest_moor":
                WNCombinedFeature.generateTrees(event, WNSaplingType.EBONY); break;
            case "wildnature:eucalyptus_forest":
                WNCombinedFeature.generateTrees(event, WNSaplingType.EUCALYPTUS); break;
            case "wildnature:tatra_mountains":
                WNCombinedFeature.generateTrees(event, WNSaplingType.FIR);
                WNCombinedFeature.generateTrees(event, WNSaplingType.SILVER_FIR); break;
            case "wildnature:olive_hills":
                WNCombinedFeature.generateTrees(event, WNSaplingType.FORSYTHIA); break;
            case "wildnature:golden_woods":
                WNCombinedFeature.generateTrees(event, WNSaplingType.GINKGO);
                WNCombinedFeature.generateTrees(event, WNSaplingType.MAGNOLIA); break;
            case "wildnature:hornbeam_forest":
                WNCombinedFeature.generateTrees(event, WNSaplingType.HORNBEAM); break;
            case "wildnature:hazel_fields":
                WNCombinedFeature.generateTrees(event, WNSaplingType.HAZEL); break;
            case "wildnature:wooded_jacaranda_meadow":
                WNCombinedFeature.generateTrees(event, WNSaplingType.JACARANDA);
                WNCombinedFeature.generateTrees(event, WNSaplingType.RED_JACARANDA);break;
            case "wildnature:SeasonalTaiga":
                WNCombinedFeature.generateTrees(event, WNSaplingType.LARCH);
                WNCombinedFeature.generateTrees(event, WNSaplingType.METASEQUOIA_GREEN);
                WNCombinedFeature.generateTrees(event, WNSaplingType.METASEQUOIA_ORANGE);
                WNCombinedFeature.generateTrees(event, WNSaplingType.METASEQUOIA_BROWN);
                WNCombinedFeature.generateTrees(event, WNSaplingType.METASEQUOIA_RED);
                WNCombinedFeature.generateTrees(event, WNSaplingType.METASEQUOIA_YELLOW);break;
            case "wildnature:mahogany_rainforest":
                WNCombinedFeature.generateTrees(event, WNSaplingType.MAHOGANY); break;
            case "wildnature:mangrove_bayou":
                WNCombinedFeature.generateTrees(event, WNSaplingType.MANGROVE); break;
            case "wildnature:maple_forest":
                WNCombinedFeature.generateTrees(event, WNSaplingType.MAPLE);
                WNCombinedFeature.generateTrees(event, WNSaplingType.MAPLE_BROWN);
                WNCombinedFeature.generateTrees(event, WNSaplingType.MAPLE_ORANGE);
                WNCombinedFeature.generateTrees(event, WNSaplingType.MAPLE_RED);
                WNCombinedFeature.generateTrees(event, WNSaplingType.MAPLE_YELLOW); break;
            case "wildnature:palm_beach":
                WNCombinedFeature.generateTrees(event, WNSaplingType.PALM); break;
            case "wildnature:pine_mixed_forest":
                WNCombinedFeature.generateTrees(event, WNSaplingType.PINE);
                WNCombinedFeature.generateTrees(event, WNSaplingType.ROWAN); break;         /*
            case "wildnature:orchard_plum":
                WNCombinedFeature.generateTrees(event, WNSaplingType.PLUM);
                WNCombinedFeature.generateTrees(event, WNSaplingType.MIRABELLE_PLUM); break;
            case "wildnature:poplar_forest":
                WNCombinedFeature.generateTrees(event, WNSaplingType.POPLAR); break;*/
            case "wildnature:redwood_forest":
                WNCombinedFeature.generateTrees(event, WNSaplingType.REDWOOD); break;
            case "wildnature:wetlands":
                WNCombinedFeature.generateTrees(event, WNSaplingType.WILLOW); break;
            case "wildnature:fields":
                WNCombinedFeature.generateFlowers(event, BushType.WILD_WHEAT); break;



            default: break;
        }
    }
}