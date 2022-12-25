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
                case DIAMOND:
                    ItemStack diamond = e.getCurrentItem();
                    Map<String, Integer> content = fu.GetConfigContent(fu.GetPlayerConfig(p));
                    int newamount = diamond.getAmount() + content.get("diamond");
                    if(newamount <= 200){
                        p.getInventory().setItem(e.getSlot(), new ItemStack(Material.AIR));
                        content.put("diamond", newamount);
                        fu.SavePlayerConfig(p, content);
                        p.openInventory(gu.getMiningGUItest(p));
                        break;
                    }
            }
        }
        else if(e.getClickedInventory() == e.getView().getTopInventory()){
            plugin.getLogger().severe("click en haut");
            switch (e.getCurrentItem().getType()) {
                case DIAMOND:
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
        }

    }

}
