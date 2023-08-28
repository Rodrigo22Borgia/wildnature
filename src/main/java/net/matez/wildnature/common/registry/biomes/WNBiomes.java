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

public record WNBiomes() {
    public static final ResourceKey<Biome> SeasonalTaiga = register("seasonal_taiga"); // DEMO BIOME

    // try to rewrite all the biomes (for now just the base biomes, without sub) step by step to make look&feel almost the same
    public static final ResourceKey<Biome> AspenGrove = null;
    public static final ResourceKey<Biome> BananaThicket = null;
    public static final ResourceKey<Biome> BaobabSavanna = null;
    public static final ResourceKey<Biome> BeechForest = null;
    public static final ResourceKey<Biome> CedarForest = null;
    public static final ResourceKey<Biome> CherryParadise = null;
    public static final ResourceKey<Biome> CitrusOrchard = null;
    public static final ResourceKey<Biome> EucalyptusForest = null;
    public static final ResourceKey<Biome> Fields = null;
    public static final ResourceKey<Biome> GoldenWoods = null;
    public static final ResourceKey<Biome> HazelFields = null;
    public static final ResourceKey<Biome> HornbeamForest = null;
    public static final ResourceKey<Biome> MahoganyRainforest = null;
    public static final ResourceKey<Biome> MangroveForest = null;
    public static final ResourceKey<Biome> MapleForest = null;
    public static final ResourceKey<Biome> OliveGarden = null;
    public static final ResourceKey<Biome> OliveHills = null;
    public static final ResourceKey<Biome> Orchard = null;
    public static final ResourceKey<Biome> PineMixedForest = null;
    public static final ResourceKey<Biome> Rainforest = null;
    public static final ResourceKey<Biome> RainforestMoor = null;
    public static final ResourceKey<Biome> RedwoodForest = null;
    public static final ResourceKey<Biome> Shrublands = null;
    public static final ResourceKey<Biome> TatraMountains = null;
    public static final ResourceKey<Biome> Wetlands = null;
    public static final ResourceKey<Biome> WoodedJacarandaMeadow = null;

    private static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(WildNature.modid, name));
    }
}
