package com.exo.items.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.exo.blocks.EXOBlocks;
import com.exo.lib.EXOMetaData;
import com.exo.lib.tab.EXOTab;

public class ItemToolbox extends Item{
	public ItemToolbox(int id){
		super(id);
		this.setUnlocalizedName("exoItemToolbox");
		this.setCreativeTab(EXOTab.TAB_EXO);
		this.setMaxStackSize(1);
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int i, float f, float j, float k){
		if(world.isAirBlock(x, y + 1, z)){
			world.setBlock(x, y + 1, z, EXOBlocks.BLOCK_TOOLBOX.blockID, 0, EXOMetaData.BLOCK_SEND_CLIENT);
		}
		
		return true;
	}
	
	@Override
	public Icon getIconFromDamage(int damage){
		return this.itemIcon;
	}
	
	@Override
	public void registerIcons(IconRegister register){
		this.itemIcon = register.registerIcon("exo:toolbox/default");
	}
}