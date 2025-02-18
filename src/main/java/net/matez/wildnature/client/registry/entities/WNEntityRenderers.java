/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.client.registry.entities;

import net.matez.wildnature.client.objects.render.entities.seat.WNSeatEntityRenderer;
import net.matez.wildnature.common.objects.entities.seat.WNSeatEntity;
import net.matez.wildnature.common.objects.initializer.InitStage;
import net.matez.wildnature.common.objects.initializer.Initialize;
import net.matez.wildnature.common.registry.entities.WNEntities;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.LinkedHashMap;
@OnlyIn(Dist.CLIENT)
@Initialize(InitStage.ENTITY_RENDERER)
public class WNEntityRenderers {
    //# --- ALL PARTICLES ---
    public static final LinkedHashMap<EntityType, EntityRendererProvider<?>> ENTITY_RENDERER_PROVIDERS = new LinkedHashMap<>();
    //#------------------

    public static final EntityRendererProvider<WNSeatEntity> SEAT = register(WNEntities.SEAT, WNSeatEntityRenderer::new);

    private static <T extends Entity> EntityRendererProvider<T> register(EntityType<? extends T> type, EntityRendererProvider<T> provider) {
        ENTITY_RENDERER_PROVIDERS.put(type, provider);
        return provider;
    }
}
