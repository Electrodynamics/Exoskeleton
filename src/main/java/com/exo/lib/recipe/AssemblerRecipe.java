package com.exo.lib.recipe;

import net.minecraft.item.ItemStack;

public final class AssemblerRecipe{
	private final ItemStack[] items;
	private final ItemStack catylyst;
	private final ItemStack output;
	
	public AssemblerRecipe(ItemStack[] items, ItemStack catylyst, ItemStack output){
		this.items = items;
		this.catylyst = catylyst;
		this.output = output;
	}
	
	public boolean matches(ItemStack[] items, ItemStack catylyst){
		for(int i = 0; i < this.items.length; i++){
			if((this.items[i] != null) && (items[i] == null)){
				return false;
			}
			
			if((this.items[i] == null) && (items[i] != null)){
				return false;
			}
			
			if((this.items[i].itemID == items[i].itemID)){
				if((this.items[i].getItemDamage() == items[i].getItemDamage())){
					if((this.items[i].stackSize <= items[i].stackSize)){
						continue;
					} else{
						return false;
					}
				} else{
					return false;
				}
			} else{
				return false;
			}
		}
		
		if((this.catylyst.itemID == catylyst.itemID) && (this.catylyst.getItemDamage() == catylyst.getItemDamage())){
			return true;
		} else{
			return false;
		}
	}
	
	public ItemStack getRecipeOutput(){
		return this.output;
	}
	
	public ItemStack[] getItems(){
		return this.items;
	}
}