package br.com.haisuu.haisuupiece;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HPCommand implements CommandExecutor {

    private final Main plugin;

    public HPCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
            plugin.reloadConfig();
            sender.sendMessage(Utils.getPrefix(plugin) + "§aConfigurações recarregadas com sucesso!");
            return true;
        }

        if (!sender.hasPermission("hp.admin")) {
            sender.sendMessage(Utils.getPrefix(plugin) + "§cVocê não tem permissão para isso.");
            return true;
        }

        sender.sendMessage(Utils.getPrefix(plugin) + "§cUso correto: /hp reload");
        return true;
        }
}
