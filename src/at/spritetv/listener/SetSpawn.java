package at.spritetv.listener;

import java.io.IOException;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import at.spritetv.lobby.Main;

public class SetSpawn implements Listener
{
	  @EventHandler
	  public void onPlayer(PlayerCommandPreprocessEvent e)
	  {
	    Player p = e.getPlayer();
	    if (p.hasPermission("lobby.admin"))
	    {
	      if (e.getMessage().equalsIgnoreCase("/setspawn"))
	    	
	      {
	        Location loc = p.getLocation();
	        Main.cfg.set("Spawn.X", Double.valueOf(loc.getX()));
	        Main.cfg.set("Spawn.Y", Double.valueOf(loc.getY()));
	        Main.cfg.set("Spawn.Z", Double.valueOf(loc.getZ()));
	        Main.cfg.set("Spawn.Yaw", Float.valueOf(loc.getYaw()));
	        Main.cfg.set("Spawn.Pitch", Float.valueOf(loc.getPitch()));
	        Main.cfg.set("Spawn.WeltName", loc.getWorld().getName());
	        try
	        {
	          Main.cfg.save(Main.file);
	        }
	        catch (IOException e1)
	        {
	          e1.printStackTrace();
	        }
	        Main.spawn = loc;
	        p.sendMessage(Main.Prefix + "§6Du hast den Spawn für die Lobby gesetzt!");
	      }
	      if (e.getMessage().equalsIgnoreCase("/setspawn 1"))
	      {
	        Location loc = p.getLocation();
	        Main.cfg.set("1.X", Double.valueOf(loc.getX()));
	        Main.cfg.set("1.Y", Double.valueOf(loc.getY()));
	        Main.cfg.set("1.Z", Double.valueOf(loc.getZ()));
	        Main.cfg.set("1.Yaw", Float.valueOf(loc.getYaw()));
	        Main.cfg.set("1.Pitch", Float.valueOf(loc.getPitch()));
	        Main.cfg.set("1.WeltName", loc.getWorld().getName());
	        try
	        {
	          Main.cfg.save(Main.file);
	        }
	        catch (IOException e1)
	        {
	          e1.printStackTrace();
	        }
	        Main.spawn1 = loc;
	        p.sendMessage(Main.Prefix + "§6Du hast den Spawn für 1 gesetzt!");
	      }
	      if (e.getMessage().equalsIgnoreCase("/setspawn 2"))
	      {
	        Location loc = p.getLocation();
	        Main.cfg.set("2.X", Double.valueOf(loc.getX()));
	        Main.cfg.set("2.Y", Double.valueOf(loc.getY()));
	        Main.cfg.set("2.Z", Double.valueOf(loc.getZ()));
	        Main.cfg.set("2.Yaw", Float.valueOf(loc.getYaw()));
	        Main.cfg.set("2.Pitch", Float.valueOf(loc.getPitch()));
	        Main.cfg.set("2.WeltName", loc.getWorld().getName());
	        try
	        {
	          Main.cfg.save(Main.file);
	        }
	        catch (IOException e1)
	        {
	          e1.printStackTrace();
	        }
	        Main.spawn2 = loc;
	        p.sendMessage(Main.Prefix + "§6Du hast den Spawn für 2 gesetzt!");
	      }
	      if (e.getMessage().equalsIgnoreCase("/setspawn 3"))
	      {
	        Location loc = p.getLocation();
	        Main.cfg.set("3.X", Double.valueOf(loc.getX()));
	        Main.cfg.set("3.Y", Double.valueOf(loc.getY()));
	        Main.cfg.set("3.Z", Double.valueOf(loc.getZ()));
	        Main.cfg.set("3.Yaw", Float.valueOf(loc.getYaw()));
	        Main.cfg.set("3.Pitch", Float.valueOf(loc.getPitch()));
	        Main.cfg.set("3.WeltName", loc.getWorld().getName());
	        try
	        {
	          Main.cfg.save(Main.file);
	        }
	        catch (IOException e1)
	        {
	          e1.printStackTrace();
	        }
	        Main.spawn3 = loc;
	        p.sendMessage(Main.Prefix + "§6Du hast den Spawn für 3 gesetzt!");
	      }
	      if (e.getMessage().equalsIgnoreCase("/setspawn 4"))
	      {
	        Location loc = p.getLocation();
	        Main.cfg.set("4.X", Double.valueOf(loc.getX()));
	        Main.cfg.set("4.Y", Double.valueOf(loc.getY()));
	        Main.cfg.set("4.Z", Double.valueOf(loc.getZ()));
	        Main.cfg.set("4.Yaw", Float.valueOf(loc.getYaw()));
	        Main.cfg.set("4.Pitch", Float.valueOf(loc.getPitch()));
	        Main.cfg.set("4.WeltName", loc.getWorld().getName());
	        try
	        {
	          Main.cfg.save(Main.file);
	        }
	        catch (IOException e1)
	        {
	          e1.printStackTrace();
	        }
	        Main.spawn4 = loc;
	        p.sendMessage(Main.Prefix + "§6Du hast den Spawn für 4 gesetzt!");
	      }
	      if (e.getMessage().equalsIgnoreCase("/setspawn 5"))
	      {
	        Location loc = p.getLocation();
	        Main.cfg.set("5.X", Double.valueOf(loc.getX()));
	        Main.cfg.set("5.Y", Double.valueOf(loc.getY()));
	        Main.cfg.set("5.Z", Double.valueOf(loc.getZ()));
	        Main.cfg.set("5.Yaw", Float.valueOf(loc.getYaw()));
	        Main.cfg.set("5.Pitch", Float.valueOf(loc.getPitch()));
	        Main.cfg.set("5.WeltName", loc.getWorld().getName());
	        try
	        {
	          Main.cfg.save(Main.file);
	        }
	        catch (IOException e1)
	        {
	          e1.printStackTrace();
	        }
	        Main.spawn5 = loc;
	        p.sendMessage(Main.Prefix + "§6Du hast den Spawn für 5 gesetzt!");
	      }
	      if (e.getMessage().equalsIgnoreCase("/setspawn 6"))
	      {
	        Location loc = p.getLocation();
	        Main.cfg.set("6.X", Double.valueOf(loc.getX()));
	        Main.cfg.set("6.Y", Double.valueOf(loc.getY()));
	        Main.cfg.set("6.Z", Double.valueOf(loc.getZ()));
	        Main.cfg.set("6.Yaw", Float.valueOf(loc.getYaw()));
	        Main.cfg.set("6.Pitch", Float.valueOf(loc.getPitch()));
	        Main.cfg.set("6.WeltName", loc.getWorld().getName());
	        try
	        {
	          Main.cfg.save(Main.file);
	        }
	        catch (IOException e1)
	        {
	          e1.printStackTrace();
	        }
	        Main.spawn6 = loc;
	        p.sendMessage(Main.Prefix + "§6Du hast den Spawn für 6 gesetzt!");
	      }
	    }
	  }
	}
