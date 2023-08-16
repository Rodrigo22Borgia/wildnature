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

import net.matez.wildnature.common.objects.blocks.plant.BushType;
import net.matez.wildnature.common.objects.features.WNCombinedFeature;
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
        // TAIGA
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.SeasonalTaiga.location()));

        // JUNGLE
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Rainforest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.RainforestMoor.location()));
        registry.register(WNOverworldBiomes.jungle().setRegistryName(WNBiomes.WoodedJacarandaMeadow.location()));

        // MESA

        // PLAINS
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Fields.location()));

        // SAVANNA
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.EucalyptusForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BananaThicket.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BaobabSavanna.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.CitrusOrchard.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.OliveGarden.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.OliveHills.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Shrublands.location()));

        // BEACH

        // FOREST
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.AspenGrove.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.BeechForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.CedarForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.HornbeamForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.MapleForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.PineMixedForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.RedwoodForest.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.CherryParadise.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.GoldenWoods.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.HazelFields.location()));
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.Orchard.location()));
        // DESERT

        // SWAMP
        registry.register(WNOverworldBiomes.swamp().setRegistryName(WNBiomes.MahoganyRainforest.location()));
        registry.register(WNOverworldBiomes.swamp().setRegistryName(WNBiomes.MangroveForest.location()));
        registry.register(WNOverworldBiomes.wetland().setRegistryName(WNBiomes.Wetlands.location()));

        // MOUNTAIN
        registry.register(WNOverworldBiomes.normal().setRegistryName(WNBiomes.TatraMountains.location()));
    }
}
