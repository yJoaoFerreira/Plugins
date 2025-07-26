package me.haisuu.eventos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Eventos extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + this.getName() + " iniciado com sucesso!");

        Bukkit.getPluginManager().registerEvents(new QuebraBloco(), this);
    }
}
