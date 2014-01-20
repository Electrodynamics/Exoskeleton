package com.exo.lib.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.exo.items.EXOItems;
import com.exo.lib.EXOMetaData;

public final class EXOTab extends CreativeTabs{
	public static final CreativeTabs TAB_EXO = new EXOTab("Exoskeleton");
	
	private EXOTab(String label){
		super(label);
	}
	
	@Override
	public ItemStack getIconItemStack(){
		return new ItemStack(EXOItems.ITEM_CRAFTING, 1, EXOMetaData.CRAFTING_METAL_GEAR_ID);
	}
	
	@Override
	public String getTranslatedTabLabel(){
		return super.getTabLabel();
	}
}