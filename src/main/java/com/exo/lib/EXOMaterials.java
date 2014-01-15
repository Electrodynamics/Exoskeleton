package com.exo.lib;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraftforge.common.EnumHelper;

public enum EXOMaterials{
	INSTANCE;
	
	public static final EnumArmorMaterial ARMOUR_MATERIAL_EXO = EnumHelper.addArmorMaterial("exo", 10, new int[]{0, 0, 0, 0}, 0);
}