/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.structures;

import net.matez.wildnature.common.log.WNLogger;
import net.matez.wildnature.common.util.WeightedList;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Random;

public class WNStructurePlacement {

    private static final WNLogger log = WildNature.getLogger();

    private final WeightedList<Entry<WNStructure>> structures = new WeightedList<>();
    private final LinkedHashMap<Entry<String>, Integer> preStructures = new LinkedHashMap<>();
    private final String baseName;
    private boolean loaded = false;

    public WNStructurePlacement(String baseName) {
        this.baseName = baseName;
    }

    public WNStructurePlacement() {
        this.baseName = null;
    }

    public static WNStructurePlacement make() {
        return new WNStructurePlacement();
    }

    public static WNStructurePlacement make(String baseName) {
        return new WNStructurePlacement(baseName);
    }

    public WNStructurePlacement with(int rarity, WNStructure structure) {
        return with(rarity, structure, null);
    }

    public WNStructurePlacement with(int rarity, WNStructure structure, @Nullable WNStructureConfig config) {
        structures.put(new Entry<>(structure, config), rarity);
        return this;
    }

    public WNStructurePlacement with(int rarity, String structure) {
        return with(rarity, structure, null);
    }

    public WNStructurePlacement with(int rarity, String structure, @Nullable WNStructureConfig config) {
        String path = baseName == null ? structure : (baseName + structure);
        preStructures.put(new Entry<>(path, config), rarity);
        if (WNStructures.isLoaded()) {
            load();
        }

        return this;
    }

    public void loadFile() {
        for (Entry<String> preEntry: preStructures.keySet()) {
            ResourceLocation location = new ResourceLocation(WildNature.modid,preEntry.structure().split(":")[1]);

            var entry = WNStructure.load(location);
            if (entry == null) {
                continue;
            }
            WNStructure structure = WNStructures.create(entry, entry.getType());
            structure.load(entry);
            WNStructures.STRUCTURES.put(location, structure);
        }
    }

    public void load() {
        if (!loaded) {
            preStructures.forEach((preEntry, rarity) -> {
                WNStructure struct = null;

                for (ResourceLocation location : WNStructures.STRUCTURES.keySet()) {
                    if (location.toString().equals(preEntry.structure())) {
                        struct = WNStructures.STRUCTURES.get(location);
                        break;
                    }
                }

                if (struct == null) {
                    log.error("Unable to add placement config for structure with name: " + preEntry.structure());
                    return;
                }


                structures.put(new Entry<>(struct, preEntry.config()), rarity);
            });

            loaded = true;
        }
    }

    @Nullable
    public Entry<WNStructure> get(Random random) {
        return structures.getWeightedEntry(random);
    }

    public record Entry<T>(T structure, @Nullable WNStructureConfig config) {
    }
}
