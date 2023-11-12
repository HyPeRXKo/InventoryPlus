package fr.infinitystudios.inventoryplus.commands;

import fr.infinitystudios.inventoryplus.utils.itemUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public class inventoryPlusCommand implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String temp;
        if(sender instanceof Player) {
            Player p = (Player) sender;
            if (args.length > 0 && args[0].equalsIgnoreCase("givebackpack1")) {
                itemUtils iu = new itemUtils();
                p.getInventory().addItem(iu.ItemWoodBackpack(p));
            }
            else if (args.length > 0 && args[0].equalsIgnoreCase("givebackpack2")) {
                itemUtils iu = new itemUtils();
                p.getInventory().addItem(iu.ItemMiningBackpack(p));
            }
            else if (args.length > 0 && args[0].equalsIgnoreCase("givebackpack3")) {
                itemUtils iu = new itemUtils();
                p.getInventory().addItem(iu.ItemFarmingBackpack(p));
            }
        }
        else if(sender instanceof ConsoleCommandSender){
            if (args.length > 0 && args[0].equalsIgnoreCase("givebackpack1")) {
                itemUtils iu = new itemUtils();
                Player p = Bukkit.getPlayer(args[1]);
                p.getInventory().addItem(iu.ItemWoodBackpack(p));
            }
            else if (args.length > 0 && args[0].equalsIgnoreCase("givebackpack2")) {
                itemUtils iu = new itemUtils();
                Player p = Bukkit.getPlayer(args[1]);
                p.getInventory().addItem(iu.ItemMiningBackpack(p));
            }
            else if (args.length > 0 && args[0].equalsIgnoreCase("givebackpack3")) {
                itemUtils iu = new itemUtils();
                Player p = Bukkit.getPlayer(args[1]);
                p.getInventory().addItem(iu.ItemFarmingBackpack(p));
            }
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        return null;
    }
}
