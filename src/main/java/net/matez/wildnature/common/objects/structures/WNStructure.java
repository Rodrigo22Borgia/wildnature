/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.common.objects.structures;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.matez.wildnature.common.log.WNLogger;
import net.matez.wildnature.common.objects.blocks.setup.WNBlock;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.commands.arguments.blocks.BlockStateParser;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Tuple;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluids;
import org.apache.commons.lang3.ArrayUtils;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.Function;
import java.util.zip.InflaterInputStream;

public class WNStructure {
    private static final WNLogger log = WildNature.getLogger();

    protected final ResourceLocation location;
    //protected final LinkedHashMap<BlockPos, BlockState> blocks = new LinkedHashMap<>();
    protected Tuple<BlockPos, BlockState>[][] blocks;
    protected final ArrayList<String> missingStates = new ArrayList<>();
    protected CompoundTag options = new CompoundTag();
    protected BlockPos min, max;

    public WNStructure(ResourceLocation location) {
        this.location = location;
    }

    //# -----------------------------------------------------------------
    public static WNStructureEntry load(ResourceLocation location) {
        String file = getFile(location);
        if (file == null) {
            return null;
        }

        var object = JsonParser.parseString(file).getAsJsonObject();
        var blocks = object.getAsJsonArray("blocks");

        CompoundTag optionsNbt = new CompoundTag();


        if (object.has("options")) {
            var options = object.getAsJsonObject("options");
            optionsNbt = readTag(options);
        }

        return new WNStructureEntry(location, blocks, optionsNbt);
    }

    private static String getFile(ResourceLocation location) {
        String path = "data/" + location.getNamespace() + "/" + WNStructures.directory + "/" + location.getPath() + WNStructures.extension;
        try {
            var inputStream = getResourceAsStream(path);
            var inflater = new InflaterInputStream(inputStream);

            ArrayList<Byte> bytes = new ArrayList<>();
            int i;
            while ((i = inflater.read()) != -1) {
                bytes.add((byte) i);
            }

            inflater.close();
            inputStream.close();

            Byte[] byteArray = bytes.toArray(new Byte[0]);
            return new String(ArrayUtils.toPrimitive(byteArray));
        } catch (IOException e) {
            log.error("Unable to load structure " + location + ": " + e.getMessage());
        }
        return null;
    }

    private static CompoundTag readTag(JsonObject options) {
        CompoundTag tag = new CompoundTag();
        for (String key : options.keySet()) {
            var value = options.get(key);
            if (value.isJsonObject()) {
                tag.put(key, readTag(value.getAsJsonObject()));
            } else {
                String val = value.getAsString();
                try {
                    int i = Integer.parseInt(val);
                    tag.putInt(key, i);
                    continue;
                } catch (NumberFormatException e) {
                }
                try {
                    double d = Double.parseDouble(val);
                    tag.putDouble(key, d);
                    continue;
                } catch (NumberFormatException e) {
                }
                try {
                    float f = Float.parseFloat(val);
                    tag.putFloat(key, f);
                    continue;
                } catch (NumberFormatException e) {
                }
                try {
                    long l = Long.parseLong(val);
                    tag.putLong(key, l);
                    continue;
                } catch (NumberFormatException e) {
                }

                tag.putString(key, val);
            }
        }
        return tag;
    }

    private static InputStream getResourceAsStream(String resource) {
        final InputStream in = getContextClassLoader().getResourceAsStream(resource);

        return in == null ? WNStructure.getResourceAsStream(resource) : in;
    }

    private static ClassLoader getContextClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

    @Nullable
    private static String getType(CompoundTag options) {
        return options.contains("type") ? options.getString("type") : null;
    }

    public void load(WNStructureEntry entry) {
        HashMap<String, List<Tuple<BlockPos, BlockState>>> map = new HashMap<>();
        for (JsonElement block : entry.blocks) {
            var obj = block.getAsJsonObject();
            BlockPos pos = BlockPos.of(obj.get("pos").getAsLong());



            try {
                BlockStateParser parser = new BlockStateParser(new StringReader(obj.get("block").getAsString()), false).parse(true);
                BlockState state = parser.getState();

                if (state == null) {
                    if (!missingStates.contains(obj.get("block").getAsString())) {
                        missingStates.add(obj.get("block").getAsString());
                    }
                    continue;
                }

                List<Tuple<BlockPos, BlockState>> l = map.computeIfAbsent(pos.getX() + ":" + pos.getZ(), k -> new ArrayList<>());
                l.add(new Tuple<>(pos,state));

                //this.blocks.put(pos, state);

                if (min == null) {
                    min = pos;
                    max = pos;
                } else {
                    min = new BlockPos(Math.min(pos.getX(), min.getX()), Math.min(pos.getY(), min.getY()), Math.min(pos.getZ(), min.getZ()));
                    max = new BlockPos(Math.max(pos.getX(), max.getX()), Math.max(pos.getY(), max.getY()), Math.max(pos.getZ(), max.getZ()));
                }


            } catch (CommandSyntaxException e) {
                log.error("Unable to load block at " + pos.toShortString() + " in structure " + location + ": " + e.getMessage());
            } catch (Exception e) {
                if (!missingStates.contains(obj.get("block").getAsString())) {
                    missingStates.add(obj.get("block").getAsString());
                }
            }
        }

        this.options = entry.options;

        if (!missingStates.isEmpty()) {
            log.error("----------------");
            log.error("Found " + missingStates.size() + " missing states in structure: " + this.getLocation().toString());
            for (String missingState : missingStates) {
                log.error("- " + missingState);
            }
        }
        blocks = new Tuple[map.size()][];
        int i = 0;
        for (List<Tuple<BlockPos, BlockState>> list: map.values()) {
            blocks[i] = list.toArray(new Tuple[0]);
            i++;
        }
        onLoad();
    }

    protected void onLoad() {
        //loadMin();
        //loadMax();
    }

    public void place(LevelAccessor level, BlockPos pos, @Nullable Rotation rotation, Random random, int placeData) {
        place(level, pos, rotation, null, random, placeData);
    }

    public void place(LevelAccessor level, BlockPos pos, @Nullable Rotation rotation, @Nullable WNStructureConfig config, Random random, int placeData) {
        LinkedHashMap<BlockPos, BlockState> secondary = new LinkedHashMap<>();
        for (Tuple<BlockPos, BlockState>[] array: blocks) {
            for (Tuple<BlockPos, BlockState> block : array) {
                BlockPos newPos = null;
                BlockState newState = block.getB();

                if (rotation != null) {
                    newPos = block.getA().rotate(rotation).offset(pos);
                    newState = newState.rotate(level, newPos, rotation);
                } else {
                    newPos = block.getA().offset(pos);
                }

                BlockState onPos = level.getBlockState(newPos);
                if (onPos.canOcclude()) {
                    continue;
                }

                if (newState.hasProperty(BlockStateProperties.WATERLOGGED) && onPos.getFluidState().is(Fluids.WATER)) {

                    newState = newState.setValue(BlockStateProperties.WATERLOGGED, true);
                }

                if (config != null) {
                    newState = config.processState(level, newState, newPos, random, rotation);
                }

                newState = processState(level, newState, newPos, random, rotation);

                if (newState.canSurvive(level, newPos)) {
                    level.setBlock(newPos, newState, placeData);
                } else {
                    secondary.put(newPos, newState);
                }
            }
        }
        secondary.forEach((blockPos, blockState) -> level.setBlock(blockPos, blockState, placeData));
    }

    public BlockState processState(LevelAccessor level, BlockState state, BlockPos pos, Random random, @Nullable Rotation rotation) {
        return state.getBlock() instanceof WNBlock wnBlock ? wnBlock.processStateOnPlace(level, state, pos, this, random, rotation) : state;
    }

    public boolean isCentered() {
        return !this.options.contains("center") || this.options.getBoolean("center");
    }

    public int getBlockAmount() {
        return this.blocks.length;
    }

    public ResourceLocation getLocation() {
        return location;
    }

    public String getName() {
        return location.getPath().substring(location.getPath().lastIndexOf("/") + 1);
    }

    @Nullable
    public String getType() {
        return getType(this.options);
    }

    public BlockPos getMin() {
        return min;
    }

    public BlockPos getMax() {
        return max;
    }

    public LinkedHashMap<BlockState, Integer> getBlockOccurrences(Function<BlockState, Boolean> canCount) {
        LinkedHashMap<BlockState, Integer> blocks = new LinkedHashMap<>();
        for (Tuple<BlockPos, BlockState>[] array: this.blocks) {
            for (Tuple<BlockPos, BlockState> block : array) {
                BlockState b = block.getB();
                if (canCount.apply(b)) {
                    if (blocks.containsKey(b)) {
                        blocks.put(b, blocks.get(b) + 1);
                    } else {
                        blocks.put(b, 1);
                    }
                }
            }
        }
        return blocks;
    }

    public record WNStructureEntry(ResourceLocation location, JsonArray blocks,
                                   CompoundTag options) {
        @Nullable
        public String getType() {
            return WNStructure.getType(options);
        }
    }
}
