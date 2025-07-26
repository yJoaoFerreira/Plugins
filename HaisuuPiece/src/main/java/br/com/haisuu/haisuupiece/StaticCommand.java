package br.com.haisuu.haisuupiece;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class StaticCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        String prefix = "§b§l[HaisuuPiece]§r ";

        switch (cmd.getName().toLowerCase()) {

            case "discord":
                sender.sendMessage(prefix + "Link do Discord: www.discord.com");
                break;

            case "textura":
                sender.sendMessage(prefix + "Link da textura: www.textura.com");
                break;

            case "site":
                sender.sendMessage(prefix + "Site oficial: www.site.com");
                break;

            default:
                sender.sendMessage(prefix + "Comando desconhecido.");
                break;
        }

        return true;
    }
}