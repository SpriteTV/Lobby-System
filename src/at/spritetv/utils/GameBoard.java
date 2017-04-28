package at.spritetv.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.ScoreboardManager;

import at.SpriteTV.coreapi.coinssystem.CoinsManager;
import net.minecraft.server.v1_8_R3.Scoreboard;

public class GameBoard {

    @SuppressWarnings("deprecation")
    public static void loadOwnScoreboard(Player p) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        org.bukkit.scoreboard.Scoreboard board =  manager.getNewScoreboard();


        Objective obj = board.registerNewObjective("aaa", "bbb");
        obj.setDisplayName("§4Lobby");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.getScore(Bukkit.getOfflinePlayer("§8§m--------------§d")).setScore(4);
        obj.getScore(Bukkit.getOfflinePlayer("§cOnline: " + Bukkit.getOnlinePlayers().size())).setScore(3);
        obj.getScore(Bukkit.getOfflinePlayer("§8§m--------------§f")).setScore(2);
        obj.getScore(Bukkit.getOfflinePlayer("§bCoins:  " )).setScore(1);
        obj.getScore(Bukkit.getOfflinePlayer("§8§m--------------§a")).setScore(0);
    }
}
