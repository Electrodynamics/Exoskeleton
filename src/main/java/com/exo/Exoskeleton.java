package com.exo;

import java.util.logging.Logger;

import com.edx.Localizer;
import com.edx.allocator.Allocator;
import com.edx.register.BlockRegistrar;
import com.edx.register.ItemRegistrar;
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
	public static final Localizer LOCALIZER = new Localizer(Exoskeleton.class){
		@Override
		public String translate(String tag) {
			return null;
		}
	};
	public static final Allocator ALLOCATOR = new Allocator("Exoskeleton");
	public static final BlockRegistrar BLOCK_REGISTRAR = new BlockRegistrar(LOCALIZER, Exoskeleton.class, ALLOCATOR);
	public static final ItemRegistrar ITEM_REGISTRAR = new ItemRegistrar(LOCALIZER, Exoskeleton.class, ALLOCATOR);
	
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