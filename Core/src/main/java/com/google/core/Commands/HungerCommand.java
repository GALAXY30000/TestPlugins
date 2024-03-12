package com.google.core.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.io.Console;

public class HungerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof ConsoleCommandSender){
            commandSender.sendMessage("You aren't a player");
        }
        Player p = (Player) commandSender;
        p.setFoodLevel(20);

        return false;
    }
}
