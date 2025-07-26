package me.haisuu.eventos;

import jdk.nashorn.internal.ir.Block;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class QuebraBloco implements Listener {

    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent blockBreakEvent) {
        Player player = blockBreakEvent.getPlayer();
        Block block = (Block) blockBreakEvent.getBlock();
        Material material = ((org.bukkit.block.Block) block).getType();

        Bukkit.broadcastMessage("Quem quebrou o bloco foi: " + player.getName() + ". O bloco foi um: " + material.name());
    }
}
