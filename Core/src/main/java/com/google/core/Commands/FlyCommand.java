package com.google.core.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        if (p.getAllowFlight()){
            p.setAllowFlight(false);
            p.sendMessage(ChatColor.RED +"Fly has been disabled" );
        }else {
            p.setAllowFlight(true);
            p.sendMessage(ChatColor.GREEN + "Fly has been enabled");
        }

        return true;
    }
}
