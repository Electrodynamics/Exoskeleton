package com.exo.blocks.misc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.exo.lib.EXOMetaData;

public final class BlockDummy extends Block{
	public BlockDummy(int id){
		super(id, Material.air);
		this.setUnlocalizedName("exoBlockDummy");
	}
	
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z){
		switch(world.getBlockMetadata(x, y, z))
		{
			case EXOMetaData.DUMMY_ASSEMBLER_ID:{
				this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.8F, 1.0F);
				break;
			}
			case EXOMetaData.DUMMY_CONSTRUCTOR_ID:{
				this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.4F, 1.0F);
				break;
			}
			default:{
				this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
				break;
			}
		}
	}
	
	@Override
	public Icon getIcon(int side, int meta){
		return Block.blockIron.getIcon(side, meta);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float j, float k){
		if(world.getBlockTileEntity(x, y - 1, z) != null){
			return Block.blocksList[world.getBlockId(x, y - 1, z)].onBlockActivated(world, x, y, z, player, i, f, j, k);
		} else{
			return false;
		}
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta){
		world.destroyBlock(x, y - 1, z, true);
	}
	
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int id){
		if(world.getBlockTileEntity(x, y - 1, z) == null){
			world.setBlockToAir(x, y, z);
		}
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
}