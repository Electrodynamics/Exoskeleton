package com.exo.client;

import net.minecraftforge.client.MinecraftForgeClient;

import com.exo.blocks.EXOBlocks;
import com.exo.client.render.blocks.TESRAssembler;
import com.exo.client.render.blocks.TESRConstructor;
import com.exo.client.render.blocks.TESRToolbox;
import com.exo.client.render.items.IIRAssembler;
import com.exo.client.render.items.IIRConstructor;
import com.exo.server.ServerProxy;
import com.exo.tiles.TileToolBox;
import com.exo.tiles.machine.TileAssembler;
import com.exo.tiles.machine.TileConstructor;

import cpw.mods.fml.client.registry.ClientRegistry;

public final class ClientProxy extends ServerProxy{
	@Override
	public void initTiles(){
		ClientRegistry.registerTileEntity(TileConstructor.class, "exo:tileConstructor", new TESRConstructor());
		ClientRegistry.registerTileEntity(TileAssembler.class, "exo:tileAssembler", new TESRAssembler());
		ClientRegistry.registerTileEntity(TileToolBox.class, "exo:tileToolbox", new TESRToolbox());
	}
	
	@Override
	public void initRenders(){
		MinecraftForgeClient.registerItemRenderer(EXOBlocks.BLOCK_ASSEMBLER.blockID, new IIRAssembler());
		MinecraftForgeClient.registerItemRenderer(EXOBlocks.BLOCK_CONSTRUCTOR.blockID, new IIRConstructor());
	}
	
	@Override
	public void init(){
		
	}
}
