package fr.infinitystudios.inventoryplus.commands;

import fr.infinitystudios.inventoryplus.utils.GuiUtils;
import fr.infinitystudios.inventoryplus.utils.ItemUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public class InventoryPlusCommand implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String temp;
        if(sender instanceof Player) {
            Player p = (Player) sender;
            if (args.length > 0 && args[0].equalsIgnoreCase("givebackpack")) {
                ItemUtils iu = new ItemUtils();
                p.getInventory().addItem(iu.ItemMiningBackpack(p));
            } else {
                GuiUtils gu = new GuiUtils();
                p.openInventory(gu.getMiningGUItest(p));
            }
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        return null;
    }
}
