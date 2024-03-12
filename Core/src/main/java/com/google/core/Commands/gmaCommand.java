package com.google.core.Commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmaCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player);
        Player p = (Player) commandSender;
        p.setGameMode(GameMode.ADVENTURE);
        p.sendMessage(ChatColor.LIGHT_PURPLE + "Your GameMode is Changed Adventure");


        return false;
    }
}
