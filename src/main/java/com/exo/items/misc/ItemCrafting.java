package com.exo.items.misc;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public final class ItemCrafting extends Item{
	public static final String[] NAMES = new String[]{
		
	};
	
	private Icon[] textures;
	
	public ItemCrafting(int id){
		super(id);
		this.setUnlocalizedName("exoItemCrafting");
		this.setHasSubtypes(true);
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.textures[damage];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return "itemCrafting." + ItemCrafting.NAMES[stack.getItemDamage()];
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.textures = new Icon[ItemCrafting.NAMES.length];
		
		for(int i = 0; i < ItemCrafting.NAMES.length; i++){
			this.textures[i] = register.registerIcon("exo:crafting/" + ItemCrafting.NAMES[i]);
		}
	}
	
	@Override
	@SuppressWarnings({"rawtypes", "unchecked"})
	public void getSubItems(int id, CreativeTabs tab, List list){
		for(int i = 0; i < ItemCrafting.NAMES.length; i++){
			list.add(new ItemStack(id, 1, i));
		}
	}
}