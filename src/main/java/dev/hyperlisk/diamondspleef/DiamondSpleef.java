package dev.hyperlisk.diamondspleef;

import co.aikar.commands.PaperCommandManager;
import dev.hyperlisk.diamondspleef.commands.ArenaCommand;
import dev.hyperlisk.diamondspleef.commands.DiamondSpleefCommand;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class DiamondSpleef extends JavaPlugin {

    @Getter
    public static DiamondSpleef instance;

    @Getter
    public static PaperCommandManager commandManager;

    @Override
    public void onEnable() {
        instance = this;
        registerCommands();
    }

    @Override
    public void onDisable() {}



    private void registerCommands() {
        commandManager = new PaperCommandManager(this);
        commandManager.enableUnstableAPI("brigadier");

        // Register Commands
        commandManager.registerCommand(new DiamondSpleefCommand());
        commandManager.registerCommand(new ArenaCommand());

    }

}
