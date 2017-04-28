package at.spritetv.lobby;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import at.spritetv.gatgets.*;
import at.spritetv.gatgets.PlayerHider;
import at.spritetv.listener.Listener;
import at.spritetv.listener.PremiumChat;
import at.spritetv.listener.*;


public class Main extends JavaPlugin {

	public static Main instance;
	public static String world = "world";
	public static String Prefix = "§7[§6Lobby§7] ";
	public static String noPerms = Prefix + "§c Du hast keine Rechte für diesen Command";
	public static File file = new File("plugins//Lobby//spawns.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	public static Location spawn;
	public static Location spawn1;
	public static Location spawn2;
	public static Location spawn3;
	public static Location spawn4;
	public static Location spawn5;
	public static Location spawn6;
	public static ArrayList<String> SilentLobby = new ArrayList();

	
	@Override
	public void onEnable() {
		instance = this;
		Bukkit.getPluginManager().registerEvents(new Gatgets(this), this);
		Bukkit.getPluginManager().registerEvents(new Listener(), this);
		
		Bukkit.getConsoleSender().sendMessage("§6---------- " + Prefix + " §6----------");
		Bukkit.getConsoleSender().sendMessage("§6-- Pluginauthor: SpriteTV --");
		Bukkit.getConsoleSender().sendMessage("§6-- Pluginstatus: §aAKTIVIERT §6--");
		Bukkit.getConsoleSender().sendMessage("§6-- Pluginversion: 1.0");
		Bukkit.getConsoleSender().sendMessage("§6---------- " + Prefix + " §6----------");
		
		Bukkit.getPluginManager().registerEvents(new PlayerHider(this), this);
		Bukkit.getPluginManager().registerEvents(new Navigator(this), this);
		Bukkit.getPluginManager().registerEvents(new EnterHaken(), this);
		Bukkit.getPluginManager().registerEvents(new SprungplatteListener(), this);
		Bukkit.getPluginManager().registerEvents(new SetSpawn(), this);
		Bukkit.getPluginManager().registerEvents(new LobbyChanger(), this);
	}

	@Override
	public void onDisable() {
		
		Bukkit.getConsoleSender().sendMessage("§6---------- " + Prefix + " §6----------");
		Bukkit.getConsoleSender().sendMessage("§6-- Pluginauthor: SpriteTV --");
		Bukkit.getConsoleSender().sendMessage("§6-- Pluginstatus: §cDEAKTIVIERT §6--");
		Bukkit.getConsoleSender().sendMessage("§6-- Pluginversion: 1.0");
		Bukkit.getConsoleSender().sendMessage("§6---------- " + Prefix + " §6----------");
		

	}

	
}
