package at.spritetv.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import ru.tehkode.permissions.bukkit.PermissionsEx;

public class PremiumChat implements Listener{
	
	
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();

        if (PermissionsEx.getUser(p).inGroup("Leitung")) {
            e.setFormat("§4Leitung §8● §4" + p.getName() + " §7⤷ " + e.getMessage());
        } else if(PermissionsEx.getUser(p).inGroup("Admin")) {
            e.setFormat("§cAdministrator §8● §c" + p.getName() + " §c⤷ " + e.getMessage());
            } else if (PermissionsEx.getUser(p).inGroup("Moderator")) {
            e.setFormat("§cMod §8● §c" + p.getName() + " §c⤷ " + e.getMessage());
            } else if (PermissionsEx.getUser(p).inGroup("JrModerator")) {
            e.setFormat("§cJrMod §8● §c" + p.getName() + " §c⤷ " + e.getMessage());
            } else if (PermissionsEx.getUser(p).inGroup("Developer")) {
            e.setFormat("§bDeveloper §8● §b" + p.getName() + " §b⤷ " + e.getMessage());
            }else if (PermissionsEx.getUser(p).inGroup("JrDeveloper")) {
            e.setFormat("§bJrDeveloper §8● §b" + p.getName() + " §b⤷ " + e.getMessage());
            }else if (PermissionsEx.getUser(p).inGroup("Supporter")) {
            e.setFormat("§eSupporter §8● §e" + p.getName() + " §e⤷ " + e.getMessage());
            }else  if (PermissionsEx.getUser(p).inGroup("JrSupporter")) {
            e.setFormat("§eJrSupporter §8● §e" + p.getName() + " §e⤷ " + e.getMessage());
            }else  if (PermissionsEx.getUser(p).inGroup("Builder")) {
            e.setFormat("§2Builder §8● §2" + p.getName() + " §2⤷" + e.getMessage());
            }else  if (PermissionsEx.getUser(p).inGroup("JrBuilder")) {
            e.setFormat("§2JrBuilder §8● §2" + p.getName() + " §2⤷ " + e.getMessage());
            }else  if (PermissionsEx.getUser(p).inGroup("Master")) {
            e.setFormat("§6Master §8● §6" + p.getName() + " §6⤷ " + e.getMessage());
            }else  if (PermissionsEx.getUser(p).inGroup("Diamond")) {
            e.setFormat("§3Diamond §8● §3" + p.getName() + " §3⤷" + e.getMessage());
            }else  if (PermissionsEx.getUser(p).inGroup("Youtuber")) {
            e.setFormat("§5Youtuber §8● §5" + p.getName() + " §5" + e.getMessage());
            }else {
            e.setFormat("§7" + p.getName() + " §7⤷  " + e.getMessage());
                        }

    }
    
                    }
                
            
        
    