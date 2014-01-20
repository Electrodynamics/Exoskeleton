package com.exo.lib.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.exo.client.gui.GuiAssembler;
import com.exo.server.gui.ContainerAssembler;
import com.exo.tiles.machine.TileAssembler;

import cpw.mods.fml.common.network.IGuiHandler;

public final class EXOGuiHandler implements IGuiHandler{
	public static final int GUI_ASSEMBLER = 0x1;
	public static final int GUI_CONSTRUCTOR = 0x2;
	public static final int GUI_TOOLBOX = 0x3;
	
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z){
		switch(id)
		{
			case GUI_ASSEMBLER:{
				return new ContainerAssembler(player.inventory, ((TileAssembler) world.getBlockTileEntity(x, y, z)));
			}
			default:{
				return null;
			}
		}
	}
	
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z){
		switch(id)
		{
			case GUI_ASSEMBLER:{
				return new GuiAssembler(player.inventory, ((TileAssembler) world.getBlockTileEntity(x, y, z)));
			}
			default:{
				return null;
			}
		}
	}
}