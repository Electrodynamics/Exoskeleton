package com.exo.lib.vector;

public class Vector2<Type extends Number>{
	protected final Type x, y;
	
	public Vector2(Type x, Type y){
		this.x = x;
		this.y = y;
	}
	
	public Type getX(){
		return this.x;
	}
	
	public Type getY(){
		return this.y;
	}
	
	public static <Type extends Number> Vector2<Type> of(Type x, Type y){
		return new Vector2<Type>(x, y);
	}
}