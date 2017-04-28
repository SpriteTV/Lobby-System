package at.spritetv.gatgets;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import at.spritetv.lobby.Main;

public class SilentLobby implements Listener{

	public void on(PlayerInteractEvent e){
		
		Player p = e.getPlayer();
		e.setCancelled(true);
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
			if(p.getItemInHand().getType() == Material.TNT){
				p.sendMessage("§eDu bist nun in der SilentLobby");
			
					 ByteArrayOutputStream b = new ByteArrayOutputStream();
						DataOutputStream out = new DataOutputStream(b);

						try {
							out.writeUTF("Connect");
							out.writeUTF("SilentLobby");
						}catch (IOException ex){
							ex.printStackTrace();
						}
						p.sendPluginMessage(Main.instance,"BungeeCord", b.toByteArray());
					}
						
			}
		}
		
	}
	

