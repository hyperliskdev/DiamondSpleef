package dev.hyperlisk.diamondspleef.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import dev.hyperlisk.diamondspleef.gui.PlayerMenuGui;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.geysermc.floodgate.api.FloodgateApi;


/**
 * The base command class for all commands in the DiamondSpleef plugin.
 *
 */
@CommandAlias("ds|diamondspleef")
public class DiamondSpleefCommandBase extends BaseCommand {

    @Default
    public void onDefault(CommandSender sender, String[] args) {
        // TODO: Implement the basic menu for ds|diamondspleef
        if (sender instanceof Player) {
            Player player = (Player) sender;
            PlayerMenuGui gui = new PlayerMenuGui();
            if (FloodgateApi.getInstance().isFloodgatePlayer(player.getUniqueId())) {
                // Send the player menu CustomForm (Bedrock Player)


            } else {
                // Send the regular inventory menu to the player (Java Player)
            }

        }



    }

}