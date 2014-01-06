package com.exo.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.exo.items.misc.ItemComponent;
import com.exo.items.misc.ItemCrafting;
import com.exo.lib.EXOSessionData;
import com.exo.lib.helpers.LocalizationHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public enum EXOItems{
	INSTANCE;
	
	public static final Item ITEM_COMPONENT = new ItemComponent(EXOSessionData.ITEM_COMPONENT_ID);
	public static final Item ITEM_CRAFTING = new ItemCrafting(EXOSessionData.ITEM_CRAFTING_ID);
	
	public void registerItems(){
		this.register(ITEM_COMPONENT);
		this.register(ITEM_CRAFTING);
	}
	
	private void register(Item item){
		GameRegistry.registerItem(item, "exo:" + item.getUnlocalizedName());
	}
	
	public void addNames(){
		int i = 0;
		for(i = 0; i < ItemCrafting.NAMES.length; i++){
			this.name(new ItemStack(ITEM_CRAFTING, 0, i), "crafting." + ItemCrafting.NAMES[i]);
		}
		for(i = 0; i < ItemComponent.NAMES.length; i++){
			this.name(new ItemStack(ITEM_COMPONENT, 0, i), "component." + ItemComponent.NAMES[i]);
		}
	}
	
	private void name(ItemStack stack, String tag){
		LanguageRegistry.addName(stack, LocalizationHelper.localize("item." + tag + ".name"));
	}
}