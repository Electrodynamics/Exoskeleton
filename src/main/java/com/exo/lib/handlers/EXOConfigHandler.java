package com.exo.lib.handlers;

import java.io.File;

import com.exo.lib.EXOSessionData;

import net.minecraftforge.common.Configuration;

public final class EXOConfigHandler{
	private final Configuration CONFIG;
	
	public EXOConfigHandler(File file){
		this.CONFIG = new Configuration(file);
	}
	
	public void load(){
		this.CONFIG.load();
		
		EXOSessionData.BLOCK_ASSEMBLER_ID = this.getBlock("Assembler", 3000);
		EXOSessionData.BLOCK_CONSTRUCTOR_ID = this.getBlock("Constructor", 3001);
		EXOSessionData.BLOCK_DUMMY_ID = this.getBlock("Dummy", 3002);
		EXOSessionData.BLOCK_TOOLBOX_ID = this.getBlock("Toolbox", 3003);
		
		EXOSessionData.ITEM_CRAFTING_ID = this.getItem("Crafting", 5000);
		EXOSessionData.ITEM_COMPONENT_ID = this.getItem("Components", 5001);
		EXOSessionData.ITEM_TOOLBOX_ID = this.getItem("Toolbox", 5002);
		EXOSessionData.ITEM_INGOT_ID = this.getItem("Ingots", 5003);
		this.CONFIG.save();
	}
	
	private int getItem(String name, int defaultId){
		return this.CONFIG.getItem(name, defaultId).getInt();
	}
	
	private int getBlock(String name, int defaultId){
		return this.CONFIG.getBlock(name, defaultId).getInt();
	}
}