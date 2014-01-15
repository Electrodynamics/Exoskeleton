package com.exo.blocks.machine;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

import com.exo.Exoskeleton;
import com.exo.blocks.EXOBlocks;
import com.exo.lib.EXOMetaData;
import com.exo.lib.handlers.EXOGuiHandler;
import com.exo.lib.helpers.RotationHelper;
import com.exo.lib.tab.EXOTab;
import com.exo.tiles.machine.TileConstructor;

public final class BlockConstructor extends BlockContainer{
	public BlockConstructor(int id){
		super(id, Material.iron);
		this.setUnlocalizedName("exoBlockConstructor");
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.4F, 1.0F);
		this.setCreativeTab(EXOTab.TAB_EXO);
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack){
		world.setBlock(x, y + 1, z, EXOBlocks.BLOCK_DUMMY.blockID, EXOMetaData.DUMMY_CONSTRUCTOR_ID, 2);
		((TileConstructor) world.getBlockTileEntity(x, y, z)).setRotation(RotationHelper.INSTANCE.get3DRotation(living));
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f, float f1, float f2){
		player.openGui(Exoskeleton.instance, EXOGuiHandler.GUI_CONSTRUCTOR, world, x, y, z);
		return true;
	}
	
	@Override
	public int quantityDropped(int i, int fortune, Random rand){
		return 1;
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
		return new TileConstructor();
	}
}