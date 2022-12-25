package fr.infinitystudios.inventoryplus.listeners;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import fr.infinitystudios.inventoryplus.utils.FileUtils;
import fr.infinitystudios.inventoryplus.utils.InvUtils;
import fr.infinitystudios.inventoryplus.utils.PermUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
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
            if(!e.isCancelled() && iu.scaninventorybackpack(p, "mining")){
                if(miningitems.contains(e.getItem().getItemStack().getType())){
                    switch (e.getItem().getItemStack().getType()) {
                        case DIAMOND: {
                            FileUtils fu = new FileUtils();
                            PermUtils pu = new PermUtils();
                            boolean cancel = false;
                            Map<String, Integer> content = fu.GetConfigContent(fu.GetPlayerConfig(p));
                            int newint = content.get("diamond") + e.getItem().getItemStack().getAmount();
                            int tempint = newint;
                            int limit = pu.miningpermstacklmimit(p);
                            ItemStack tempitemstack = e.getItem().getItemStack().clone();
                            if (newint > limit) {
                                for (int i = 1; i <= limit; i++) {
                                    tempint = tempint - 1;
                                    if(tempitemstack.getAmount() - i == 0){cancel=true; break;}
                                    else if (tempint == limit) {
                                        newint = tempint;
                                        tempitemstack.setAmount(e.getItem().getItemStack().getAmount() - i);
                                        plugin.getLogger().severe(String.valueOf(tempint) + tempitemstack.getAmount());
                                        break;
                                    }
                                }
                            }
                            if(cancel){break;}
                            plugin.getLogger().severe(String.valueOf(newint) + e.getItem().getItemStack().getAmount() + tempitemstack.getAmount() + content.get("diamond"));
                            content.put("diamond", newint);
                            fu.SavePlayerConfig(p, content);
                            Bukkit.getScheduler().runTaskLater(plugin, () -> p.getInventory().removeItem(tempitemstack), 1L);
                            plugin.getLogger().severe(String.valueOf(content.get("diamond")) + e.getItem().getItemStack().getAmount() + tempitemstack.getAmount());
                            break;
                        }
                        case COAL: {
                            FileUtils fu = new FileUtils();
                            Map<String, Integer> content = fu.GetConfigContent(fu.GetPlayerConfig(p));
                            int newint = content.get("diamond") + e.getItem().getItemStack().getAmount();
                            plugin.getLogger().severe(String.valueOf(newint) + e.getItem().getItemStack().getAmount() + content.get("diamond"));
                            content.put("diamond", newint);
                            fu.SavePlayerConfig(p, content);
                            Bukkit.getScheduler().runTaskLater(plugin, () -> p.getInventory().removeItem(e.getItem().getItemStack()), 1L);
                            plugin.getLogger().severe(String.valueOf(content.get("diamond")) + e.getItem().getItemStack().getAmount());
                            break;
                        }
                    }
                }
            }
        }
    }

}
