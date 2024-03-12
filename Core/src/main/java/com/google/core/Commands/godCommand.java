package com.google.core.Commands;

import jdk.internal.org.jline.reader.ParsedLine;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class godCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player);
        Player p = (Player) commandSender;
        if (p.isInvulnerable()){
            p.setInvulnerable(false);
            p.sendMessage(ChatColor.RED + "God Mode Is Disabled");
        }else{
            p.setInvulnerable(true);
            p.sendMessage(ChatColor.GREEN + "God Mode Is Enabled");
        }


        return false;
    }
}
