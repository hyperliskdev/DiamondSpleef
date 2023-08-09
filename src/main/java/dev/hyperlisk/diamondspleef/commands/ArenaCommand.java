package dev.hyperlisk.diamondspleef.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Dependency;
import dev.hyperlisk.diamondspleef.DiamondSpleef;


@CommandAlias("arena|ar")
public class ArenaCommand extends DiamondSpleefCommandBase {

    @Dependency
    private DiamondSpleef diamondSpleef;

    public ArenaCommand(DiamondSpleef diamondSpleef) {
        this.diamondSpleef = diamondSpleef;
    }

}
