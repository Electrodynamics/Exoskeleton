package com.exo.lib.helpers;

import org.lwjgl.opengl.GL11;

import com.exo.lib.vector.Vector3;
import com.exo.lib.vector.Vector4;

public enum RenderHelper{
	INSTANCE;
	
	public static enum Colours{
		INSTANCE;
		
		public static final Vector4<Float> WHITE = Vector4.of(1.0F, 1.0F, 1.0F, 1.0F);
		
		public void applyColour(Vector4<Float> vec){
			GL11.glColor4f(vec.getX(), vec.getY(), vec.getZ(), vec.getA());
		}
	}
	
	public void translate(Vector3<Float> vec){
		GL11.glTranslatef(vec.getX(), vec.getY(), vec.getZ());
	}
	
	public Vector3<Float> createBasicOffset(Vector3<Float> vec){
		return Vector3.of(vec.getX() + 0.5F, vec.getY() + 1.5F, vec.getZ() + 0.5F);
	}
}