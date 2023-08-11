package dev.hyperlisk.diamondspleef.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


@CommandAlias("diamondspleef|ds")
@Subcommand("arena|a")
public class ArenaCommand extends BaseCommand {


    /**
     * The arena command.
     *
     * /diamondspleef arena
     *
     * This command is executed when the user types /diamondspleef arena. It will
     * show a list of arena subcommands the user can use and their descriptions.
     *
     * @param sender
     */
    @Default
    @CommandPermission("diamondspleef.arena")
    public void onArena(CommandSender sender) {
        //TODO: List all subcommands and their descriptions.
        sender.sendMessage("Subcommands: create, delete, list, set, edit");

    }

    /**
     * The `create` subcommand.
     *
     * This command will create an arena for the players to play a game of spleef in.
     *
     * @param sender
     * @param args
     */
    @Subcommand("create|c")
    @CommandPermission("diamondspleef.arena.create")
    public void onArenaCreate(CommandSender sender, String[] args) {
        sender.sendMessage("You have created an arena.");

    }


    /**
     * The `delete` subcommand.
     *
     * This command will delete an arena.
     *
     * @param sender
     * @param args
     */
    @Subcommand("delete|d")
    @CommandPermission("diamondspleef.arena.delete")
    public void onArenaDelete(CommandSender sender, String[] args) {
        sender.sendMessage("You have deleted an arena.");
    }


    /**
     * The `list` subcommand.
     *
     * This command will list all arenas.
     */
    @Subcommand("list|l")
    @CommandPermission("diamondspleef.arena.list")
    public void onArenaList() {

    }


    /**
     * The `set` subcommand.
     *
     * This command will set the arenas area. There are two options for how the command will function. If one set of points
     * is given, the area will you the player as the first location and the given coordinates as the second location.
     *
     * If two sets of points are given, the first set of points will be the first location and the second set of points
     * will be the second location.
     *
     *
     * `/diamondspleef arena set <arena> [x, y, z]`
     * `/diamondspleef arena set <arena> [x, y, z] [x, y, z]`
     *
     *
     * @param sender - The command sender.
     * @param args - <b>[arena name] [corner]</b> <i>[optional second corner]</i>
     */
    @Subcommand("set|s")
    @Syntax("<arena name> <x> <y> <z> [x] [y] [z]")
    @CommandPermission("diamondspleef.arena.set")
    public void onArenaSet(CommandSender sender, String[] args) {
        String arenaName = args[0];

        double[] cornerA = new double[]{
                Double.parseDouble(args[1]),
                Double.parseDouble(args[2]),
                Double.parseDouble(args[3])
        };

        if (!(sender instanceof Player)) {
            sender.sendMessage("You must be a player to use this command.");
            return;
        }

        Player player = (Player) sender;

        // TODO: Get the second corner from the player if it is not given.


        // TODO: Set the arena's area.

    }

    @Subcommand("edit|e")
    @CommandPermission("diamondspleef.arena.edit")
    public void onArenaEdit() {

    }


}
