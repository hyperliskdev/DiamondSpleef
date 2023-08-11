package dev.hyperlisk.diamondspleef.gui;


import dev.hyperlisk.diamondspleef.DiamondSpleef;
import lombok.Getter;
import net.kyori.adventure.text.Component;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class PlayerMenuGui implements InventoryHolder{


    @Getter
    private final Inventory menu;

    public PlayerMenuGui(DiamondSpleef plugin) {

        this.menu = plugin.getServer().createInventory(this, 9, Component.text("Diamond Spleef Menu"));


    }

    public void initMenu() {
        // TODO: Add a new item to the inventory for each arena.

    }

    @Override
    public @NotNull Inventory getInventory() {
        return this.menu;
    }
}
