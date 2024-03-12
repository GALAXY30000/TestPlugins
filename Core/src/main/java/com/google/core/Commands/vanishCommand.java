package com.google.core.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class vanishCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
       if (p.isInvisible()) {
           p.setInvisible(false);
           p.sendMessage(ChatColor.YELLOW + "You are now visible");
       }else{
           p.setInvisible(true);
           p.sendMessage(ChatColor.YELLOW + "You Are Now Invisible");
       }
                  return true;
    }
}
