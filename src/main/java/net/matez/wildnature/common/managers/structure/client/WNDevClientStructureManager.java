/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.managers.structure.client;

import net.matez.wildnature.common.managers.structure.WNDevStructureSelection;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.LinkedHashMap;

/**
 * Client only
 */
@OnlyIn(Dist.CLIENT)
public class WNDevClientStructureManager {
    public static final LinkedHashMap<Player, WNDevClientStructureSelection> STRUCTURE_SELECTIONS = new LinkedHashMap<>();

    public static WNDevStructureSelection get(Player player) {
        return STRUCTURE_SELECTIONS.get(player);
    }

    public static boolean delete(Player player) {
        if (STRUCTURE_SELECTIONS.containsKey(player)) {
            STRUCTURE_SELECTIONS.remove(player);
            return true;
        }
        return false;
    }
}
