package fr.infinitystudios.inventoryplus.listeners;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import fr.infinitystudios.inventoryplus.utils.*;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class guiInteraction implements Listener {

    private static final InventoryPlus plugin = InventoryPlus.getPlugin();

    private static final Map<Material, String> matlist = new HashMap<>();
    private static final Map<Integer, String> fireworklist = new HashMap<>();
    private static final ArrayList<Material> miningitems = new ArrayList<>();
    private static final ArrayList<Material> wooditems = new ArrayList<>();
    private static final ArrayList<Material> farmingitems = new ArrayList<>();


    @EventHandler
    public void GuiInteractionEvent(InventoryClickEvent e) {
        if (matlist.isEmpty()) {
            matlist.put(Material.COAL, "coal");
            matlist.put(Material.RAW_IRON, "rawiron");
            matlist.put(Material.RAW_COPPER, "rawcopper");
            matlist.put(Material.RAW_GOLD, "rawgold");
            matlist.put(Material.DIAMOND, "diamond");
            matlist.put(Material.EMERALD, "emerald");
            matlist.put(Material.LAPIS_LAZULI, "lapis");
            matlist.put(Material.REDSTONE, "redstone");
            matlist.put(Material.QUARTZ, "quartz");
            matlist.put(Material.ANCIENT_DEBRIS, "netherite");
            matlist.put(Material.OAK_LOG, "oak");
            matlist.put(Material.BIRCH_LOG, "birch");
            matlist.put(Material.SPRUCE_LOG, "spruce");
            matlist.put(Material.ACACIA_LOG, "acacia");
            matlist.put(Material.CHERRY_LOG, "cherry");
            matlist.put(Material.JUNGLE_LOG, "jungle");
            matlist.put(Material.DARK_OAK_LOG, "darkoak");
            matlist.put(Material.MANGROVE_LOG, "mangrove");
            matlist.put(Material.WHEAT, "wheat");
            matlist.put(Material.POTATO, "potato");
            matlist.put(Material.CARROT, "carrot");
            matlist.put(Material.BEETROOT, "beetroot");
            matlist.put(Material.SWEET_BERRIES, "sweetberries");
            matlist.put(Material.PUMPKIN, "pumpkin");
            matlist.put(Material.MELON_SLICE, "melon");
            matlist.put(Material.SUGAR_CANE, "sugarcane");
            matlist.put(Material.RED_MUSHROOM, "redmushroom");
            matlist.put(Material.BROWN_MUSHROOM, "brownmushroom");
            matlist.put(Material.NETHER_WART, "netherwart");
        }
        if (miningitems.isEmpty()) {
            miningitems.add(Material.COAL);
            miningitems.add(Material.RAW_IRON);
            miningitems.add(Material.RAW_COPPER);
            miningitems.add(Material.RAW_GOLD);
            miningitems.add(Material.DIAMOND);
            miningitems.add(Material.EMERALD);
            miningitems.add(Material.LAPIS_LAZULI);
            miningitems.add(Material.REDSTONE);
            miningitems.add(Material.QUARTZ);
            miningitems.add(Material.ANCIENT_DEBRIS);
        }
        if (wooditems.isEmpty()) {
            wooditems.add(Material.OAK_LOG);
            wooditems.add(Material.BIRCH_LOG);
            wooditems.add(Material.SPRUCE_LOG);
            wooditems.add(Material.ACACIA_LOG);
            wooditems.add(Material.CHERRY_LOG);
            wooditems.add(Material.JUNGLE_LOG);
            wooditems.add(Material.DARK_OAK_LOG);
            wooditems.add(Material.MANGROVE_LOG);
        }
        if (farmingitems.isEmpty()) {
            farmingitems.add(Material.WHEAT);
            farmingitems.add(Material.POTATO);
            farmingitems.add(Material.CARROT);
            farmingitems.add(Material.BEETROOT);
            farmingitems.add(Material.SWEET_BERRIES);
            farmingitems.add(Material.PUMPKIN);
            farmingitems.add(Material.MELON_SLICE);
            farmingitems.add(Material.SUGAR_CANE);
            farmingitems.add(Material.RED_MUSHROOM);
            farmingitems.add(Material.BROWN_MUSHROOM);
            farmingitems.add(Material.NETHER_WART);
        }
        if (fireworklist.isEmpty()) {
            itemUtils iu = new itemUtils();
            for (Material mat : wooditems) {
                fireworklist.put(iu.Wood(mat).getItemMeta().getCustomModelData(), matlist.get(mat) + "part");
            }
            for (Material mat : miningitems) {
                if (mat == Material.EMERALD) {
                    continue;
                }
                fireworklist.put(iu.Ores(mat).getItemMeta().getCustomModelData(), matlist.get(mat) + "part");
            }
        }


        Player p = (Player) e.getWhoClicked();
        invUtils iu = new invUtils();
        guiUtils gu = new guiUtils();
        if (e.getView().getTitle().contains(ChatColor.translateAlternateColorCodes('&', "&6Wood Backpack"))) {
            e.setCancelled(true);
            if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR) {
                return;
            }
            if(e.getCurrentItem().getType() == Material.BARRIER){p.closeInventory();}

            if (e.getClickedInventory() == e.getView().getTopInventory()) {
                //Click sur l'inventaire du backpack
                if (e.getCurrentItem().getType() == Material.FIREWORK_STAR) {
                    int modeldata = e.getCurrentItem().getItemMeta().getCustomModelData();
                    if (iu.scaninventoryfirework(p, modeldata)) {
                        ItemStack item = new itemUtils().Wood(modeldata);
                        int amount = fileUtils.getmaterialint(p, fireworklist.get(modeldata));
                        if (amount > 64) {
                            for (int i = amount; i > 0; ) {
                                if (i > 64) {
                                    item.setAmount(64);
                                    p.getInventory().addItem(item);
                                    i = i - 64;
                                } else {
                                    item.setAmount(i);
                                    p.getInventory().addItem(item);
                                    break;
                                }
                            }
                        }
                        else if(amount <= 64){
                            item.setAmount(amount);
                            p.getInventory().addItem(item);
                        }
                        fileUtils.setmaterialint(p, fireworklist.get(modeldata), 0);
                        p.openInventory(gu.getWoodBackpack(p));
                    }
                }
                else if (iu.scaninventorysimple(p, e.getCurrentItem().getType())) {
                    ItemStack item = new ItemStack(e.getCurrentItem().getType());
                    int amount = fileUtils.getmaterialint(p, matlist.get(item.getType()));
                    if (amount > 64) {
                        for (int i = amount; i > 0; ) {
                            if (i > 64) {
                                item.setAmount(64);
                                p.getInventory().addItem(item);
                                i = i - 64;
                            } else {
                                item.setAmount(i);
                                p.getInventory().addItem(item);
                                break;
                            }
                        }
                    }
                    else if(amount <= 64){
                        item.setAmount(amount);
                        p.getInventory().addItem(item);
                    }
                    fileUtils.setmaterialint(p, matlist.get(item.getType()), 0);
                    p.openInventory(gu.getWoodBackpack(p));

                }
            }
            else if (e.getClickedInventory() == e.getView().getBottomInventory()) {
                //click dans l'inventaire du joueur
                if (e.getCurrentItem().getType() == Material.FIREWORK_STAR) {
                    if (e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasCustomModelData()) {
                        int modeldata = e.getCurrentItem().getItemMeta().getCustomModelData();
                        if (fireworklist.containsKey(modeldata)) {
                            if (modeldata >= 2 && modeldata <= 9) {
                                ItemStack item = e.getCurrentItem();
                                int newamount = item.getAmount() + fileUtils.getmaterialint(p, fireworklist.get(modeldata));
                                if (newamount <= iu.tierinventorybackpack(p, "wood")) {
                                    p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                                    fileUtils.setmaterialint(p, fireworklist.get(modeldata), newamount);
                                    p.openInventory(gu.getWoodBackpack(p));
                                }
                            }
                        }
                    }
                }
                else if (wooditems.contains(e.getCurrentItem().getType())) {
                    ItemStack item = e.getCurrentItem();
                    int newamount = item.getAmount() + fileUtils.getmaterialint(p, matlist.get(item.getType()));
                    if (newamount <= iu.tierinventorybackpack(p, "wood")) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        fileUtils.setmaterialint(p, matlist.get(item.getType()), newamount);
                        p.openInventory(gu.getWoodBackpack(p));
                    }
                }
            }
        }
        if (e.getView().getTitle().contains(ChatColor.translateAlternateColorCodes('&', "&6Mining Backpack"))) {
            e.setCancelled(true);
            if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR) {
                return;
            }
            if(e.getCurrentItem().getType() == Material.BARRIER){p.closeInventory();}

            if (e.getClickedInventory() == e.getView().getTopInventory()) {
                //Click sur l'inventaire du backpack
                if (e.getCurrentItem().getType() == Material.FIREWORK_STAR) {
                    int modeldata = e.getCurrentItem().getItemMeta().getCustomModelData();
                    if (iu.scaninventoryfirework(p, modeldata)) {
                        ItemStack item = new itemUtils().Ores(modeldata);
                        int amount = fileUtils.getmaterialint(p, fireworklist.get(modeldata));
                        if (amount > 64) {
                            for (int i = amount; i > 0; ) {
                                if (i > 64) {
                                    item.setAmount(64);
                                    p.getInventory().addItem(item);
                                    i = i - 64;
                                } else {
                                    item.setAmount(i);
                                    p.getInventory().addItem(item);
                                    break;
                                }
                            }
                        }
                        else if(amount <= 64){
                            item.setAmount(amount);
                            p.getInventory().addItem(item);
                        }
                        fileUtils.setmaterialint(p, fireworklist.get(modeldata), 0);
                        p.openInventory(gu.getMiningBackpack(p));
                    }
                }
                else if (iu.scaninventorysimple(p, e.getCurrentItem().getType())) {
                    ItemStack item = new ItemStack(e.getCurrentItem().getType());
                    int amount = fileUtils.getmaterialint(p, matlist.get(item.getType()));
                    if (amount > 64) {
                        for (int i = amount; i > 0; ) {
                            if (i > 64) {
                                item.setAmount(64);
                                p.getInventory().addItem(item);
                                i = i - 64;
                            } else {
                                item.setAmount(i);
                                p.getInventory().addItem(item);
                                break;
                            }
                        }
                    }
                    else if(amount <= 64){
                        item.setAmount(amount);
                        p.getInventory().addItem(item);
                    }
                    fileUtils.setmaterialint(p, matlist.get(item.getType()), 0);
                    p.openInventory(gu.getMiningBackpack(p));

                }
            }
            else if (e.getClickedInventory() == e.getView().getBottomInventory()) {
                //click dans l'inventaire du joueur
                if (e.getCurrentItem().getType() == Material.FIREWORK_STAR) {
                    if (e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasCustomModelData()) {
                        int modeldata = e.getCurrentItem().getItemMeta().getCustomModelData();
                        if (fireworklist.containsKey(modeldata)) {
                            if (modeldata >= 11 && modeldata <= 19) {
                                ItemStack item = e.getCurrentItem();
                                int newamount = item.getAmount() + fileUtils.getmaterialint(p, fireworklist.get(modeldata));
                                if (newamount <= iu.tierinventorybackpack(p, "mining")) {
                                    p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                                    fileUtils.setmaterialint(p, fireworklist.get(modeldata), newamount);
                                    p.openInventory(gu.getMiningBackpack(p));
                                }
                            }
                        }
                    }
                }
                else if (wooditems.contains(e.getCurrentItem().getType())) {
                    ItemStack item = e.getCurrentItem();
                    int newamount = item.getAmount() + fileUtils.getmaterialint(p, matlist.get(item.getType()));
                    if (newamount <= iu.tierinventorybackpack(p, "mining")) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        fileUtils.setmaterialint(p, matlist.get(item.getType()), newamount);
                        p.openInventory(gu.getMiningBackpack(p));
                    }
                }
            }
        }
        if (e.getView().getTitle().contains(ChatColor.translateAlternateColorCodes('&', "&6Farming Backpack"))) {
            e.setCancelled(true);
            if(e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR) {
                return;
            }
            if(e.getCurrentItem().getType() == Material.BARRIER){p.closeInventory();}

            if (e.getClickedInventory() == e.getView().getTopInventory()) {
                //Click sur l'inventaire du backpack
                if (iu.scaninventorysimple(p, e.getCurrentItem().getType())) {
                    ItemStack item = new ItemStack(e.getCurrentItem().getType());
                    int amount = fileUtils.getmaterialint(p, matlist.get(item.getType()));
                    if (amount > 64) {
                        for (int i = amount; i > 0; ) {
                            if (i > 64) {
                                item.setAmount(64);
                                p.getInventory().addItem(item);
                                i = i - 64;
                            } else {
                                item.setAmount(i);
                                p.getInventory().addItem(item);
                                break;
                            }
                        }
                    }
                    else if(amount <= 64){
                        item.setAmount(amount);
                        p.getInventory().addItem(item);
                    }
                    fileUtils.setmaterialint(p, matlist.get(item.getType()), 0);
                    p.openInventory(gu.getFarmingBackpack(p));

                }
            }
            else if (e.getClickedInventory() == e.getView().getBottomInventory()) {
                //click dans l'inventaire du joueur
                 if (wooditems.contains(e.getCurrentItem().getType())) {
                    ItemStack item = e.getCurrentItem();
                    int newamount = item.getAmount() + fileUtils.getmaterialint(p, matlist.get(item.getType()));
                    if (newamount <= iu.tierinventorybackpack(p, "farming")) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        fileUtils.setmaterialint(p, matlist.get(item.getType()), newamount);
                        p.openInventory(gu.getFarmingBackpack(p));
                    }
                }
            }
        }
    }
}