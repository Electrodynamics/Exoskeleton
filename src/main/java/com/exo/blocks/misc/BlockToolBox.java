package com.exo.blocks.misc;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.exo.Exoskeleton;
import com.exo.items.EXOItems;
import com.exo.lib.handlers.EXOGuiHandler;
import com.exo.tiles.TileToolBox;

public final class BlockToolBox extends BlockContainer{
	public BlockToolBox(int id){
		super(id, Material.iron);
		this.setUnlocalizedName("exoBlockToolbox");
		this.setBlockBounds(0.1F, 0.0F, 0.2F, 0.9F, 0.7F, 0.8F);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float j, float k){
		player.openGui(Exoskeleton.instance, EXOGuiHandler.GUI_TOOLBOX, world, x, y, z);
		return true;
	}
	
	@Override
	public Icon getIcon(int side, int meta){
		return Block.blockIron.getIcon(side, meta);
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public int quantityDropped(int i, int j, Random rand){
		return 1;
	}
	
	@Override
	public int idDropped(int i, Random rand, int j){
		return EXOItems.ITEM_TOOLBOX.itemID;
	}
	
	@Override
	public int getRenderType(){
		return -1;
	}
	
	@Override
	public int getRenderBlockPass(){
		return 1;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world){
		return new TileToolBox();
	}
}