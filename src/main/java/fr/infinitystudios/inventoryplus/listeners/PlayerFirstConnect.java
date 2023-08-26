package fr.infinitystudios.inventoryplus.listeners;

import fr.infinitystudios.inventoryplus.utils.FileUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import java.util.HashMap;
import java.util.Map;

public class PlayerFirstConnect implements Listener {

    @EventHandler
    public void FirstConnection(PlayerLoginEvent e){
        Player p = e.getPlayer();
        FileUtils fu = new FileUtils();
        if(!p.hasPlayedBefore()){
            fu.SavePlayerConfig(p, fu.EmptyContent());
            return;
        }
        if(fu.GetPlayerConfig(p) == null){
            fu.SavePlayerConfig(p, fu.EmptyContent());
        }
    }
}
