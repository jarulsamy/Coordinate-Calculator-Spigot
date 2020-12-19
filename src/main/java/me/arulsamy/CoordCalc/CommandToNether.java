package me.arulsamy.CoordCalc;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ComponentBuilder;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandToNether implements CommandExecutor {

    public void displayUsage(Player player) {
        player.spigot().sendMessage(new ComponentBuilder("Usage: /toNether <X> <Y> <Z>").color(ChatColor.RED).create());
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            int x, y, z;
            Player player = (Player) sender;
            // Ensure correct num of args
            if (args.length != 3) {
                displayUsage(player);
                return true;
            }

            try {
                x = Integer.parseInt(args[0]);
                y = Integer.parseInt(args[1]);
                z = Integer.parseInt(args[2]);
            } catch (Exception e) {
                displayUsage(player);
                return true;
            }

            Point pos = new Point(x, y, z, World.Environment.NORMAL);
            player.spigot().sendMessage(new ComponentBuilder("\n\nNether").color(ChatColor.GREEN).create());
            player.spigot().sendMessage(new ComponentBuilder(pos.toNether()).color(ChatColor.WHITE).create());

            return true;
        }

        return false;
    }
}
