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

import com.mojang.datafixers.util.Pair;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;


import java.util.function.Consumer;


public class WNRegion extends Region {
    public WNRegion(ResourceLocation name, int weight)
    {
        super(name, RegionType.OVERWORLD, weight);
    }
    private static final Climate.Parameter FULL_RANGE = Climate.Parameter.span(-1.0F, 1.0F);
    private static final Climate.Parameter[] temperatures = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.45F),
            Climate.Parameter.span(-0.45F, -0.15F),
            Climate.Parameter.span(-0.15F, 0.2F),
            Climate.Parameter.span(0.2F, 0.55F),
            Climate.Parameter.span(0.55F, 1.0F)
    };

    private static final Climate.Parameter[] humidities = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.35F),
            Climate.Parameter.span(-0.35F, -0.1F),
            Climate.Parameter.span(-0.1F, 0.1F),
            Climate.Parameter.span(0.1F, 0.3F),
            Climate.Parameter.span(0.3F, 1.0F)
    };

    private static final Climate.Parameter[] erosions = new Climate.Parameter[]{
            Climate.Parameter.span(0F, 1F),
            Climate.Parameter.span(-1F, 0F)
    };
    private static final Climate.Parameter[] weirdness = new Climate.Parameter[]{
        /*
        Climate.Parameter.span(-1.0F, -0.93333334F),    //MID1
        Climate.Parameter.span(-0.93333334F, -0.7666667F),  //HIGH1
        Climate.Parameter.span(-0.7666667F, -0.56666666F),      //PEAKS1
        Climate.Parameter.span(-0.56666666F, -0.4F),        //HIGH2
        Climate.Parameter.span(-0.4F, -0.26666668F),    //MID2
        Climate.Parameter.span(-0.26666668F, -0.05F),//LOW1
        Climate.Parameter.span(-0.05F, 0.05F),//VALLEYS
        Climate.Parameter.span(0.05F, 0.26666668F),  //LOW2
        Climate.Parameter.span(0.26666668F, 0.4F),      //MID3

        Climate.Parameter.span(0.4F, 0.56666666F),          //HIGH3
        Climate.Parameter.span(0.56666666F, 0.7666667F),        //PEAKS2
        Climate.Parameter.span(0.7666667F, 0.93333334F),    //HIGH4
        Climate.Parameter.span(0.93333334F, 1.0F)       //MID4
        */
            Climate.Parameter.span(-0.2F,0.2F),                 //valleys

            Climate.Parameter.span(-1F,-0.7666667F),            //rare slopes
            Climate.Parameter.span(0.7666667F,1F),              //rare slopes

            Climate.Parameter.span(-0.56666666F,-0.2F),         //slopes
            Climate.Parameter.span(0.2F,0.56666666F),           //slopes

            Climate.Parameter.span(-0.7666667F, -0.56666666F),  //peaks
            Climate.Parameter.span(0.56666666F, 0.7666667F),    //peaks
    };

    protected static final Climate.Parameter COMMON_RARENESS_RANGE     =     Climate.Parameter.span(-1.0F, 0.35F);
    protected static final Climate.Parameter RARE_RARENESS_RANGE     =     Climate.Parameter.span(0.35F, 1.0F);

    protected static final Climate.Parameter FROZEN_RANGE     =     temperatures[0];
    protected static final Climate.Parameter UNFROZEN_RANGE     =     Climate.Parameter.span(temperatures[1], temperatures[4]);
    protected static final Climate.Parameter mushroomFieldsContinentalness     =     Climate.Parameter.span(-1.2F, -1.05F);
    protected static final Climate.Parameter deepOceanContinentalness     =     Climate.Parameter.span(-1.05F, -0.455F);
    protected static final Climate.Parameter oceanContinentalness     =     Climate.Parameter.span(-0.455F, -0.19F);
    protected static final Climate.Parameter coastContinentalness     =     Climate.Parameter.span(-0.19F, -0.11F);
    protected static final Climate.Parameter inlandContinentalness     =     Climate.Parameter.span(-0.11F, 0.55F);
    protected static final Climate.Parameter nearInlandContinentalness     =     Climate.Parameter.span(-0.11F, 0.03F);
    protected static final Climate.Parameter midInlandContinentalness     =     Climate.Parameter.span(0.03F, 0.3F);
    protected static final Climate.Parameter farInlandContinentalness     =     Climate.Parameter.span(0.3F, 1.0F);

    private static final ResourceKey<Biome>[][] OCEANS     =     new ResourceKey[][]{
            {Biomes.DEEP_FROZEN_OCEAN, Biomes.DEEP_COLD_OCEAN, Biomes.DEEP_OCEAN, Biomes.DEEP_LUKEWARM_OCEAN, Biomes.WARM_OCEAN},
            {Biomes.FROZEN_OCEAN,      Biomes.COLD_OCEAN,      Biomes.OCEAN,      Biomes.LUKEWARM_OCEAN,      Biomes.WARM_OCEAN}
    };

    private static final ResourceKey<Biome>[][][][] COASTLANDS = new ResourceKey[][][][]{
//↓ Temperature \ Humidity →
    //LOWLAND
            {{//PLAINS
                    {WNBiomes.SaltFlats             , WNBiomes.SnowyDenseTucholaForest  , WNBiomes.ForestedFields      , WNBiomes.ColdTaigaMarsh    , WNBiomes.FrozenTaiga},
                    {WNBiomes.SaltFlats             , WNBiomes.BorealForest             , WNBiomes.OakValley           , WNBiomes.PineMixedMarsh    , WNBiomes.BialowiezaFrozenMarsh},
                    {WNBiomes.CrackedDesert         , WNBiomes.Steppe                   , WNBiomes.HyacinthFields      , WNBiomes.Scrublands        , WNBiomes.BialowiezaMarsh},
                    {WNBiomes.Oasis                 , WNBiomes.Safari                   , WNBiomes.MarigoldFields      , WNBiomes.Wetlands          , WNBiomes.Rainforest},
                    {WNBiomes.Sahara                , WNBiomes.LushDesert               , WNBiomes.SunflowerFields     , WNBiomes.BananaThicket     , WNBiomes.Wetlands}},

            {//HILLSIDES (small - ignores continentalness)
                    {WNBiomes.Mirkwood              , WNBiomes.SnowyTucholaForest       , WNBiomes.SnowyTucholaForest  , WNBiomes.SnowyForest       , WNBiomes.SequoiaForest},
                    {WNBiomes.Mirkwood              , WNBiomes.SnowyBorealForest        , WNBiomes.Oaklands            , WNBiomes.SnowyForest       , WNBiomes.SequoiaForest},
                    {WNBiomes.OliveGarden           , WNBiomes.TemperatePineMixedForest , WNBiomes.TemperateForest     , WNBiomes.CornField         , WNBiomes.SakuraJungle},
                    {WNBiomes.DeadDesolation        , WNBiomes.CottonFields             , WNBiomes.FlowerField         , WNBiomes.Shrublands        , WNBiomes.RainforestMoor},
                    {WNBiomes.TintedDesert          , WNBiomes.CaatingaScrubs           , WNBiomes.RapeseedField       , WNBiomes.RapeseedField     , WNBiomes.RainforestMoor}},

            {//HILLS
                    {WNBiomes.SnowyTucholaForestHill, WNBiomes.SnowyTucholaForestHill   , WNBiomes.SnowyBirchGrove     , WNBiomes.ColdTaigaHills    , WNBiomes.ColdTaigaHills},
                    {WNBiomes.MapleForest           , WNBiomes.SnowyBorealForestHill    , WNBiomes.RedwoodForest       , WNBiomes.SnowyBirchGrove   , WNBiomes.CypressHills},
                    {WNBiomes.OliveHills            , WNBiomes.ErodedHills              , WNBiomes.Masuria             , WNBiomes.OaklandHills      , WNBiomes.OaklandHills},
                    {WNBiomes.Prairie               , WNBiomes.SafariHills              , WNBiomes.DenseMoor           , WNBiomes.HillyShrublands   , WNBiomes.RainforestHills},
                    {WNBiomes.TintedDesertHills     , WNBiomes.CaatingaHills            , WNBiomes.OrchardPlum         , WNBiomes.HillyShrublands   , WNBiomes.RainforestHills}}},

    //HIGHLAND
            {{//PLATEAUS
                    {WNBiomes.ColdTaiga             , WNBiomes.ColdTaiga                , WNBiomes.ColdTaigaClearing   , WNBiomes.ColdTaigaClearing , WNBiomes.CypressFields},
                    {WNBiomes.DarkMirkwood          , WNBiomes.ColdSilverlands          , WNBiomes.AspenGrove          , WNBiomes.SnowyAspenGrove   , WNBiomes.CypressFields},
                    {WNBiomes.PrairiePlateau        , WNBiomes.TemperateRedwoodScrubs   , WNBiomes.AutumnalPoplarForest, WNBiomes.PoppyFields       , WNBiomes.TemperateSequoiaRainforest},
                    {WNBiomes.Badlands              , WNBiomes.TemperateCedarScrubs     , WNBiomes.RoofedForest        , WNBiomes.ShrublandPlateau  , WNBiomes.GiantEucalyptusForest},
                    {WNBiomes.PoldersEdge           , WNBiomes.Polders                  , WNBiomes.LavenderGarden      , WNBiomes.DaintreePlateau   , WNBiomes.GiantEucalyptusForest}},

            {//MOUNTAINS (small - ignores continentalness)
                    {WNBiomes.ColdRockyTaiga        , WNBiomes.ColdRockyTaiga           , WNBiomes.ColdBerryTaiga      , WNBiomes.ColdForest        , WNBiomes.ColdForest},
                    {WNBiomes.RockyTaiga            , WNBiomes.SnowyCedarForest         , WNBiomes.BerryTaiga          , WNBiomes.TropicalBadlands  , WNBiomes.BialowiezaForest},
                    {WNBiomes.ErodedFields          , WNBiomes.AutumnalPoplarForestHills, WNBiomes.WeepingBirchForest  , WNBiomes.TropicalBadlands  , WNBiomes.BialowiezaForest},
                    {WNBiomes.CitrusOrchard         , WNBiomes.DeciduousForest          , WNBiomes.BirchGrove          , WNBiomes.MahoganyRainforest, WNBiomes.EucalyptusForest},
                    {WNBiomes.BaobabSavanna         , WNBiomes.GiantSavanna             , WNBiomes.VibrantForest       , WNBiomes.DaintreeForest    , WNBiomes.EucalyptusForest}},

            {//PEAKS
                    {WNBiomes.AutumnalMapleForest   , WNBiomes.BorealForestHill         , Biomes.ICE_SPIKES            , Biomes.ICE_SPIKES          , WNBiomes.WetTaiga},
                    {WNBiomes.AutumnalMapleForest   , WNBiomes.BorealForestHill         , WNBiomes.RedwoodHills        , WNBiomes.RedwoodHills      , WNBiomes.AutumnalSequoiaRainforest},
                    {WNBiomes.PrairieHills          , WNBiomes.PrairieHills             , WNBiomes.OldRedwoodForest    , WNBiomes.Moor              , WNBiomes.RoofedValley},
                    {Biomes.DESERT                  , Biomes.BADLANDS                   , WNBiomes.Orchard             , WNBiomes.MahoganyCliffs    , Biomes.BAMBOO_JUNGLE},
                    {Biomes.ERODED_BADLANDS         , Biomes.BADLANDS                   , WNBiomes.Orchard             , WNBiomes.DaintreeCliffs    , Biomes.BAMBOO_JUNGLE}}}
    };


    private static final ResourceKey<Biome>[][][][] INLANDS = new ResourceKey[][][][]{
//↓ Temperature \ Humidity →
    //LOWLAND
            {{//PLAINS
                    {WNBiomes.Silverlands      , WNBiomes.SnowyGiantConiferousForest, WNBiomes.TaigaClearing           , WNBiomes.SnowyTatraChocholowskaGlade, WNBiomes.WetTaiga},
                    {WNBiomes.Silverlands      , WNBiomes.CedarForest               , WNBiomes.SnowyBialowiezaForest   , WNBiomes.TaigaMarsh                 , WNBiomes.AutumnalSequoiaRainforest},
                    {WNBiomes.Forest           , WNBiomes.GiantConiferousForest     , WNBiomes.BirchMarsh              , WNBiomes.TatraChocholowskaGlade     , WNBiomes.MangroveBayou},
                    {WNBiomes.Farmlands        , WNBiomes.Meadow                    , WNBiomes.HornbeamValley          , WNBiomes.Backwaters                 , WNBiomes.MangroveBayou},
                    {WNBiomes.Grasslands       , WNBiomes.Fields                    , WNBiomes.Bog                     , WNBiomes.RoofedValley               , WNBiomes.Wetlands}},

            {//HILLSIDES (ignores continentalness)
                    {WNBiomes.TucholaForest    , WNBiomes.DenseTucholaForest        , WNBiomes.Taiga                   , WNBiomes.SnowyTatraLowerForest      , WNBiomes.SnowyTatraLowerForest},
                    {WNBiomes.TucholaForest    , WNBiomes.DenseTucholaForest        , WNBiomes.Taiga                   , WNBiomes.SeasonalTaiga              , WNBiomes.ThujaShield},
                    {WNBiomes.BeechGrove       , WNBiomes.AutumnalSpruceForest      , WNBiomes.Greenwood               , WNBiomes.GoldenWoods                , WNBiomes.TatraLowerForest},
                    {WNBiomes.GrasslandsHills  , WNBiomes.BeechForestTall           , WNBiomes.BirchScrubs             , WNBiomes.PoplarForest               , WNBiomes.TatraLowerForest},
                    {WNBiomes.Outback          , WNBiomes.WoodedOutback             , WNBiomes.HazelFields             , WNBiomes.CherryParadise             , WNBiomes.CherryParadise}},

            {//HILLS
                    {WNBiomes.TucholaForestHill, WNBiomes.HighForestHills           , WNBiomes.TaigaHills              , WNBiomes.SnowyTatraFoothills        , WNBiomes.SnowyTatraUpperForest},
                    {WNBiomes.TucholaForestHill, WNBiomes.HighForestHills           , WNBiomes.TaigaHills              , WNBiomes.SnowyTatraFoothills        , WNBiomes.SnowyTatraUpperForest},
                    {WNBiomes.BeechForestHills , WNBiomes.Highlands                 , WNBiomes.HornbeamForest          , WNBiomes.SequoiaHills               , WNBiomes.TatraUpperForest},
                    {Biomes.DESERT             , WNBiomes.WoodedMeadow              , WNBiomes.GreenwoodHills          , WNBiomes.SequoiaHills               , WNBiomes.ForestedGrasslandsHills},
                    {Biomes.DESERT             , WNBiomes.WoodedJacarandaMeadow     , WNBiomes.HornbeamHills           , WNBiomes.HornbeamHills              , WNBiomes.ForestedGrasslandsHills}}},

    //HIGHLAND
            {{//VALLEYS - can be quite cliffy
                    {WNBiomes.ColdTaigaValley  , WNBiomes.SnowyTucholaValley        , WNBiomes.SnowyTatraFireweedValley, WNBiomes.FrozenMorskieOko           , WNBiomes.SnowyCracowGorge},
                    {WNBiomes.TaigaValley      , WNBiomes.HighForestValley          , WNBiomes.SnowyBorealValley       , WNBiomes.BorealValley               , WNBiomes.CracowGorge},
                    {WNBiomes.TucholaValley    , WNBiomes.AutumnalPoplarForestValley, WNBiomes.OvergrownCliffs         , WNBiomes.MorskieOko                 , WNBiomes.TatraFireweedValley},
                    {WNBiomes.Canyons          , WNBiomes.BeechValley               , WNBiomes.GreenwoodValley         , WNBiomes.ForestValley               , WNBiomes.LandOfRivers},
                    {WNBiomes.GrandCanyon      , WNBiomes.PrehistoricValley         , WNBiomes.PoplarForestValley      , WNBiomes.ForestedGrasslands         , WNBiomes.LandOfRivers}},

            {//MOUNTAINS (ignores continentalness)
                    {WNBiomes.PineMixedForest  , WNBiomes.HighForest                , WNBiomes.PurpleWoodland          , WNBiomes.SnowedMountains            , WNBiomes.SnowyTatraMountains},
                    {WNBiomes.PineMixedForest  , WNBiomes.HighForest                , WNBiomes.PurpleWoodland          , WNBiomes.Glacier                    , WNBiomes.Glacier},
                    {WNBiomes.BeechForest      , WNBiomes.ForestedMountains         , WNBiomes.DenseOaklands           , WNBiomes.TatraFoothills             , WNBiomes.TatraMountains},
                    {WNBiomes.SequoiaValley    , WNBiomes.ForestedMountains         , WNBiomes.DenseOaklands           , WNBiomes.TatraFoothills             , WNBiomes.TatraMountains},
                    {WNBiomes.SequoiaValley    , WNBiomes.PoplarForestHills         , WNBiomes.PoplarForestHills       , WNBiomes.TatraFoothills             , WNBiomes.TatraMountains}},

            {//PEAKS
                    {Biomes.FROZEN_PEAKS       , Biomes.FROZEN_PEAKS                , Biomes.FROZEN_PEAKS              , WNBiomes.SnowyGiewont               , WNBiomes.SnowyTatraKasprowyPeak},
                    {WNBiomes.ChristmasDream   , WNBiomes.ChristmasDream            , Biomes.JAGGED_PEAKS              , WNBiomes.SnowyGiewont               , WNBiomes.SnowyTatraKasprowyPeak},
                    {WNBiomes.SequoiaHills     , Biomes.STONY_PEAKS                 , Biomes.JAGGED_PEAKS              , WNBiomes.Rysy                       , WNBiomes.Rysy},
                    {WNBiomes.TatraGreenedPeak , Biomes.JAGGED_PEAKS                , Biomes.STONY_PEAKS               , WNBiomes.TatraRedPeak               , WNBiomes.TatraKasprowyPeak},
                    {WNBiomes.TatraGreenedPeak , WNBiomes.Giewont                   , WNBiomes.Giewont                 , WNBiomes.TatraRedPeak               , WNBiomes.TatraKasprowyPeak}}}
    };

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        addGrasslands(registry,mapper);
    }
    private static void addGrasslands(Registry<Biome> biomeRegistry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        WildNature.getLogger().progress("Adding biomes 3x for some reason");
        addSurfaceBiome(mapper, FULL_RANGE, FULL_RANGE, Climate.Parameter.span(-0.11F, 1F), FULL_RANGE, Climate.Parameter.span(-0.06F, 0.06F), 0.0F, Biomes.RIVER);
        for (int t = 0; t < temperatures.length; ++t)
        {
            Climate.Parameter temperature = temperatures[t];

            for (int h = 0; h < humidities.length; ++h)
            {
                Climate.Parameter humidity = humidities[h];

                for (int e = 0; e < erosions.length; ++e)
                {
                    Climate.Parameter erosion = erosions[e];
            //Adds flatlands
                    ResourceKey<Biome> coastal = pickCoastal(biomeRegistry, e, 0, t, h);
                    ResourceKey<Biome> inland = pickInland(biomeRegistry, e, 0, t, h);
                    addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 0.55F), erosion, weirdness[0], 0.0F, coastal);
                    addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(0.55F, 1F), erosion, weirdness[0], 0.0F, inland);

            //Adds slopelands
                    coastal = pickCoastal(biomeRegistry, e, 1, t, h);
                    inland = pickInland(biomeRegistry, e, 1, t, h);
                //rare/small biomes
                    addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, weirdness[1], 0.0F, coastal);
                    addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, weirdness[2], 0.0F, coastal);
                //cliff/mountain biomes
                    addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, weirdness[3], 0.0F, inland);
                    addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, weirdness[4], 0.0F, inland);

            //Adds peak/hill biomes
                    coastal = pickCoastal(biomeRegistry, e, 2, t, h);
                    inland = pickInland(biomeRegistry, e, 2, t, h);
                    addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 0.55F), erosion, weirdness[5], 0.0F, coastal);
                    addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 0.55F), erosion, weirdness[6], 0.0F, coastal);

                    addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(0.55F, 1F), erosion, weirdness[5], 0.0F, inland);
                    addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(0.55F, 1F), erosion, weirdness[6], 0.0F, inland);
                }


            }
            addSurfaceBiome(mapper, temperature, FULL_RANGE, deepOceanContinentalness, FULL_RANGE, FULL_RANGE, 0.0F, OCEANS[0][t]);
            addSurfaceBiome(mapper, temperature, FULL_RANGE, oceanContinentalness, FULL_RANGE, FULL_RANGE, 0.0F, OCEANS[1][t]);
            addSurfaceBiome(mapper, temperature, FULL_RANGE, coastContinentalness, FULL_RANGE, Climate.Parameter.span(-0.055F, 0.055F), 0.0F, Biomes.BEACH);
        }
        WildNature.getLogger().success("Biomes added");
    }


    private static ResourceKey<Biome> pickCoastal(Registry<Biome> biomeRegistry, int erosionIndex, int slopeIndex, int temperatureIndex, int humidityIndex)
    {return biomeOrFallback(biomeRegistry, COASTLANDS[erosionIndex][slopeIndex][temperatureIndex][humidityIndex],Biomes.SUNFLOWER_PLAINS);}
    private static ResourceKey<Biome> pickInland(Registry<Biome> biomeRegistry, int erosionIndex, int slopeIndex, int temperatureIndex, int humidityIndex)
    {return biomeOrFallback(biomeRegistry, INLANDS[erosionIndex][slopeIndex][temperatureIndex][humidityIndex],Biomes.FLOWER_FOREST);}


    private static void addSurfaceBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper, Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness, Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome)
    {
        mapper.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(0.0F), weirdness, offset), biome));
        mapper.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(1.0F), weirdness, offset), biome));
    }

    private static ResourceKey<Biome> biomeOrFallback(Registry<Biome> biomeRegistry, ResourceKey<Biome>... biomes)
    {
        for (ResourceKey<Biome> key : biomes)
        {

            if (key != null) {return key;}
        }

        throw new RuntimeException("Failed to find fallback for biome!");
    }
}
