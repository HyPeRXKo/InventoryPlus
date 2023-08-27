package fr.infinitystudios.inventoryplus.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class guiUtils {

    public String cc(String string){
        return ChatColor.translateAlternateColorCodes('&', string);}


    public Inventory getMiningGUItest(Player p){

        itemUtils iu = new itemUtils();

        Inventory gui = Bukkit.createInventory(null, 27, cc("&6Mining Backpack"));

        gui.setItem(2, iu.ItemGuiGoldIngot(p));
        gui.setItem(3, iu.ItemGuiIronIngot(p));
        gui.setItem(10, iu.ItemGuiDiamond(p));
        gui.setItem(11, iu.ItemGuiGoldRaw(p));
        gui.setItem(12, iu.ItemGuiIronRaw(p));
        gui.setItem(13, iu.ItemGuiCoal(p));
        gui.setItem(19, iu.ItemMiningBackpack(p));

        return gui;
    }



}
