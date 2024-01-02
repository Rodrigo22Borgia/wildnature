/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.util;

import java.util.*;

public class WeightedList<T> extends LinkedHashMap<T, Integer> {
    private static final Random random = new Random();
    public T getWeightedEntry() {
        if (isEmpty()) {return null;}

        int x = 0;
        for (Map.Entry<T, Integer> entry : entrySet()) {
            x += entry.getValue();
        }

        x = random.nextInt(x) + 1;
        int y = 0;

        for (Map.Entry<T, Integer> entry : entrySet()) {
            if (x <= (y += entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public T getWeightedEntry(Random rnd) {
        if (isEmpty()) {return null;}

        int x = 0;
        for (Map.Entry<T, Integer> entry : entrySet()) {
            x += entry.getValue();
        }

        x = rnd.nextInt(x) + 1;
        int y = 0;

        for (Map.Entry<T, Integer> entry : entrySet()) {
            if (x <= (y += entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }


    public ArrayList<T> getAllWithWeight(int weight) {
        ArrayList<T> list = new ArrayList<>();
        forEach((entry, rarity) -> {
            if (rarity == weight) {
                list.add(entry);
            }
        });
        return list;
    }
}
