package com.exo.client.render.items;

import static org.lwjgl.opengl.GL11.GL_LIGHTING;
import static org.lwjgl.opengl.GL11.glDisable;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glPopMatrix;
import static org.lwjgl.opengl.GL11.glPushMatrix;
import static org.lwjgl.opengl.GL11.glScalef;
import static org.lwjgl.opengl.GL11.glTranslatef;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import com.exo.client.render.IModel;
import com.exo.client.render.model.ModelAssembler;
import com.exo.lib.helpers.RotationHelper;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class IIRAssembler implements IItemRenderer{
	private final ResourceLocation TEXTURE = new ResourceLocation("exo", "textures/blocks/assembler.png");
	private final IModel model = new ModelAssembler();
	
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
				glScalef(0.75F, 0.75F, 0.75F);
				glTranslatef(0.0F, 0.65F, 0.0F);
				RotationHelper.INSTANCE.rotate(180.0F, RotationHelper.X_MAG);
				this.model.render();
				glDisable(GL_LIGHTING);
				glPopMatrix();
				return;
			}
			case EQUIPPED:{
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE);
				glPushMatrix();
				glEnable(GL_LIGHTING);
				glScalef(0.75F, 0.75F, 0.75F);
				glTranslatef(0.0F, 0.65F, 0.0F);
				RotationHelper.INSTANCE.rotate(180.0F, RotationHelper.X_MAG);
				this.model.render();
				glDisable(GL_LIGHTING);
				glPopMatrix();
				return;
			}
			case INVENTORY:{
				FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE);
				glPushMatrix();
				glEnable(GL_LIGHTING);
				glScalef(0.75F, 0.75F, 0.75F);
				glTranslatef(0.0F, 0.65F, 0.0F);
				RotationHelper.INSTANCE.rotate(180.0F, RotationHelper.X_MAG);
				this.model.render();
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