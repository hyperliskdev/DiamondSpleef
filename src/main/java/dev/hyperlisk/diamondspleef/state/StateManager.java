package dev.hyperlisk.diamondspleef.state;

import dev.hyperlisk.diamondspleef.DiamondSpleef;
import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;

/**
 * Manages the current state of the game
 */
public class StateManager {

    private SpleefState currentState;

    public StateManager(SpleefState initialState) {
        setState(initialState);
    }

    public void nextState() {
        setState(currentState.getNextState());
    }

    public void setState(SpleefState state) {
        if (currentState != null) {
            currentState.onDisable();
        }

        HandlerList.unregisterAll(currentState);

        currentState = state;
        Bukkit.getPluginManager().registerEvents(currentState, DiamondSpleef.getInstance());
        currentState.onEnable();

    }

    public boolean isInState(Class<? extends SpleefState> stateClass) {
        return currentState.getClass().equals(stateClass);
    }

}
