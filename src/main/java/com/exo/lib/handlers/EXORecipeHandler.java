package com.exo.lib.handlers;

import java.util.LinkedList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import com.exo.blocks.EXOBlocks;
import com.exo.items.EXOItems;
import com.exo.lib.EXOMetaData;
import com.exo.lib.recipe.AssemblerRecipe;

import cpw.mods.fml.common.registry.GameRegistry;

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
		this.addCraftingRecipes();
	}
	
	private void addCraftingRecipes() {
		
		GameRegistry.addShapedRecipe(getCrafting(EXOMetaData.CRAFTING_METAL_ROD_ID), "III",
				'I', Item.ingotIron);

		GameRegistry.addShapedRecipe(getCrafting(EXOMetaData.CRAFTING_RING_ROD_ID), "SSS", " S ", " H ", 
				'H', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_ID), 
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_ROD_ID));

		GameRegistry.addShapedRecipe(getComponent(EXOMetaData.COMPONENT_SUPPORT_BAR_ID), "S S", "S S", "S S", 
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_ROD_ID));

		GameRegistry.addShapedRecipe(getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_ID), "SSS", "SIS", "SSS", 
				'I', Item.ingotIron, 
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_ROD_ID));

		GameRegistry.addShapedRecipe(getCrafting(EXOMetaData.CRAFTING_HINGE_ID), "SHS", 
				'H', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_ID), 
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_ROD_ID));

		GameRegistry.addShapedRecipe(getCrafting(EXOMetaData.CRAFTING_METAL_GEAR_ID), " S ", "SIS", " S ", 
				'I', Item.ingotIron, 
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_ROD_ID));

		GameRegistry.addShapedRecipe(getCrafting(EXOMetaData.CRAFTING_PAD_LOCK_ID), " S ", "HLH", "HHH", 
				'L', getCrafting(EXOMetaData.CRAFTING_RING_ROD_ID), 
				'H', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_ID), 
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_ROD_ID));

		GameRegistry.addShapedRecipe(getComponent(EXOMetaData.COMPONENT_JOINT_ID), "SHS", 
				'H', getCrafting(EXOMetaData.CRAFTING_HINGE_ID), 
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_ROD_ID));

		GameRegistry.addShapedRecipe(getCrafting(EXOMetaData.CRAFTING_FUSE_ID), "RRR", "LRL", "S S", 
				'R', getItemStack(Item.dyePowder, 1, 1), 
				'L', getCrafting(EXOMetaData.CRAFTING_RING_ROD_ID), 
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_ROD_ID));

		GameRegistry.addShapedRecipe(getComponent(EXOMetaData.COMPONENT_RESISTOR_ID), "HHH", "HRH", "S S", 
				'R', Item.redstone, 
				'H', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_ID), 
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_ROD_ID));

		GameRegistry.addShapedRecipe(getCrafting(EXOMetaData.CRAFTING_STORAGE_DRIVE_ID), "HHH", "SRS", "HCH", 
				'R', Item.redstone, 
				'H', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_ID), 
				'C', Item.compass, 
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_ROD_ID));

		GameRegistry.addShapedRecipe(getIngot(EXOMetaData.INGOT_PIGIRON_ID), "CCC", "CIC", "CCC", 
				'C', Item.coal, 
				'I', Item.ingotIron); 
	
		FurnaceRecipes.smelting().addSmelting(EXOItems.ITEM_INGOT.itemID, EXOMetaData.INGOT_PIGIRON_ID, getIngot(EXOMetaData.INGOT_SILVER_ID), 10);
		
		GameRegistry.addShapedRecipe(getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_R_ID), "SSS", "PPP", "SSS", 
				'P', getIngot(EXOMetaData.INGOT_SILVER_ID), 
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_ID)); 
		
		GameRegistry.addShapedRecipe(getComponent(EXOMetaData.CRAFTING_SUSPENSION_ID), "SH ", " HS", "SH",
				'H', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_R_ID),
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_ROD_ID));
		
		GameRegistry.addShapedRecipe(getComponent(EXOMetaData.COMPONENT_CONCUSSION_CELL_ID), "SPS ", "HUH", " H ",
				'S', getComponent(EXOMetaData.COMPONENT_SUPPORT_BAR_ID),
				'P', Block.pistonBase,
				'H', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_R_ID),
				'U', getCrafting(EXOMetaData.CRAFTING_SUSPENSION_ID));
		
		GameRegistry.addShapedRecipe(getComponent(EXOMetaData.COMPONENT_SHINS_ID), "S S ", "H H",
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_R_ID),
				'H', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_ID));
		
		GameRegistry.addShapedRecipe(getComponent(EXOMetaData.COMPONENT_TOES_ID), " H ", "S S",
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_R_ID),
				'H', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_ID));
		
		GameRegistry.addShapedRecipe(getComponent(EXOMetaData.COMPONENT_CHESTPLATE_ID), "S S", "JOJ", "UCU",
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_R_ID),
				'J', getComponent(EXOMetaData.COMPONENT_JOINT_ID),
				'O', getComponent(EXOMetaData.COMPONENT_CORE_CONTAINMENT),
				'C', getComponent(EXOMetaData.COMPONENT_CHESTPLATE_ID),
				'U', getComponent(EXOMetaData.COMPONENT_SUPPORT_BAR_ID));
		
		GameRegistry.addShapedRecipe(new ItemStack(EXOBlocks.BLOCK_ASSEMBLER), "SGS", "URU", "SPS",
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_R_ID),
				'G', Block.glass,
				'U', getComponent(EXOMetaData.COMPONENT_SUPPORT_BAR_ID),
				'R', getComponent(EXOMetaData.COMPONENT_RESISTOR_ID),
				'P', getComponent(EXOMetaData.COMPONENT_POWER_CELL_ID));
		
		GameRegistry.addShapedRecipe(new ItemStack(EXOBlocks.BLOCK_CONSTRUCTOR), "SJS", "URU", "SPS",
				'S', getCrafting(EXOMetaData.CRAFTING_METAL_SHEET_R_ID),
				'J', getComponent(EXOMetaData.COMPONENT_JOINT_ID),
				'U', getComponent(EXOMetaData.COMPONENT_SUPPORT_BAR_ID),
				'R', getComponent(EXOMetaData.COMPONENT_RESISTOR_ID),
				'P', getComponent(EXOMetaData.COMPONENT_POWER_CELL_ID));
		

	}
	
	private ItemStack getCrafting(int meta){
	    return getItemStack(EXOItems.ITEM_CRAFTING, 1, meta);
	}
	
	private ItemStack getComponent(int meta){
	    return getItemStack(EXOItems.ITEM_COMPONENT, 1, meta);
	}
	
	private ItemStack getIngot(int meta){
	    return getItemStack(EXOItems.ITEM_INGOT, 1, meta);
	}
	
	private ItemStack getItemStack(Item item, int quantity, int meta){
	    return new ItemStack(item, quantity, meta);
	}
	
	private void addAssemblerRecipes(){
		AssemblerRecipes.INSTANCE.addRecipe(new AssemblerRecipe(new ItemStack[]{
				new ItemStack(Block.dirt, 1), new ItemStack(Block.dirt, 1), new ItemStack(Block.dirt, 1),
				new ItemStack(Block.dirt, 1), new ItemStack(Block.dirt, 1), new ItemStack(Block.dirt, 1),
				new ItemStack(Block.dirt, 1), new ItemStack(Block.dirt, 1), new ItemStack(Block.dirt, 1)
		}, new ItemStack(Item.diamond, 1), new ItemStack(Item.ghastTear, 1)));
	}
}