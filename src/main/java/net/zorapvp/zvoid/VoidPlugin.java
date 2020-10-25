package net.zorapvp.zvoid;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class VoidPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new VoidEvent(), this);
    }

    @Override
    public void onDisable() {

    }
}
