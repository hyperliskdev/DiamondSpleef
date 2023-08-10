package dev.hyperlisk.diamondspleef.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import dev.hyperlisk.diamondspleef.DiamondSpleef;
import org.bukkit.command.CommandSender;
import org.geysermc.floodgate.api.FloodgateApi;


@Subcommand("arena|ar")
public class ArenaCommand extends DiamondSpleefCommandBase {

    @Default
    @CommandPermission("diamondspleef.arena")
    public void onDefault(CommandSender sender, String[] args) {

    }


}
