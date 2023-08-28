package net.matez.wildnature.common.registry.biomes;

import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.Music;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import javax.annotation.Nullable;

public abstract class WNBiome {
    // KEEP HERE SHARED VARIABLES FOR BIOMES
    @Nullable
    protected static final Music NORMAL_MUSIC = null;
    private ResourceKey<Biome> resourceKey;
    private Biome biome;
    // ---

    public WNBiome(ResourceKey<Biome> resourceKey, Biome.Precipitation precipitation, Biome.BiomeCategory category, float temperature, float downfall, @Nullable Music music) {
        this.resourceKey = resourceKey;
        this.biome = WNBiomeBuilder.makeBiome(precipitation, category, temperature, downfall, buildMobSpawn(), buildBiome(), music);
        this.biome.setRegistryName(resourceKey.location());
    }

    public WNBiome(ResourceKey<Biome> resourceKey, Biome.Precipitation precipitation, Biome.BiomeCategory category, float temperature, float downfall, @Nullable Music music, int... colors) {
        this.resourceKey = resourceKey;
        this.biome = WNBiomeBuilder.makeBiome(precipitation, category, temperature, downfall, buildMobSpawn(), buildBiome(), music, colors);
        this.biome.setRegistryName(resourceKey.location());
    }

    // ------------------------------------
    // KEEP HERE SHARED FUNCTIONS FOR BIOMES
    protected static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
        BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(builder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
        BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
        BiomeDefaultFeatures.addDefaultSprings(builder);
        BiomeDefaultFeatures.addSurfaceFreezing(builder);
    }

    public abstract MobSpawnSettings.Builder buildMobSpawn();

    public abstract BiomeGenerationSettings.Builder buildBiome();

    public abstract void applyCustomFeatures(final BiomeLoadingEvent event);

    public abstract SurfaceRules.RuleSource getSurface();

    public Biome build() {
        // here you can add additional final steps before registration
        return this.biome;
    }

    public ResourceKey<Biome> getKey() {
        return this.resourceKey;
    }

    public Biome getBiome() {
        return this.biome;
    }
}
