package com.google.core;

import com.google.core.Commands.*;
import com.google.core.Listener.JoinLeaveListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
    getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
    getCommand("fly").setExecutor(new FlyCommand());
    getCommand("gma").setExecutor(new gmaCommand());
    getCommand("gmsp").setExecutor(new gmspCommand());
    getCommand("gmc").setExecutor(new gmcCommand());
    getCommand("gms").setExecutor(new gmsCommand());
    getCommand("feed").setExecutor(new HungerCommand());
    getCommand("die").setExecutor(new DieCommand());
    getCommand("vanish").setExecutor(new vanishCommand());
    getCommand("godmode").setExecutor(new godCommand());
    getCommand("vanish").setExecutor(new vanishCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}