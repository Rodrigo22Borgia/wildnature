package net.matez.wildnature.common.registry.biomes;

import net.matez.wildnature.common.log.WNLogger;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
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
        BiomeGenerationSettings.Builder builder = event.getGeneration();

        if (event.getName().getNamespace().equals("minecraft"))
            switch (event.getName().getPath()) {
                case "dripstone_caves" -> {
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,WNBiome.QUARTZITE);
                    for (Holder<PlacedFeature> feature: WNBiome.DRIPSTONE_DECORATION) {builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, feature);}
                }
                case "lush_caves"      -> {
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,WNBiome.MARBLE);
                    builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,WNBiome.LIMESTONE);
                    for (Holder<PlacedFeature> feature: WNBiome.LUSH_CAVE_DECORATION) {builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, feature);}
                }
                default -> WNBiome.addWNdefault(builder);
            }

        else if (event.getName().getNamespace().equals(WildNature.modid)) {
            for (Map.Entry<ResourceLocation, WNBiome> entry : WNBiomeRegistry.WN_BIOMES.entrySet()) {
                if (entry.getValue().getKey().location().toString().equals(event.getName().toString())) {
                    entry.getValue().applyCustomFeatures(event);
                    WNBiome.addWNdefault(builder);
                    log.debug("Successfully registered features for " + event.getName().toString() + " biome");
                    break;
                }
            }
        }
    }
}