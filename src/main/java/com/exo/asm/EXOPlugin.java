package com.exo.asm;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLCallHook;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.TransformerExclusions({"com.exo.asm"})
@IFMLLoadingPlugin.MCVersion("1.6.4")
public final class EXOPlugin implements IFMLLoadingPlugin, IFMLCallHook{
	@Override
	public String[] getASMTransformerClass(){
		return null;
	}
	
	@Override
	public String getModContainerClass(){
		return EXOPlugin.getASMClass("EXOModContainer");
	}
	
	@Override
	public String getSetupClass(){
		return EXOPlugin.getASMClass("EXOPlugin");
	}
	
	public static String getASMClass(String name){
		return String.format("com.exo.asm.%s", name);
	}
	
	@Override public void injectData(Map<String, Object> data){}
	@Override public Void call() throws Exception{return null;}
}