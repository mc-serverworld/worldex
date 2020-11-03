package com.serverworld.worldex;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        event.getPlayer().sendMessage(ChatColor.YELLOW + "HOLL:: plaer");
    }

    static void downloadNet(String surl, String filename) throws MalformedURLException {
        int bytesum = 0;
        int byteread = 0;
        URL url = new URL(surl);
        try {
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
            FileOutputStream fs = new FileOutputStream("C:/test/" + filename);
            byte[] buffer = new byte[4096];
            int length;
            while ((byteread = inStream.read(buffer)) != -1) {
                bytesum = byteread;
                fs.write(buffer, 0, byteread);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}