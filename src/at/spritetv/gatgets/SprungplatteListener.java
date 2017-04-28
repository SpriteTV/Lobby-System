package at.spritetv.gatgets;


import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class SprungplatteListener
  implements Listener
{
  @EventHandler
  public void onInteractEvent(PlayerMoveEvent e)
  {

    
    if (e.getPlayer().getLocation().getBlock().getType() == Material.STONE_PLATE) {
      Vector v = e.getPlayer().getLocation().getDirection().multiply(6D).setY(1D);
      e.getPlayer().setVelocity(v);
      e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ENDERDRAGON_WINGS, 3, 2);
      
    }
  }
}
