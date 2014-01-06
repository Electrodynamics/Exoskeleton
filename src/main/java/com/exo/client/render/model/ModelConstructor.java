package com.exo.client.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.exo.client.render.IModel;

public class ModelConstructor extends ModelBase implements IModel {
	ModelRenderer arm4;
	ModelRenderer arm3;
	ModelRenderer arm2;
	ModelRenderer arm1;
	ModelRenderer bottomPlate;
	ModelRenderer topPlate;
	ModelRenderer centerBlock;
	ModelRenderer rightAngle;
	ModelRenderer smallPlate;
	ModelRenderer backPlate;
	ModelRenderer leftAngle;
	ModelRenderer frontPlate;
	ModelRenderer keypad2;
	ModelRenderer keypad;
	ModelRenderer arm;
	ModelRenderer base;

	public ModelConstructor() {
		textureWidth = 128;
		textureHeight = 64;

		arm4 = new ModelRenderer(this, 56, 0);
		arm4.addBox(0F, 0F, 0F, 1, 14, 1);
		arm4.setRotationPoint(7F, 9F, 7F);
		arm4.setTextureSize(128, 64);
		arm4.mirror = true;
		setRotation(arm4, 0F, 0F, 0F);
		
		arm3 = new ModelRenderer(this, 56, 0);
		arm3.addBox(0F, 0F, 0F, 1, 14, 1);
		arm3.setRotationPoint(7F, 9F, -8F);
		arm3.setTextureSize(128, 64);
		arm3.mirror = true;
		setRotation(arm3, 0F, 0F, 0F);
		
		arm2 = new ModelRenderer(this, 56, 0);
		arm2.addBox(0F, 0F, 0F, 1, 14, 1);
		arm2.setRotationPoint(-8F, 9F, 7F);
		arm2.setTextureSize(128, 64);
		arm2.mirror = true;
		setRotation(arm2, 0F, 0F, 0F);
		
		arm1 = new ModelRenderer(this, 56, 0);
		arm1.addBox(0F, 0F, 0F, 1, 14, 1);
		arm1.setRotationPoint(-8F, 9F, -8F);
		arm1.setTextureSize(128, 64);
		arm1.mirror = true;
		setRotation(arm1, 0F, 0F, 0F);
		
		bottomPlate = new ModelRenderer(this, 0, 28);
		bottomPlate.addBox(0F, 0F, 0F, 16, 1, 16);
		bottomPlate.setRotationPoint(-8F, 23F, -8F);
		bottomPlate.setTextureSize(128, 64);
		bottomPlate.mirror = true;
		setRotation(bottomPlate, 0F, 0F, 0F);
		
		topPlate = new ModelRenderer(this, 0, 28);
		topPlate.addBox(0F, 0F, 0F, 16, 1, 16);
		topPlate.setRotationPoint(-8F, 8F, -8F);
		topPlate.setTextureSize(128, 64);
		topPlate.mirror = true;
		setRotation(topPlate, 0F, 0F, 0F);
		
		centerBlock = new ModelRenderer(this, 0, 0);
		centerBlock.addBox(0F, 0F, 0F, 14, 14, 14);
		centerBlock.setRotationPoint(-7F, 9F, -7F);
		centerBlock.setTextureSize(128, 64);
		centerBlock.mirror = true;
		setRotation(centerBlock, 0F, 0F, 0F);
		
		rightAngle = new ModelRenderer(this, 88, 5);
		rightAngle.addBox(0F, 0F, 0F, 1, 4, 12);
		rightAngle.setRotationPoint(5F, 6F, -6F);
		rightAngle.setTextureSize(128, 64);
		rightAngle.mirror = true;
		setRotation(rightAngle, 0.1745329F, 0F, 0F);
		
		smallPlate = new ModelRenderer(this, 64, 43);
		smallPlate.addBox(0F, 0F, 0F, 14, 1, 14);
		smallPlate.setRotationPoint(-7F, 7F, -7F);
		smallPlate.setTextureSize(128, 64);
		smallPlate.mirror = true;
		setRotation(smallPlate, 0F, 0F, 0F);
		
		backPlate = new ModelRenderer(this, 0, 45);
		backPlate.addBox(0F, 0F, 0F, 14, 4, 2);
		backPlate.setRotationPoint(-7F, 3F, 5F);
		backPlate.setTextureSize(128, 64);
		backPlate.mirror = true;
		setRotation(backPlate, 0F, 0F, 0F);
		
		leftAngle = new ModelRenderer(this, 88, 5);
		leftAngle.addBox(0F, 0F, 0F, 1, 4, 12);
		leftAngle.setRotationPoint(-6F, 6F, -6F);
		leftAngle.setTextureSize(128, 64);
		leftAngle.mirror = true;
		setRotation(leftAngle, 0.1745329F, 0F, 0F);
		
		frontPlate = new ModelRenderer(this, 64, 35);
		frontPlate.addBox(0F, 0F, 0F, 12, 2, 1);
		frontPlate.setRotationPoint(-5.99F, 6F, -6F);
		frontPlate.setTextureSize(128, 64);
		frontPlate.mirror = true;
		setRotation(frontPlate, 0F, 0F, 0F);
		
		keypad2 = new ModelRenderer(this, 90, 35);
		keypad2.addBox(0F, 0F, 0F, 11, 3, 4);
		keypad2.setRotationPoint(-5.5F, 10F, -7F);
		keypad2.setTextureSize(128, 64);
		keypad2.mirror = true;
		setRotation(keypad2, -0.6981317F, 0F, 0F);
		
		keypad = new ModelRenderer(this, 64, 38);
		keypad.addBox(0F, 0F, 0F, 12, 4, 1);
		keypad.setRotationPoint(-6F, 9F, -7F);
		keypad.setTextureSize(128, 64);
		keypad.mirror = true;
		setRotation(keypad, -0.6981317F, 0F, 0F);
		
		arm = new ModelRenderer(this, 32, 45);
		arm.addBox(0F, 0F, 0F, 2, 1, 5);
		arm.setRotationPoint(-1F, 4F, 1F);
		arm.setTextureSize(128, 64);
		arm.mirror = true;
		setRotation(arm, 0F, 0F, 0F);
		
		base = new ModelRenderer(this, 32, 51);
		base.addBox(0F, 0F, 0F, 4, 1, 4);
		base.setRotationPoint(-2F, 6F, -2F);
		base.setTextureSize(128, 64);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		arm4.render(f5);
		arm3.render(f5);
		arm2.render(f5);
		arm1.render(f5);
		bottomPlate.render(f5);
		topPlate.render(f5);
		centerBlock.render(f5);
		rightAngle.render(f5);
		smallPlate.render(f5);
		backPlate.render(f5);
		leftAngle.render(f5);
		frontPlate.render(f5);
		keypad2.render(f5);
		keypad.render(f5);
		arm.render(f5);
		base.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	private void render(float f5){
		arm4.render(f5);
		arm3.render(f5);
		arm2.render(f5);
		arm1.render(f5);
		bottomPlate.render(f5);
		topPlate.render(f5);
		centerBlock.render(f5);
		rightAngle.render(f5);
		smallPlate.render(f5);
		backPlate.render(f5);
		leftAngle.render(f5);
		frontPlate.render(f5);
		keypad2.render(f5);
		keypad.render(f5);
		arm.render(f5);
		base.render(f5);
	}
	
	@Override
	public void render(){
		this.render(0.0625F);
	}
}