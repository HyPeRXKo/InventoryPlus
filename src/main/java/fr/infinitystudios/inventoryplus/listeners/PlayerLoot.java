package fr.infinitystudios.inventoryplus.listeners;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import fr.infinitystudios.inventoryplus.utils.FileUtils;
import fr.infinitystudios.inventoryplus.utils.InvUtils;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PlayerLoot implements Listener {

    private static final InventoryPlus plugin = InventoryPlus.getPlugin();

    ArrayList<Material> miningitems = new ArrayList<>();



    //TODO CHECK EVENT IF CANCELLED / TRY 0ING STACK WHEN PICKED UP(NO CANCEL)
    @EventHandler
    public void PlayerLootEvent(EntityPickupItemEvent e){
        if(miningitems.isEmpty()){
            miningitems.add(Material.DIAMOND);
        }
        if(e.getEntity().getType() == EntityType.PLAYER){
            Player p = (Player) e.getEntity();
            InvUtils iu = new InvUtils();
            //if(iu.scaninventorymining(p)){
            if(!miningitems.isEmpty()){
                if(miningitems.contains(e.getItem().getItemStack().getType())){
                    e.setCancelled(true);
                    FileUtils fu = new FileUtils();
                    FileConfiguration PlayerSave = fu.GetPlayerConfig(p);
                    Map<String, Integer> content = new HashMap<>();
                    //content.put("diamond", PlayerSave.getInt("diamond") + e.getItem().getItemStack().getAmount());
                    //fu.SavePlayerConfig(p, content);
                }
            }
        }
    }

}
