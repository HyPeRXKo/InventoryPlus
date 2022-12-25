package fr.infinitystudios.inventoryplus.listeners;

import fr.infinitystudios.inventoryplus.utils.FileUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import java.util.HashMap;
import java.util.Map;

public class PlayerFirstConnect implements Listener {

    public void FirstConnection(PlayerLoginEvent e){
        Player p = (Player) e.getPlayer();
        if(p.hasPlayedBefore()){
            FileUtils fu = new FileUtils();
            Map<String, Integer> content = new HashMap<>();
            content.put("diamond", 0);
            content.put("coal", 0);
            fu.SavePlayerConfig(p, content);
        }
    }
}
