package br.com.haisuu.haisuupiece;

import org.bukkit.Bukkit;

public class Console {

    public static void consoleMessage(String text) {

        String prefix = "§b§l[HaisuuPiece]§r ";

        Bukkit.getConsoleSender().sendMessage(prefix + text);
    }
}