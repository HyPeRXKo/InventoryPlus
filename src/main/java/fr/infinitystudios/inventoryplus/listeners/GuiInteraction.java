package fr.infinitystudios.inventoryplus.listeners;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import fr.infinitystudios.inventoryplus.utils.FileUtils;
import fr.infinitystudios.inventoryplus.utils.GuiUtils;
import fr.infinitystudios.inventoryplus.utils.InvUtils;
import fr.infinitystudios.inventoryplus.utils.PermUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class GuiInteraction implements Listener {

    private static final InventoryPlus plugin = InventoryPlus.getPlugin();


    @EventHandler
    public void GuiInteractionEvent(InventoryClickEvent e){
        if(!e.getView().getTitle().contains(ChatColor.translateAlternateColorCodes('&', "&6Mining Backpack"))) {return;}

        e.setCancelled(true);
        Player p = (Player) e.getWhoClicked();
        InvUtils iu = new InvUtils();
        FileUtils fu = new FileUtils();
        GuiUtils gu = new GuiUtils();
        PermUtils pu = new PermUtils();
        if(e.getCurrentItem() == null){return;}
        if(e.getClickedInventory() == e.getView().getBottomInventory()){
            plugin.getLogger().severe("Click en bas");
            switch (e.getCurrentItem().getType()){
                case DIAMOND: {
                    ItemStack diamond = e.getCurrentItem();
                    Map<String, Integer> content = fu.GetConfigContent(fu.GetPlayerConfig(p));
                    int newamount = diamond.getAmount() + content.get("diamond");
                    if (newamount <= pu.miningpermstacklmimit(p)) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        content.put("diamond", newamount);
                        fu.SavePlayerConfig(p, content);
                        p.openInventory(gu.getMiningGUItest(p));
                        break;
                    }
                }
                case COAL: {
                    ItemStack coal = e.getCurrentItem();
                    Map<String, Integer> content = fu.GetConfigContent(fu.GetPlayerConfig(p));
                    int newamount = coal.getAmount() + content.get("coal");
                    if (newamount <= pu.miningpermstacklmimit(p)) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        content.put("coal", newamount);
                        fu.SavePlayerConfig(p, content);
                        p.openInventory(gu.getMiningGUItest(p));
                        break;
                    }
                }
                case RAW_GOLD: {
                    ItemStack rawgold = e.getCurrentItem();
                    Map<String, Integer> content = fu.GetConfigContent(fu.GetPlayerConfig(p));
                    int newamount = rawgold.getAmount() + content.get("rawgold");
                    if (newamount <= pu.miningpermstacklmimit(p)) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        content.put("rawgold", newamount);
                        fu.SavePlayerConfig(p, content);
                        p.openInventory(gu.getMiningGUItest(p));
                        break;
                    }
                }
                case RAW_IRON: {
                    ItemStack rawiron = e.getCurrentItem();
                    Map<String, Integer> content = fu.GetConfigContent(fu.GetPlayerConfig(p));
                    int newamount = rawiron.getAmount() + content.get("rawiron");
                    if (newamount <= pu.miningpermstacklmimit(p)) {
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        content.put("rawiron", newamount);
                        fu.SavePlayerConfig(p, content);
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
                        Map<String, Integer> content = fu.GetConfigContent(fu.GetPlayerConfig(p));
                        ItemStack diamond = new ItemStack(Material.DIAMOND, content.get("diamond"));
                        p.getInventory().addItem(diamond);
                        content.put("diamond", 0);
                        fu.SavePlayerConfig(p, content);
                        p.closeInventory();
                        break;
                    }
                }
                case COAL: {
                    if (iu.scaninventorysingle(p, "coal")) {
                        Map<String, Integer> content = fu.GetConfigContent(fu.GetPlayerConfig(p));
                        ItemStack coal = new ItemStack(Material.COAL, content.get("coal"));
                        p.getInventory().addItem(coal);
                        content.put("coal", 0);
                        fu.SavePlayerConfig(p, content);
                        p.closeInventory();
                        break;
                    }
                }
                case RAW_GOLD: {
                    if (iu.scaninventorysingle(p, "rawgold")) {
                        Map<String, Integer> content = fu.GetConfigContent(fu.GetPlayerConfig(p));
                        ItemStack rawgold = new ItemStack(Material.RAW_GOLD, content.get("rawgold"));
                        p.getInventory().addItem(rawgold);
                        content.put("rawgold", 0);
                        fu.SavePlayerConfig(p, content);
                        p.closeInventory();
                        break;
                    }
                }
                case RAW_IRON: {
                    if (iu.scaninventorysingle(p, "rawiron")) {
                        Map<String, Integer> content = fu.GetConfigContent(fu.GetPlayerConfig(p));
                        ItemStack rawiron = new ItemStack(Material.RAW_IRON, content.get("rawiron"));
                        p.getInventory().addItem(rawiron);
                        content.put("rawiron", 0);
                        fu.SavePlayerConfig(p, content);
                        p.closeInventory();
                        break;
                    }
                }
            }
        }
    }

}
