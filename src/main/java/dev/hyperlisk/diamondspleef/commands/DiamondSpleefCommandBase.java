package dev.hyperlisk.diamondspleef.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;


/**
 * The base command class for all commands in the DiamondSpleef plugin.
 *
 */
@CommandAlias("ds|diamondspleef")
public class DiamondSpleefCommandBase extends BaseCommand {

    @Default
    public void onDefault() {
        // TODO: Implement this

        // If a player executes this, give the base player gui where they can select from a list of spleef games to join.
        // If a console executes this, give them a list of commands they can execute.

    }

}