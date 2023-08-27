package fr.infinitystudios.inventoryplus.listeners;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import fr.infinitystudios.inventoryplus.utils.fileUtils;
import fr.infinitystudios.inventoryplus.utils.guiUtils;
import fr.infinitystudios.inventoryplus.utils.invUtils;
import fr.infinitystudios.inventoryplus.utils.permUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class guiInteraction implements Listener {

    private static final InventoryPlus plugin = InventoryPlus.getPlugin();


    @EventHandler
    public void GuiInteractionEvent(InventoryClickEvent e){
        if(!e.getView().getTitle().contains(ChatColor.translateAlternateColorCodes('&', "&6Mining Backpack"))) {return;}



        e.setCancelled(true);
        Player p = (Player) e.getWhoClicked();
        invUtils iu = new invUtils();
        fileUtils fu = new fileUtils();
        guiUtils gu = new guiUtils();
        permUtils pu = new permUtils();
        if(e.getCurrentItem() == null){return;}
        if(e.getClickedInventory() == e.getView().getBottomInventory()){
            plugin.getLogger().severe("Click en bas");
            switch (e.getCurrentItem().getType()){
                case DIAMOND: {
                    ItemStack diamond = e.getCurrentItem();
                    Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
                    int newamount = diamond.getAmount() + content.get("diamond");
                    if (newamount <= pu.miningpermstacklmimit(p)) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        content.put("diamond", newamount);
                        fu.savePlayerConfig(p, content);
                        p.openInventory(gu.getMiningGUItest(p));
                        break;
                    }
                }
                case COAL: {
                    ItemStack coal = e.getCurrentItem();
                    Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
                    int newamount = coal.getAmount() + content.get("coal");
                    if (newamount <= pu.miningpermstacklmimit(p)) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        content.put("coal", newamount);
                        fu.savePlayerConfig(p, content);
                        p.openInventory(gu.getMiningGUItest(p));
                        break;
                    }
                }
                case RAW_GOLD: {
                    ItemStack rawgold = e.getCurrentItem();
                    Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
                    int newamount = rawgold.getAmount() + content.get("rawgold");
                    if (newamount <= pu.miningpermstacklmimit(p)) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        content.put("rawgold", newamount);
                        fu.savePlayerConfig(p, content);
                        p.openInventory(gu.getMiningGUItest(p));
                        break;
                    }
                }
                case RAW_IRON: {
                    ItemStack rawiron = e.getCurrentItem();
                    Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
                    int newamount = rawiron.getAmount() + content.get("rawiron");
                    if (newamount <= pu.miningpermstacklmimit(p)) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        content.put("rawiron", newamount);
                        fu.savePlayerConfig(p, content);
                        p.openInventory(gu.getMiningGUItest(p));
                        break;
                    }
                }
                case GOLD_INGOT: {
                    ItemStack gold = e.getCurrentItem();
                    Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
                    int newamount = gold.getAmount() + content.get("gold");
                    if (newamount <= pu.miningpermstacklmimit(p)) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        content.put("gold", newamount);
                        fu.savePlayerConfig(p, content);
                        p.openInventory(gu.getMiningGUItest(p));
                        break;
                    }
                }
                case IRON_INGOT: {
                    ItemStack iron = e.getCurrentItem();
                    Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
                    int newamount = iron.getAmount() + content.get("iron");
                    if (newamount <= pu.miningpermstacklmimit(p)) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        content.put("iron", newamount);
                        fu.savePlayerConfig(p, content);
                        p.openInventory(gu.getMiningGUItest(p));
                        break;
                    }
                }
            }
        }
        else if(e.getClickedInventory() == e.getView().getTopInventory()){
            plugin.getLogger().severe("click en haut");
            switch (e.getCurrentItem().getType()) {
                case DIAMOND: {
                    if (iu.scaninventorysingle(p, "diamond")) {
                        Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
                        ItemStack diamond = new ItemStack(Material.DIAMOND, content.get("diamond"));
                        p.getInventory().addItem(diamond);
                        content.put("diamond", 0);
                        fu.savePlayerConfig(p, content);
                        p.closeInventory();
                        break;
                    }
                }
                case COAL: {
                    if (iu.scaninventorysingle(p, "coal")) {
                        Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
                        ItemStack coal = new ItemStack(Material.COAL, content.get("coal"));
                        p.getInventory().addItem(coal);
                        content.put("coal", 0);
                        fu.savePlayerConfig(p, content);
                        p.closeInventory();
                        break;
                    }
                }
                case RAW_GOLD: {
                    if (iu.scaninventorysingle(p, "rawgold")) {
                        Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
                        ItemStack rawgold = new ItemStack(Material.RAW_GOLD, content.get("rawgold"));
                        p.getInventory().addItem(rawgold);
                        content.put("rawgold", 0);
                        fu.savePlayerConfig(p, content);
                        p.closeInventory();
                        break;
                    }
                }
                case RAW_IRON: {
                    if (iu.scaninventorysingle(p, "rawiron")) {
                        Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
                        ItemStack rawiron = new ItemStack(Material.RAW_IRON, content.get("rawiron"));
                        p.getInventory().addItem(rawiron);
                        content.put("rawiron", 0);
                        fu.savePlayerConfig(p, content);
                        p.closeInventory();
                        break;
                    }
                }
                case GOLD_INGOT: {
                    if (iu.scaninventorysingle(p, "gold")) {
                        Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
                        ItemStack gold = new ItemStack(Material.GOLD_INGOT, content.get("gold"));
                        p.getInventory().addItem(gold);
                        content.put("gold", 0);
                        fu.savePlayerConfig(p, content);
                        p.closeInventory();
                        break;
                    }
                }
                case IRON_INGOT: {
                    if (iu.scaninventorysingle(p, "iron")) {
                        Map<String, Integer> content = fu.getConfigContent(fu.getPlayerConfig(p));
                        ItemStack iron = new ItemStack(Material.IRON_INGOT, content.get("iron"));
                        p.getInventory().addItem(iron);
                        content.put("iron", 0);
                        fu.savePlayerConfig(p, content);
                        p.closeInventory();
                        break;
                    }
                }
            }
        }
    }

}
