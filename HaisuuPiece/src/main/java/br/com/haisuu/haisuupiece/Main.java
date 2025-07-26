package br.com.haisuu.haisuupiece;

import org.bukkit.plugin.java.JavaPlugin;

import static br.com.haisuu.haisuupiece.Console.consoleMessage;

// Maven -> Lifecycle -> Package

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        consoleMessage("Plugin inicializado com sucesso.");
        getCommand("textura").setExecutor(new TexturaCommand());
    }

    @Override
    public void onDisable() {
        consoleMessage("Plugin desabilitado com sucesso.");
    }
}