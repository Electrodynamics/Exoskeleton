package com.exo.items.armour;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.exo.lib.EXOMaterials;

public class ItemEXOArmour extends ItemArmor{
	private final String texture;
	
	public ItemEXOArmour(int id, int slot, String texture){
		super(id, EXOMaterials.ARMOUR_MATERIAL_EXO, slot, 0);
		this.texture = texture;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer){
		return this.texture;
	}
}