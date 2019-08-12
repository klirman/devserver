package me.pcrunn.devserver.commands;

import me.pcrunn.devserver.DevServerPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ToggleHotReloadsExecutor implements CommandExecutor {

    private final DevServerPlugin plugin;

    public ToggleHotReloadsExecutor(DevServerPlugin devServerPlugin) {
        this.plugin = devServerPlugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        plugin.getConfig().set("fyreReloads", !plugin.getConfig().getBoolean("fyreReloads"));
        plugin.saveConfig();
        commandSender.sendMessage("fyreReloads = " + plugin.getConfig().get("fyreReloads: true"));
        return false;
    }
}
