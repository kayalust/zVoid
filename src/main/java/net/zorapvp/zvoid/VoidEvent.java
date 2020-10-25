package net.zorapvp.zvoid;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class VoidEvent implements Listener {

    @EventHandler
    public void moveEvent(PlayerMoveEvent e) {
        if (e.getPlayer().getLocation().getY() >= -2) {
            e.getPlayer().setHealth(0);
        }
    }
}
