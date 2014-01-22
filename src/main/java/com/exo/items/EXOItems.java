package com.exo.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.exo.items.armour.ItemEXOArmourBoots;
import com.exo.items.armour.ItemEXOArmourChest;
import com.exo.items.armour.ItemEXOArmourHelmet;
import com.exo.items.armour.ItemEXOArmourLegs;
import com.exo.items.misc.ItemComponent;
import com.exo.items.misc.ItemCrafting;
import com.exo.items.misc.ItemIngot;
import com.exo.items.tools.ItemToolbox;
//github.com/Electrodynamics/Exoskeleton
import com.exo.lib.helpers.LocalizationHelper;
import com.exo.lib.EXOSessionData;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public enum EXOItems{
	INSTANCE;
	
	public static final Item ITEM_COMPONENT = new ItemComponent(EXOSessionData.ITEM_COMPONENT_ID);
	public static final Item ITEM_CRAFTING = new ItemCrafting(EXOSessionData.ITEM_CRAFTING_ID);
	public static final Item ITEM_INGOT = new ItemIngot(EXOSessionData.ITEM_INGOT_ID);
	public static final Item ITEM_ARMOUR_HELM = new ItemEXOArmourHelmet(EXOSessionData.ITEM_EXO_ARMOUR_HELM_ID);
	public static final Item ITEM_ARMOUR_CHEST = new ItemEXOArmourChest(EXOSessionData.ITEM_EXO_ARMOUR_CHEST_ID);
	public static final Item ITEM_ARMOUR_LEGS = new ItemEXOArmourLegs(EXOSessionData.ITEM_EXO_ARMOUR_LEGS_ID);
	public static final Item ITEM_ARMOUR_BOOTS = new ItemEXOArmourBoots(EXOSessionData.ITEM_EXO_ARMOUR_BOOTS_ID);
	public static final Item ITEM_TOOLBOX = new ItemToolbox(EXOSessionData.ITEM_TOOLBOX_ID);
	
	public void registerItems(){
		this.register(ITEM_COMPONENT);
		this.register(ITEM_CRAFTING);
		this.register(ITEM_INGOT);
		this.register(ITEM_TOOLBOX);
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
		for(i = 0; i < ItemIngot.NAMES.length; i++){
			this.name(new ItemStack(ITEM_INGOT, 0, i), "ingot." + ItemIngot.NAMES[i]);
		}
		this.name(new ItemStack(ITEM_TOOLBOX, 0, 0), "toolbox");
	}
	
	private void name(ItemStack stack, String tag){
		LanguageRegistry.addName(stack, LocalizationHelper.localize("item." + tag + ".name"));
	}
}
