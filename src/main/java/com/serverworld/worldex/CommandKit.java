package com.serverworld.worldex;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CommandKit implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
      sender.sendMessage("測試");
      try {
          downloadNet(args[0],"sdad.jar");
      }catch (Exception E){

      }

        return false;

    }

    static void downloadNet(String surl,String filename) throws MalformedURLException {
        int bytesum = 0;
        int byteread = 0;
        URL url = new URL(surl);
        try {
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
            FileOutputStream fs = new FileOutputStream("C:/test/" +filename);
            byte[] buffer = new byte[4096];
            int length;
            while ((byteread = inStream.read(buffer)) != -1) {
                bytesum  = byteread;
                fs.write(buffer, 0, byteread);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}