package br.com.haisuu.haisuupiece;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class StaticCommand implements CommandExecutor {

    private final Main plugin;

    public StaticCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        FileConfiguration config = plugin.getConfig();

        if (!sender.hasPermission("hp.basic")) {
            sender.sendMessage(Utils.getPrefix(plugin) + "§cVocê não tem permissão para isso.");
            return true;
        }

        String messagePath;
        switch (cmd.getName().toLowerCase()) {
            case "discord":
                messagePath = "messages.discord";
                break;
            case "textura":
                messagePath = "messages.textura";
                break;
            case "site":
                messagePath = "messages.site";
                break;
            default:
                sender.sendMessage(Utils.getPrefix(plugin) + ChatColor.translateAlternateColorCodes('&', config.getString("messages.unknown-command", "Comando desconhecido.")));
                return true;
        }

        String message = config.getString(messagePath);
        if (message != null && !message.isEmpty()) {
            sender.sendMessage(Utils.getPrefix(plugin) + ChatColor.translateAlternateColorCodes('&', message));
        } else {
            sender.sendMessage(Utils.getPrefix(plugin) + "Mensagem para '" + cmd.getName() + "' não configurada.");
        }

        return true;
    }
}