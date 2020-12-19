package me.arulsamy.CoordCalc;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class CoordCalc extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(this.getCommand("coords")).setExecutor(new CommandCoords());
        Objects.requireNonNull(this.getCommand("toNether")).setExecutor(new CommandToNether());
        Objects.requireNonNull(this.getCommand("toOverworld")).setExecutor(new CommandToOverworld());
    }
}

