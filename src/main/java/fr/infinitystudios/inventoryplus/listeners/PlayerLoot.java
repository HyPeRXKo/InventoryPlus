package fr.infinitystudios.inventoryplus.listeners;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import fr.infinitystudios.inventoryplus.utils.FileUtils;
import fr.infinitystudios.inventoryplus.utils.InvUtils;
import org.bukkit.Bukkit;
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



    @EventHandler
    public void PlayerLootEvent(EntityPickupItemEvent e){
        if(miningitems.isEmpty()){
            miningitems.add(Material.DIAMOND);
        }
        if(e.getEntity().getType() == EntityType.PLAYER){
            Player p = (Player) e.getEntity();
            InvUtils iu = new InvUtils();
            //if(iu.scaninventorymining(p)){
            if(!e.isCancelled()){
                if(miningitems.contains(e.getItem().getItemStack().getType())){
                    FileUtils fu = new FileUtils();
                    FileConfiguration PlayerSave = fu.GetPlayerConfig(p);
                    Map<String, Integer> content = new HashMap<>();
                    int newint = PlayerSave.getInt("mining.diamond") + e.getItem().getItemStack().getAmount();
                    plugin.getLogger().severe(String.valueOf(newint) + e.getItem().getItemStack().getAmount() + PlayerSave.getInt("mining.diamond"));
                    content.put("diamond", newint);
                    fu.SavePlayerConfig(p, content);
                    Bukkit.getScheduler().runTaskLater(plugin, () -> p.getInventory().removeItem(e.getItem().getItemStack()), 1L);
                    plugin.getLogger().severe(String.valueOf(content.get("diamond")) + e.getItem().getItemStack().getAmount());
                }
            }
        }
    }

}
