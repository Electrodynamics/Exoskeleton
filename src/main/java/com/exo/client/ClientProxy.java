package com.exo.client;

import com.exo.client.render.blocks.TESRAssembler;
import com.exo.client.render.blocks.TESRConstructor;
import com.exo.server.ServerProxy;
import com.exo.tiles.machine.TileAssembler;
import com.exo.tiles.machine.TileConstructor;

import cpw.mods.fml.client.registry.ClientRegistry;

public final class ClientProxy extends ServerProxy{
	@Override
	public void initTiles(){
		ClientRegistry.registerTileEntity(TileConstructor.class, "exo:tileConstructor", new TESRConstructor());
		ClientRegistry.registerTileEntity(TileAssembler.class, "exo:tileAssembler", new TESRAssembler());
	}
	
	@Override
	public void initRenders(){
		
	}
	
	@Override
	public void init(){
		
	}
}
