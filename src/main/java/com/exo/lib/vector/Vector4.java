package com.exo.lib.vector;

public class Vector4<Type extends Number> extends Vector3<Type>{
	protected final Type a;
	
	public Vector4(Type x, Type y, Type z, Type a){
		super(x, y, z);
		this.a = a;
	}
	
	public Type getA(){
		return this.a;
	}
	
	public static <Type extends Number> Vector4<Type> of(Type x, Type y, Type z, Type a){
		return new Vector4<Type>(x, y, z, a);
	}
}