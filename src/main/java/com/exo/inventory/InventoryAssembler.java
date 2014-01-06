package com.exo.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public final class InventoryAssembler implements IInventory{
	private final int WIDTH = 0xB;
	private final ItemStack[] STACKS = new ItemStack[this.WIDTH];
	private final Container PARENT;
	
	public InventoryAssembler(Container c){
		this.PARENT = c;
	}
	
	public ItemStack[] stackList(){
		return this.STACKS;
	}
	
	public ItemStack getStackInRowAndColumn(int row, int col){
		if((row >= 0) && (row < this.WIDTH)){
			return this.getStackInSlot(row + col * this.WIDTH);
		} else{
			return null;
		}
	}
	
	@Override
	public boolean isItemValidForSlot(int slot, ItemStack stack){
		return true;
	}
	
	@Override
	public int getSizeInventory(){
		return this.STACKS.length;
	}
	
	@Override
	public ItemStack getStackInSlot(int slot){
		if(slot > this.getSizeInventory()){
			return null;
		} else{
			return this.STACKS[slot];
		}
	}
	
	@Override
	public String getInvName(){
		return "container.assembler";
	}
	
	@Override
	public boolean isInvNameLocalized(){
		return false;
	}
	
	@Override
	public ItemStack getStackInSlotOnClosing(int slot){
		if(this.STACKS[slot] != null){
			ItemStack stack = this.STACKS[slot];
			this.STACKS[slot] = null;
			return stack;
		} else{
			return null;
		}
	}
	
	@Override
	public ItemStack decrStackSize(int slot, int amount){
		if(this.STACKS[slot] != null){
			ItemStack stack = null;
			
			if(this.STACKS[slot].stackSize <= amount){
				stack = this.STACKS[slot];
				this.PARENT.onCraftMatrixChanged(this);
				return stack;
			} else{
				stack = this.STACKS[slot].splitStack(amount);
				
				if(this.STACKS[slot].stackSize == 0){
					this.STACKS[slot] = null;
				}
				
				this.PARENT.onCraftMatrixChanged(this);
				return stack;
			}
		} else{
			return null;
		}
	}
	
	@Override
	public void setInventorySlotContents(int slot, ItemStack stack){
		this.STACKS[slot] = stack;
		this.PARENT.onCraftMatrixChanged(this);
	}
	
	@Override
	public int getInventoryStackLimit(){
		return 64;
	}
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player){
		return true;
	}
	
	@Override public void onInventoryChanged(){}
	@Override public void openChest(){}
	@Override public void closeChest(){}
}