package com.serverworld.worldex;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class worldex extends JavaPlugin{
    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {
        this.getCommand("kit").setExecutor(new CommandKit());
        getLogger().info(ChatColor.GREEN + "Hello word");
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

    }
}
