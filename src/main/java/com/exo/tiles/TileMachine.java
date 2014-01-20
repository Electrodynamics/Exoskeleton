package com.exo.tiles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileMachine extends TileEntity{
	protected float rot = 0.0F;
	
	public void setRotation(float rot){
		this.rot = rot;
	}
	
	public float getRotation(){
		return this.rot;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound comp){
		super.readFromNBT(comp);
		comp.setFloat("rot", this.rot);
	}
	
	@Override
	public void writeToNBT(NBTTagCompound comp){
		super.writeToNBT(comp);
		this.rot = comp.getFloat("rot");
	}
}