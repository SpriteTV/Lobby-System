package at.spritetv.utils;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import at.SpriteTV.coreapi.CoreAPI;
import at.spritetv.lobby.Main;

public class JoinUntil {

	public static void setJoinItems(Player p){
	    ItemStack compass = new ItemStack(Material.COMPASS);
	    ItemMeta cm = compass.getItemMeta();
	    cm.setDisplayName("§eNavigator §7(Rechtsklick)");
	    compass.setItemMeta(cm);
	    
	    ItemStack spielerverstecken = new ItemStack(Material.BLAZE_ROD);
	    ItemMeta sv = spielerverstecken.getItemMeta();
	    sv.setDisplayName("§aSpieler-Verstecken §7(Rechtsklick)");
	    spielerverstecken.setItemMeta(sv);
	    
	    ItemStack lobbyswitch = new ItemStack(Material.NETHER_STAR);
	    ItemMeta ls = lobbyswitch.getItemMeta();
	    ls.setDisplayName("§cLobby-Switcher §7(Rechtsklick)");
	    lobbyswitch.setItemMeta(ls);
	    
	    ItemStack gadgets = new ItemStack(Material.CHEST);
	    ItemMeta gm = gadgets.getItemMeta();
	    gm.setDisplayName("§bGadgets §7(Rechtsklick)");
	    gadgets.setItemMeta(gm);
	    
	    ItemStack nick = new ItemStack(Material.NAME_TAG);
	    ItemMeta n = nick.getItemMeta();
	    n.setDisplayName("§6Nick §7(Rechtsklick)");
	    nick.setItemMeta(n);
	    
	    ItemStack sl = new ItemStack(Material.TNT);
	    ItemMeta s = nick.getItemMeta();
	    s.setDisplayName("§6SilentLobby §7(Rechtsklick)");
	    sl.setItemMeta(s);
	    
	    ItemStack Silent = new ItemStack(Material.TNT);
	    ItemMeta SSilent = Silent.getItemMeta();
	    SSilent.setDisplayName("§5Silent Lobby §8<Rechtsklick>");
	    Silent.setItemMeta(SSilent);
	    
	    ItemStack gadget = new ItemStack(Material.BARRIER);
	    ItemMeta gadgetn= nick.getItemMeta();
	    gadgetn.setDisplayName("§cKein Gadget ausgewählt");
	    gadget.setItemMeta(gadgetn);
	    
	    
	    if(p.hasPermission("lobby.vip")){
	    	GameBoard.loadOwnScoreboard(p);
	    p.getInventory().clear();
		p.getInventory().setItem(3, Silent);
	    p.getInventory().setItem(5, nick);
	    p.getInventory().setItem(4, compass);
	    p.getInventory().setItem(1, spielerverstecken);
	    p.getInventory().setItem(7, lobbyswitch);
	    p.getInventory().setItem(0, gadget);
	    p.getInventory().setItem(8, gadgets);
	    p.updateInventory();
	    p.teleport(Main.spawn);
	    }else {
		    p.getInventory().clear();
		    p.getInventory().setItem(4, compass);
		    p.getInventory().setItem(1, spielerverstecken);
		    p.getInventory().setItem(7, lobbyswitch);
		    p.getInventory().setItem(0, gadget);
		    p.getInventory().setItem(8, gadgets);
		    p.updateInventory();
		    p.teleport(Main.spawn);

	    

		
		
		
	    }
	}
}



