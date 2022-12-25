package fr.infinitystudios.inventoryplus.utils;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import org.bukkit.entity.Player;

public class PermUtils {

    private static final InventoryPlus plugin = InventoryPlus.getPlugin();


    public boolean hasminingperm(Player p){
        return p.hasPermission("inventoryplus.mining.1") ||  p.hasPermission("inventoryplus.mining.2") || p.hasPermission("inventoryplus.mining.3");
    }

    public int whatminingperm(Player p){
        if(p.hasPermission("inventoryplus.mining.1")){return 1;}
        else if(p.hasPermission("inventoryplus.mining.2")){return 2;}
        else if(p.hasPermission("inventoryplus.mining.2")){return 3;}
        else {return 0;}
    }

    public int miningpermstacklmimit(Player p){
        if(p.hasPermission("inventoryplus.mining.1")){return plugin.getConfig().getInt("capacity.mining.tier1");}
        else if(p.hasPermission("inventoryplus.mining.2")){return plugin.getConfig().getInt("capacity.mining.tier2");}
        else if(p.hasPermission("inventoryplus.mining.2")){return plugin.getConfig().getInt("capacity.mining.tier3");}
        else {return 0;}
    }

}
