package com.exo.server.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.exo.inventory.InventoryAssembler;
import com.exo.lib.handlers.EXORecipeHandler;
import com.exo.tiles.machine.TileAssembler;

public final class ContainerAssembler extends Container{
	private final InventoryAssembler CRAFT_MATRIX = new InventoryAssembler(this);
	private final InventoryCraftResult CRAFT_RESULT = new InventoryCraftResult();
	
	public ContainerAssembler(InventoryPlayer playerInv, TileAssembler tile){
		this.bindPlayerInventory(playerInv);
		this.createCraftingMatrix();
		this.onCraftMatrixChanged(this.CRAFT_MATRIX);
	}
	
	private void createCraftingMatrix(){
		for(int x = 0; x < 3; x++){
			for(int y = 0; y < 3; y++){
				this.addSlotToContainer(new Slot(this.CRAFT_MATRIX, (x + y * 3), (17 + y * 18), (17 + x * 18)));
			}
		}
		
		this.addSlotToContainer(new Slot(this.CRAFT_MATRIX, 9, 84, 35));
		this.addSlotToContainer(new Slot(this.CRAFT_RESULT, 0, 142, 35));
	}
	
	@Override
	public void onCraftMatrixChanged(IInventory inventory){
		ItemStack[] items = new ItemStack[9];
		ItemStack cat = this.CRAFT_MATRIX.getStackInSlot(9);
		
		for(int i = 0; i < items.length; i++){
			items[i] = this.CRAFT_MATRIX.getStackInSlot(i);
		}
		
		this.CRAFT_RESULT.setInventorySlotContents(0, EXORecipeHandler.AssemblerRecipes.INSTANCE.getRecipe(items, cat).getRecipeOutput().copy());
	}
	
	private void bindPlayerInventory(InventoryPlayer playerInv){
		for(int x = 0; x < 3; x++){
			for(int y = 0; y < 9; y++){
				this.addSlotToContainer(new Slot(playerInv, (y + x * 9 + 9), (8 + y * 18), (84 + x * 18)));
			}
		}
		
		for(int y = 0; y < 9; y++){
			this.addSlotToContainer(new Slot(playerInv, y, (8 + y * 18), 142));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer entityplayer) {
		return true;
	}
}