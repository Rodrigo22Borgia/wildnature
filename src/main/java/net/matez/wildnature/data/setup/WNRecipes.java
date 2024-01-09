package net.matez.wildnature.data.setup;

import net.matez.wildnature.common.log.WNLogger;
import net.matez.wildnature.common.objects.blocks.ores.GemBlock;
import net.matez.wildnature.common.objects.blocks.ores.Ore;
import net.matez.wildnature.common.objects.blocks.rocks.RockType;
import net.matez.wildnature.common.objects.blocks.setup.WNBlock;
import net.matez.wildnature.common.objects.blocks.wood.LogType;
import net.matez.wildnature.common.objects.blocks.wood.vanilla.VanillaLogType;
import net.matez.wildnature.common.objects.items.ores.OreFamily;
import net.matez.wildnature.common.objects.items.ores.OreItem;
import net.matez.wildnature.common.objects.items.tools.ToolItem;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.minecraft.world.item.Item;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Predicate;

import static net.matez.wildnature.data.setup.Templates.*;
import static net.matez.wildnature.setup.WildNature.modid;

abstract class WNRecipes {
    private static final WNLogger log = new WNLogger(true);

    protected static void generate() {
//WOODEN
        for (LogType w: LogType.values()) {
            String fileName = w.toString().toLowerCase();

            String bench         = RL(WNBlocks.BENCHES.get(w));
            String branch        = RL(WNBlocks.BRANCHES.get(w));
            String button        = RL(WNBlocks.WOODEN_BUTTONS.get(w));
            String chair         = RL(WNBlocks.CHAIRS.get(w));
            String log           = RL(WNBlocks.LOGS.get(w));
            String parquet       = RL(WNBlocks.PARQUET.get(w));
            String parquet_slab  = RL(WNBlocks.SLAB_PARQUET.get(w));
            String parquet_stair = RL(WNBlocks.STAIRS_PARQUET.get(w));
            String plank         = RL(WNBlocks.PLANKS.get(w));
            String slab          = RL(WNBlocks.SLAB_PLANKS.get(w));
            String stair         = RL(WNBlocks.STAIRS_PLANKS.get(w));
            String stripped      = RL(WNBlocks.STRIPPED_LOGS.get(w));
            String stripped_wood = RL(WNBlocks.STRIPPED_WOODS.get(w));
            String table         = RL(WNBlocks.TABLES.get(w));
            String wood          = RL(WNBlocks.WOODS.get(w));
            String door          = RL(WNBlocks.WOODEN_DOORS.get(w));
            String trapdoor      = RL(WNBlocks.WOODEN_TRAPDOORS.get(w));
            String fence         = RL(WNBlocks.WOODEN_FENCES.get(w));
            String gate          = RL(WNBlocks.WOODEN_FENCE_GATES.get(w));
            String pressure      = RL(WNBlocks.WOODEN_PRESSURE_PLATE.get(w));

            writeJSON(getJSON(boat       , plank        , "minecraft:oak_boat", 1), fileName + "_boat");
            writeJSON(getJSON(twoByone   , plank        , pressure            , 1), fileName + "_pressure");
            writeJSON(getJSON(doors      , plank        , door                , 3), fileName + "_door");
            writeJSON(getJSON(fences     , plank        , fence               , 3), fileName + "_fence");
            writeJSON(getJSON(gates      , plank        , gate                , 1), fileName + "_gate");
            writeJSON(getJSON(oneToOne   , log          , plank               , 4), fileName + "_planks");
            writeJSON(getJSON(oneToOne   , wood         , plank               , 4), fileName + "wood_planks");
            writeJSON(getJSON(oneToOne   , stripped_wood, plank               , 4), fileName + "s_wood_planks");
            writeJSON(getJSON(oneToOne   , plank        , button              , 1), fileName + "_buttons");
            writeJSON(getJSON(slabs      , parquet      , parquet_slab        , 6), fileName + "_parquet_slabs");
            writeJSON(getJSON(slabs      , plank        , slab                , 6), fileName + "_slabs");
            writeJSON(getJSON(stairs     , parquet      , parquet_stair       , 4), fileName + "_parquet_stairs");
            writeJSON(getJSON(stairs     , plank        , stair               , 4), fileName + "_stairs");
            writeJSON(getJSON(stonecutter, log          , branch              , 1), fileName + "_branch");
            writeJSON(getJSON(stonecutter, log          , stripped            , 1), fileName + "_stripped");
            writeJSON(getJSON(stonecutter, log          , stripped_wood       , 1), fileName + "_stripped_wood");
            writeJSON(getJSON(stonecutter, plank        , bench               , 1), fileName + "_bench");
            writeJSON(getJSON(stonecutter, plank        , chair               , 1), fileName + "_chair");
            writeJSON(getJSON(stonecutter, plank        , parquet             , 1), fileName + "_parquet");
            writeJSON(getJSON(stonecutter, plank        , table               , 1), fileName + "_table");
            writeJSON(getJSON(trapdoors  , plank        , trapdoor            , 2), fileName + "_trapdoor");
            writeJSON(getJSON(twoByTwo   , log          , wood                , 3), fileName + "_wood");
            writeJSON(getJSON(twoByTwo   , stripped     , stripped_wood       , 3), fileName + "s_wood");
        }

//WOODEN VANILLA
        for (VanillaLogType v: VanillaLogType.values()) {
            String fileName = v.toString().toLowerCase();

            String plank         = "minecraft:" + v.getName() + "_planks";
            String log           = "minecraft:" + v.getName() + "_log";
            String bench         = RL(WNBlocks.VANILLA_BENCHES.get(v));
            String branch        = RL(WNBlocks.VANILLA_BRANCHES.get(v));
            String chair         = RL(WNBlocks.VANILLA_CHAIRS.get(v));
            String parquet       = RL(WNBlocks.VANILLA_PARQUET.get(v));
            String parquet_slab  = RL(WNBlocks.SLAB_VANILLA_PARQUET.get(v));
            String parquet_stair = RL(WNBlocks.STAIRS_VANILLA_PARQUET.get(v));
            String table         = RL(WNBlocks.VANILLA_TABLES.get(v));

            writeJSON(getJSON(slabs      , parquet, parquet_slab , 6), fileName + "_slabs");
            writeJSON(getJSON(stairs     , parquet, parquet_stair, 4), fileName + "_stairs");
            writeJSON(getJSON(stonecutter, log    , branch       , 1), fileName + "_branch");
            writeJSON(getJSON(stonecutter, plank  , bench        , 1), fileName + "_bench");
            writeJSON(getJSON(stonecutter, plank  , chair        , 1), fileName + "_chair");
            writeJSON(getJSON(stonecutter, plank  , parquet      , 1), fileName + "_parquet");
            writeJSON(getJSON(stonecutter, plank  , table        , 1), fileName + "_table");
        }

//ROCK
        for (RockType r: RockType.values()) {
            String fileName = r.toString().toLowerCase();

            String ancient        = RL(WNBlocks.ROCKS_BRICKS_ANCIENT.get(r));
            String bricks         = RL(WNBlocks.ROCKS_BRICKS.get(r));
            String chiseled       = RL(WNBlocks.ROCKS_BRICKS_CHISELED.get(r));
            String cracked        = RL(WNBlocks.ROCKS_BRICKS_CRACKED.get(r));
            String rocks          = RL(WNBlocks.ROCKS.get(r));
            String mossy          = RL(WNBlocks.ROCKS_BRICKS_MOSSY.get(r));
            String brick_slab     = RL(WNBlocks.ROCK_BRICK_SLABS.get(r));
            String mossy_slab     = RL(WNBlocks.ROCK_BRICK_MOSSY_SLABS.get(r));
            String mossy_stair    = RL(WNBlocks.ROCK_BRICK_MOSSY_STAIRS.get(r));
            String polished       = RL(WNBlocks.ROCKS_POLISHED.get(r));
            String polished_stair = RL(WNBlocks.ROCK_POLISHED_STAIRS.get(r));
            String small          = RL(WNBlocks.ROCKS_BRICKS_SMALL.get(r));
            String brick_stairs   = RL(WNBlocks.ROCK_BRICK_STAIRS.get(r));
            String mossy_wall     = RL(WNBlocks.ROCK_BRICK_MOSSY_WALL.get(r));
            String brick_wall     = RL(WNBlocks.ROCK_BRICK_WALL.get(r));
            String polished_wall  = RL(WNBlocks.ROCK_POLISHED_WALLS.get(r));
            String slab           = RL(WNBlocks.ROCK_SLABS.get(r));
            String stair          = RL(WNBlocks.ROCK_STAIRS.get(r));
            String polished_slab  = RL(WNBlocks.ROCK_POLISHED_SLABS.get(r));

            writeJSON(getJSON(slabs      , bricks  , brick_slab    , 6), fileName + "_brick_slab");
            writeJSON(getJSON(slabs      , mossy   , mossy_slab    , 6), fileName + "_mossy_slab");
            writeJSON(getJSON(slabs      , polished, polished_slab , 6), fileName + "_polished_slab");
            writeJSON(getJSON(slabs      , rocks   , slab          , 6), fileName + "_slab");
            writeJSON(getJSON(stairs     , bricks  , brick_stairs  , 4), fileName + "_brick_stairs");
            writeJSON(getJSON(stairs     , mossy   , mossy_stair   , 4), fileName + "_mossy_stairs");
            writeJSON(getJSON(stairs     , polished, polished_stair, 4), fileName + "_polished_stairs");
            writeJSON(getJSON(stairs     , rocks   , stair         , 4), fileName + "_stair");
            writeJSON(getJSON(stonecutter, bricks  , brick_slab    , 2), fileName + "cut_brick_slab");
            writeJSON(getJSON(stonecutter, mossy   , mossy_slab    , 2), fileName + "cut_mossy_slab");
            writeJSON(getJSON(stonecutter, polished, polished_slab , 2), fileName + "cut_polished_slab");
            writeJSON(getJSON(stonecutter, rocks   , slab          , 2), fileName + "cut_slab");
            writeJSON(getJSON(stonecutter, bricks  , brick_stairs  , 1), fileName + "cut_brick_stairs");
            writeJSON(getJSON(stonecutter, mossy   , mossy_stair   , 1), fileName + "cut_mossy_stairs");
            writeJSON(getJSON(stonecutter, polished, polished_stair, 1), fileName + "cut_polished_stairs");
            writeJSON(getJSON(stonecutter, rocks   , stair         , 1), fileName + "cut_stair");
            writeJSON(getJSON(stonecutter, rocks   , ancient       , 1), fileName + "_ancient");
            writeJSON(getJSON(stonecutter, rocks   , brick_wall    , 1), fileName + "_brick_wall");
            writeJSON(getJSON(stonecutter, rocks   , bricks        , 1), fileName + "_bricks");
            writeJSON(getJSON(stonecutter, rocks   , chiseled      , 1), fileName + "_chiseled");
            writeJSON(getJSON(stonecutter, rocks   , cracked       , 1), fileName + "_cracked");
            writeJSON(getJSON(stonecutter, rocks   , mossy         , 1), fileName + "_mossy");
            writeJSON(getJSON(stonecutter, rocks   , mossy_wall    , 1), fileName + "_mossy_wall");
            writeJSON(getJSON(stonecutter, rocks   , polished      , 1), fileName + "_polished");
            writeJSON(getJSON(stonecutter, rocks   , polished_wall , 1), fileName + "_polished_wall");
            writeJSON(getJSON(stonecutter, rocks   , small         , 1), fileName + "_small");
        }
//TOOLS
        for (ToolItem tool: ToolItem.values()) {
            String material = modid + ":" + tool.getFamily().getName();
            String result = modid + ":" + tool.getId();

            switch (tool.getFamily()) {
                case SILVER:
                case BRONZE:
                case TIN:
                case STEEL: material = material + "_ingot";
            }

            switch (tool.getType()) {
                case AXE    -> writeJSON(getJSON(axe    , material, result), tool.getId());
                case HOE    -> writeJSON(getJSON(hoe    , material, result), tool.getId());
                case SHOVEL -> writeJSON(getJSON(shovel , material, result), tool.getId());
                case PICKAXE-> writeJSON(getJSON(pickaxe, material, result), tool.getId());
                case SWORD  -> writeJSON(getJSON(sword  , material, result), tool.getId());
            }
        }
        writeJSON(getJSON(crossbow, modid + ":silver_crossbow" , 1), "silver_crossbow");

//GEMS
        for (GemBlock gem: GemBlock.values()) {
            String material = modid + ":" + gem.getItem().getId();
            String result = modid + ":" + gem.getId();

            writeJSON(getJSON(threeByThree, material, result, 1), "block_of_" + gem.getItem().getId());
            writeJSON(getJSON(oneToOne, result, material, 9), gem.getItem().getId() + "_from_block");
        }
//SMELTING
        writeJSON(getJSON(smithing, modid + ":" + OreItem.TIN_INGOT.getId()       , "minecraft:copper_ingot"                   , modid + ":" + OreItem.BRONZE_INGOT.getId()), "bronze_1");
        writeJSON(getJSON(smithing, "minecraft:copper_ingot"                      , modid + ":" + OreItem.TIN_INGOT.getId()    , modid + ":" + OreItem.BRONZE_INGOT.getId()), "bronze_2");
        writeJSON(getJSON(blasting, "minecraft:iron_ingot"                        , modid + ":" + OreItem.STEEL_INGOT.getId()  , 8000), "blasting_steel");
        writeJSON(getJSON(blasting, modid + ":" + OreItem.SILVER_RAW.getId()      , modid + ":" + OreItem.SILVER_INGOT.getId() , 200) , "blasting_silver");
        writeJSON(getJSON(blasting, modid + ":" + OreItem.TIN_RAW.getId()         , modid + ":" + OreItem.TIN_INGOT.getId()    , 200) , "blasting_tin");
        writeJSON(getJSON(blasting, modid + ":" + Ore.AMBER_ORE.getId()           , modid + ":" + OreItem.AMBER.getId()        , 200) , "blasting_amber");
        writeJSON(getJSON(smelting, modid + ":" + Ore.AMBER_ORE.getId()           , modid + ":" + OreItem.AMBER.getId())       , "smelting_amber");
        writeJSON(getJSON(smelting, modid + ":" + OreItem.SILVER_RAW.getId()      , modid + ":" + OreItem.SILVER_INGOT.getId()), "smelting_silver");
        writeJSON(getJSON(smelting, modid + ":" + OreItem.TIN_RAW.getId()         , modid + ":" + OreItem.TIN_INGOT.getId())   , "smelting_tin");
        writeJSON(getJSON(smelting, modid + ":" + Ore.SILVER_ORE.getId()          , modid + ":" + OreItem.SILVER_RAW.getId())  , "raw_silver");
        writeJSON(getJSON(smelting, modid + ":" + Ore.TIN_ORE.getId()             , modid + ":" + OreItem.TIN_RAW.getId())     , "raw_tin");
        writeJSON(getJSON(smelting, modid + ":" + Ore.SILVER_DEEPSLATE_ORE.getId(), modid + ":" + OreItem.SILVER_RAW.getId())  , "raw_deep_silver");
        writeJSON(getJSON(smelting, modid + ":" + Ore.TIN_DEEPSLATE_ORE.getId()   , modid + ":" + OreItem.TIN_RAW.getId())     , "raw_deep_tin");

        writeJSON(getJSON(blasting, modid + ":" + OreItem.DARK_AMETHYST_SHARD.getId(), modid + ":" + OreItem.DARK_AMETHYST.getId()       , 200), "blasting_amethyst");
        writeJSON(getJSON(blasting, modid + ":" + OreItem.SAPPHIRE_RAW.getId()       , modid + ":" + OreItem.SAPPHIRE.getId()            , 200), "blasting_sapphire");
        writeJSON(getJSON(blasting, modid + ":" + OreItem.RUBY_RAW.getId()           , modid + ":" + OreItem.RUBY.getId()                , 200), "blasting_ruby");
        writeJSON(getJSON(blasting, modid + ":" + OreItem.TOPAZ_RAW.getId()          , modid + ":" + OreItem.TOPAZ.getId()               , 200), "blasting_topaz");
        writeJSON(getJSON(smelting, modid + ":" + Ore.DARK_AMETHYST_FORMATION.getId(), modid + ":" + OreItem.DARK_AMETHYST_SHARD.getId()), "raw_amethyst");
        writeJSON(getJSON(smelting, modid + ":" + Ore.SAPPHIRE_FORMATION.getId()     , modid + ":" + OreItem.SAPPHIRE_RAW.getId())       , "raw_sapphire");
        writeJSON(getJSON(smelting, modid + ":" + Ore.RUBY_FORMATION.getId()         , modid + ":" + OreItem.RUBY_RAW.getId())           , "raw_ruby");
        writeJSON(getJSON(smelting, modid + ":" + Ore.TOPAZ_FORMATION.getId()        , modid + ":" + OreItem.TOPAZ_RAW.getId())          , "raw_topaz");
        writeJSON(getJSON(smelting, modid + ":" + OreItem.DARK_AMETHYST_SHARD.getId(), modid + ":" + OreItem.DARK_AMETHYST.getId())      , "smelting_amethyst");
        writeJSON(getJSON(smelting, modid + ":" + OreItem.SAPPHIRE_RAW.getId()       , modid + ":" + OreItem.SAPPHIRE.getId())           , "smelting_sapphire");
        writeJSON(getJSON(smelting, modid + ":" + OreItem.RUBY_RAW.getId()           , modid + ":" + OreItem.RUBY.getId())               , "smelting_ruby");
        writeJSON(getJSON(smelting, modid + ":" + OreItem.TOPAZ_RAW.getId()          , modid + ":" + OreItem.TOPAZ.getId())              , "smelting_topaz");
//BACKPACKS
        writeJSON(getJSON(backpack, "minecraft:string"     , "minecraft:leather"    , modid + ":backpack_small" , 1), "backpack_small");
        writeJSON(getJSON(backpack, "minecraft:rabbit_hide", "minecraft:leather"    , modid + ":backpack_medium", 1), "backpack_medium");
        writeJSON(getJSON(backpack, "minecraft:scute"      , "minecraft:rabbit_hide", modid + ":backpack_big"   , 1), "backpack_big");
//EXTRA
        writeJSON(getJSON(string, "minecraft:string", 4), "wool_string");
        writeJSON(getJSON(shaped2, """
                " O ",
                "X X",
                "XXX"
                """      , "minecraft:leather", "minecraft:string", "minecraft:bundle", 1), "bundle");
        writeJSON(getJSON(shaped2, """
                "XXX",
                "OXO"
                """      , "minecraft:leather", "minecraft:iron_ingot", "minecraft:saddle", 1), "saddle");
    }
    private static String RL(WNBlock block) {
        if (block == null) {
            return null;
        }

        return block.getRegistryName().toString();
    }

    private static String getJSON(String template, Object... arg) {
        if (Arrays.stream(arg).anyMatch(Predicate.isEqual(null))) {return null;}
        return String.format(template, arg);
    }

    private static void writeJSON(String json, String fileName) {
        if (json != null) {
            try {
                FileWriter myWriter = new FileWriter("wildnature/export/" + fileName + ".json");
                myWriter.write(json);
                myWriter.close();
                log.success(fileName + " generated");
            } catch (IOException e) {
                log.error(fileName + " failed to generate");
            }
        }
    }
}
