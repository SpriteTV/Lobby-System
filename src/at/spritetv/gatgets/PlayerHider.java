package at.spritetv.gatgets;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;
import org.bukkit.event.player.PlayerPreLoginEvent;
import org.bukkit.plugin.Plugin;

import at.spritetv.lobby.Main;


public class PlayerHider implements Listener{

        public static Main plugin;
       
        public PlayerHider(Main plugin){
                this.plugin = plugin;
        }
       
       
        ArrayList<String> HideShow = new ArrayList<String>();
 
        @EventHandler
        public void onInteract(PlayerInteractEvent event){
                Player player = (Player)event.getPlayer();
                if(player.getItemInHand().getType() == Material.BLAZE_ROD){
                        if(HideShow.contains(player.getName())){
                                HideShow.remove(player.getName());
                                for(Player players : Bukkit.getOnlinePlayers()){
                                        player.showPlayer(players);
                                }
                                player.sendMessage(plugin.Prefix + "Alle Spieler sind nun sichtbar!");
                        }else{
                                HideShow.add(player.getName());
                                for(Player players : Bukkit.getOnlinePlayers()){
                                        player.hidePlayer(players);
                                }
                                player.sendMessage(plugin.Prefix + "Alle Spieler sind nun unsichtbar!");
                        }
                }
        }
       
       
       

               
       
        
        @EventHandler
        public void onJoin(PlayerJoinEvent event){
                Player player = (Player)event.getPlayer();
               
                event.setJoinMessage("");
               
                for(Player players : Bukkit.getOnlinePlayers()){
                        if(HideShow.contains(players.getName())){
                                players.hidePlayer(player);
                        }else{
                                player.sendMessage("");
                        }
                        }
               
        }
       
       
}
