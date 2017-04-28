package at.spritetv.gatgets;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitScheduler;

import at.spritetv.lobby.Main;

public class Navigator
  implements Listener
{
  static ArrayList<Player> incd = new ArrayList();
  static int cd;
  static int cdc;
  private Main pl;
  
  public Navigator(Main Main)
  {
    this.pl = Main;
  }
  
  @EventHandler
  public void onInteract(PlayerInteractEvent e)
  {
    e.setCancelled(true);
    final Player p = e.getPlayer();
    try
    {
      if (e.getItem().getType() == Material.COMPASS) {
        if (incd.isEmpty())
        {
          if (!Bukkit.getScheduler().isCurrentlyRunning(cd))
          {
            incd.add(p);
            cdc = 0;
            final Inventory inv = Bukkit.createInventory(null, 27, "§6Navigator §7(Rechtsklick)");
            final ItemStack a = new ItemStack(Material.EXP_BOTTLE);
            ItemMeta am = a.getItemMeta();
            am.setDisplayName("§aEvent");
            a.setItemMeta(am);
            
            final ItemStack a1 = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta am1 = a1.getItemMeta();
            am1.setDisplayName("§3SkyPvP");
            a1.setItemMeta(am1);
            
            final ItemStack a2 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
            ItemMeta am2 = a2.getItemMeta();
            am2.setDisplayName("§eQSG");
            a2.setItemMeta(am2);
            
            final ItemStack a3 = new ItemStack(Material.ENDER_PEARL);
            ItemMeta am3 = a3.getItemMeta();
            am3.setDisplayName("§cComming Soon...");
            a3.setItemMeta(am3);
            
            final ItemStack a4 = new ItemStack(Material.BED);
            ItemMeta am4 = a4.getItemMeta();
            am4.setDisplayName("§6BedWars");
            a4.setItemMeta(am4);
            
            final ItemStack a5 = new ItemStack(Material.FISHING_ROD);
            ItemMeta am5 = a5.getItemMeta();
            am5.setDisplayName("§b1vs1");
            a5.setItemMeta(am5);
            
            final ItemStack a51 = new ItemStack(Material.MAGMA_CREAM);
            ItemMeta am51 = a51.getItemMeta();
            am51.setDisplayName("§6Spawn");
            a51.setItemMeta(am51);
            e.setCancelled(true);
            p.openInventory(inv);
            
            cd = Bukkit.getScheduler().scheduleSyncRepeatingTask(this.pl, new Runnable()
            {
              public void run()
              {
                Navigator.cdc += 1;
                p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 1.0F);
                if (Navigator.cdc == 1)
                {
                  inv.setItem(9, a4);
                  return;
                }
                if (Navigator.cdc == 2)
                {
                  inv.setItem(9, null);
                  inv.setItem(10, a4);
                  inv.setItem(0, a5);
                  inv.setItem(18, a5);
                  return;
                }
                if (Navigator.cdc == 3)
                {
                  inv.setItem(10, null);
                  inv.setItem(0, null);
                  inv.setItem(18, null);
                  inv.setItem(11, a4);
                  inv.setItem(1, a5);
                  inv.setItem(19, a3);
                  inv.setItem(9, a51);
                  return;
                }
                if (Navigator.cdc == 4)
                {
                  inv.setItem(12, null);
                  inv.setItem(2, null);
                  inv.setItem(20, null);
                  inv.setItem(10, null);
                  inv.setItem(12, a4);
                  inv.setItem(2, a5);
                  inv.setItem(20, a3);
                  inv.setItem(10, a51);
                  inv.setItem(0, a);
                  inv.setItem(18, a2);
                  return;
                }
                if (Navigator.cdc == 5)
                {
                  inv.setItem(12, null);
                  inv.setItem(2, null);
                  inv.setItem(20, null);
                  inv.setItem(10, null);
                  inv.setItem(0, null);
                  inv.setItem(18, null);
                  inv.setItem(13, a4);
                  inv.setItem(3, a5);
                  inv.setItem(21, a3);
                  inv.setItem(11, a51);
                  inv.setItem(1, a);
                  inv.setItem(19, a2);
                  inv.setItem(9, a1);
                  return;
                }
                if (Navigator.cdc == 6)
                {
                  inv.setItem(13, null);
                  inv.setItem(3, null);
                  inv.setItem(21, null);
                  inv.setItem(11, null);
                  inv.setItem(1, null);
                  inv.setItem(19, null);
                  inv.setItem(9, null);
                  inv.setItem(14, a4);
                  inv.setItem(4, a5);
                  inv.setItem(22, a3);
                  inv.setItem(12, a51);
                  inv.setItem(2, a);
                  inv.setItem(20, a2);
                  inv.setItem(10, a1);
                  return;
                }
                if (Navigator.cdc == 7)
                {
                  inv.setItem(14, null);
                  inv.setItem(4, null);
                  inv.setItem(22, null);
                  inv.setItem(12, null);
                  inv.setItem(2, null);
                  inv.setItem(20, null);
                  inv.setItem(10, null);
                  inv.setItem(15, a4);
                  inv.setItem(5, a5);
                  inv.setItem(23, a3);
                  inv.setItem(13, a51);
                  inv.setItem(3, a);
                  inv.setItem(21, a2);
                  inv.setItem(11, a1);
                  Bukkit.getScheduler().cancelTask(Navigator.cd);
                  Navigator.incd.clear();
                }
                if (Navigator.cdc == 8)
                {
                  Bukkit.getScheduler().cancelTask(Navigator.cd);
                  Navigator.incd.clear();
                }
              }
            }, 1L, 1L);
          }
          else
          {
            Bukkit.getScheduler().cancelTask(cd);
            p.sendMessage(Main.Prefix + "§cEs ist ein Fehler aufgetreten! Bitte §ffne den Navigator erneut!");
            p.closeInventory();
          }
        }
        else {
          p.sendMessage(Main.Prefix + "§cZu viele Spieler verwenden den Navigator gleichzeitig, bitte warte einen Moment!");
        }
      }
    }
    catch (Exception localException) {}
  }
  
  @EventHandler
  public void onClick(InventoryClickEvent e)
  {
    Player p = (Player)e.getWhoClicked();
    if (e.getInventory().getName().equalsIgnoreCase("§6Navigator §7(Rechtsklick)"))
    {
      if (e.getCurrentItem().getType() == Material.EXP_BOTTLE)
      {
        p.teleport(Main.spawn1);
        p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
        p.sendMessage(Main.Prefix + "§7Du hast dich zum §eEvent §7teleportiert!");
        p.closeInventory();
      }
      if (e.getCurrentItem().getType() == Material.FISHING_ROD)
      {
        p.teleport(Main.spawn2);
        p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
        p.sendMessage(Main.Prefix + "§7Du hast dich zu §e1vs1 §7teleportiert!");
        p.closeInventory();
      }
      if (e.getCurrentItem().getType() == Material.DIAMOND_SWORD)
      {
        p.teleport(Main.spawn3);
        p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
        p.sendMessage(Main.Prefix + "§7Du hast dich zu §eSkyPvP §7teleportiert!");
        p.closeInventory();
      }
      if (e.getCurrentItem().getType() == Material.BED)
      {
        p.teleport(Main.spawn4);
        p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
        p.sendMessage(Main.Prefix + "§7Du hast dich zu §eBedWars §7teleportiert!");
        p.closeInventory();
      }
      if (e.getCurrentItem().getType() == Material.CHAINMAIL_CHESTPLATE)
      {
        p.teleport(Main.spawn5);
        p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
        p.sendMessage(Main.Prefix + "§7Du hast dich zu §eQSG §7teleportiert!");
        p.closeInventory();
      }
      if (e.getCurrentItem().getType() == Material.ENDER_PEARL)
      {
        p.teleport(Main.spawn6);
        p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
        p.sendMessage(Main.Prefix + "§cDieser Spielmodus ist bislang nicht verf§gbar!");
        p.closeInventory();
      }
      if (e.getCurrentItem().getType() == Material.MAGMA_CREAM)
      {
        p.teleport(Main.spawn);
        p.playSound(p.getLocation(), Sound.NOTE_BASS, 1.0F, 1.0F);
        p.sendMessage(Main.Prefix + "§7Du hast dich zum §eSpawn §7teleportiert!");
        p.closeInventory();
      }
    }
  }
}
