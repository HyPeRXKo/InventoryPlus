package fr.infinitystudios.inventoryplus.utils;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.util.Map;

public class invUtils {

    private static final InventoryPlus plugin = InventoryPlus.getPlugin();

    public Boolean scaninventorybackpack(Player p, String type) {
        itemUtils iu = new itemUtils();
        if(type.equalsIgnoreCase("mining") && p.getInventory().contains(iu.ItemMiningBackpack(p))){return true;}
        else if(type.equalsIgnoreCase("wood") && p.getInventory().contains(iu.ItemWoodBackpack(p))){return true;}
        else if(type.equalsIgnoreCase("farming") && p.getInventory().contains(iu.ItemFarmingBackpack(p))){return true;}
        return false;
    }
    public int tierinventorybackpack(Player p, String type){
        itemUtils iu = new itemUtils();
        if(type.equalsIgnoreCase("mining") && p.getInventory().contains(iu.ItemMiningBackpack(p))){
            for (int slot = 0; slot < p.getInventory().getSize(); slot++) {
                ItemStack item = p.getInventory().getItem(slot);

                if(item != null && item.isSimilar(iu.ItemMiningBackpack(p))){
                    if(item.hasItemMeta()
                    && item.getItemMeta().getPersistentDataContainer().has(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER)){
                        return new permUtils().miningpermstacklmimit(item.getItemMeta().getPersistentDataContainer().get(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER));
                    }
                }
            }
        }
        else if(type.equalsIgnoreCase("wood") && p.getInventory().contains(iu.ItemWoodBackpack(p))){
            for (int slot = 0; slot < p.getInventory().getSize(); slot++) {
                ItemStack item = p.getInventory().getItem(slot);

                if(item != null && item.isSimilar(iu.ItemWoodBackpack(p))){
                    if(item.hasItemMeta()
                            && item.getItemMeta().getPersistentDataContainer().has(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER)){
                        return new permUtils().woodpermstacklmimit(item.getItemMeta().getPersistentDataContainer().get(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER));
                    }
                }
            }
        }
        else if(type.equalsIgnoreCase("farming") && p.getInventory().contains(iu.ItemFarmingBackpack(p))){
            for (int slot = 0; slot < p.getInventory().getSize(); slot++) {
                ItemStack item = p.getInventory().getItem(slot);

                if(item != null && item.isSimilar(iu.ItemFarmingBackpack(p))){
                    if(item.hasItemMeta()
                            && item.getItemMeta().getPersistentDataContainer().has(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER)){
                        return new permUtils().farmingpermstacklmimit(item.getItemMeta().getPersistentDataContainer().get(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER));
                    }
                }
            }
        }
        return 0;
    }

    public Boolean scaninventorysingle(Player p, String itemstring){
        Map<String, Integer> content = fileUtils.getloadedcontentPlayer(p);
        ItemStack item = new ItemStack(Material.AIR);
        int amount = -1;
        switch (itemstring){
            case "diamond":
                item.setType(Material.DIAMOND);
                amount = content.get("diamond");
                break;
            case "rawgold":
                item.setType(Material.RAW_GOLD);
                amount = content.get("rawgold");
                break;
            case "rawiron":
                item.setType(Material.RAW_IRON);
                amount = content.get("rawiron");
                break;
            case "coal":
                item.setType(Material.COAL);
                amount = content.get("coal");
                break;
            case "gold":
                item.setType(Material.GOLD_INGOT);
                amount = content.get("gold");
                break;
            case "iron":
                item.setType(Material.IRON_INGOT);
                amount = content.get("iron");
                break;
        }
        if(item.getType() == Material.AIR || amount == -1 || amount == 0){return false;}

        ItemStack[] invRef = p.getInventory().getStorageContents();
        for (ItemStack iteminv : invRef) {
            if(iteminv == null || iteminv.getType() == Material.AIR){
                amount = amount - 64;
            }
            else if(iteminv.getType() == item.getType()){
                amount = amount - (64 - iteminv.getAmount());
            }
            if(amount <= 0){return true;}
        }
        return false;
    }

    public void removeiteminv(Player p, ItemStack itemstack){
        Bukkit.getScheduler().runTaskLater(plugin, () -> p.getInventory().removeItem(itemstack), 1L);
    }


}
