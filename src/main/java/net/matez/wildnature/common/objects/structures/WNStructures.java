/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.structures;

import net.matez.wildnature.common.log.WNLogger;
import net.matez.wildnature.common.objects.features.WNExtraTrees;
import net.matez.wildnature.common.objects.features.WNFallenTrees;
import net.matez.wildnature.common.objects.structures.types.WNFallenTreeStructure;
import net.matez.wildnature.common.objects.structures.types.WNTreeStructure;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;
import java.util.LinkedHashMap;

public class WNStructures {
    public static final LinkedHashMap<ResourceLocation, WNStructure> STRUCTURES = new LinkedHashMap<>();
    //# ---------------
    protected static final String directory = "wn_structures";
    protected static final String extension = ".wnstruct";
    private static final WNLogger log = WildNature.getLogger();
    private static final LinkedHashMap<String, StructureSupplier> SUPPLIERS = new LinkedHashMap<>();

    static {
        reg("tree", (entry) -> new WNTreeStructure(entry.location()));
        reg("fallen_tree", (entry) -> new WNFallenTreeStructure(entry.location()));
    }

    public static boolean isLoaded() {
        return !STRUCTURES.isEmpty();
    }

    private static void reg(String type, StructureSupplier supplier) {
        SUPPLIERS.put(type, supplier);
    }

    public static void load() {
        if (!STRUCTURES.isEmpty()) {
            log.success("No need to load structures, already loaded " + STRUCTURES.size());
            return;
        }

        log.progress("Loading structures");
        int done = 0;
        int outOf = WNExtraTrees.values().length + WNExtraTrees.values().length;
        log.startProgress();
        log.progressPercentage(done, outOf);

        for (WNExtraTrees struct: WNExtraTrees.values()) {
            struct.getPlacement().loadFile();
            done++;
            log.progressPercentage(done, outOf);
        }
        for (WNFallenTrees struct: WNFallenTrees.values()) {
            struct.getPlacement().loadFile();
            done++;
            log.progressPercentage(done, outOf);
        }

        log.endProgress();
    }

    public static WNStructure create(WNStructure.WNStructureEntry entry, @Nullable String type) {
        if (type != null) {
            if (SUPPLIERS.containsKey(type)) {
                return SUPPLIERS.get(type).get(entry);
            }
        }

        return new WNStructure(entry.location());
    }

    public interface StructureSupplier {
        WNStructure get(WNStructure.WNStructureEntry entry);
    }
}
