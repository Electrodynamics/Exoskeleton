package com.exo.client.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.exo.client.render.IModel;

public final class ModelAssembler extends ModelBase implements IModel {
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
	ModelRenderer lidFront;
	ModelRenderer frontPlate;
	ModelRenderer hinge2;
	ModelRenderer lidRight;
	ModelRenderer lidTop;
	ModelRenderer hinge1;
	ModelRenderer lidLeft;
	ModelRenderer keypad2;
	ModelRenderer keypad;
	ModelRenderer lidFrontR;
	ModelRenderer lidFrontT;
	ModelRenderer lidGlass;
	ModelRenderer lidFrontL;

	public ModelAssembler() {
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
		rightAngle.setRotationPoint(5F, 5F, -6F);
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
		backPlate.addBox(0F, 0F, 0F, 14, 10, 2);
		backPlate.setRotationPoint(-7F, -3F, 5F);
		backPlate.setTextureSize(128, 64);
		backPlate.mirror = true;
		setRotation(backPlate, 0F, 0F, 0F);
		
		leftAngle = new ModelRenderer(this, 88, 5);
		leftAngle.addBox(0F, 0F, 0F, 1, 4, 12);
		leftAngle.setRotationPoint(-6F, 5F, -6F);
		leftAngle.setTextureSize(128, 64);
		leftAngle.mirror = true;
		setRotation(leftAngle, 0.1745329F, 0F, 0F);
		
		lidFront = new ModelRenderer(this, 88, 2);
		lidFront.addBox(0F, 9F, -13F, 14, 2, 1);
		lidFront.setRotationPoint(-7F, -4F, 6F);
		lidFront.setTextureSize(128, 64);
		lidFront.mirror = true;
		setRotation(lidFront, 0F, 0F, 0F);
		
		frontPlate = new ModelRenderer(this, 64, 35);
		frontPlate.addBox(0F, 0F, 0F, 12, 2, 1);
		frontPlate.setRotationPoint(-5.99F, 5F, -6F);
		frontPlate.setTextureSize(128, 64);
		frontPlate.mirror = true;
		setRotation(frontPlate, 0F, 0F, 0F);
		
		hinge2 = new ModelRenderer(this, 0, 0);
		hinge2.addBox(8F, -1F, 0F, 3, 1, 1);
		hinge2.setRotationPoint(-6F, -2.5F, 5.5F);
		hinge2.setTextureSize(128, 64);
		hinge2.mirror = true;
		setRotation(hinge2, 0F, 0F, 0F);
		
		lidRight = new ModelRenderer(this, 64, 0);
		lidRight.addBox(0F, 1F, -12F, 1, 10, 11);
		lidRight.setRotationPoint(6F, -4F, 6F);
		lidRight.setTextureSize(128, 64);
		lidRight.mirror = true;
		setRotation(lidRight, 0F, 0F, 0F);
		
		lidTop = new ModelRenderer(this, 64, 21);
		lidTop.addBox(0F, 0F, -13F, 14, 1, 13);
		lidTop.setRotationPoint(-7F, -4F, 6F);
		lidTop.setTextureSize(128, 64);
		lidTop.mirror = true;
		setRotation(lidTop, 0F, 0F, 0F);
		
		hinge1 = new ModelRenderer(this, 0, 0);
		hinge1.addBox(1F, -1F, 0F, 3, 1, 1);
		hinge1.setRotationPoint(-6F, -2.5F, 5.5F);
		hinge1.setTextureSize(128, 64);
		hinge1.mirror = true;
		setRotation(hinge1, 0F, 0F, 0F);
		
		lidLeft = new ModelRenderer(this, 64, 0);
		lidLeft.addBox(0F, 1F, -12F, 1, 10, 11);
		lidLeft.setRotationPoint(-7F, -4F, 6F);
		lidLeft.setTextureSize(128, 64);
		lidLeft.mirror = true;
		setRotation(lidLeft, 0F, 0F, 0F);
		
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
		
		lidFrontR = new ModelRenderer(this, 56, 15);
		lidFrontR.addBox(11F, 2F, -13F, 3, 7, 1);
		lidFrontR.setRotationPoint(-7F, -4F, 6F);
		lidFrontR.setTextureSize(128, 64);
		lidFrontR.mirror = true;
		setRotation(lidFrontR, 0F, 0F, 0F);
		
		lidFrontT = new ModelRenderer(this, 88, 0);
		lidFrontT.addBox(0F, 1F, -13F, 14, 1, 1);
		lidFrontT.setRotationPoint(-7F, -4F, 6F);
		lidFrontT.setTextureSize(128, 64);
		lidFrontT.mirror = true;
		setRotation(lidFrontT, 0F, 0F, 0F);
		
		lidGlass = new ModelRenderer(this, 32, 45);
		lidGlass.addBox(3F, 2F, -12.5F, 8, 7, 1);
		lidGlass.setRotationPoint(-7F, -4F, 6F);
		lidGlass.setTextureSize(128, 64);
		lidGlass.mirror = true;
		setRotation(lidGlass, 0F, 0F, 0F);
		
		lidFrontL = new ModelRenderer(this, 56, 15);
		lidFrontL.addBox(0F, 2F, -13F, 3, 7, 1);
		lidFrontL.setRotationPoint(-7F, -4F, 6F);
		lidFrontL.setTextureSize(128, 64);
		lidFrontL.mirror = true;
		setRotation(lidFrontL, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
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
		lidFront.render(f5);
		frontPlate.render(f5);
		hinge2.render(f5);
		lidRight.render(f5);
		lidTop.render(f5);
		hinge1.render(f5);
		lidLeft.render(f5);
		keypad2.render(f5);
		keypad.render(f5);
		lidFrontR.render(f5);
		lidFrontT.render(f5);
		lidGlass.render(f5);
		lidFrontL.render(f5);
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
		lidFront.render(f5);
		frontPlate.render(f5);
		hinge2.render(f5);
		lidRight.render(f5);
		lidTop.render(f5);
		hinge1.render(f5);
		lidLeft.render(f5);
		keypad2.render(f5);
		keypad.render(f5);
		lidFrontR.render(f5);
		lidFrontT.render(f5);
		lidGlass.render(f5);
		lidFrontL.render(f5);
	}

	@Override
	public void render() {
		this.render(0.0625F);
	}
}