package dev.hyperlisk.diamondspleef.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.command.CommandSender;

@CommandAlias("diamondspleef|ds")
@Subcommand("kit|k")
public class KitCommand extends BaseCommand {


    @Default
    @CommandPermission("diamondspleef.kit")
    public void onKit(CommandSender sender) {

    }

    @Subcommand("create|c")
    @CommandPermission("diamondspleef.kit.create")
    public void onKitCreate(CommandSender sender) {

    }
}
