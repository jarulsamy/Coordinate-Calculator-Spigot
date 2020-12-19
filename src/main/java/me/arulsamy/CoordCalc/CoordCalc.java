package me.arulsamy.CoordCalc;

import org.bukkit.plugin.java.JavaPlugin;

public class CoordCalc extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        this.getCommand("coords").setExecutor(new CommandCoords());
        this.getCommand("toNether").setExecutor(new CommandToNether());
        this.getCommand("toOverworld").setExecutor(new CommandToOverworld());
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}

