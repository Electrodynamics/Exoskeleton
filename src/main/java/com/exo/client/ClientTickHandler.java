package com.exo.client;

import java.util.EnumSet;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public final class ClientTickHandler implements ITickHandler{
	@Override
	public String getLabel() {
		return "EXO/Client-Tick";
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		
	}
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT, TickType.RENDER);
	}
}