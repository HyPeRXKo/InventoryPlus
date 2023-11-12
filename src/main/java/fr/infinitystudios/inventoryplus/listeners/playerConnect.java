package fr.infinitystudios.inventoryplus.listeners;

import fr.infinitystudios.inventoryplus.utils.fileUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class playerConnect implements Listener {

    Map<UUID, Boolean> resourcePackResponses = new HashMap<>();

    @EventHandler
    public void onResourcePackStatus(PlayerResourcePackStatusEvent event) {
        Player p = event.getPlayer();

        // Check if the player has accepted the resource pack
        if (event.getStatus() == PlayerResourcePackStatusEvent.Status.ACCEPTED) {
            resourcePackResponses.put(p.getUniqueId(), true);
        }
    }

    @EventHandler
    public void OnPlayerConnection(PlayerLoginEvent e){
        Player p = e.getPlayer();
        fileUtils fu = new fileUtils();
        if(!p.hasPlayedBefore()){
            fu.savePlayerConfig(p, fu.emptyContent());
            fileUtils.setloadedcontent(p, fu.emptyContent());
            return;
        }
        if(fu.getPlayerConfig(p) == null){
            fu.savePlayerConfig(p, fu.emptyContent());
            fileUtils.setloadedcontent(p, fu.emptyContent());
            return;
        }

        fileUtils.setloadedcontent(p, fu.getConfigContent(fu.getPlayerConfig(p)));
    }

    @EventHandler
    public void onPlayerDisconnection(PlayerQuitEvent e){
        Player p = e.getPlayer();

        if(!resourcePackResponses.containsKey(p.getUniqueId())){
            return;
        }

        fileUtils fu = new fileUtils();

        fu.savePlayerConfig(p, fileUtils.getloadedcontentPlayer(p));
        fileUtils.deleteloadedcontent(p);
        resourcePackResponses.remove(p.getUniqueId());
    }

    @EventHandler
    public void onPlayerKicked(PlayerKickEvent e){
        Player p = e.getPlayer();
        fileUtils fu = new fileUtils();

        fu.savePlayerConfig(p, fileUtils.getloadedcontentPlayer(p));
        fileUtils.deleteloadedcontent(p);
    }


}
