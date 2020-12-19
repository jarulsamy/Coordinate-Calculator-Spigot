package me.arulsamy.CoordCalc;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ComponentBuilder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandCoords implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Point current_pos = new Point(player.getLocation());

            player.spigot().sendMessage(new ComponentBuilder("\n\nOverworld").color(ChatColor.GREEN).create());
            player.spigot().sendMessage(new ComponentBuilder(current_pos.toOverworld()).color(ChatColor.WHITE).create());
            player.spigot().sendMessage(new ComponentBuilder("Nether").color(ChatColor.GREEN).create());
            player.spigot().sendMessage(new ComponentBuilder(current_pos.toNether()).color(ChatColor.WHITE).create());

            return true;
        }
        return false;
    }
}
