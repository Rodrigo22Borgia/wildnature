/**
 * Copyright (C) Glitchfiend
 * <p>
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package net.matez.wildnature.common.registry.biomes;

import net.matez.wildnature.common.log.WNLogger;
import net.matez.wildnature.common.objects.biomes.land.*;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashMap;
import java.util.LinkedHashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WNBiomeRegistry {
    private static final WNLogger log = WildNature.getLogger();

    public static HashMap<ResourceLocation, WNBiome> WN_BIOMES = new LinkedHashMap<>();

    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> e) {
        log.progress("Registering biomes");

        register(e, new WNAspenGrove());
        register(e, new WNAutumnalMapleForest());/*
        register(e, new WNAutumnalPoplarForest());
        register(e, new WNAutumnalPoplarForestHills());
        register(e, new WNAutumnalPoplarForestValley());
        register(e, new WNAutumnalSequoiaRainforest());
        register(e, new WNAutumnalSpruceForest());
        register(e, new WNBackwaters());
        register(e, new WNBadlands());
        register(e, new WNBananaThicket());
        register(e, new WNBaobabSavanna());
        register(e, new WNBeechForest());
        register(e, new WNBeechForestHills());
        register(e, new WNBeechForestTall());
        register(e, new WNBeechGrove());
        register(e, new WNBeechValley());
        register(e, new WNBerryTaiga());
        register(e, new WNBialowiezaForest());
        register(e, new WNBialowiezaFrozenMarsh());
        register(e, new WNBialowiezaMarsh());
        register(e, new WNBirchGrove());
        register(e, new WNBirchMarsh());
        register(e, new WNBirchScrubs());
        register(e, new WNBog());
        register(e, new WNBorealForest());
        register(e, new WNBorealForestHill());
        register(e, new WNBorealValley());
        register(e, new WNCaatingaHills());
        register(e, new WNCaatingaScrubs());
        register(e, new WNCanyons());
        register(e, new WNCedarForest());
        register(e, new WNCitrusOrchard());
        register(e, new WNColdBerryTaiga());
        register(e, new WNColdForest());
        register(e, new WNColdRockyTaiga());
        register(e, new WNColdSilverlands());
        register(e, new WNColdTaiga());
        register(e, new WNColdTaigaClearing());
        register(e, new WNColdTaigaHills());
        register(e, new WNColdTaigaMarsh());
        register(e, new WNColdTaigaValley());
        register(e, new WNCornField());
        register(e, new WNCottonFields());
        register(e, new WNCrackedDesert());
        register(e, new WNCracowGorge());
        register(e, new WNCypressFields());
        register(e, new WNCypressHills());
        register(e, new WNDaintreeCliffs());
        register(e, new WNDaintreeForest());
        register(e, new WNDaintreePlateau());
        register(e, new WNDarkMirkwood());
        register(e, new WNDeadDesolation());
        register(e, new WNDeciduousForest());
        register(e, new WNDenseMoor());
        register(e, new WNDenseOaklands());
        register(e, new WNDenseTucholaForest());
        register(e, new WNErodedFields());
        register(e, new WNErodedHills());
        register(e, new WNEucalyptusForest());
        register(e, new WNFarmlands());
        register(e, new WNFields());
        register(e, new WNFlowerField());
        register(e, new WNForest());
        register(e, new WNForestedFields());
        register(e, new WNForestedGrasslands());
        register(e, new WNForestedGrasslandsHills());
        register(e, new WNForestedMountains());
        register(e, new WNForestValley());
        register(e, new WNFrozenMorskieOko());
        register(e, new WNFrozenTaiga());
        register(e, new WNGiantConiferousForest());
        register(e, new WNGiantEucalyptusForest());
        register(e, new WNGiantSavanna());
        register(e, new WNGiewont());
        register(e, new WNGlacier());
        register(e, new WNGoldenWoods());
        register(e, new WNGrandCanyon());
        register(e, new WNGrasslands());
        register(e, new WNGrasslandsHills());
        register(e, new WNGreenwood());
        register(e, new WNGreenwoodHills());
        register(e, new WNGreenwoodValley());
        register(e, new WNHazelFields());
        register(e, new WNHighForest());
        register(e, new WNHighForestHills());
        register(e, new WNHighForestValley());
        register(e, new WNHighlands());
        register(e, new WNHillyShrublands());
        register(e, new WNHimalayas());
        register(e, new WNHornbeamForest());
        register(e, new WNHornbeamHills());
        register(e, new WNHornbeamValley());
        register(e, new WNHyacinthFields());
        register(e, new WNCherryParadise());
        register(e, new WNChristmasDream());
        register(e, new WNIcelands());
        register(e, new WNLandOfRivers());
        register(e, new WNLavenderGarden());
        register(e, new WNLushDesert());
        register(e, new WNMahoganyCliffs());
        register(e, new WNMahoganyRainforest());
        register(e, new WNMangroveBayou());
        register(e, new WNMapleForest());
        register(e, new WNMarigoldFields());
        register(e, new WNMasuria());
        register(e, new WNMeadow());
        register(e, new WNMirkwood());
        register(e, new WNMoor());
        register(e, new WNMorskieOko());
        register(e, new WNOaklandHills());
        register(e, new WNOaklands());
        register(e, new WNOakValley());
        register(e, new WNOasis());
        register(e, new WNOldRedwoodForest());
        register(e, new WNOliveGarden());
        register(e, new WNOliveHills());
        register(e, new WNOrchard());
        register(e, new WNOrchardPlum());
        register(e, new WNOutback());
        register(e, new WNOvergrownCliffs());
        register(e, new WNPineMixedForest());
        register(e, new WNPineMixedMarsh());
        register(e, new WNPolders());
        register(e, new WNPoldersEdge());
        register(e, new WNPoplarForest());
        register(e, new WNPoplarForestHills());
        register(e, new WNPoplarForestValley());
        register(e, new WNPoppyFields());
        register(e, new WNPrairie());
        register(e, new WNPrairieHills());
        register(e, new WNPrairiePlateau());
        register(e, new WNPrehistoricValley());
        register(e, new WNPurpleWoodland());
        register(e, new WNRainforest());
        register(e, new WNRainforestHills());
        register(e, new WNRainforestMoor());
        register(e, new WNRapeseedField());
        register(e, new WNRedwoodForest());
        register(e, new WNRedwoodHills());
        register(e, new WNRockyTaiga());
        register(e, new WNRoofedForest());
        register(e, new WNRoofedValley());
        register(e, new WNRysy());
        register(e, new WNSafari());
        register(e, new WNSafariHills());
        register(e, new WNSahara());
        register(e, new WNSakuraJungle());
        register(e, new WNSaltFlats());
        register(e, new WNScrublands());
        register(e, new WNSeasonalTaiga());
        register(e, new WNSequoiaForest());
        register(e, new WNSequoiaHills());
        register(e, new WNSequoiaValley());
        register(e, new WNShrublandPlateau());
        register(e, new WNShrublands());
        register(e, new WNSilverlands());
        register(e, new WNSnowedMountains());
        register(e, new WNSnowyAspenGrove());
        register(e, new WNSnowyBialowiezaForest());
        register(e, new WNSnowyBirchGrove());
        register(e, new WNSnowyBorealForest());
        register(e, new WNSnowyBorealForestHill());
        register(e, new WNSnowyBorealValley());
        register(e, new WNSnowyCedarForest());
        register(e, new WNSnowyCracowGorge());
        register(e, new WNSnowyDenseTucholaForest());
        register(e, new WNSnowyForest());
        register(e, new WNSnowyGiantConiferousForest());
        register(e, new WNSnowyGiewont());
        register(e, new WNSnowyTatraFireweedValley());
        register(e, new WNSnowyTatraFoothills());
        register(e, new WNSnowyTatraChocholowskaGlade());
        register(e, new WNSnowyTatraKasprowyPeak());
        register(e, new WNSnowyTatraLowerForest());
        register(e, new WNSnowyTatraMountains());
        register(e, new WNSnowyTatraUpperForest());
        register(e, new WNSnowyTucholaForest());
        register(e, new WNSnowyTucholaForestHill());
        register(e, new WNSnowyTucholaValley());
        register(e, new WNSteppe());
        register(e, new WNSunflowerFields());
        register(e, new WNTaiga());
        register(e, new WNTaigaClearing());
        register(e, new WNTaigaHills());
        register(e, new WNTaigaMarsh());
        register(e, new WNTaigaValley());
        register(e, new WNTatraFireweedValley());
        register(e, new WNTatraFoothills());
        register(e, new WNTatraGreenedPeak());
        register(e, new WNTatraChocholowskaGlade());
        register(e, new WNTatraKasprowyPeak());
        register(e, new WNTatraLowerForest());
        register(e, new WNTatraMountains());
        register(e, new WNTatraRedPeak());
        register(e, new WNTatraUpperForest());
        register(e, new WNTemperateCedarScrubs());
        register(e, new WNTemperateForest());
        register(e, new WNTemperatePineMixedForest());
        register(e, new WNTemperateRedwoodScrubs());
        register(e, new WNTemperateSequoiaRainforest());
        register(e, new WNThujaShield());
        register(e, new WNTintedDesert());
        register(e, new WNTintedDesertHills());
        register(e, new WNTropicalBadlands());
        register(e, new WNTropicalLake());
        register(e, new WNTucholaForest());
        register(e, new WNTucholaForestHill());
        register(e, new WNTucholaValley());
        register(e, new WNVibrantForest());
        register(e, new WNWeepingBirchForest());
        register(e, new WNWetlands());
        register(e, new WNWetTaiga());
        register(e, new WNWoodedJacarandaMeadow());
        register(e, new WNWoodedMeadow());
        register(e, new WNWoodedOutback());*/

        log.success("Registered " + WN_BIOMES.size() + " biomes");
    }

    private static WNBiome register(RegistryEvent.Register<Biome> event, WNBiome biome) {
        IForgeRegistry<Biome> registry = event.getRegistry();

        registry.register(biome.build());
        WN_BIOMES.put(biome.getKey().location(), biome);
        return biome;
    }
}