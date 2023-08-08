package dev.hyperlisk.diamondspleef.state;

import org.geysermc.event.Listener;

public abstract class GameState implements Listener {

    public abstract void onEnable();
    public abstract void onDisable();

    public abstract GameState getNextState();

}



