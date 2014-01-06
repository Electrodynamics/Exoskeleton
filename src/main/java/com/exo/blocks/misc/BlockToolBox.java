package com.exo.blocks.misc;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.exo.lib.tab.EXOTab;
import com.exo.tiles.TileToolBox;

public final class BlockToolBox extends BlockContainer{
	public BlockToolBox(int id){
		super(id, Material.iron);
		this.setUnlocalizedName("exoBlockToolbox");
		this.setCreativeTab(EXOTab.TAB_EXO);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float j, float k){
		return true;
	}
	
	@Override
	public Icon getIcon(int side, int meta){
		return this.blockIcon;
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