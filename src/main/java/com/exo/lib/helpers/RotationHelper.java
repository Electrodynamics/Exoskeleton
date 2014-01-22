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
	
	public static final float NORTH = 180.0F;
	public static final float SOUTH = 0.0F;
	public static final float WEST = 90.0F;
	public static final float EAST = -90.0F;
	
	public float get3DRotation(EntityLivingBase living){
		return this.getWeight(MathHelper.floor_double((double) ((living.rotationYaw * 4.0F) / 360.0F) + 0.5D) & 3);
	}
	
	@Deprecated
	public float getTheta(ForgeDirection dir){
		switch(dir)
		{
			case NORTH:{
				return NORTH;
			}
			case WEST:{
				return WEST;
			}
			case EAST:{
				return EAST;
			}
			case SOUTH:{
				return SOUTH;
			}
			default:{
				return 0.0F;
			}
		}
	}
	
	@SuppressWarnings("fallthrough")
	public float getWeight(int theta){
		switch(theta)
		{
			case 0:{
				return NORTH;
			}
			case 1:{
				return EAST;
			}
			case 2:{
				return SOUTH;
			}
			case 3:{
				return WEST;
			}
			case 4:{
				return SOUTH;
			}
			default:{
				return 0.0F;
			}
		}
	}
	
	@Deprecated
	public void rotate_f(ForgeDirection dir, Vector3<Float> mag){
		this.rotate(this.getTheta(dir), mag);
	}
	
	public void rotate(float theta, Vector3<Float> mag){
		GL11.glRotatef(theta, mag.getX(), mag.getY(), mag.getZ());
	}
}
