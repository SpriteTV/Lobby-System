package at.spritetv.gatgets;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.apache.logging.log4j.core.net.DatagramOutputStream;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import at.spritetv.lobby.Main;

public class LobbyChanger implements Listener{

	@EventHandler
	public void on(PlayerInteractEvent e){
		Player p = e.getPlayer();
		e.setCancelled(true);
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
		if(p.getItemInHand().getType() == Material.NETHER_STAR){
			Inventory inv = Bukkit.createInventory(null, 18 , "Wechelt die Lobby");
			
			ItemStack Server = new ItemStack(Material.SUGAR);
			ItemMeta ServerMeta = Server.getItemMeta();
			ServerMeta.setDisplayName("");
			
			inv.setItem(0, getItem(160, 1, 5, ""));
			inv.setItem(1, getItem(160, 1, 5, ""));
			inv.setItem(2, getItem(160, 1, 5, ""));
			inv.setItem(3, getItem(160, 1, 5, ""));
			inv.setItem(4, getItem(399, 1, 0, "§6Premium Lobby"));
			inv.setItem(5, getItem(160, 1, 5, ""));
			inv.setItem(6, getItem(160, 1, 5, ""));
			inv.setItem(7, getItem(160, 1, 5, ""));
			inv.setItem(8, getItem(160, 1, 5, ""));
			inv.setItem(9, getItem(160, 1, 5, ""));
			inv.setItem(10, getItem(348, 1, 0, "§cLobby 1"));
			inv.setItem(11, getItem(160, 1, 5, ""));
			inv.setItem(12, getItem(331, 1, 0, "§cLobby 2"));
			inv.setItem(13, getItem(160, 1, 5, ""));
			inv.setItem(14, getItem(331, 1, 0, "§cLobby 3"));
			inv.setItem(15, getItem(160, 1, 5, ""));
			inv.setItem(16, getItem(331, 1, 0, "§cLobby 4"));
			inv.setItem(17, getItem(160, 1, 5, ""));
			
			p.openInventory(inv);
		}
	}				
}
	public void conect(Player p,String servername){
	 ByteArrayOutputStream b = new ByteArrayOutputStream();
		DataOutputStream out = new DataOutputStream(b);

		try {
			out.writeUTF("Connect");
			out.writeUTF(servername);
		}catch (IOException e){
			e.printStackTrace();
		}
		p.sendPluginMessage(Main.instance,"BungeeCord", b.toByteArray());
	}
	
	@EventHandler
	public void on(InventoryClickEvent e){
		
		e.setCancelled(true);
		Player p = (Player) e.getWhoClicked();
		if(e.getInventory().getName().contains("Wechsel")){
			if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§cLobby 1")){
				conect(p, "Lobby1");
			}
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§cLobby 2")){
				conect(p, "Lobby2");
			}
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§cLobby 3")){
				conect(p, "Lobby3");
			}
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§cLobby 4")){
				conect(p, "Lobby4");
			}
			
			if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§cPermium Lobby")){
				conect(p, "lobby5");
			}
		}
	}
	public static ItemStack getItem(int id,int anzahl,int s,String name){
		ItemStack item = new ItemStack(id,anzahl,(short)s);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(name);
		item.setItemMeta(meta);
		return item;
	}
	
	
}
