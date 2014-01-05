package com.exo.blocks.machine;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public final class BlockConstructor extends BlockContainer{
	public BlockConstructor(int id){
		super(id, Material.iron);
		this.setUnlocalizedName("exoBlockConstructor");
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.4F, 1.0F);
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase base, ItemStack stack){
		
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float f1, float f2){
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
		return null;
	}
}