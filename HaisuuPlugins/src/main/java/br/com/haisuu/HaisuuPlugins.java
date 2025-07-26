package br.com.haisuu;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class HaisuuPlugins extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Oi, tudo bem? Plugin ligado!");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("Oi, tudo bem? Plugin desligado!");
    }
}
