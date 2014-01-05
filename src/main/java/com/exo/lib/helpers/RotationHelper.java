package com.exo.lib.helpers;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraftforge.common.ForgeDirection;

import org.lwjgl.opengl.GL11;

import com.exo.lib.vector.Vector3;

public enum RotationHelper{
	INSTANCE;
	
	public static final Vector3<Float> X_MAG = Vector3.of(1.0F, 0.0F, 0.0F);
	public static final Vector3<Float> Y_MAG = Vector3.of(0.0F, 1.0F, 0.0F);
	public static final Vector3<Float> Z_MAG = Vector3.of(0.0F, 0.0F, 1.0F);
	
	public ForgeDirection get3DRotation(EntityLivingBase living){
		switch(MathHelper.floor_double((double) (living.rotationYaw * 4.0F / 360F) + 0.5D) & 3)
		{
			case 0:{
				return ForgeDirection.EAST;
			}
			case 1:{
				return ForgeDirection.NORTH;
			}
			case 2:{
				return ForgeDirection.SOUTH;
			}
			case 3:{
				return ForgeDirection.WEST;
			}
			default:{
				return ForgeDirection.UNKNOWN;
			}
		}
	}
	
	public float getTheta(ForgeDirection dir){
		switch(dir)
		{
			case NORTH:{
				return 180.0F;
			}
			case WEST:{
				return 90.0F;
			}
			case EAST:{
				return 270.0F;
			}
			default:{
				return 0.0F;
			}
		}
	}
	
	public void rotate_f(ForgeDirection dir, Vector3<Float> mag){
		this.rotate(this.getTheta(dir), mag);
	}
	
	public void rotate(float theta, Vector3<Float> mag){
		GL11.glRotatef(theta, mag.getX(), mag.getY(), mag.getZ());
	}
}