package fr.infinitystudios.inventoryplus.utils;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

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

    public Boolean scaninventorysingle(Player p, String itemstring){
        fileUtils fu = new fileUtils();
        Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
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
