package com.exo.blocks;

import net.minecraft.block.Block;

import com.exo.blocks.machine.BlockAssembler;
import com.exo.blocks.machine.BlockConstructor;
import com.exo.blocks.misc.BlockDummy;
import com.exo.blocks.misc.BlockToolBox;
import com.exo.lib.EXOSessionData;
import com.exo.lib.helpers.LocalizationHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public enum EXOBlocks{
	INSTANCE;
	
	public static final Block BLOCK_ASSEMBLER = new BlockAssembler(EXOSessionData.BLOCK_ASSEMBLER_ID);
	public static final Block BLOCK_CONSTRUCTOR = new BlockConstructor(EXOSessionData.BLOCK_CONSTRUCTOR_ID);
	public static final Block BLOCK_DUMMY = new BlockDummy(EXOSessionData.BLOCK_DUMMY_ID);
	public static final Block BLOCK_TOOLBOX = new BlockToolBox(EXOSessionData.BLOCK_TOOLBOX_ID);
	
	public void registerBlocks(){
		this.register(BLOCK_ASSEMBLER);
		this.register(BLOCK_CONSTRUCTOR);
		this.register(BLOCK_TOOLBOX);
	}
	
	private void register(Block b){
		GameRegistry.registerBlock(b, "exo:" + b.getUnlocalizedName());
	}
	
	public void addNames(){
		this.name(BLOCK_ASSEMBLER, "assembler");
		this.name(BLOCK_CONSTRUCTOR, "constructor");
		this.name(BLOCK_TOOLBOX, "toolbox");
	}
	
	private void name(Block b, String tag){
		LanguageRegistry.addName(b, LocalizationHelper.localize("block." + tag + ".name"));
	}
}