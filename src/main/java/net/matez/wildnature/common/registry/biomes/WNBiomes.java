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
    protected static final ResourceKey<Biome> AspenGrove = register("aspen_grove");
    protected static final ResourceKey<Biome> BananaThicket = register("banana_thicket");
    protected static final ResourceKey<Biome> BaobabSavanna = register("baobab_savanna");
    protected static final ResourceKey<Biome> BeechForest = register("beech_forest");
    protected static final ResourceKey<Biome> CedarForest = register("cedar_fields");
    protected static final ResourceKey<Biome> CherryParadise = register("cherry_paradise");
    protected static final ResourceKey<Biome> CitrusOrchard = register("citrus_orchard");
    protected static final ResourceKey<Biome> EucalyptusForest = register("eucalyptus_forest");
    protected static final ResourceKey<Biome> Fields = register("fields");
    protected static final ResourceKey<Biome> GoldenWoods = register("golden_woods");
    protected static final ResourceKey<Biome> HazelFields = register("hazel_fields");
    protected static final ResourceKey<Biome> HornbeamForest = register("hornbeam_forest");
    protected static final ResourceKey<Biome> MahoganyRainforest = register("mahogany_rainforest");
    protected static final ResourceKey<Biome> MangroveForest = register("mangrove_bayou");
    protected static final ResourceKey<Biome> MapleForest = register("maple_forest");
    protected static final ResourceKey<Biome> OliveGarden = register("olive_grove");
    protected static final ResourceKey<Biome> OliveHills = register("olive_hills");
    protected static final ResourceKey<Biome> Orchard = register("orchard");
    protected static final ResourceKey<Biome> PineMixedForest = register("pine_mixed_forest");
    protected static final ResourceKey<Biome> Rainforest = register("rainforest");
    protected static final ResourceKey<Biome> RainforestMoor = register("rainforest_moor");
    protected static final ResourceKey<Biome> RedwoodForest = register("redwood_forest");
    protected static final ResourceKey<Biome> SeasonalTaiga = register("seasonal_taiga");
    protected static final ResourceKey<Biome> Shrublands = register("shrublands");
    protected static final ResourceKey<Biome> TatraMountains = register("tatra_mountains");
    protected static final ResourceKey<Biome> Wetlands = register("wetlands");
    protected static final ResourceKey<Biome> WoodedJacarandaMeadow = register("wooded_jacaranda_meadow");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(WildNature.modid, name));
    }
}
