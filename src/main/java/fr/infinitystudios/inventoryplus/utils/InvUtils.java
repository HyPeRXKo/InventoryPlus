package fr.infinitystudios.inventoryplus.utils;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class InvUtils {

    private static final InventoryPlus plugin = InventoryPlus.getPlugin();

    public Boolean scaninventorybackpack(Player p, String type) {
        ItemUtils iu = new ItemUtils();
        if(type.equalsIgnoreCase("mining") && p.getInventory().contains(iu.ItemMiningBackpack(p))){return true;}
        return false;
    }

    public Boolean scaninventorysingle(Player p, String itemstring){
        FileUtils fu = new FileUtils();
        Map<String, Integer> content = fu.GetConfigContent(fu.GetPlayerConfig(p));
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
            case "coal":
                item.setType(Material.COAL);
                amount = content.get("coal");
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


}
