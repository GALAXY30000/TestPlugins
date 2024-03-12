package com.google.core.Listener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import static net.md_5.bungee.api.ChatColor.translateAlternateColorCodes;

public class JoinLeaveListener implements Listener {


    @EventHandler
    public void onPLayerLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN +  "  Has left the server");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        e.setJoinMessage (ChatColor.AQUA + player.getDisplayName()  +  ChatColor.GOLD +  "  Jonied The server");

    }
}
