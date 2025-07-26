package br.com.haisuu.haisuupiece;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TexturaCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage("§b§l[HaisuuPiece]§r Link da Textura: www.teste.com");
        return true;
    }
}