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
public class WNBiomeRegistry
{
    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event)
    {
        IForgeRegistry<Biome> registry = event.getRegistry();
        // TAIGA
        registry.register(WNBiomeBuilder.taiga().setRegistryName(WNBiomes.SeasonalTaiga.location()));
        registry.register(WNBiomeBuilder.taiga().setRegistryName(WNBiomes.TatraMountains.location()));
        registry.register(WNBiomeBuilder.taiga().setRegistryName(WNBiomes.PineMixedForest.location()));

        // JUNGLE
        registry.register(WNBiomeBuilder.jungle().setRegistryName(WNBiomes.Rainforest.location()));
        registry.register(WNBiomeBuilder.jungle().setRegistryName(WNBiomes.RainforestMoor.location()));
        registry.register(WNBiomeBuilder.jungle().setRegistryName(WNBiomes.WoodedJacarandaMeadow.location()));

        // MESA

        // PLAINS
        registry.register(WNBiomeBuilder.plains().setRegistryName(WNBiomes.Fields.location()));

        // SAVANNA
        registry.register(WNBiomeBuilder.savanna().setRegistryName(WNBiomes.EucalyptusForest.location()));
        registry.register(WNBiomeBuilder.savanna().setRegistryName(WNBiomes.BananaThicket.location()));
        registry.register(WNBiomeBuilder.savanna().setRegistryName(WNBiomes.BaobabSavanna.location()));
        registry.register(WNBiomeBuilder.savanna().setRegistryName(WNBiomes.CitrusOrchard.location()));
        registry.register(WNBiomeBuilder.savanna().setRegistryName(WNBiomes.OliveGarden.location()));
        registry.register(WNBiomeBuilder.savanna().setRegistryName(WNBiomes.OliveHills.location()));
        registry.register(WNBiomeBuilder.savanna().setRegistryName(WNBiomes.Shrublands.location()));

        // BEACH

        // FOREST
        registry.register(WNBiomeBuilder.forest().setRegistryName(WNBiomes.AspenGrove.location()));
        registry.register(WNBiomeBuilder.forest().setRegistryName(WNBiomes.BeechForest.location()));
        registry.register(WNBiomeBuilder.forest().setRegistryName(WNBiomes.CedarForest.location()));
        registry.register(WNBiomeBuilder.forest().setRegistryName(WNBiomes.HornbeamForest.location()));
        registry.register(WNBiomeBuilder.forest().setRegistryName(WNBiomes.MapleForest.location()));
        registry.register(WNBiomeBuilder.forest().setRegistryName(WNBiomes.RedwoodForest.location()));
        registry.register(WNBiomeBuilder.forest().setRegistryName(WNBiomes.CherryParadise.location()));
        registry.register(WNBiomeBuilder.forest().setRegistryName(WNBiomes.GoldenWoods.location()));
        registry.register(WNBiomeBuilder.forest().setRegistryName(WNBiomes.HazelFields.location()));
        registry.register(WNBiomeBuilder.forest().setRegistryName(WNBiomes.Orchard.location()));
        // DESERT

        // SWAMP
        registry.register(WNBiomeBuilder.swamp().setRegistryName(WNBiomes.MahoganyRainforest.location()));
        registry.register(WNBiomeBuilder.swamp().setRegistryName(WNBiomes.MangroveForest.location()));
        registry.register(WNBiomeBuilder.wetland().setRegistryName(WNBiomes.Wetlands.location()));

        // MOUNTAIN
    }
}