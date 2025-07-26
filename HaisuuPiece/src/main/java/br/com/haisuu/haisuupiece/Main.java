package br.com.haisuu.haisuupiece;

import org.bukkit.plugin.java.JavaPlugin;

// Maven -> Lifecycle -> Package

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin inicializado com sucesso.");

        saveDefaultConfig();

        StaticCommand staticCommand = new StaticCommand(this);

        getCommand("discord").setExecutor(staticCommand);
        getCommand("textura").setExecutor(staticCommand);
        getCommand("site").setExecutor(staticCommand);

        getCommand("hp").setExecutor(new HPCommand(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin desabilitado com sucesso.");
    }
}