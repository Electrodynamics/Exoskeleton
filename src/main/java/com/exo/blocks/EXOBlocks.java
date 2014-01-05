package com.exo.blocks;

import net.minecraft.block.Block;

import com.exo.blocks.machine.BlockAssembler;
import com.exo.blocks.machine.BlockConstructor;
import com.exo.lib.helpers.LocalizationHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public enum EXOBlocks{
	INSTANCE;
	
	public static final Block BLOCK_ASSEMBLER = new BlockAssembler(3000);
	public static final Block BLOCK_CONSTRUCTOR = new BlockConstructor(3001);
	
	public void registerBlocks(){
		this.register(BLOCK_ASSEMBLER);
		this.register(BLOCK_CONSTRUCTOR);
	}
	
	private void register(Block b){
		GameRegistry.registerBlock(b, "exo:" + b.getUnlocalizedName());
	}
	
	public void addNames(){
		this.name(BLOCK_ASSEMBLER, "assembler");
	}
	
	private void name(Block b, String tag){
		LanguageRegistry.addName(b, LocalizationHelper.localize("block." + tag + ".name"));
	}
}