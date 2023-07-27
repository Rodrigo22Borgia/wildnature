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

import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomes
{
    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event)
    {
        IForgeRegistry<Biome> registry = event.getRegistry();
//FLAT
        //GRASSLANDS: flat
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Grasslands.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.GrasslandsHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ForestedGrasslands.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ForestedGrasslandsHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Polders.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.PoldersEdge.location()));
        registry.register(WNOverworldBiomes.normal(12171099).setRegistryName(WNBiomes.Shrublands.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.HillyShrublands.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Scrublands.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.HazelFields.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Fields.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SunflowerFields.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.PoppyFields.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ForestedFields.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.PrehistoricValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ErodedFields.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ErodedHills.location()));


        //PRAIRIE: flat
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Prairie.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.PrairieHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.PrairiePlateau.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.RapeseedField.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.CornField.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.CottonFields.location()));


        //OUTBACK flat
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Outback.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.WoodedOutback.location()));

        //SAFARI flat
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Safari.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SafariHills.location()));
        registry.register(WNOverworldBiomes.normal(12564309).setRegistryName(WNBiomes.BaobabSavanna.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.GiantSavanna.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.CaatingaScrubs.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.CaatingaHills.location()));

        //REDWOOD flat
        registry.register(WNOverworldBiomes.normal(9470285).setRegistryName(WNBiomes.RedwoodForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.RedwoodHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.OldRedwoodForest.location()));
        registry.register(WNOverworldBiomes.normal(9090697).setRegistryName(WNBiomes.CedarForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyCedarForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TemperateCedarScrubs.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TemperateRedwoodScrubs.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.CypressFields.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.CypressHills.location()));

        //FLOWER FIELD flat
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.FlowerField.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.HyacinthFields.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.MarigoldFields.location()));

        //MEADOWS flat
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Meadow.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.WoodedMeadow.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.WoodedJacarandaMeadow.location()));

        //SAHARA flat
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Sahara.location()));

        //DESERT flat
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Oasis.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.LushDesert.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.CrackedDesert.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TintedDesert.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TintedDesertHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Badlands.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.DeadDesolation.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Canyons.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.GrandCanyon.location()));

        //LAVENDER flat
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.LavenderGarden.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SaltFlats.location()));


        //FARMLANDS flat
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Farmlands.location()));

        //MAHOGANY hot
        registry.register(WNOverworldBiomes.normal(5622079).setRegistryName(WNBiomes.MahoganyRainforest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.MahoganyCliffs.location()));

        //SAKURA hot
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SakuraJungle.location()));

        //BADLANDS flat
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TropicalBadlands.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Steppe.location()));

        //ICE cold
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Icelands.location()));

        //BOG
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Bog.location()));
//FORESTS
        //OAK
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Oaklands.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.DenseOaklands.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.OakValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.OaklandHills.location()));

        //POPLAR
        registry.register(WNOverworldBiomes.normal(9090697).setRegistryName(WNBiomes.PoplarForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.PoplarForestValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.PoplarForestHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.AutumnalPoplarForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.AutumnalPoplarForestValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.AutumnalPoplarForestHills.location()));


        //HIGH
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.HighForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.HighForestHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.HighForestValley.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ForestedMountains.location()));

        //ASPEN
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.AspenGrove.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyAspenGrove.location()));

        //BEECH
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BeechForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BeechForestHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BeechValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BeechForestTall.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BeechGrove.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.PurpleWoodland.location()));

        //ORCHARD
        registry.register(WNOverworldBiomes.normal(9164170).setRegistryName(WNBiomes.Orchard.location()));
        registry.register(WNOverworldBiomes.normal(9164170).setRegistryName(WNBiomes.OrchardPlum.location()));
        registry.register(WNOverworldBiomes.normal(9164170).setRegistryName(WNBiomes.CherryParadise.location()));
        registry.register(WNOverworldBiomes.normal(12171099).setRegistryName(WNBiomes.CitrusOrchard.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.VibrantForest.location()));
        //MAPLE
        registry.register(WNOverworldBiomes.normal(9090697).setRegistryName(WNBiomes.MapleForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.AutumnalMapleForest.location()));

        //TATRA: cold
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TatraFoothills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TatraLowerForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TatraUpperForest.location()));
        registry.register(WNOverworldBiomes.normal(8434839).setRegistryName(WNBiomes.TatraMountains.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TatraGreenedPeak.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TatraRedPeak.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TatraKasprowyPeak.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ChocholowskaGlade.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.FireweedValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.CracowGorge.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.MorskieOko.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Giewont.location()));

        //SNOWY: cold
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyTatraFoothills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyTatraLowerForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyTatraUpperForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyTatraMountains.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyTatraKasprowyPeak.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyChocholowskaGlade.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyFireweedValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyCracowGorge.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.FrozenMorskieOko.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyGiewont.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Rysy.location()));

        //BIALOWIEZA
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BialowiezaForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BialowiezaMarsh.location()));

        //BOREAL cold
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BorealForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BorealForestHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BorealValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyBorealForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyBorealForestHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyBorealValley.location()));
        registry.register(WNOverworldBiomes.normal(9090697).setRegistryName(WNBiomes.SeasonalTaiga.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.PineMixedForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TemperatePineMixedForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.PineMixedMarsh.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Moor.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.DenseMoor.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TucholaForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.DenseTucholaForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TucholaForestHill.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TucholaValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyTucholaForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyDenseTucholaForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyTucholaForestHill.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyTucholaValley.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Taiga.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TaigaHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TaigaValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TaigaClearing.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.WetTaiga.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TaigaMarsh.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BerryTaiga.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.RockyTaiga.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ColdTaiga.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ColdTaigaHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ColdTaigaValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ColdTaigaClearing.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.FrozenTaiga.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ColdTaigaMarsh.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ColdBerryTaiga.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ColdRockyTaiga.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Silverlands.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ColdSilverlands.location()));

        //HIGHLANDS slope
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Highlands.location()));

        //RAINFOREST
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Rainforest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.RainforestHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.RainforestMoor.location()));

        //SEQUOIA
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SequoiaForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SequoiaHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SequoiaValley.location()));

        //TEMPERATE RAINFOREST
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TemperateSequoiaRainforest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TemperateSequoiaRainforestHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TemperateSequoiaRainforestValley.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.AutumnalSequoiaRainforest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.AutumnalSequoiaRainforestHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.AutumnalSequoiaRainforestValley.location()));

        //GREENWOOD slope
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Greenwood.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.GreenwoodHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.GreenwoodValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.RoofedForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.RoofedValley.location()));

        //GIANT CONIFEROUS slope
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.GiantConiferousForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyGiantConiferousForest.location()));

        //AUTUMNAL slope
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.AutumnalSpruceForest.location()));

        //BIRCH_GROVE slope
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BirchGrove.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyBirchGrove.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.WeepingBirchForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BirchScrubs.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BirchMarsh.location()));

        //DENSE FOREST
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.DeciduousForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Forest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ForestValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ColdForest.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TemperateForest.location()));

        //GOLDEN WOODS
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.GoldenWoods.location()));

        //WETLANDS
        registry.register(WNOverworldBiomes.normal(5011004).setRegistryName(WNBiomes.Wetlands.location()));
        registry.register(WNOverworldBiomes.normal(5011004).setRegistryName(WNBiomes.MangroveForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Backwaters.location()));

        //TROPICAL hot
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.EucalyptusForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.GiantEucalyptusForest.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.DaintreeForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.DaintreePlateau.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.DaintreeCliffs.location()));

        registry.register(WNOverworldBiomes.normal(6604607).setRegistryName(WNBiomes.BananaThicket.location()));

        //CITRUS
        registry.register(WNOverworldBiomes.normal(12171099).setRegistryName(WNBiomes.OliveGarden.location()));
        registry.register(WNOverworldBiomes.normal(12171099).setRegistryName(WNBiomes.OliveHills.location()));

        //HORNBEAM
        registry.register(WNOverworldBiomes.hornbeam().setRegistryName(WNBiomes.HornbeamForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.HornbeamHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.HornbeamValley.location()));

        //SPOOKY
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Mirkwood.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.DarkMirkwood.location()));

        //SHIELD
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ThujaShield.location()));

//PEAKS
        //CLIFFS
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyMountains.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Glacier.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Himalayas.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.OvergrownCliffs.location()));

//SPECIAL
        //CHRISTMAS special
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ChristmasDream.location()));

        //LAKES special
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.WarmLake.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ColdLake.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TropicalLake.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.FrozenLake.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.DriedLake.location()));

        //ISLANDS special
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.EasterIsland.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TropicalIsland.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TropicalCliffs.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ChristmasIsland.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Madagascar.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.MadagascarValley.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ParadiseIsland.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Island.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ForestedIsland.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SnowyIsland.location()));

        //BEACHES special
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Beach.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.PalmBeach.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.WhiteBeach.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.WhitePalmBeach.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BeachDunes.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ColdBeach.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.StoneShore.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.ColdStoneShore.location()));

        //RIVERED special
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Masuria.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.LandOfRivers.location()));

        //RIVERS
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.RiverValleySharp.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.RiverValleySmooth.location()));

        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.River.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.FrozenRiver.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.AmazonRiver.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.NileRiver.location()));


        //STREAMS
        //lowlands
        //registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.STREAM_LOWLAND.location()));
        //registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.STREAM_LOWLAND_VALLEY.location()));
    }
}
