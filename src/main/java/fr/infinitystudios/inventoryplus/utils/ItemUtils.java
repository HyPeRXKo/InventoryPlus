package fr.infinitystudios.inventoryplus.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemUtils {

    public String cc(String string){
        return ChatColor.translateAlternateColorCodes('&', string);}

    public ItemStack ItemGuiDiamond(Player p){
        FileUtils fu = new FileUtils();
        ItemStack diamond = new ItemStack(Material.DIAMOND);
        ItemMeta meta = diamond.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&bDiamond"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + fu.GetPlayerConfig(p).getInt("mining.diamond") + "&7/200"));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        diamond.setItemMeta(meta);

        return diamond;
    }

}
