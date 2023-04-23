package net.matez.wildnature.common.objects.features;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class WNBiomes {
    public static final ResourceKey<Biome> FIRST = register("wildnature:first");

    public static final ResourceKey<Biome> SECOND = register("wildnature:second");

    private static ResourceKey<Biome> register(String pKey) {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(pKey));
    }
}