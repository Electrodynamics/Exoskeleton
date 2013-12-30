package com.exo.asm;

import java.util.Arrays;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class EXOModContainer extends DummyModContainer{
	public EXOModContainer(){
		super(new ModMetadata());
		this.setMetadata();
	}
	
	private void setMetadata(){
		ModMetadata meta = super.getMetadata();
		
		meta.modId = "EXO-Core";
		meta.name = "Exoskeleton Core";
		meta.version = "0.0.0";
		meta.authorList = Arrays.asList(new String[]{
				"Asyncronous", "CyanideX"
		});
		meta.description = "Coremod for Exoskeleton";
		meta.url = "https://www.electrodynamicsmod.com";
		meta.credits = "Forge Team, Mojang, Team EDX and supporters";
	}
	
	@Override
	public boolean registerBus(EventBus bus, LoadController controller){
		return true;
	}
	
	@Subscribe
	private void preInit(FMLPreInitializationEvent event){
		
	}
	
	@Subscribe
	private void init(FMLInitializationEvent event){
		
	}
	
	@Subscribe
	private void postInit(FMLPostInitializationEvent event){
		
	}
	
	@Subscribe
	private void serverStarting(FMLServerStartingEvent event){
		
	}
}