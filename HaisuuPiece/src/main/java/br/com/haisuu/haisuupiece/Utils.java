package br.com.haisuu.haisuupiece;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

public class Utils {
    public static String getPrefix(JavaPlugin plugin) {
        String raw = plugin.getConfig().getString("prefix", "&b&l[HaisuuPiece]&r ");
        return ChatColor.translateAlternateColorCodes('&', raw);
    }
}