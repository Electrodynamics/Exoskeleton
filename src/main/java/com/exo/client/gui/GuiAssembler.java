package com.exo.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import com.exo.lib.helpers.RenderHelper;
import com.exo.server.gui.ContainerAssembler;
import com.exo.tiles.machine.TileAssembler;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class GuiAssembler extends GuiContainer{
	private final ResourceLocation TEXTURE = new ResourceLocation("exo", "");
	
	public GuiAssembler(InventoryPlayer playerInv, TileAssembler tile){
		super(new ContainerAssembler(playerInv, tile));
	}
	
	@Override
	public void drawGuiContainerForegroundLayer(int x, int y){
		RenderHelper.Colours.INSTANCE.applyColour(RenderHelper.Colours.WHITE);
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE);
		int i = (this.width - this.xSize) / 2;
		int j = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		
	}
}