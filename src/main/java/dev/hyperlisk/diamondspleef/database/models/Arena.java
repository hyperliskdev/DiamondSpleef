package dev.hyperlisk.diamondspleef.database.models;

import lombok.Getter;
import lombok.Setter;

import org.bukkit.entity.Player;
import org.bukkit.Location;

public class Arena {

    @Getter
    private int id;
    @Getter
    private String name;

    // The area of the arena is a "cube", so we only need two locations.
    @Getter
    @Setter
    private Location cornerA;

    @Getter
    @Setter
    private Location b;


    public Arena(int id, String name, Location a, Location b) {
        this.id = id;
        this.name = name;
        this.cornerA = a;
        this.b = b;
    }

    public Arena(String name) {
        this.name = name;
    }
    
    


    public boolean isInArena(Player p) {
        Location loc = p.getLocation();

        if (cornerA == null || b == null) {
            return false;
        }

        return (loc.getX() >= cornerA.getX() && loc.getX() <= b.getX()) &&
                (loc.getY() >=  cornerA.getY() && loc.getY() <= b.getY()) &&
                (loc.getZ() >= cornerA.getZ() && loc.getZ() <= b.getZ());
    }




}
