package com.exo.lib.handlers;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.exo.lib.recipe.AssemblerRecipe;

public enum EXORecipeHandler{
	INSTANCE;
	
	public static enum AssemblerRecipes{
		INSTANCE;
		
		private final List<AssemblerRecipe> RECIPES = new LinkedList<AssemblerRecipe>();
		
		public void addRecipe(AssemblerRecipe recipe){
			this.RECIPES.add(recipe);
		}
		
		public AssemblerRecipe getRecipe(ItemStack[] items, ItemStack catylyst){
			for(AssemblerRecipe recipe : this.RECIPES){
				if(recipe.matches(items, catylyst)){
					return recipe;
				}
			}
			
			return null;
		}
	}
	
	public void addRecipes(){
		this.addAssemblerRecipes();
	}
	
	private void addAssemblerRecipes(){
		AssemblerRecipes.INSTANCE.addRecipe(new AssemblerRecipe(new ItemStack[]{
				new ItemStack(Block.dirt, 1), new ItemStack(Block.dirt, 1), new ItemStack(Block.dirt, 1),
				new ItemStack(Block.dirt, 1), new ItemStack(Block.dirt, 1), new ItemStack(Block.dirt, 1),
				new ItemStack(Block.dirt, 1), new ItemStack(Block.dirt, 1), new ItemStack(Block.dirt, 1)
		}, new ItemStack(Item.diamond, 1), new ItemStack(Item.ghastTear, 1)));
	}
}