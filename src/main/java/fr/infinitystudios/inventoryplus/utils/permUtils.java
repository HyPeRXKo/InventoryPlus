package fr.infinitystudios.inventoryplus.utils;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import org.bukkit.entity.Player;

public class permUtils {

    private static final InventoryPlus plugin = InventoryPlus.getPlugin();


    //MINING

    public boolean hasminingperm(Player p){
        return p.hasPermission("inventoryplus.mining.1") ||  p.hasPermission("inventoryplus.mining.2") || p.hasPermission("inventoryplus.mining.3");
    }

    public int whatminingperm(Player p){
        if(p.hasPermission("inventoryplus.mining.1")){return 1;}
        else if(p.hasPermission("inventoryplus.mining.2")){return 2;}
        else if(p.hasPermission("inventoryplus.mining.3")){return 3;}
        else {return 0;}
    }

    public int miningpermstacklmimit(Player p){
        if(p.hasPermission("inventoryplus.mining.1")){return plugin.getConfig().getInt("capacity.mining.tier1");}
        else if(p.hasPermission("inventoryplus.mining.2")){return plugin.getConfig().getInt("capacity.mining.tier2");}
        else if(p.hasPermission("inventoryplus.mining.3")){return plugin.getConfig().getInt("capacity.mining.tier3");}
        else {return 0;}
    }
    public int miningpermstacklmimit(int level){
        if(level == 1){return plugin.getConfig().getInt("capacity.mining.tier1");}
        else if(level == 2){return plugin.getConfig().getInt("capacity.mining.tier2");}
        else if(level == 3){return plugin.getConfig().getInt("capacity.mining.tier3");}
        else {return 0;}
    }

    //WOODS

    public boolean haswoodperm(Player p){
        return p.hasPermission("inventoryplus.wood.1") ||  p.hasPermission("inventoryplus.wood.2") || p.hasPermission("inventoryplus.wood.3");
    }

    public int whatwoodperm(Player p){
        if(p.hasPermission("inventoryplus.wood.1")){return 1;}
        else if(p.hasPermission("inventoryplus.wood.2")){return 2;}
        else if(p.hasPermission("inventoryplus.wood.3")){return 3;}
        else {return 0;}
    }

    public int woodpermstacklmimit(Player p){
        if(p.hasPermission("inventoryplus.wood.1")){return plugin.getConfig().getInt("capacity.wood.tier1");}
        else if(p.hasPermission("inventoryplus.wood.2")){return plugin.getConfig().getInt("capacity.wood.tier2");}
        else if(p.hasPermission("inventoryplus.wood.3")){return plugin.getConfig().getInt("capacity.wood.tier3");}
        else {return 0;}
    }

    public int woodpermstacklmimit(int level){
        if(level == 1){return plugin.getConfig().getInt("capacity.wood.tier1");}
        else if(level == 2){return plugin.getConfig().getInt("capacity.wood.tier2");}
        else if(level == 3){return plugin.getConfig().getInt("capacity.wood.tier3");}
        else {return 0;}
    }


    //FARMING

    public boolean hasfarmingperm(Player p){
        return p.hasPermission("inventoryplus.farming.1") ||  p.hasPermission("inventoryplus.farming.2") || p.hasPermission("inventoryplus.farming.3");
    }

    public int whatfarmingperm(Player p){
        if(p.hasPermission("inventoryplus.farming.1")){return 1;}
        else if(p.hasPermission("inventoryplus.farming.2")){return 2;}
        else if(p.hasPermission("inventoryplus.farming.3")){return 3;}
        else {return 0;}
    }

    public int farmingpermstacklmimit(Player p){
        if(p.hasPermission("inventoryplus.farming.1")){return plugin.getConfig().getInt("capacity.farming.tier1");}
        else if(p.hasPermission("inventoryplus.farming.2")){return plugin.getConfig().getInt("capacity.farming.tier2");}
        else if(p.hasPermission("inventoryplus.farming.3")){return plugin.getConfig().getInt("capacity.farming.tier3");}
        else {return 0;}
    }

    public int farmingpermstacklmimit(int level){
        if(level == 1){return plugin.getConfig().getInt("capacity.farming.tier1");}
        else if(level == 2){return plugin.getConfig().getInt("capacity.farming.tier2");}
        else if(level == 3){return plugin.getConfig().getInt("capacity.farming.tier3");}
        else {return 0;}
    }

}
