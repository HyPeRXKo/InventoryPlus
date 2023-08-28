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

    public Inventory getWoodBackpack(Player p){
        itemUtils iu = new itemUtils();
        Inventory gui = Bukkit.createInventory(null, 36, cc("&Wood Backpack"));

        gui.setItem(2, iu.itemGuiOak(p));
        gui.setItem(11, iu.itemGuiOakPart(p));

        gui.setItem(3, iu.itemGuiBirch(p));
        gui.setItem(12, iu.itemGuiBirchPart(p));

        gui.setItem(4, iu.itemGuiSpruce(p));
        gui.setItem(13, iu.itemGuiSprucePart(p));

        gui.setItem(5, iu.itemGuiJungle(p));
        gui.setItem(14, iu.itemGuiJunglePart(p));

        gui.setItem(20, iu.itemGuiAcacia(p));
        gui.setItem(29, iu.itemGuiAcaciaPart(p));

        gui.setItem(21, iu.itemGuiDarkOak(p));
        gui.setItem(30, iu.itemGuiDarkOakPart(p));

        gui.setItem(22, iu.itemGuiCherry(p));
        gui.setItem(31, iu.itemGuiCherryPart(p));

        gui.setItem(23, iu.itemGuiMangrove(p));
        gui.setItem(32, iu.itemGuiMangrovePart(p));

        gui.setItem(35, iu.exitBarrier());

        return gui;
    }



}
