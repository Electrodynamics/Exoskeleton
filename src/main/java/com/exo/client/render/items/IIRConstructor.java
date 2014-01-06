package com.exo.client.render.items;

import static org.lwjgl.opengl.GL11.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import com.exo.client.render.IModel;
import com.exo.client.render.model.ModelConstructor;
import com.exo.lib.helpers.RenderHelper;
import com.exo.lib.helpers.RotationHelper;
import com.exo.lib.vector.Vector3;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class IIRConstructor implements IItemRenderer{
	private final IModel MODEL = new ModelConstructor();
	private final ResourceLocation TEXTURE = new ResourceLocation("exo", "");
	
	@Override
	public boolean handleRenderType(ItemStack stack, ItemRenderType type) {
		return true;
	}
	
	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack stack, ItemRendererHelper helper) {
		return true;
	}
	
	@Override
	public void renderItem(ItemRenderType type, ItemStack stack, Object... data) {
		switch(type)
		{
			case ENTITY:{
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE);
				glPushMatrix();
				glEnable(GL_LIGHTING);
				glScalef(1.0F, 1.0F, 1.0F);
				RenderHelper.INSTANCE.translate(Vector3.of(0.0F, 0.7F, 0.0F));
				RotationHelper.INSTANCE.rotate(180.0F, RotationHelper.X_MAG);
				this.MODEL.render();
				glDisable(GL_LIGHTING);
				glPopMatrix();
				return;
			}
			case EQUIPPED:{
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE);
				glPushMatrix();
				glEnable(GL_LIGHTING);
				glScalef(1.0F, 1.0F, 1.0F);
				RenderHelper.INSTANCE.translate(Vector3.of(0.0F, 0.7F, 0.0F));
				RotationHelper.INSTANCE.rotate(180.0F, RotationHelper.X_MAG);
				this.MODEL.render();
				glDisable(GL_LIGHTING);
				glPopMatrix();
				return;
			}
			case INVENTORY:{
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE);
				glPushMatrix();
				glEnable(GL_LIGHTING);
				glScalef(0.825F, 0.825F, 0.825F);
				RenderHelper.INSTANCE.translate(Vector3.of(0.0F, 0.8F, 0.0F));
				RotationHelper.INSTANCE.rotate(180.0F, RotationHelper.X_MAG);
				this.MODEL.render();
				glDisable(GL_LIGHTING);
				glPopMatrix();
				return;
			}
			default:{
				return;
			}
		}
	}
}