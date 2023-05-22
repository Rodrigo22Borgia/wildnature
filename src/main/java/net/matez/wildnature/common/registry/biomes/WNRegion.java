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
            Climate.Parameter.span(-1.0F, -0.2225F),      //0-2
            //Climate.Parameter.span(-1.0F, -0.78F),      //0
            //Climate.Parameter.span(-0.78F, -0.375F),    //1
            //Climate.Parameter.span(-0.375F, -0.2225F),  //2
            Climate.Parameter.span(-0.2225F, 0F),    //3
            Climate.Parameter.span(0F, 0.2225F),       //4
            //Climate.Parameter.span(0.45F, 0.55F),       //5
            //Climate.Parameter.span(0.55F, 1.0F)         //6
            Climate.Parameter.span(0.2225F, 1.0F)         //5-6
    };
    private final Climate.Parameter[] weirdness = new Climate.Parameter[]{
        /*
            Weirdness ranges map to specific slices in a repeating triangle wave fashion.





         */

        // First cycle
        Climate.Parameter.span(-1.0F, -0.93333334F),    //MID1
        Climate.Parameter.span(-0.93333334F, -0.7666667F),  //HIGH1
        Climate.Parameter.span(-0.7666667F, -0.56666666F),      //PEAKS1
        Climate.Parameter.span(-0.56666666F, -0.4F),        //HIGH2
        Climate.Parameter.span(-0.4F, -0.26666668F),    //MID2
        Climate.Parameter.span(-0.26666668F, -0.05F),//LOW1
        Climate.Parameter.span(-0.05F, 0.05F),//VALLEYS
        Climate.Parameter.span(0.05F, 0.26666668F),  //LOW2
        Climate.Parameter.span(0.26666668F, 0.4F),      //MID3
        // Second cycle is truncated
        Climate.Parameter.span(0.4F, 0.56666666F),          //HIGH3
        Climate.Parameter.span(0.56666666F, 0.7666667F),        //PEAKS2
        Climate.Parameter.span(0.7666667F, 0.93333334F),    //HIGH4
        Climate.Parameter.span(0.93333334F, 1.0F)       //MID4
    };
    
    protected static final Climate.Parameter COMMON_RARENESS_RANGE = Climate.Parameter.span(-1.0F, 0.35F);
    protected static final Climate.Parameter RARE_RARENESS_RANGE = Climate.Parameter.span(0.35F, 1.0F);

    protected final Climate.Parameter FROZEN_RANGE = this.temperatures[0];
    protected final Climate.Parameter UNFROZEN_RANGE = Climate.Parameter.span(this.temperatures[1], this.temperatures[4]);
    protected final Climate.Parameter mushroomFieldsContinentalness = Climate.Parameter.span(-1.2F, -1.05F);
    protected final Climate.Parameter deepOceanContinentalness = Climate.Parameter.span(-1.05F, -0.455F);
    protected final Climate.Parameter oceanContinentalness = Climate.Parameter.span(-0.455F, -0.19F);
    protected final Climate.Parameter coastContinentalness = Climate.Parameter.span(-0.19F, -0.11F);
    protected final Climate.Parameter inlandContinentalness = Climate.Parameter.span(-0.11F, 0.55F);
    protected final Climate.Parameter nearInlandContinentalness = Climate.Parameter.span(-0.11F, 0.03F);
    protected final Climate.Parameter midInlandContinentalness = Climate.Parameter.span(0.03F, 0.3F);
    protected final Climate.Parameter farInlandContinentalness = Climate.Parameter.span(0.3F, 1.0F);

    private final ResourceKey<Biome>[][] OCEANS = new ResourceKey[][]{
            {Biomes.DEEP_FROZEN_OCEAN, Biomes.DEEP_COLD_OCEAN, Biomes.DEEP_OCEAN, Biomes.DEEP_LUKEWARM_OCEAN, Biomes.WARM_OCEAN},
            {Biomes.FROZEN_OCEAN,      Biomes.COLD_OCEAN,      Biomes.OCEAN,      Biomes.LUKEWARM_OCEAN,      Biomes.WARM_OCEAN}
    };

    private final ResourceKey<Biome>[][][] FLATLANDS = new ResourceKey[][][]{
    //↓ Temperature \ Humidity →
            {//Erosion 0-2
                {null, null, WNBiomes.SnowyTatraFoothills, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}},

            {//Erosion 3
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, WNBiomes.Grasslands, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}},

            {//Erosion 4
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, WNBiomes.Polders, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}},

            {//Erosion 5-6
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, WNBiomes.HOT_RED}}
    };


    private final ResourceKey<Biome>[][][] SLOPES = new ResourceKey[][][]{
//↓ Temperature \ Humidity →
            {//Erosion 0-2
                    {null, null, WNBiomes.TatraMountains, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null}},

            {//Erosion 3
                    {null, null, WNBiomes.COLD_BLUE, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null}},

            {//Erosion 4
                    {null, null, WNBiomes.SnowyBorealForest, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null}},

            {//Erosion 5-6
                    {null, null, WNBiomes.SnowyBirchGrove, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null}}
    };


    private final ResourceKey<Biome>[][][] PEAKS = new ResourceKey[][][]{
//↓ Temperature \ Humidity →
            {//Erosion 0-2
                        {null, null, WNBiomes.SnowyTatraKasprowyPeak, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}},

            {//Erosion 3
                        {null, null, WNBiomes.TatraKasprowyPeak, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}},

            {//Erosion 4
                        {null, null, WNBiomes.TatraGreenedPeak, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}},

            {//Erosion 5-6
                        {null, null, WNBiomes.TatraRedPeak, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}}
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
                    ResourceKey<Biome> pickFlatland = this.pickFlatland(biomeRegistry, e, t, h);
                    ResourceKey<Biome> pickSlopes = this.pickSlopes(biomeRegistry, e, t, h);
                    ResourceKey<Biome> pickPeaks = this.pickPeaks(biomeRegistry, e, t, h);

                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, Climate.Parameter.span(-0.3F,0.3F), 0.0F, pickFlatland);

                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, Climate.Parameter.span(-1F,-0.7666667F), 0.0F, pickSlopes);
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, Climate.Parameter.span(0.7666667F,1F), 0.0F, pickSlopes);
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, Climate.Parameter.span(-0.56666666F,-0.3F), 0.0F, pickSlopes);
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, Climate.Parameter.span(0.3F,0.56666666F), 0.0F, pickSlopes);

                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, weirdness[2], 0.0F, pickPeaks);
                    this.addSurfaceBiome(mapper, temperature, humidity,  Climate.Parameter.span(-0.11F, 1F), erosion, weirdness[10], 0.0F, pickPeaks);
                }


            }
            this.addSurfaceBiome(mapper, temperature, this.FULL_RANGE, this.deepOceanContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, this.OCEANS[0][t]);
            this.addSurfaceBiome(mapper, temperature, this.FULL_RANGE, this.oceanContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, this.OCEANS[1][t]);
            this.addSurfaceBiome(mapper, temperature, this.FULL_RANGE, this.coastContinentalness, this.FULL_RANGE, Climate.Parameter.span(-0.055F, 0.055F), 0.0F, Biomes.BEACH);
        }
        WildNature.getLogger().success("Biomes added");
    }
    protected ResourceKey<Biome> pickFlatland(Registry<Biome> biomeRegistry, int erosionIndex, int temperatureIndex, int humidityIndex)
    {return biomeOrFallback(biomeRegistry, this.FLATLANDS[erosionIndex][temperatureIndex][humidityIndex], Biomes.PLAINS);}
    protected ResourceKey<Biome> pickSlopes(Registry<Biome> biomeRegistry, int erosionIndex, int temperatureIndex, int humidityIndex)
    {return biomeOrFallback(biomeRegistry, this.SLOPES[erosionIndex][temperatureIndex][humidityIndex], Biomes.FOREST);}
    protected ResourceKey<Biome> pickPeaks(Registry<Biome> biomeRegistry, int erosionIndex, int temperatureIndex, int humidityIndex)
    {return biomeOrFallback(biomeRegistry, this.PEAKS[erosionIndex][temperatureIndex][humidityIndex], Biomes.WINDSWEPT_HILLS);}


    protected void addSurfaceBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper, Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness, Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome)
    {
        mapper.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(0.0F), weirdness, offset), biome));
        mapper.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(1.0F), weirdness, offset), biome));
    }
    public static ResourceKey<Biome> biomeOrFallback(Registry<Biome> biomeRegistry, ResourceKey<Biome>... biomes)
    {
        for (ResourceKey<Biome> key : biomes)
        {
            if (key != null) {return key;}
        }

        throw new RuntimeException("Failed to find fallback for biome!");
    }
}
