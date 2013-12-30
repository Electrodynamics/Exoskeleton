package com.exo;

import java.util.logging.Logger;

import com.exo.server.ServerProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="EXO", name="Exoskeleton", version="0.0.0")
@NetworkMod(channels={"EXO"})
public final class Exoskeleton{
	@Mod.Instance("EXO")
	public static Exoskeleton instance;
	
	public static final Logger LOGGER = Logger.getLogger(Exoskeleton.class.getSimpleName());
	
	@SidedProxy(clientSide="com.exo.client.ClientProxy", serverSide="com.exo.server.ServerProxy")
	public static ServerProxy proxy;
	
	@Mod.EventHandler()
	private void preInit(FMLPreInitializationEvent event){
		
	}
	
	@Mod.EventHandler()
	private void init(FMLInitializationEvent event){
		
	}
	
	@Mod.EventHandler()
	private void postInit(FMLPostInitializationEvent event){
		
	}
	
	@Mod.EventHandler()
	private void serverStarting(FMLServerStartingEvent event){
		
	}
}