package me.arulsamy.CoordCalc;

import org.bukkit.Location;
import org.bukkit.World;

import java.util.Objects;

public class Point {
    public int x;
    public int y;
    public int z;
    public World.Environment dim;

    Point(Location pos) {
        this.x = (int) Math.round(pos.getX());
        this.y = (int) Math.round(pos.getY());
        this.z = (int) Math.round(pos.getZ());
        this.dim = Objects.requireNonNull(pos.getWorld()).getEnvironment();
    }

    Point(int x, int y, int z, World.Environment dim) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dim = dim;
    }

    String toOverworld() {
        if (this.dim == World.Environment.NETHER) {
            int overworld_x = x * 8;
            int overworld_z = z * 8;
            return String.format("X: %d, Y: %d, Z: %d", overworld_x, y, overworld_z);
        }
        return String.format("X: %d, Y: %d, Z: %d", x, y, z);
    }

    String toNether() {
        if (this.dim == World.Environment.NORMAL) {
            int nether_x = (int) Math.round(x / 8.0);
            int nether_z = (int) Math.round(z / 8.0);
            return String.format("X: %d, Y: %d, Z: %d", nether_x, y, nether_z);
        }
        return String.format("X: %d, Y: %d, Z: %d", x, y, z);
    }
}