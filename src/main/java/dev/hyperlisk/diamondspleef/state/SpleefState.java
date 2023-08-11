package dev.hyperlisk.diamondspleef.state;

import org.bukkit.event.Listener;

public abstract class SpleefState implements Listener {




    public abstract void onEnable();

    public abstract void onDisable();

    public abstract SpleefState getNextState();

}
