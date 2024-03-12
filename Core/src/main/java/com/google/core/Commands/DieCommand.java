package com.google.core.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DieCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (!(commandSender instanceof Player));
        Player p = (Player) commandSender;
        p.setHealth(0.0);
        return false;
    }
}
