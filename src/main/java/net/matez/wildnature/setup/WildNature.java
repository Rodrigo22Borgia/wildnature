/*
 * Copyright (c) matez.net 2022.
 * All rights reserved.
 * Consider supporting this project on Patreon: https://patreon.com/wildnaturemod
 */

package net.matez.wildnature.setup;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.matez.wildnature.client.objects.blocks.WNBlockRenderer;
import net.matez.wildnature.client.registry.screen.WNScreenMenuBindings;
import net.matez.wildnature.client.registry.setup.WNClientRegistry;
import net.matez.wildnature.common.log.WNLogger;
import net.matez.wildnature.common.networking.WNNetworking;
import net.matez.wildnature.common.objects.features.FeatureRegistry;
import net.matez.wildnature.common.objects.initializer.InitStage;
import net.matez.wildnature.common.objects.initializer.NewInitializer;
import net.matez.wildnature.common.objects.structures.WNStructures;
import net.matez.wildnature.common.registry.biomes.TestRegion;
import net.matez.wildnature.common.registry.biomes.TestSurfaceRuleData;
import net.matez.wildnature.common.registry.commands.WNCommandArguments;
import net.matez.wildnature.common.registry.commands.WNCommands;
import net.matez.wildnature.data.setup.DataGenType;
import net.matez.wildnature.data.setup.WNDataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

import java.util.ArrayList;

@Mod("wildnature")
public class WildNature {
    public static WildNature instance;
    public static final boolean debugMode = true; //! <-------- DISABLE IN PRODUCTION
    public static final boolean devMode = true; //! <-------- DISABLE IN PRODUCTION
    public static final String modid = "wildnature";
    public static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .disableHtmlEscaping()
            .create();

    private static final WNLogger log = getLogger();
    public final NewInitializer initializer;
    public String version = "3.1_a2";
    //---
    private final long startTime;

    private ArrayList<Callback> clientCallbacks = new ArrayList<>();

    //! change this for data gen
    public WNDataGenerator dataGenerator;
    //private final DataGenType dataGenType = DataGenType.GEN_REFRESH_ALL;
    private final DataGenType dataGenType = null;

    public WildNature() {
        instance = this;
        startTime = System.currentTimeMillis();
        log.progress("Starting WildNature Mod");
        initializer = new NewInitializer();
        initializer.prepare();

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FeatureRegistry.init(modEventBus);

        //# --- EVENT BUS ---
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::construct);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::terraBlender);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::finish);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(WNClientRegistry::registerParticleFactories);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(WNClientRegistry::registerBlockEntityRenderers);
        //# -----------------

        MinecraftForge.EVENT_BUS.register(this);
        initializer.init(InitStage.START);
    }

    private void construct(final FMLConstructModEvent event) {
        log.progress("WildNature Construct");
        //initializer.init(InitStage.CONSTRUCT);

        if (dataGenType != null) {
            dataGenerator = new WNDataGenerator(modid, dataGenType);
            dataGenerator.register();
            dataGenerator.generate();
        }
    }

    public static String getVersion() {
        return instance.version;
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        log.progress("WildNature Client Setup");
        WNBlockRenderer.registerAll();
        initializer.init(InitStage.CLIENT);

        WNScreenMenuBindings.register();

        log.log("Running " + clientCallbacks.size() + " client callbacks.");
        for (Callback clientCallback : clientCallbacks) {
            clientCallback.call();
        }
        log.success("WildNature Client Setup Complete");
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {

    }

    private void processIMC(final InterModProcessEvent event) {

    }

    private void finish(final FMLLoadCompleteEvent event) {
        initializer.init(InitStage.FINISH);

        long ms = System.currentTimeMillis() - startTime;
        log.success("WildNature loaded in " + (ms / 1000) + "s");
    }

    private void setup(final FMLCommonSetupEvent event) {
        log.progress("WildNature Setup");
        initializer.init(InitStage.SETUP);
        WNNetworking.register();

        log.success("WildNature Setup Complete");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @SubscribeEvent
    public void onServerAboutToStart(ServerAboutToStartEvent event) {
        WNStructures.load(event.getServer().getResourceManager());
    }

    public static WNLogger getLogger() {
        return new WNLogger(debugMode);
    }

    public static void doOnClient(Callback callback) {
        WildNature.instance.clientCallbacks.add(callback);
    }

    @SubscribeEvent
    public void onCommandsRegister(RegisterCommandsEvent event) {
        WNCommandArguments.register();
        WNCommands.register(event.getDispatcher());
    }
    private void terraBlender(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() ->
        {
            Regions.register(new TestRegion(new ResourceLocation(modid, "overworld"), 2));
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, modid, TestSurfaceRuleData.makeRules());
        });
    }
}
