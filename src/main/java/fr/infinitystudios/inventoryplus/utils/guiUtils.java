package fr.infinitystudios.inventoryplus.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class guiUtils {

    public String cc(String string){
        return ChatColor.translateAlternateColorCodes('&', string);}


    public Inventory getMiningBackpack(Player p){

        itemUtils iu = new itemUtils();

        Inventory gui = Bukkit.createInventory(null, 54, cc("&6Mining Backpack"));

        gui.setItem(10, iu.itemGuiCoal(p));
        gui.setItem(19, iu.itemGuiCoalPart(p));

        gui.setItem(11, iu.itemGuiIronIngot(p));
        gui.setItem(20, iu.itemGuiRawIron(p));
        gui.setItem(29, iu.itemGuiRawIronPart(p));

        gui.setItem(12, iu.itemGuiCopperIngot(p));
        gui.setItem(21, iu.itemGuiRawCopper(p));
        gui.setItem(30, iu.itemGuiRawCopperPart(p));

        gui.setItem(13, iu.itemGuiGoldIngot(p));
        gui.setItem(22, iu.itemGuiRawGold(p));
        gui.setItem(31, iu.itemGuiRawGoldPart(p));

        gui.setItem(14, iu.itemGuiDiamond(p));
        gui.setItem(23, iu.itemGuiDiamondPart(p));

        gui.setItem(15, iu.itemGuiLapis(p));
        gui.setItem(24, iu.itemGuiLapisPart(p));

        gui.setItem(16, iu.itemGuiRedstone(p));
        gui.setItem(25, iu.itemGuiRedstonePart(p));

        gui.setItem(32, iu.itemGuiQuartz(p));
        gui.setItem(41, iu.itemGuiQuartzPart(p));

        gui.setItem(34, iu.itemGuiAncientDebris(p));
        gui.setItem(43, iu.itemGuiAncientDebrisPart(p));

        gui.setItem(39, iu.itemGuiEmerald(p));

        gui.setItem(53, iu.exitBarrier());

        return gui;
    }

    public Inventory getWoodBackpack(Player p){
        itemUtils iu = new itemUtils();
        Inventory gui = Bukkit.createInventory(null, 36, cc("&6Wood Backpack"));

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

    public Inventory getFarmingBackpack(Player p){
        itemUtils iu = new itemUtils();
        Inventory gui = Bukkit.createInventory(null, 27, cc("&6Farming Backpack"));

        gui.setItem(2, iu.itemGuiWheat(p));
        gui.setItem(3, iu.itemGuiCarrot(p));
        gui.setItem(4, iu.itemGuiPotato(p));
        gui.setItem(5, iu.itemGuiBeetroot(p));
        gui.setItem(6, iu.itemGuiSweetberries(p));

        gui.setItem(11, iu.itemGuiMelon(p));
        gui.setItem(12, iu.itemGuiPumpkin(p));
        gui.setItem(13, iu.itemGuiBrownMushroom(p));
        gui.setItem(14, iu.itemGuiRedMushroom(p));
        gui.setItem(15, iu.itemGuiNetherwart(p));

        gui.setItem(22, iu.itemGuiSugarcane(p));

        gui.setItem(26, iu.exitBarrier());


        return gui;
    }


}
