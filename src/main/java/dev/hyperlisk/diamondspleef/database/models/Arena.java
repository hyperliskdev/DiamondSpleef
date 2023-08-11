package dev.hyperlisk.diamondspleef.database.models;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;

public class Arena {

    @Getter
    private String name;

    @Getter
    private double[] cornerA;

    @Getter
    private double[] cornerB;

    @Getter
    @Setter
    private int maxPlayers;

    @Getter
    @Setter
    private boolean enabled;


    public Arena(String name, double[] cornerA, double[] cornerB) {
        this.name = name;
        this.cornerA = cornerA;
        this.cornerB = cornerB;
    }


    public Arena(String name, double[] cornerA, double[] cornerB, int maxPlayers, boolean enabled) {
        this.name = name;
        this.cornerA = cornerA;
        this.cornerB = cornerB;
        this.maxPlayers = maxPlayers;
        this.enabled = enabled;
    }


    public boolean isInside(Location l, double[] cornerA, double[] cornerB) {
        double x = l.getX();
        double y = l.getY();
        double z = l.getZ();



    }

    }






}
