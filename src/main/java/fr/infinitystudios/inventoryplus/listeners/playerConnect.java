package fr.infinitystudios.inventoryplus.listeners;

import fr.infinitystudios.inventoryplus.utils.fileUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class playerConnect implements Listener {

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
        fileUtils fu = new fileUtils();

        fu.savePlayerConfig(p, fileUtils.getloadedcontent(p));
        fileUtils.deleteloadedcontent(p);
    }


}
