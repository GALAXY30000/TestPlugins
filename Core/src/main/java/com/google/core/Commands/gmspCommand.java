package com.google.core.Commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmspCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        p.setGameMode(GameMode.SPECTATOR);
        p.sendMessage(ChatColor.LIGHT_PURPLE + "Your GameMode is Changed To Spectator");
        return false;
    }
}
