package at.spritetv.gatgets;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import at.spritetv.lobby.Main;
import at.spritetv.utils.ItemBuilder;

public class Gatgets implements Listener {

	Inventory inventory;
	Main main;

	public Gatgets(Main main) {
		this.main = main;
		onGadgets();
	}

	public void onGadgets() {
		


		
		inventory = Bukkit.createInventory(null, 9, "§bGadgets");

		
		inventory.setItem(0,LobbyChanger.getItem(368, 1, 0, "§b§lEnderperle"));
		inventory.setItem(1, LobbyChanger.getItem(401, 1, 0, "§b§lFeuerwerk"));
		inventory.setItem(2, LobbyChanger.getItem(346, 1, 0,"§b§lEnterhacken"));
		inventory.setItem(3, LobbyChanger.getItem(288, 1, 0,"§b§lFogelFlieger"));
		inventory.setItem(8, LobbyChanger.getItem(166, 1, 0, "§cKein Gadget ausgewählt"));

	}

	@EventHandler
	public void onGadgets1(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (e.getItem() != null && e.getItem().getType() == Material.CHEST) {
				p.openInventory(inventory);
				p.playSound(e.getPlayer().getLocation(), Sound.CHEST_OPEN, 1, 1);
				e.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if (e.getClickedInventory() != null && e.getClickedInventory().getName().equalsIgnoreCase("§bGadgets")) {
			Player p = (Player) e.getWhoClicked();
			if (e.getCurrentItem() != null && e.getCurrentItem().getType() != Material.AIR) {
				Material material = e.getCurrentItem().getType();
				if (material == Material.ENDER_PEARL) {
					p.getInventory().setItem(0,
							LobbyChanger.getItem(368, 1, 0, "§b§lEnderperle"));
				} else if (material == Material.FIREWORK) {
					p.getInventory().setItem(0, LobbyChanger.getItem(401, 1, 0, "§b§lFeuerwerk"));
				} else if (material == Material.FISHING_ROD) {
					p.getInventory().setItem(0,
							LobbyChanger.getItem(346, 1, 0,"§b§lEnterhacken"));
				} else if (material == Material.FEATHER) {
					p.getInventory().setItem(0, LobbyChanger.getItem(288, 1, 0,"§b§lFogelFlieger"));
				} else if (material == Material.BARRIER) {
					p.getInventory().setItem(0,
							LobbyChanger.getItem(166, 1, 0,"§cKein Gadget ausgewählt"));
				}else {
					p.sendMessage(Main.Prefix + "§cDieses Gadget funktioniert nicht!");
				}
				p.closeInventory();
				p.updateInventory();
				p.playSound(p.getLocation(), Sound.CHEST_CLOSE, 3, 1);
			}
		}
	}
}