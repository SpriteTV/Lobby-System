package at.spritetv.listener;

import javax.swing.text.html.parser.Entity;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

import at.spritetv.lobby.Main;
import at.spritetv.utils.JoinUntil;

public class Listener implements org.bukkit.event.Listener{
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		e.setJoinMessage(null);
		JoinUntil.setJoinItems(p);
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		Player p = e.getPlayer();
		e.setQuitMessage(null);
	}
	
	
	@EventHandler
	public void onFood(FoodLevelChangeEvent e){

		e.setCancelled(true);
	}
	@EventHandler
	public void onBlock(BlockPlaceEvent e){
		Player p = e.getPlayer();
		
		
		if(p.hasPermission("lobby.admin") || p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
		}else{
			e.setCancelled(true);
		}
		
	}
	
	@EventHandler
	public void onBreak(BlockBreakEvent e){
		
		Player p = e.getPlayer();
		
		if(p.hasPermission("lobby.admin") || p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
		}else{
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onItem(PlayerPickupItemEvent e){
		
		Player p = e.getPlayer();
		
		if(!p.hasPermission("lobby.admin") || p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
		}else{
			e.setCancelled(true);
		}	
	}
	
	@EventHandler
	public void onDrop(PlayerDropItemEvent e){
		Player p = e.getPlayer();
		
		if(!p.hasPermission("lobby.admin") || p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
		}else{
			e.setCancelled(true);
		}
	}
	
/*	@EventHandler
	public void onClick(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		Location loc = p.getLocation();
		
		if(p.hasPermission("lobby.admin") || p.getGameMode() == GameMode.CREATIVE){
			e.setCancelled(false);
			p.playSound(loc, Sound.CLICK,1F, 1F);
		}
	}
*/
	@EventHandler
	public void onDamage1(EntityDamageByEntityEvent e){
		e.setCancelled(true);
	}
	
	@EventHandler
	public void onDamage(EntityDamageEvent e){
		e.setCancelled(true);
	}
	
	@EventHandler
	public void onWeather(WeatherChangeEvent e)  {
		if(e.toWeatherState() && e.getWorld().getName().equals(Main.world))  {
			e.setCancelled(true);
		}
	}

}