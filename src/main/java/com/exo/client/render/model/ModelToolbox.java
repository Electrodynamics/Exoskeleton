package com.exo.client.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.exo.client.render.IModel;

public class ModelToolbox extends ModelBase implements IModel {
	ModelRenderer handleSmall2;
	ModelRenderer toolbox;
	ModelRenderer lid;
	ModelRenderer handleLong;
	ModelRenderer handleSmall1;
	ModelRenderer lock;

	public ModelToolbox() {
		textureWidth = 64;
		textureHeight = 32;

		handleSmall2 = new ModelRenderer(this, 0, 0);
		handleSmall2.addBox(9F, -3.5F, -4.5F, 1, 1, 1);
		handleSmall2.setRotationPoint(-7F, 17F, 4F);
		handleSmall2.setTextureSize(64, 32);
		handleSmall2.mirror = true;
		setRotation(handleSmall2, 0F, 0F, 0F);
		
		toolbox = new ModelRenderer(this, 0, 11);
		toolbox.addBox(0F, 0F, 0F, 14, 7, 8);
		toolbox.setRotationPoint(-7F, 17F, -4F);
		toolbox.setTextureSize(64, 32);
		toolbox.mirror = true;
		setRotation(toolbox, 0F, 0F, 0F);
		
		lid = new ModelRenderer(this, 0, 0);
		lid.addBox(0F, -3F, -8F, 14, 3, 8);
		lid.setRotationPoint(-7F, 17F, 4F);
		lid.setTextureSize(64, 32);
		lid.mirror = true;
		setRotation(lid, 0F, 0F, 0F);
		
		handleLong = new ModelRenderer(this, 44, 0);
		handleLong.addBox(4F, -4.5F, -4.5F, 6, 1, 1);
		handleLong.setRotationPoint(-7F, 17F, 4F);
		handleLong.setTextureSize(64, 32);
		handleLong.mirror = true;
		setRotation(handleLong, 0F, 0F, 0F);
		
		handleSmall1 = new ModelRenderer(this, 0, 0);
		handleSmall1.addBox(4F, -3.5F, -4.5F, 1, 1, 1);
		handleSmall1.setRotationPoint(-7F, 17F, 4F);
		handleSmall1.setTextureSize(64, 32);
		handleSmall1.mirror = true;
		setRotation(handleSmall1, 0F, 0F, 0F);
		
		lock = new ModelRenderer(this, 0, 2);
		lock.addBox(6.5F, -0.5F, -8.5F, 1, 2, 1);
		lock.setRotationPoint(-7F, 17F, 4F);
		lock.setTextureSize(64, 32);
		lock.mirror = true;
		setRotation(lock, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		handleSmall2.render(f5);
		toolbox.render(f5);
		lid.render(f5);
		handleLong.render(f5);
		handleSmall1.render(f5);
		lock.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	private void render(float f5){
		handleSmall2.render(f5);
		toolbox.render(f5);
		lid.render(f5);
		handleLong.render(f5);
		handleSmall1.render(f5);
		lock.render(f5);
	}

	@Override
	public void render() {
		this.render(0.0625F);
	}
}