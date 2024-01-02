/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.items.fruits;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;

import javax.annotation.Nullable;

public enum Fruit {
    PARADISE_APPLE("paradise_apple", Foods.APPLE),
    CHERRY("cherry", Foods.SWEET_BERRIES),
    GREEN_APPLE("green_apple", Foods.APPLE),
    MIRABELLE_PLUM("mirabelle_plum", Foods.APPLE),
    PEAR("pear", Foods.APPLE),
    PLUM("plum", Foods.APPLE),

    BANANA("banana", Foods.APPLE),
    GRAPEFRUIT("grapefruit", Foods.APPLE),
    LEMON("lemon", Foods.CARROT),
    LIME("lime", Foods.CARROT),
    MANGO("mango", Foods.SWEET_BERRIES),
    OLIVES("olives", Foods.SWEET_BERRIES),
    ORANGE("orange", Foods.SWEET_BERRIES),
    PEACH("peach", Foods.APPLE),
    PINESWEET_BERRIES("pineapple", Foods.SWEET_BERRIES),
    POMEGRANATE("pomegranate", Foods.APPLE),

    PURPLE_GRAPES("purple_grapes", Foods.APPLE),
    YELLOW_GRAPES("yellow_grapes", Foods.APPLE),

    BILBERRIES("bilberries", Foods.SWEET_BERRIES),
    BLACK_CURRANT("black_currant", Foods.SWEET_BERRIES),
    BLACKBERRIES("blackberries", Foods.SWEET_BERRIES),
    BLUEBERRIES("blueberries", Foods.SWEET_BERRIES),
    CHOKEBERRIES("chokeberries", Foods.SWEET_BERRIES),
    CRANBERRIES("cranberries", Foods.SWEET_BERRIES),
    COFFEEBERRY("coffeeberry",null),
    ELDERBERRIES("elderberries", Foods.SWEET_BERRIES),
    GOOSEBERRIES("gooseberries", Foods.SWEET_BERRIES),
    HAWTHORN_BERRIES("hawthorn_berries", Foods.SWEET_BERRIES),
    KAMCHATKA_BERRIES("kamchatka_berries", Foods.SWEET_BERRIES),
    LINGONBERRIES("lingonberries", Foods.SWEET_BERRIES),
    QUINCE_FRUIT("quince_fruit", Foods.SWEET_BERRIES),
    RASPBERRY("raspberry", Foods.SWEET_BERRIES),
    RED_CURRANT("red_currant", Foods.SWEET_BERRIES),
    WHITE_CURRANT("white_currant", Foods.SWEET_BERRIES),
    STRAWBERRY("strawberry", Foods.SWEET_BERRIES),

    BELLADONNA("belladonna_fruit", (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.POISON, 400, 0), 0.5F).build()),
    WILD_ROSE("wild_rose_fruit", Foods.SWEET_BERRIES),
    ORANGE_ROWANBERRIES_CLUSTER("orange_rowanberries_cluster", null),
    RED_ROWANBERRIES_CLUSTER("red_rowanberries_cluster", null),
    ORANGE_ROWANBERRIES("orange_rowanberries", Foods.SWEET_BERRIES),
    RED_ROWANBERRIES("red_rowanberries", Foods.SWEET_BERRIES),
    ;

    private final String id;
    @Nullable
    private final FoodProperties food;

    Fruit(String id, @Nullable FoodProperties food) {
        this.id = id;
        this.food = food;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public FoodProperties getFood() {
        return food;
    }
}
