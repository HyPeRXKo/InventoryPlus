package fr.infinitystudios.inventoryplus.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class GuiUtils {

    public String cc(String string){
        return ChatColor.translateAlternateColorCodes('&', string);}


    public Inventory getMiningGUItest(Player p){

        ItemUtils iu = new ItemUtils();

        Inventory gui = Bukkit.createInventory(null, 27, cc("&6Mining Backpack"));

        gui.setItem(0, iu.ItemGuiDiamond(p));

        return gui;
    }



}
