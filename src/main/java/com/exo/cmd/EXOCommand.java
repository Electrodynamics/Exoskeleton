package com.exo.cmd;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatMessageComponent;

import com.exo.Exoskeleton;

import cpw.mods.fml.common.Mod;

public class EXOCommand extends CommandBase{
	@Override
	public String getCommandName() {
		return "exo";
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return "/exo help";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		if(args[0].equalsIgnoreCase("-help")){
			sendText(sender, "Current switches are:");
			sendText(sender, "       -help");
			sendText(sender, "       -version");
		} else if(args[0].equalsIgnoreCase("-version")){
			sendText(sender, String.format("Current Exoskeleton version is %s", Exoskeleton.class.getAnnotation(Mod.class).version()));
		}
	}
	
	private void sendText(ICommandSender sender, String text){
		sender.sendChatToPlayer(ChatMessageComponent.createFromText(text));
	}

	@Override
	public int compareTo(Object arg0){
		return 0;
	}
}