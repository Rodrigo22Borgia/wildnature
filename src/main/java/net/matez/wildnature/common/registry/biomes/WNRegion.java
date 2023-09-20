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
    private final Climate.Parameter FULL_RANGE = Climate.Parameter.span(-1.0F, 1.0F);
    private final Climate.Parameter[] temperatures = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.45F),
            Climate.Parameter.span(-0.45F, -0.15F),
            Climate.Parameter.span(-0.15F, 0.2F),
            Climate.Parameter.span(0.2F, 0.55F),
            Climate.Parameter.span(0.55F, 1.0F)
    };

    private final Climate.Parameter[] humidities = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.35F),
            Climate.Parameter.span(-0.35F, -0.1F),
            Climate.Parameter.span(-0.1F, 0.1F),
            Climate.Parameter.span(0.1F, 0.3F),
            Climate.Parameter.span(0.3F, 1.0F)
    };

    private final Climate.Parameter[] erosions = new Climate.Parameter[]{
            Climate.Parameter.span(0F, 1F),
            Climate.Parameter.span(-1F, 0F)
    };
    private final Climate.Parameter[] weirdness = new Climate.Parameter[]{
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

    protected final Climate.Parameter FROZEN_RANGE     =     this.temperatures[0];
    protected final Climate.Parameter UNFROZEN_RANGE     =     Climate.Parameter.span(this.temperatures[1], this.temperatures[4]);
    protected final Climate.Parameter mushroomFieldsContinentalness     =     Climate.Parameter.span(-1.2F, -1.05F);
    protected final Climate.Parameter deepOceanContinentalness     =     Climate.Parameter.span(-1.05F, -0.455F);
    protected final Climate.Parameter oceanContinentalness     =     Climate.Parameter.span(-0.455F, -0.19F);
    protected final Climate.Parameter coastContinentalness     =     Climate.Parameter.span(-0.19F, -0.11F);
    protected final Climate.Parameter inlandContinentalness     =     Climate.Parameter.span(-0.11F, 0.55F);
    protected final Climate.Parameter nearInlandContinentalness     =     Climate.Parameter.span(-0.11F, 0.03F);
    protected final Climate.Parameter midInlandContinentalness     =     Climate.Parameter.span(0.03F, 0.3F);
    protected final Climate.Parameter farInlandContinentalness     =     Climate.Parameter.span(0.3F, 1.0F);

    private final ResourceKey<Biome>[][] OCEANS     =     new ResourceKey[][]{
            {Biomes.DEEP_FROZEN_OCEAN, Biomes.DEEP_COLD_OCEAN, Biomes.DEEP_OCEAN, Biomes.DEEP_LUKEWARM_OCEAN, Biomes.WARM_OCEAN},
            {Biomes.FROZEN_OCEAN,      Biomes.COLD_OCEAN,      Biomes.OCEAN,      Biomes.LUKEWARM_OCEAN,      Biomes.WARM_OCEAN}
    };

    private final ResourceKey<Biome>[][][][] COASTLANDS = new ResourceKey[][][][]{
//↓ Temperature \ Humidity →
    //LOWLAND
            {{//PLAINS
                    {null                        , WNBiomes.SnowyDenseTucholaForest  , WNBiomes.ForestedFields      , WNBiomes.ColdTaigaMarsh    , WNBiomes.FrozenTaiga},
                    {WNBiomes.SaltFlats          , WNBiomes.BorealForest             , WNBiomes.OakValley           , WNBiomes.PineMixedMarsh    , WNBiomes.BialowiezaFrozenMarsh},
                    {WNBiomes.CrackedDesert      , WNBiomes.Steppe                   , WNBiomes.HyacinthFields      , WNBiomes.Scrublands        , WNBiomes.BialowiezaMarsh},
                    {WNBiomes.Oasis              , WNBiomes.Safari                   , WNBiomes.MarigoldFields      , WNBiomes.Wetlands          , WNBiomes.Rainforest},
                    {WNBiomes.Sahara             , WNBiomes.LushDesert               , WNBiomes.SunflowerFields     , WNBiomes.BananaThicket     , null}},

            {//HILLSIDES (small - ignores continentalness)
                    {null                        , WNBiomes.SnowyTucholaForest       , null                         , null                       , null},
                    {WNBiomes.Mirkwood           , WNBiomes.SnowyBorealForest        , WNBiomes.Oaklands            , WNBiomes.SnowyForest       , WNBiomes.SequoiaForest},
                    {WNBiomes.OliveGarden        , WNBiomes.TemperatePineMixedForest , WNBiomes.TemperateForest     , WNBiomes.CornField         , WNBiomes.SakuraJungle},
                    {WNBiomes.DeadDesolation     , WNBiomes.CottonFields             , WNBiomes.FlowerField         , WNBiomes.Shrublands        , WNBiomes.RainforestMoor},
                    {WNBiomes.TintedDesert       , WNBiomes.CaatingaScrubs           , WNBiomes.RapeseedField       , null                       , null}},

            {//HILLS
                    {null                        , WNBiomes.SnowyTucholaForestHill   , null                         , WNBiomes.ColdTaigaHills    , null},
                    {WNBiomes.MapleForest        , WNBiomes.SnowyBorealForestHill    , WNBiomes.RedwoodForest       , WNBiomes.SnowyBirchGrove   , WNBiomes.CypressHills},
                    {WNBiomes.OliveHills         , WNBiomes.ErodedHills              , WNBiomes.Masuria             , WNBiomes.OaklandHills      , null},
                    {WNBiomes.Prairie            , WNBiomes.SafariHills              , WNBiomes.DenseMoor           , WNBiomes.HillyShrublands   , WNBiomes.RainforestHills},
                    {WNBiomes.TintedDesertHills  , WNBiomes.CaatingaHills            , WNBiomes.OrchardPlum         , null                       , null}}},

    //HIGHLAND
            {{//PLATEAUS
                    {null                        , WNBiomes.ColdTaiga                , WNBiomes.ColdTaigaClearing   , null                       , null},
                    {WNBiomes.DarkMirkwood       , WNBiomes.ColdSilverlands          , WNBiomes.AspenGrove          , WNBiomes.SnowyAspenGrove   , WNBiomes.CypressFields},
                    {WNBiomes.PrairiePlateau     , WNBiomes.TemperateRedwoodScrubs   , WNBiomes.AutumnalPoplarForest, WNBiomes.PoppyFields       , WNBiomes.TemperateSequoiaRainforest},
                    {WNBiomes.Badlands           , WNBiomes.TemperateCedarScrubs     , WNBiomes.RoofedForest        , WNBiomes.ShrublandPlateau  , WNBiomes.GiantEucalyptusForest},
                    {WNBiomes.PoldersEdge        , WNBiomes.Polders                  , WNBiomes.LavenderGarden      , WNBiomes.DaintreePlateau   , null}},

            {//MOUNTAINS (small - ignores continentalness)
                    {null                        , WNBiomes.ColdRockyTaiga           , WNBiomes.ColdBerryTaiga      , null                       , null},
                    {WNBiomes.RockyTaiga         , WNBiomes.SnowyCedarForest         , WNBiomes.BerryTaiga          , WNBiomes.ColdForest        , null},
                    {WNBiomes.ErodedFields       , WNBiomes.AutumnalPoplarForestHills, WNBiomes.WeepingBirchForest  , WNBiomes.TropicalBadlands  , null},
                    {WNBiomes.CitrusOrchard      , WNBiomes.DeciduousForest          , WNBiomes.BirchGrove          , WNBiomes.MahoganyRainforest, WNBiomes.EucalyptusForest},
                    {WNBiomes.BaobabSavanna      , WNBiomes.GiantSavanna             , WNBiomes.VibrantForest       , WNBiomes.DaintreeForest    , null}},

            {//PEAKS
                    {null                        , null                              , null                         , null                       , null},
                    {WNBiomes.AutumnalMapleForest, WNBiomes.BorealForestHill         , WNBiomes.RedwoodHills        , null                       , null},
                    {WNBiomes.PrairieHills       , null                              , WNBiomes.OldRedwoodForest    , WNBiomes.Moor              , null},
                    {null                        , null                              , null                         , WNBiomes.MahoganyCliffs    , null},
                    {null                        , null                              , WNBiomes.Orchard             , WNBiomes.DaintreeCliffs    , null}}}
    };


    private final ResourceKey<Biome>[][][][] INLANDS = new ResourceKey[][][][]{
//↓ Temperature \ Humidity →
    //LOWLAND
            {{//PLAINS
                    {null                      , WNBiomes.SnowyGiantConiferousForest, WNBiomes.TaigaClearing           , WNBiomes.SnowyTatraChocholowskaGlade, WNBiomes.WetTaiga},
                    {WNBiomes.Silverlands      , WNBiomes.CedarForest               , WNBiomes.SnowyBialowiezaForest   , WNBiomes.TaigaMarsh                 , WNBiomes.AutumnalSequoiaRainforest},
                    {WNBiomes.Forest           , WNBiomes.GiantConiferousForest     , WNBiomes.BirchMarsh              , WNBiomes.TatraChocholowskaGlade     , null},
                    {WNBiomes.Farmlands        , WNBiomes.Meadow                    , WNBiomes.HornbeamValley          , WNBiomes.Backwaters                 , WNBiomes.MangroveBayou},
                    {WNBiomes.Grasslands       , WNBiomes.Fields                    , WNBiomes.Bog                     , WNBiomes.RoofedValley               , null}},

            {//HILLSIDES (ignores continentalness)
                    {null                      , null                               , null                             , null                                , WNBiomes.SnowyTatraLowerForest},
                    {WNBiomes.TucholaForest    , WNBiomes.DenseTucholaForest        , WNBiomes.Taiga                   , WNBiomes.SeasonalTaiga              , WNBiomes.ThujaShield},
                    {WNBiomes.BeechGrove       , WNBiomes.AutumnalSpruceForest      , WNBiomes.Greenwood               , WNBiomes.GoldenWoods                , WNBiomes.TatraLowerForest},
                    {WNBiomes.GrasslandsHills  , WNBiomes.BeechForestTall           , WNBiomes.BirchScrubs             , WNBiomes.PoplarForest               , null},
                    {WNBiomes.Outback          , WNBiomes.WoodedOutback             , WNBiomes.HazelFields             , WNBiomes.CherryParadise             , null}},

            {//HILLS
                    {null                      , null                               , null                             , WNBiomes.SnowyTatraFoothills        , WNBiomes.SnowyTatraUpperForest},
                    {WNBiomes.TucholaForestHill, WNBiomes.HighForestHills           , WNBiomes.TaigaHills              , null                                , null},
                    {WNBiomes.BeechForestHills , WNBiomes.Highlands                 , WNBiomes.HornbeamForest          , WNBiomes.TatraGreenedPeak           , WNBiomes.TatraUpperForest},
                    {null                      , WNBiomes.WoodedMeadow              , WNBiomes.GreenwoodHills          , null                                , null},
                    {null                      , WNBiomes.WoodedJacarandaMeadow     , WNBiomes.HornbeamHills           , WNBiomes.ForestedGrasslandsHills    , null}}},

    //HIGHLAND
            {{//VALLEYS - can be quite cliffy
                    {WNBiomes.ColdTaigaValley  , WNBiomes.SnowyTucholaValley        , WNBiomes.SnowyTatraFireweedValley, WNBiomes.FrozenMorskieOko           , WNBiomes.SnowyCracowGorge},
                    {WNBiomes.TaigaValley      , WNBiomes.HighForestValley          , WNBiomes.SnowyBorealValley       , WNBiomes.BorealValley               , WNBiomes.CracowGorge},
                    {WNBiomes.TucholaValley    , WNBiomes.AutumnalPoplarForestValley, WNBiomes.OvergrownCliffs         , WNBiomes.MorskieOko                 , WNBiomes.TatraFireweedValley},
                    {WNBiomes.Canyons          , WNBiomes.BeechValley               , WNBiomes.GreenwoodValley         , WNBiomes.ForestValley               , null},
                    {WNBiomes.GrandCanyon      , WNBiomes.PrehistoricValley         , WNBiomes.PoplarForestValley      , WNBiomes.ForestedGrasslands         , WNBiomes.LandOfRivers}},

            {//MOUNTAINS (ignores continentalness)
                    {null                      , null                               , null                             , WNBiomes.SnowedMountains            , WNBiomes.SnowyTatraMountains},
                    {WNBiomes.PineMixedForest  , WNBiomes.HighForest                , WNBiomes.PurpleWoodland          , WNBiomes.Glacier                    , null},
                    {WNBiomes.BeechForest      , WNBiomes.ForestedMountains         , WNBiomes.DenseOaklands           , WNBiomes.TatraFoothills             , WNBiomes.TatraMountains},
                    {WNBiomes.SequoiaValley    , null                               , null                             , null                                , null},
                    {null                      , null                               , WNBiomes.PoplarForestHills       , null                                , null}},

            {//PEAKS
                    {null                      , null                               , null                             , WNBiomes.SnowyGiewont               , WNBiomes.Rysy},
                    {null                      , WNBiomes.ChristmasDream            , null                             , WNBiomes.Giewont                    , WNBiomes.SnowyTatraKasprowyPeak},
                    {null                      , null                               , null                             , WNBiomes.TatraRedPeak               , WNBiomes.TatraKasprowyPeak},
                    {WNBiomes.SequoiaHills     , null                               , null                             , null                                , null},
                    {null                      , null                               , null                             , null                                , null}}}
    };

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        this.addGrasslands(registry,mapper);

    }
    private void addGrasslands(Registry<Biome> biomeRegistry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper)
    {
        WildNature.getLogger().progress("Adding biomes 3x for some reason");
        this.addSurfaceBiome(mapper, this.FULL_RANGE, this.FULL_RANGE, Climate.Parameter.span(-0.11F, 1F), this.FULL_RANGE, Climate.Parameter.span(-0.06F, 0.06F), 0.0F, Biomes.RIVER);
        for (int t = 0; t < this.temperatures.length; ++t)
        {
            Climate.Parameter temperature = this.temperatures[t];

            for (int h = 0; h < this.humidities.length; ++h)
            {
                Climate.Parameter humidity = this.humidities[h];

                for (int e = 0; e < this.erosions.length; ++e)
                {
                    Climate.Parameter erosion = this.erosions[e];
            //Adds flatlands
                    ResourceKey<Biome> coastal = this.pickCoastal(biomeRegistry, e, 0, t, h);
                    ResourceKey<Biome> inland = this.pickInland(biomeRegistry, e, 0, t, h);
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 0.55F), erosion, weirdness[0], 0.0F, coastal);
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(0.55F, 1F), erosion, weirdness[0], 0.0F, inland);

            //Adds slopelands
                    coastal = this.pickCoastal(biomeRegistry, e, 1, t, h);
                    inland = this.pickInland(biomeRegistry, e, 1, t, h);
                //rare/small biomes
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, weirdness[1], 0.0F, coastal);
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, weirdness[2], 0.0F, coastal);
                //cliff/mountain biomes
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, weirdness[3], 0.0F, inland);
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, weirdness[4], 0.0F, inland);

            //Adds peak/hill biomes
                    coastal = this.pickCoastal(biomeRegistry, e, 2, t, h);
                    inland = this.pickInland(biomeRegistry, e, 2, t, h);
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 0.55F), erosion, weirdness[5], 0.0F, coastal);
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 0.55F), erosion, weirdness[6], 0.0F, coastal);

                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(0.55F, 1F), erosion, weirdness[5], 0.0F, inland);
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(0.55F, 1F), erosion, weirdness[6], 0.0F, inland);
                }


            }
            this.addSurfaceBiome(mapper, temperature, this.FULL_RANGE, this.deepOceanContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, this.OCEANS[0][t]);
            this.addSurfaceBiome(mapper, temperature, this.FULL_RANGE, this.oceanContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, this.OCEANS[1][t]);
            this.addSurfaceBiome(mapper, temperature, this.FULL_RANGE, this.coastContinentalness, this.FULL_RANGE, Climate.Parameter.span(-0.055F, 0.055F), 0.0F, Biomes.BEACH);
        }
        WildNature.getLogger().success("Biomes added");
    }


    private ResourceKey<Biome> pickCoastal(Registry<Biome> biomeRegistry, int erosionIndex, int slopeIndex, int temperatureIndex, int humidityIndex)
    {return biomeOrFallback(biomeRegistry, this.COASTLANDS[erosionIndex][slopeIndex][temperatureIndex][humidityIndex],Biomes.SUNFLOWER_PLAINS);}
    private ResourceKey<Biome> pickInland(Registry<Biome> biomeRegistry, int erosionIndex, int slopeIndex, int temperatureIndex, int humidityIndex)
    {return biomeOrFallback(biomeRegistry, this.INLANDS[erosionIndex][slopeIndex][temperatureIndex][humidityIndex],Biomes.FLOWER_FOREST);}


    private void addSurfaceBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper, Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness, Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome)
    {
        mapper.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(0.0F), weirdness, offset), biome));
        mapper.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(1.0F), weirdness, offset), biome));
    }

    private static int index = 0;
    private static final ResourceKey<Biome>[] list = WNBiomes.getAllBiomes();

    private static ResourceKey<Biome> biomeOrFallback(Registry<Biome> biomeRegistry, ResourceKey<Biome>... biomes)
    {
        /*index ++;
        if (index >= list.length) {
            index = 0;
        }
        return list[index];*/
        for (ResourceKey<Biome> key : biomes)
        {

            if (key != null) {return key;}
        }

        throw new RuntimeException("Failed to find fallback for biome!");
    }
}
