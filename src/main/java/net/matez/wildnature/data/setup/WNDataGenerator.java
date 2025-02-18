/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.data.setup;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.matez.wildnature.common.log.WNLogger;
import net.matez.wildnature.common.objects.blocks.rocks.RockType;
import net.matez.wildnature.common.objects.blocks.setup.WNBlock;
import net.matez.wildnature.common.objects.blocks.wood.LogType;
import net.matez.wildnature.common.objects.blocks.wood.vanilla.VanillaLogType;
import net.matez.wildnature.common.objects.items.tools.ToolItem;
import net.matez.wildnature.common.objects.tags.TagCategory;
import net.matez.wildnature.common.objects.tags.WNTags;
import net.matez.wildnature.common.registry.blocks.WNBlocks;
import net.matez.wildnature.common.registry.items.WNItems;
import net.matez.wildnature.common.registry.particles.WNParticles;
import net.matez.wildnature.common.registry.tabs.WNTabs;
import net.matez.wildnature.data.lang.WNTranslations;
import net.matez.wildnature.data.setup.base.WNResource;
import net.matez.wildnature.data.setup.base.WNTag;
import org.apache.commons.io.FileUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Predicate;

public class WNDataGenerator {
    private static final WNLogger log = new WNLogger(true);


    private final DataGenType mode;
    private final String modid;
    private final String path = ""; //! <<-------- TO CHANGE
    private final ArrayList<WNResource> resources = new ArrayList<>();

    private final String[] deletePaths;

    public WNDataGenerator(String modid, DataGenType mode){
        this.modid = modid;
        this.mode = mode;
        WNResource.modid = this.modid;

        deletePaths = new String[]{
                "/assets/" + modid + "/blockstates",
                "/assets/" + modid + "/models",
                "/assets/" + modid + "/particles",
                "/data/" + modid + "/recipes",
                "/data/" + modid + "/tags" ,
                "/data/minecraft/recipes",
                "/data/minecraft/tags",
                "/data/forge/recipes",
                "/data/forge/tags"
        };
    }

    public void register(){
        resources.addAll(WNModelTemplates.TEMPLATES);

        WNBlocks.BLOCKS.forEach((key, value) -> {
            if(value.getBlockstate() == null){
                log.warn("Block " + key.toString() + " doesn't have own blockstate.");
            }else {
                resources.add(value.getBlockstate());
            }
            if(value.getBlockModels() == null || value.getBlockModels().models.isEmpty()){
                log.warn("Block " + key.toString() + " doesn't have any models.");
            }else{
                resources.addAll(value.getBlockModels().models);
            }

            if(value.getWNTags() != null && !value.getWNTags().getTagList().isEmpty()){
                for (WNTags.Tag tag : value.getWNTags().getTagList()) {
                    tag.with(value.getRegistryName());//append tag
                }
            }
        });

        WNBlocks.BLOCK_ITEMS.forEach((key, value) -> {
            if (value.getItemModel() == null) {
                if (value.getItemModels() == null) {
                    log.warn("Block Item " + key.toString() + " doesn't have own model.");
                } else {
                    resources.addAll(value.getItemModels().models);
                }
            } else {
                resources.add(value.getItemModel());
            }
        });

        WNItems.ITEMS.forEach((key, value) -> {
            if(value.getItemModel() == null){
                if(value.getItemModels() == null) {
                    log.warn("Item " + key.toString() + " doesn't have own model.");
                }else{
                    resources.addAll(value.getItemModels().models);
                }
            }else {
                resources.add(value.getItemModel());
            }
        });

        WNTags.TAGS.forEach((key, tag) -> {
            if (tag.getCategory() == TagCategory.BLOCKS || tag.getCategory() == TagCategory.BLOCKS_AND_ITEMS) {
                resources.add(new WNTag(tag, "blocks"));
            }
            if (tag.getCategory() == TagCategory.ITEMS || tag.getCategory() == TagCategory.BLOCKS_AND_ITEMS) {
                resources.add(new WNTag(tag, "items"));
            }
        });

        WNTranslations.LANGUAGES.forEach((name, language) -> {
            resources.add(language);
        });
        generateTranslations();


        log.log("Registered " + resources.size() + " resources to Data Generator.");
    }

    public void generate(){
        log.progress("Starting Data Generator on setting " + this.mode);
        log.log("Main Path: " + path);

        switch (mode) {
            case GEN_MISSING_TEXTURES -> findMissingTextures();
            case REMOVE_OLD_TEXTURES -> removeOldTextures();
            case GEN_RECIPES -> WNRecipes.generate();
            case GEN_DELETE_AND_REFRESH_ALL -> {deleteAll(); createFor(resources); findMissingTextures();}
            default -> {createFor(resources); findMissingTextures();}
        }
    }

    public void generateParticles(){
        log.progress("Starting Data Generator on setting " + this.mode + " for PARTICLES");
        ArrayList<WNResource> particles = new ArrayList<>();
        WNParticles.PARTICLE_PROVIDERS.forEach((key, value) -> {
            resources.addAll(value.getTextures().models);
            particles.addAll(value.getTextures().models);
        });

        createFor(particles);
    }

    public void deleteAll(){
        log.debug("Deleting and refreshing mode enabled. Deleting files..");
        for (String deletePath : deletePaths) {
            File file = new File(this.path + deletePath);
            if(file.exists()) {
                log.debug("Deleting " + file.getPath());
                deleteDirectory(file);
            }
        }
    }

    private void deleteDirectory(File file) {
        for (File subFile : file.listFiles()) {
            if (subFile.isDirectory()) {
                deleteDirectory(subFile);
            }

            subFile.delete();
        }
    }

    public void createFor(ArrayList<WNResource> resources){
        int changed = 0;
        log.startProgress();
        log.progressPercentage(0, resources.size());
        for (WNResource resource : resources) {
            String path = resource.getPath() + "/" + resource.getName() + ".json";
            try {
                File file = new File(this.path + path);
                String oldContents = null;
                if (file.exists() && resource.needsOldFileContent()) {
                    var scanner = new Scanner(file);
                    oldContents = "";
                    while (scanner.hasNextLine()) {
                        oldContents += scanner.nextLine() + "\n";
                    }
                    scanner.close();
                }
                if (file.exists() && mode == DataGenType.GEN_REFRESH_ALL) {
                    file.delete();
                }
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                    if (file.createNewFile()) {
                        FileWriter myWriter = new FileWriter(file);
                        if (resource.needsOldFileContent()) {
                            myWriter.write(resource.parseJSON(oldContents));
                        } else {
                            myWriter.write(resource.parseJSON());
                        }
                        myWriter.close();
                        changed++;
                        log.progressPercentage(changed, resources.size());
                    }
                }
            } catch (IOException e) {
                log.error("Unable to create file for resource: " + path + " - " + e.getMessage());
            }
        }

        log.endProgress();

        if (changed > 0) {
            log.success("Created " + changed + " new resources.");
        } else {
            log.log("No resources created.");
        }
    }

    public void findMissingTextures(){
        log.log("Finding missing textures...");

        File missingTexture = new File(this.path + "/assets/" + this.modid + "/textures/missing_texture.png");

        for (WNResource resource : resources) {
            if (!resource.containsTextures()) {
                continue;
            }
            try {
                JsonElement element = JsonParser.parseString(resource.parseJSON());
                JsonObject obj = element.getAsJsonObject();
                if (obj.has("textures")) {
                    for (Map.Entry<String, JsonElement> textures : obj.getAsJsonObject("textures").entrySet()) {
                        String key = textures.getKey();
                        String path = textures.getValue().getAsString();
                        if (path.startsWith(this.modid)) {
                            String texturePath = "/assets/" + this.modid + "/textures/" + path.replace(this.modid + ":", "") + ".png";
                            File file = new File(this.path + texturePath);
                            if (!file.exists()) {
                                if (file.getParentFile().exists() || file.getParentFile().mkdirs()) {
                                    try {
                                        log.log("Missing texture: " + path);
                                        FileUtils.copyFile(missingTexture, file);
                                    } catch (IOException e) {
                                        log.warn("Unable to create new texture for resource " + resource.getName() + ": " + key + " | " + path + " | " + texturePath);
                                    }
                                } else {
                                    log.warn("Unable to mkdirs for resource " + resource.getName() + ": " + key + " | " + path + " | " + texturePath);
                                }
                            }
                        }
                    }
                }
            }catch (Exception e){
                log.warn("Unable to find missing texture for: " + resource.getName() + ": " + e.getMessage());
            }
        }
    }

    public void removeOldTextures(){
        File textures = new File(this.path + "/assets/" + this.modid + "/textures/");
        File missingTexture = new File(this.path + "/assets/" + this.modid + "/textures/missing_texture.png");

        try {
            BufferedImage missingImg = ImageIO.read(missingTexture);

            for (File file : FileUtils.listFiles(textures, new String[]{"png"}, true)) {
                if(file.getPath().equals(missingTexture.getPath())){
                    continue;
                }
                try {
                    BufferedImage image = ImageIO.read(file);

                    if(bufferedImagesEqual(missingImg,image)){
                        log.log("Deleted " + file.getName() + ": " + file.delete());
                    }
                } catch (IOException e) {
                    log.error("Unable to read texture: " + file.getName() + " - " + e.getMessage());
                }
            }
        }catch (IOException e){
            log.fatal("Unable to read missing texture: " + e.getMessage());
            e.printStackTrace();
        }
    }
    private boolean bufferedImagesEqual(BufferedImage img1, BufferedImage img2) {
        if (img1.getWidth() == img2.getWidth() && img1.getHeight() == img2.getHeight()) {
            for (int x = 0; x < img1.getWidth(); x++) {
                for (int y = 0; y < img1.getHeight(); y++) {
                    if (img1.getRGB(x, y) != img2.getRGB(x, y))
                        return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }


    //-------
    public void generateTranslations() {
        WNBlocks.BLOCKS.forEach((id, block) -> {
            WNTranslations.add(WNTranslations.Keys.BLOCK, id.getPath());
        });
        WNItems.ITEMS.forEach((id, item) -> {
            WNTranslations.add(WNTranslations.Keys.ITEM, id.getPath());
        });
        WNBlocks.BLOCK_ITEMS.forEach((id, blockItem) -> {
            WNTranslations.add(WNTranslations.Keys.ITEM, id.getPath());
        });
        WNTabs.TABS.forEach((id, tab) -> {
            WNTranslations.add(WNTranslations.Keys.ITEM_GROUP, id);
        });


        log.success("Created " + WNTranslations.size() + " translations.");
        // ---
        WNTranslations.flush();
    }
}
