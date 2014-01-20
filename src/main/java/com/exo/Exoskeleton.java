package com.exo;

import java.util.logging.Logger;

import com.exo.blocks.EXOBlocks;
import com.exo.client.ClientTickHandler;
import com.exo.cmd.EXOCommand;
import com.exo.items.EXOItems;
import com.exo.lib.handlers.EXOConfigHandler;
import com.exo.lib.handlers.EXOGuiHandler;
import com.exo.lib.handlers.EXORecipeHandler;
import com.exo.server.ServerPacketHandler;
import com.exo.server.ServerProxy;
import com.exo.server.ServerTickHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid="EXO", name="Exoskeleton", version="0.0.0")
@NetworkMod(channels={"EXO"}, packetHandler=ServerPacketHandler.class)
public final class Exoskeleton{
	@Mod.Instance("EXO")
	public static Exoskeleton instance;
	
	public static final Logger LOGGER = Logger.getLogger(Exoskeleton.class.getSimpleName());
	
	@SidedProxy(clientSide="com.exo.client.ClientProxy", serverSide="com.exo.server.ServerProxy")
	public static ServerProxy proxy;
	
	public static EXOConfigHandler config;
	
	@Mod.EventHandler()
	private void preInit(FMLPreInitializationEvent event){
		LOGGER.info("Proxy Init");
		proxy.init();
		proxy.initRenders();
		proxy.initTiles();
		
		LOGGER.info("Loading Configuration");
		config = new EXOConfigHandler(event.getSuggestedConfigurationFile());
		config.load();
	}
	
	@Mod.EventHandler()
	private void init(FMLInitializationEvent event){
		LOGGER.info("Registering TickHandlers");
		TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
		
		LOGGER.info("Registering GUI Handler");
		NetworkRegistry.instance().registerGuiHandler(Exoskeleton.instance, new EXOGuiHandler());
		
		LOGGER.info("Registering Blocks");
		EXOBlocks.INSTANCE.registerBlocks();
		
		LOGGER.info("Registering Items");
		EXOItems.INSTANCE.registerItems();
	}
	
	@Mod.EventHandler()
	private void postInit(FMLPostInitializationEvent event){
		LOGGER.info("Adding Block Names");
		EXOBlocks.INSTANCE.addNames();
		
		LOGGER.info("Adding Item Names");
		EXOItems.INSTANCE.addNames();
		
		LOGGER.info("Adding Recipes");
		EXORecipeHandler.INSTANCE.addRecipes();
	}
	
	@Mod.EventHandler()
	private void serverStarting(FMLServerStartingEvent event){
		event.registerServerCommand(new EXOCommand());
	}
}