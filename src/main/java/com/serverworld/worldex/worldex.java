package com.serverworld.worldex;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class worldex extends JavaPlugin{
    @Override
    public void onLoad() {

    }

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.GREEN + "Hello world");
    }
}
