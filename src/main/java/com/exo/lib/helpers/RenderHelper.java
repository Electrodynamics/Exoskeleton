package com.exo.lib.helpers;

import org.lwjgl.opengl.GL11;

import com.exo.lib.vector.Vector3;

public enum RenderHelper{
	INSTANCE;
	
	public void translate(Vector3<Float> vec){
		GL11.glTranslatef(vec.getX(), vec.getY(), vec.getZ());
	}
	
	public Vector3<Float> createBasicOffset(Vector3<Float> vec){
		return Vector3.of(vec.getX() + 0.5F, vec.getY() + 1.5F, vec.getZ() + 0.5F);
	}
}