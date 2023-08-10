package dev.hyperlisk.diamondspleef;

import co.aikar.commands.PaperCommandManager;
import dev.hyperlisk.diamondspleef.commands.ArenaCommand;
import dev.hyperlisk.diamondspleef.commands.DiamondSpleefCommandBase;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class DiamondSpleef extends JavaPlugin {

    public static DiamondSpleef plugin;

    @Getter
    public static PaperCommandManager commandManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        registerCommands();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }



    private void registerCommands() {
        commandManager = new PaperCommandManager(this);
        commandManager.enableUnstableAPI("brigadier");

        // Register Commands
        commandManager.registerCommand(new DiamondSpleefCommandBase());
        commandManager.registerCommand(new ArenaCommand());

    }

}
