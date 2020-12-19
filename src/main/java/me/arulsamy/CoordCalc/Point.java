package me.arulsamy.CoordCalc;

import org.bukkit.Location;
import org.bukkit.World.Environment;

import java.util.Objects;

/*
 * Represents a x, z, y position in a minecraft dimension,
 * with some helpful extra methods.
 */
public class Point {
    public int x;
    public int y;
    public int z;
    public Environment dim;

    /*
     * Construct from a Location object
     *
     * @param pos Location to grab coordinates from
     */
    Point(Location pos) {
        this.x = (int) Math.round(pos.getX());
        this.y = (int) Math.round(pos.getY());
        this.z = (int) Math.round(pos.getZ());
        this.dim = Objects.requireNonNull(pos.getWorld()).getEnvironment();
    }

    /*
     * Construct from x, y, z, coordinates
     *
     * @param x Coordinate x to convert
     * @param y Coordinate y to convert
     * @param z Coordinate z to convert
     * @param dim Environment (bukkit constant) that coordinates are currently in
     */
    Point(int x, int y, int z, Environment dim) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.dim = dim;
    }

    /*
     * Convert coordinates to overworld scheme.
     * @return: Formatted string of coordinates
     */
    String toOverworld() {
        if (this.dim == Environment.NETHER) {
            int overworld_x = x * 8;
            int overworld_z = z * 8;
            return String.format("X: %d Y: %d Z: %d", overworld_x, y, overworld_z);
        }
        return String.format("X: %d Y: %d Z: %d", x, y, z);
    }

    /*
     * Convert coordinates to nether scheme.
     * @return: Formatted string of coordinates
     */
    String toNether() {
        if (this.dim == Environment.NORMAL) {
            int nether_x = (int) Math.round(x / 8.0);
            int nether_z = (int) Math.round(z / 8.0);
            return String.format("X: %d Y: %d Z: %d", nether_x, y, nether_z);
        }
        return String.format("X: %d Y: %d Z: %d", x, y, z);
    }
}