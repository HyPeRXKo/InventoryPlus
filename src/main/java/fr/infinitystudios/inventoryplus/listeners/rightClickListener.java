package fr.infinitystudios.inventoryplus.listeners;

import fr.infinitystudios.inventoryplus.utils.guiUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class rightClickListener implements Listener {

    @EventHandler
    public void onRightClick(PlayerInteractEvent e){
        Player p = e.getPlayer();
        Action a = e.getAction();
        if(a == Action.RIGHT_CLICK_AIR){
            if(e.getItem().hasItemMeta()) {
                if(e.getItem().getItemMeta().hasCustomModelData()){
                    if(e.getItem().getItemMeta().getCustomModelData() == 150){
                        p.openInventory(new guiUtils().getWoodBackpack(p));
                        return;
                    }
                    else if(e.getItem().getItemMeta().getCustomModelData() == 151){
                        p.openInventory(new guiUtils().getMiningGUItest(p));
                        return;
                    }
                    else if(e.getItem().getItemMeta().getCustomModelData() == 152){
                        //openinvfarming
                    }
                }
            }
        }
    }
}
