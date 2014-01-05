package com.exo.lib.tab;

import net.minecraft.creativetab.CreativeTabs;

public final class EXOTab extends CreativeTabs{
	public static final CreativeTabs TAB_EXO = new EXOTab("Exoskeleton");
	
	private EXOTab(String label){
		super(label);
	}
}