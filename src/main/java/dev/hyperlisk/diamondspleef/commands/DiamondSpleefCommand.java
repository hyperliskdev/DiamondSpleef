package dev.hyperlisk.diamondspleef.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import dev.hyperlisk.diamondspleef.DiamondSpleef;
import dev.hyperlisk.diamondspleef.gui.PlayerMenuGui;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


/**
 * The base command class for all commands in the DiamondSpleef plugin.
 *
 */
@CommandAlias("diamondspleef|ds")
public class DiamondSpleefCommand extends BaseCommand {

    @Default
    @CommandPermission("diamondspleef")
    public void onDefault(CommandSender sender, String[] args) {

        // TODO: Add a GUI for the player to use.

        if (sender instanceof Player) {
            Player player = (Player) sender;
            PlayerMenuGui gui = new PlayerMenuGui(DiamondSpleef.getInstance());
            player.openInventory(gui.getInventory());
        }

        // TODO: Create a gui for admins to use.

    }



}