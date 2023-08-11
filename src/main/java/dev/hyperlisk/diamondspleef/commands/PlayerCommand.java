package dev.hyperlisk.diamondspleef.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.command.CommandSender;

@CommandAlias("ds|diamondspleef")
public class PlayerCommand extends BaseCommand {

    // TODO: Add join, leave, spectate, and stats commands


    /**
     * The join subcommand.
     *
     * This command will allow a player to join a specific arena.
     *
     * @param sender
     * @param args
     *
     */
    @Subcommand("join|j")
    public void onJoin(CommandSender sender, String[] args) {
        // TODO: The player can name an arena or use a GUI to join an arena.
    }

    /**
     * The leave subcommand.
     *
     * This command will allow a player to leave a specific arena.
     */
    @Subcommand("leave|l")
    public void onLeave() {

    }



}
