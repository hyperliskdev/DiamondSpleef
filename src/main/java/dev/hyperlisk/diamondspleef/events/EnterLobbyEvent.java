package dev.hyperlisk.diamondspleef.events;


import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class EnterLobbyEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();


    private final String playerName;

    public EnterLobbyEvent(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }


    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }



}