package com.exo.lib.vector;

public class Vector3<Type extends Number> extends Vector2<Type>{
	protected final Type z;
	
	public Vector3(Type x, Type y, Type z){
		super(x, y);
		this.z = z;
	}
	
	public Type getZ(){
		return this.z;
	}
	
	public static <Type extends Number> Vector3<Type> of(Type x, Type y, Type z){
		return new Vector3<Type>(x, y, z);
	}
}