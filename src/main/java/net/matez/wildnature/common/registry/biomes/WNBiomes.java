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

import net.matez.wildnature.setup.WildNature;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class WNBiomes
{
    protected static final ResourceKey<Biome> HOT_RED = register("hot_red");
    protected static final ResourceKey<Biome> COLD_BLUE = register("cold_blue");

    protected static final ResourceKey<Biome> RiverValleySharp = register("river_valley_sharp");
    protected static final ResourceKey<Biome> RiverValleySmooth = register("river_valley_smooth");

    protected static final ResourceKey<Biome> River = register("river");
    protected static final ResourceKey<Biome> FrozenRiver = register("frozen_river");
    protected static final ResourceKey<Biome> AmazonRiver = register("amazon_river");
    protected static final ResourceKey<Biome> NileRiver = register("nile_river");


    //STREAMS
    //lowlands
    //protected static final ResourceKey<Biome> STREAM_LOWLAND = register("stream_lowland",0.1f,0f);
    //protected static final ResourceKey<Biome> STREAM_LOWLAND_VALLEY = register("stream_lowland_valley",0.1f,0.05f);

    //-----------------------------------------------------

    //OAK
    protected static final ResourceKey<Biome> Oaklands = register("oaklands");
    protected static final ResourceKey<Biome> DenseOaklands = register("dense_oaklands");
    protected static final ResourceKey<Biome> OakValley = register("oak_valley");
    protected static final ResourceKey<Biome> OaklandHills = register("oakland_hills");

    //POPLAR
    protected static final ResourceKey<Biome> PoplarForest = register("poplar_forest");
    protected static final ResourceKey<Biome> PoplarForestValley = register("poplar_forest_valley");
    protected static final ResourceKey<Biome> PoplarForestHills = register("poplar_forest_hills");
    protected static final ResourceKey<Biome> AutumnalPoplarForest = register("autumnal_poplar_forest");
    protected static final ResourceKey<Biome> AutumnalPoplarForestValley = register("autumnal_poplar_forest_valley");
    protected static final ResourceKey<Biome> AutumnalPoplarForestHills = register("autumnal_poplar_forest_hills");


    //HIGH
    protected static final ResourceKey<Biome> HighForest = register("high_forest");
    protected static final ResourceKey<Biome> HighForestHills = register("high_forest_hills");
    protected static final ResourceKey<Biome> HighForestValley = register("high_forest_valley");

    protected static final ResourceKey<Biome> ForestedMountains = register("forested_cliffs");

    //ASPEN
    protected static final ResourceKey<Biome> AspenGrove = register("aspen_grove");
    protected static final ResourceKey<Biome> SnowyAspenGrove = register("snowy_aspen_grove");

    //BEECH
    protected static final ResourceKey<Biome> BeechForest = register("beech_forest");
    protected static final ResourceKey<Biome> BeechForestHills = register("beech_hills");
    protected static final ResourceKey<Biome> BeechValley = register("beech_valley");
    protected static final ResourceKey<Biome> BeechForestTall = register("beech_tall_forest");
    protected static final ResourceKey<Biome> BeechGrove = register("beech_grove");

    protected static final ResourceKey<Biome> PurpleWoodland = register("purple_woodland");

    //ORCHARD
    protected static final ResourceKey<Biome> Orchard = register("orchard");
    protected static final ResourceKey<Biome> OrchardPlum = register("orchard_plum");
    protected static final ResourceKey<Biome> CherryParadise = register("cherry_paradise");
    protected static final ResourceKey<Biome> CitrusOrchard = register("citrus_orchard");

    protected static final ResourceKey<Biome> VibrantForest = register("vibrant_forest");
    //MAPLE
    protected static final ResourceKey<Biome> MapleForest = register("maple_forest");
    protected static final ResourceKey<Biome> AutumnalMapleForest = register("autumnal_maple_forest");

    //GRASSLANDS
    protected static final ResourceKey<Biome> Grasslands = register("grasslands");
    protected static final ResourceKey<Biome> GrasslandsHills = register("grasslands_hills");
    protected static final ResourceKey<Biome> ForestedGrasslands = register("forested_grasslands");
    protected static final ResourceKey<Biome> ForestedGrasslandsHills = register("forested_grasslands_hills");
    protected static final ResourceKey<Biome> Polders = register("polders");
    protected static final ResourceKey<Biome> PoldersEdge = register("polders_edge");
    protected static final ResourceKey<Biome> Shrublands = register("shrublands");
    protected static final ResourceKey<Biome> HillyShrublands = register("hilly_shrublands");
    protected static final ResourceKey<Biome> Scrublands = register("scrublands");
    protected static final ResourceKey<Biome> HazelFields = register("hazel_fields");

    protected static final ResourceKey<Biome> Fields = register("fields");
    protected static final ResourceKey<Biome> SunflowerFields = register("sunflower_fields");
    protected static final ResourceKey<Biome> PoppyFields = register("poppy_fields");
    protected static final ResourceKey<Biome> ForestedFields = register("forested_fields");

    protected static final ResourceKey<Biome> PrehistoricValley = register("prehistoric_valley");
    protected static final ResourceKey<Biome> ErodedFields = register("eroded_fields");
    protected static final ResourceKey<Biome> ErodedHills = register("eroded_hills");


    //PRAIRIE
    protected static final ResourceKey<Biome> Prairie = register("prairie");
    protected static final ResourceKey<Biome> PrairieHills = register("prairie_hills");
    protected static final ResourceKey<Biome> PrairiePlateau = register("prairie_plateau");
    protected static final ResourceKey<Biome> RapeseedField = register("rapeseed_field");
    protected static final ResourceKey<Biome> CornField = register("corn_field");
    protected static final ResourceKey<Biome> CottonFields = register("cotton_fields");


    //OUTBACK
    protected static final ResourceKey<Biome> Outback = register("outback");
    protected static final ResourceKey<Biome> WoodedOutback = register("wooded_outback");

    //TATRA
    protected static final ResourceKey<Biome> TatraFoothills = register("tatra_foothills");//edge biome
    protected static final ResourceKey<Biome> TatraLowerForest = register("tatra_lower_forest");
    protected static final ResourceKey<Biome> TatraUpperForest = register("tatra_upper_forest");
    protected static final ResourceKey<Biome> TatraMountains = register("tatra_mountains");//basic biome
    protected static final ResourceKey<Biome> TatraGreenedPeak = register("tatra_greened_peak");
    protected static final ResourceKey<Biome> TatraRedPeak = register("tatra_red_peak");
    protected static final ResourceKey<Biome> TatraKasprowyPeak = register("tatra_kasprowy_peak");

    protected static final ResourceKey<Biome> ChocholowskaGlade = register("tatra_chocholowska_glade");
    protected static final ResourceKey<Biome> FireweedValley = register("tatra_fireweed_valley");
    protected static final ResourceKey<Biome> CracowGorge = register("cracow_gorge");
    protected static final ResourceKey<Biome> MorskieOko = register("morskie_oko");
    protected static final ResourceKey<Biome> Giewont = register("giewont");

    //snowy:
    protected static final ResourceKey<Biome> SnowyTatraFoothills = register("snowy_tatra_foothills");//edge biome
    protected static final ResourceKey<Biome> SnowyTatraLowerForest = register("snowy_tatra_lower_forest");
    protected static final ResourceKey<Biome> SnowyTatraUpperForest = register("snowy_tatra_upper_forest");
    protected static final ResourceKey<Biome> SnowyTatraMountains = register("snowy_tatra_mountains");//basic biome
    protected static final ResourceKey<Biome> SnowyTatraKasprowyPeak = register("snowy_tatra_kasprowy_peak");

    protected static final ResourceKey<Biome> SnowyChocholowskaGlade = register("snowy_tatra_chocholowska_glade");
    protected static final ResourceKey<Biome> SnowyFireweedValley = register("snowy_tatra_fireweed_valley");
    protected static final ResourceKey<Biome> SnowyCracowGorge = register("snowy_cracow_gorge");
    protected static final ResourceKey<Biome> FrozenMorskieOko = register("frozen_morskie_oko");
    protected static final ResourceKey<Biome> SnowyGiewont = register("snowy_giewont");

    protected static final ResourceKey<Biome> Rysy = register("rysy");
    //BIALOWIEZA
    protected static final ResourceKey<Biome> BialowiezaForest = register("bialowieza_forest");
    protected static final ResourceKey<Biome> BialowiezaMarsh = register("bialowieza_marsh");
    protected static final ResourceKey<Biome> BialowiezaForestS = register("snowy_bialowieza_forest");
    protected static final ResourceKey<Biome> BialowiezaMarshS = register("bialowieza_frozen_marsh");

    //CLIFFS
    protected static final ResourceKey<Biome> SnowyMountains = register("snowy_mountains");
    protected static final ResourceKey<Biome> Glacier = register("glacier");
    protected static final ResourceKey<Biome> Himalayas = register("himalayas");
    protected static final ResourceKey<Biome> OvergrownCliffs = register("overgrown_cliffs");


    //BOG
    protected static final ResourceKey<Biome> Bog = register("bog");

    //BOREAL
    protected static final ResourceKey<Biome> BorealForest = register("boreal_forest");
    protected static final ResourceKey<Biome> BorealForestHills = register("boreal_forest_hills");
    protected static final ResourceKey<Biome> BorealValley = register("boreal_valley");
    protected static final ResourceKey<Biome> SnowyBorealForest = register("snowy_boreal_forest");
    protected static final ResourceKey<Biome> SnowyBorealForestHills = register("snowy_boreal_forest_hills");
    protected static final ResourceKey<Biome> SnowyBorealValley = register("snowy_boreal_valley");
    protected static final ResourceKey<Biome> SeasonalTaiga = register("seasonal_taiga");
    protected static final ResourceKey<Biome> PineMixedForest = register("pine_mixed_forest");
    protected static final ResourceKey<Biome> TemperatePineMixedForest = register("temperate_pine_mixed_forest");
    protected static final ResourceKey<Biome> PineMixedMarsh = register("pine_mixed_marsh");
    protected static final ResourceKey<Biome> Moor = register("moor");
    protected static final ResourceKey<Biome> DenseMoor = register("dense_moor");

    protected static final ResourceKey<Biome> TucholaForest = register("tuchola_forest");
    protected static final ResourceKey<Biome> DenseTucholaForest = register("dense_tuchola_forest");
    protected static final ResourceKey<Biome> TucholaForestHill = register("tuchola_forest_hill");
    protected static final ResourceKey<Biome> TucholaValley = register("tuchola_valley");
    protected static final ResourceKey<Biome> SnowyTucholaForest = register("snowy_tuchola_forest");
    protected static final ResourceKey<Biome> SnowyDenseTucholaForest = register("snowy_dense_tuchola_forest");
    protected static final ResourceKey<Biome> SnowyTucholaForestHill = register("snowy_tuchola_forest_hill");
    protected static final ResourceKey<Biome> SnowyTucholaValley = register("snowy_tuchola_valley");

    protected static final ResourceKey<Biome> Taiga = register("taiga");
    protected static final ResourceKey<Biome> TaigaHills = register("taiga_hills");
    protected static final ResourceKey<Biome> TaigaValley = register("taiga_valley");
    protected static final ResourceKey<Biome> TaigaClearing = register("taiga_clearing");
    protected static final ResourceKey<Biome> WetTaiga = register("wet_taiga");
    protected static final ResourceKey<Biome> TaigaMarsh = register("taiga_marsh");
    protected static final ResourceKey<Biome> BerryTaiga = register("berry_taiga");
    protected static final ResourceKey<Biome> RockyTaiga = register("rocky_taiga");

    protected static final ResourceKey<Biome> ColdTaiga = register("cold_taiga");
    protected static final ResourceKey<Biome> ColdTaigaHills = register("cold_taiga_hills");
    protected static final ResourceKey<Biome> ColdTaigaValley = register("cold_taiga_valley");
    protected static final ResourceKey<Biome> ColdTaigaClearing = register("cold_taiga_clearing");
    protected static final ResourceKey<Biome> FrozenTaiga = register("frozen_taiga");
    protected static final ResourceKey<Biome> ColdTaigaMarsh = register("cold_taiga_marsh");
    protected static final ResourceKey<Biome> ColdBerryTaiga = register("cold_berry_taiga");
    protected static final ResourceKey<Biome> ColdRockyTaiga = register("cold_rocky_taiga");

    protected static final ResourceKey<Biome> Silverlands = register("silverlands");
    protected static final ResourceKey<Biome> ColdSilverlands = register("cold_silverlands");

    //HIGHLANDS
    protected static final ResourceKey<Biome> Highlands = register("highlands");

    //RAINFOREST
    protected static final ResourceKey<Biome> Rainforest = register("rainforest");
    protected static final ResourceKey<Biome> RainforestHills = register("rainforest_hills");
    protected static final ResourceKey<Biome> RainforestMoor = register("rainforest_moor");

    //SAFARI
    protected static final ResourceKey<Biome> Safari = register("safari");
    protected static final ResourceKey<Biome> SafariHills = register("safari_hills");
    protected static final ResourceKey<Biome> BaobabSavanna = register("baobab_savanna");
    protected static final ResourceKey<Biome> GiantSavanna = register("giant_savanna");

    protected static final ResourceKey<Biome> CaatingaScrubs = register("caatinga_scrubs");
    protected static final ResourceKey<Biome> CaatingaHills = register("caatinga_hills");

    //REDWOOD
    protected static final ResourceKey<Biome> RedwoodForest = register("redwood_forest");
    protected static final ResourceKey<Biome> RedwoodHills = register("redwood_hills");
    protected static final ResourceKey<Biome> OldRedwoodForest = register("old_redwood_forest");
    protected static final ResourceKey<Biome> CedarForest = register("cedar_fields");
    protected static final ResourceKey<Biome> SnowyCedarForest = register("snowy_cedar_fields");
    protected static final ResourceKey<Biome> TemperateCedarScrubs = register("temperate_cedar_scrubs");
    protected static final ResourceKey<Biome> TemperateRedwoodScrubs = register("temperate_redwood_scrubs");
    protected static final ResourceKey<Biome> CypressFields = register("cypress_fields");
    protected static final ResourceKey<Biome> CypressHills = register("cypress_hills");

    //SEQUOIA
    protected static final ResourceKey<Biome> SequoiaForest = register("sequoia_forest");
    protected static final ResourceKey<Biome> SequoiaHills = register("sequoia_hills");
    protected static final ResourceKey<Biome> SequoiaValley = register("sequoia_valley");

    //TEMPERATE RAINFOREST
    protected static final ResourceKey<Biome> TemperateSequoiaRainforest = register("temperate_sequoia_rainforest");
    protected static final ResourceKey<Biome> TemperateSequoiaRainforestHills = register("temperate_sequoia_rainforest_hills");
    protected static final ResourceKey<Biome> TemperateSequoiaRainforestValley = register("temperate_sequoia_rainforest_valley");

    protected static final ResourceKey<Biome> AutumnalSequoiaRainforest = register("autumnal_sequoia_rainforest");
    protected static final ResourceKey<Biome> AutumnalSequoiaRainforestHills = register("autumnal_sequoia_rainforest_hills");
    protected static final ResourceKey<Biome> AutumnalSequoiaRainforestValley = register("autumnal_sequoia_rainforest_valley");

    //GREENWOOD
    protected static final ResourceKey<Biome> Greenwood = register("greenwood");
    protected static final ResourceKey<Biome> GreenwoodHills = register("greenwood_hills");
    protected static final ResourceKey<Biome> GreenwoodValley = register("greenwood_valley");
    protected static final ResourceKey<Biome> RoofedForest = register("roofed_forest");
    protected static final ResourceKey<Biome> RoofedValley = register("roofed_valley");


    //CHRISTMAS
    protected static final ResourceKey<Biome> ChristmasDream = register("christmas_dream");

    //GIANT CONIFEROUS
    protected static final ResourceKey<Biome> GiantConiferousForest = register("giant_coniferous_forest");
    protected static final ResourceKey<Biome> SnowyGiantConiferousForest = register("snowy_giant_coniferous_forest");

    //AUTUMNAL
    protected static final ResourceKey<Biome> AutumnalSpruceForest = register("autumnal_spruce");

    //BIRCH_GROVE
    protected static final ResourceKey<Biome> BirchGrove = register("birch_grove");
    protected static final ResourceKey<Biome> SnowyBirchGrove = register("snowy_birch_grove");
    protected static final ResourceKey<Biome> WeepingBirchForest = register("weeping_birch_forest");
    protected static final ResourceKey<Biome> BirchScrubs = register("birch_scrubs");
    protected static final ResourceKey<Biome> BirchMarsh = register("birch_marsh");

    //FLOWER FIELD
    protected static final ResourceKey<Biome> FlowerField = register("flower_field");
    protected static final ResourceKey<Biome> HyacinthFields = register("hyacinth_fields");
    protected static final ResourceKey<Biome> MarigoldFields = register("marigold_fields");

    //MEADOWS
    protected static final ResourceKey<Biome> Meadow = register("meadow");
    protected static final ResourceKey<Biome> WoodedMeadow = register("wooded_meadow");
    protected static final ResourceKey<Biome> WoodedJacarandaMeadow = register("wooded_jacaranda_meadow");

    //SAHARA
    protected static final ResourceKey<Biome> Sahara = register("sahara");

    //DESERT
    protected static final ResourceKey<Biome> Oasis = register("oasis");
    protected static final ResourceKey<Biome> LushDesert = register("lush_desert");
    protected static final ResourceKey<Biome> CrackedDesert = register("cracked_desert");
    protected static final ResourceKey<Biome> TintedDesert = register("tinted_desert");
    protected static final ResourceKey<Biome> TintedDesertHills = register("tinted_desert_hills");
    protected static final ResourceKey<Biome> Badlands = register("badlands");
    protected static final ResourceKey<Biome> DeadDesolation = register("dead_desolation");
    protected static final ResourceKey<Biome> Canyons = register("canyons");
    protected static final ResourceKey<Biome> GrandCanyon = register("grand_canyon");

    //DENSE FOREST
    protected static final ResourceKey<Biome> DeciduousForest = register("deciduous_forest");
    protected static final ResourceKey<Biome> Forest = register("forest");
    protected static final ResourceKey<Biome> ForestValley = register("forest_valley");
    protected static final ResourceKey<Biome> SnowyForest = register("snowy_forest");
    protected static final ResourceKey<Biome> ColdForest = register("cold_forest");

    protected static final ResourceKey<Biome> TemperateForest = register("temperate_forest");

    //GOLDEN WOODS
    protected static final ResourceKey<Biome> GoldenWoods = register("golden_woods");

    //LAVENDER
    protected static final ResourceKey<Biome> LavenderGarden = register("lavender_garden");

    //
    protected static final ResourceKey<Biome> SaltFlats = register("salt_flats");


    //FARMLANDS
    protected static final ResourceKey<Biome> Farmlands = register("farmlands");

    //MAHOGANY
    protected static final ResourceKey<Biome> MahoganyRainforest = register("mahogany_rainforest");
    protected static final ResourceKey<Biome> MahoganyCliffs = register("mahogany_cliffs");

    //SAKURA
    protected static final ResourceKey<Biome> SakuraJungle = register("sakura_jungle");

    //BADLANDS
    protected static final ResourceKey<Biome> TropicalBadlands = register("tropical_badlands");
    protected static final ResourceKey<Biome> Steppe = register("steppe");

    //ICE
    protected static final ResourceKey<Biome> Icelands = register("icelands");


    //RIVERED
    protected static final ResourceKey<Biome> Masuria = register("masuria");
    protected static final ResourceKey<Biome> LandOfRivers = register("land_of_rivers");

    //WETLANDS
    protected static final ResourceKey<Biome> Wetlands = register("wetlands");
    protected static final ResourceKey<Biome> MangroveForest = register("mangrove_bayou");
    protected static final ResourceKey<Biome> Backwaters = register("backwaters");

    //TROPICAL
    protected static final ResourceKey<Biome> EucalyptusForest = register("eucalyptus_forest");
    protected static final ResourceKey<Biome> GiantEucalyptusForest = register("giant_eucalyptus_forest");

    protected static final ResourceKey<Biome> DaintreeForest = register("daintree_forest");
    protected static final ResourceKey<Biome> DaintreePlateau = register("daintree_plateau");
    protected static final ResourceKey<Biome> DaintreeCliffs = register("daintree_cliffs");

    protected static final ResourceKey<Biome> BananaThicket = register("banana_thicket");

    //CITRUS
    protected static final ResourceKey<Biome> OliveGarden = register("olive_grove");
    protected static final ResourceKey<Biome> OliveHills = register("olive_hills");

    //HORNBEAM
    protected static final ResourceKey<Biome> HornbeamForest = register("hornbeam_forest");
    protected static final ResourceKey<Biome> HornbeamHills = register("hornbeam_hills");
    protected static final ResourceKey<Biome> HornbeamValley = register("hornbeam_valley");

    //SPOOKY
    protected static final ResourceKey<Biome> Mirkwood = register("mirkwood");
    protected static final ResourceKey<Biome> DarkMirkwood = register("dark_mirkwood");

    //SHIELD
    protected static final ResourceKey<Biome> ThujaShield = register("thuja_shield");


    //LAKES
    protected static final ResourceKey<Biome> WarmLake = register("warm_lake");
    protected static final ResourceKey<Biome> ColdLake = register("cold_lake");
    protected static final ResourceKey<Biome> TropicalLake = register("tropical_lake");
    protected static final ResourceKey<Biome> FrozenLake = register("frozen_lake");
    protected static final ResourceKey<Biome> DriedLake = register("dried_lake");


    //ISLANDS
    protected static final ResourceKey<Biome> EasterIsland = register("easter_island");
    protected static final ResourceKey<Biome> TropicalIsland = register("tropical_island");
    protected static final ResourceKey<Biome> TropicalCliffs = register("tropical_cliffs");
    protected static final ResourceKey<Biome> ChristmasIsland = register("christmas_island");
    protected static final ResourceKey<Biome> Madagascar = register("madagascar");
    protected static final ResourceKey<Biome> MadagascarValley = register("madagascar_valley");
    protected static final ResourceKey<Biome> ParadiseIsland = register("paradise_island");

    protected static final ResourceKey<Biome> Island = register("island");
    protected static final ResourceKey<Biome> ForestedIsland = register("forested_island");
    protected static final ResourceKey<Biome> SnowyIsland = register("snowy_island");

    //BEACHES
    protected static final ResourceKey<Biome> Beach = register("beach");
    protected static final ResourceKey<Biome> PalmBeach = register("palm_beach");
    protected static final ResourceKey<Biome> WhiteBeach = register("white_beach");
    protected static final ResourceKey<Biome> WhitePalmBeach = register("white_palm_beach");
    protected static final ResourceKey<Biome> BeachDunes = register("dune_beach");
    protected static final ResourceKey<Biome> ColdBeach = register("cold_beach");
    protected static final ResourceKey<Biome> StoneShore = register("stone_shore");
    protected static final ResourceKey<Biome> ColdStoneShore = register("cold_stone_shore");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(WildNature.modid, name));
    }
}
