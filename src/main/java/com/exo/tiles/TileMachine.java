package com.exo.tiles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.ForgeDirection;

public class TileMachine extends TileEntity{
	protected ForgeDirection rot = ForgeDirection.NORTH;
	
	public void setRotation(ForgeDirection rot){
		this.rot = rot;
	}
	
	public ForgeDirection getRotation(){
		return this.rot;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound comp){
		super.readFromNBT(comp);
		
		this.rot = ForgeDirection.VALID_DIRECTIONS[comp.getInteger("rot")];
	}
	
	@Override
	public void writeToNBT(NBTTagCompound comp){
		super.writeToNBT(comp);
		
		comp.setInteger("rot", this.rot.ordinal());
	}
}