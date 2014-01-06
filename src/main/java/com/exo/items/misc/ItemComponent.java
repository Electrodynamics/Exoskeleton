package com.exo.items.misc;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public final class ItemComponent extends Item{
	public static final String[] NAMES = new String[]{
		"chestplate", "chestplateLeft", "chestplateRight",
		"concusionCell", "coreContainment", "joint",
		"powerCell", "resistor", "shins",
		"supportBar", "toes"
	};
	
	private Icon[] textures;
	
	public ItemComponent(int id){
		super(id);
		this.setUnlocalizedName("exoItemComponent");
		this.setHasSubtypes(true);
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.textures[damage];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return "itemComponent." + ItemComponent.NAMES[stack.getItemDamage()];
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.textures = new Icon[ItemComponent.NAMES.length];
		
		for(int i = 0; i < ItemComponent.NAMES.length; i++){
			this.textures[i] = register.registerIcon("exo:component/" + ItemComponent.NAMES[i]);
		}
	}
	
	@Override
	@SuppressWarnings({"rawtypes", "unchecked"})
	public void getSubItems(int id, CreativeTabs tab, List list){
		for(int i = 0; i < ItemComponent.NAMES.length; i++){
			list.add(new ItemStack(id, 1, i));
		}
	}
}