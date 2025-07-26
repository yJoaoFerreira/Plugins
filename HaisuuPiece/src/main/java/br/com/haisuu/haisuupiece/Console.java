package br.com.haisuu.haisuupiece;

import org.bukkit.Bukkit;

public class Console {

    public static void consoleMessage(String text) {
        Bukkit.getConsoleSender().sendMessage("§b[HaisuuPiece] §r" + text);
    }
}