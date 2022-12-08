package fr.infinitystudios.inventoryplus.utils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class InvUtils {

    public Boolean scaninventorymining(Player p) {
        for (int i = 0; i < p.getInventory().getSize(); i++) {
            ItemStack item = p.getInventory().getItem(i);
            if (item.getItemMeta().getDisplayName().equalsIgnoreCase("connerienombackpack")) {
                return true;
            }
        }
        return false;
    }


}
