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
import net.matez.wildnature.common.objects.biomes.land.WNBiomeAspenGrove;
import net.matez.wildnature.common.objects.biomes.land.WNBiomeSeasonalTaiga;
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
        // TAIGA
        register(e, new WNBiomeSeasonalTaiga());
        register(e, new WNBiomeAspenGrove());

        log.success("Registered " + WN_BIOMES.size() + " biomes");
    }

    private static WNBiome register(RegistryEvent.Register<Biome> event, WNBiome biome) {
        IForgeRegistry<Biome> registry = event.getRegistry();

        registry.register(biome.build());
        WN_BIOMES.put(biome.getKey().location(), biome);
        return biome;
    }
}