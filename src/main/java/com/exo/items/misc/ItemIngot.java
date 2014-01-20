package com.exo.items.misc;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

import com.exo.lib.tab.EXOTab;

public class ItemIngot extends Item{
	public static final String[] NAMES = new String[]{
		"exo", "exo_dirty"
	};
	
	private Icon[] textures;
	
	public ItemIngot(int id){
		super(id);
		this.setUnlocalizedName("exoItemIngot");
		this.setHasSubtypes(true);
		this.setCreativeTab(EXOTab.TAB_EXO);
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.textures[damage];
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack){
		return "itemIngot." + ItemIngot.NAMES[stack.getItemDamage()];
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.textures = new Icon[ItemIngot.NAMES.length];
		
		for(int i = 0; i < ItemIngot.NAMES.length; i++){
			this.textures[i] = register.registerIcon("exo:ingots/" + ItemIngot.NAMES[i]);
		}
	}
	
	@Override
	@SuppressWarnings({"rawtypes", "unchecked"})
	public void getSubItems(int id, CreativeTabs tab, List list){
		for(int i = 0; i < ItemIngot.NAMES.length; i++){
			list.add(new ItemStack(id, 1, i));
		}
	}
}