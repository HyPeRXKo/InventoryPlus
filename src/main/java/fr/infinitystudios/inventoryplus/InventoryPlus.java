package fr.infinitystudios.inventoryplus;

import fr.infinitystudios.inventoryplus.commands.InventoryPlusCommand;
import fr.infinitystudios.inventoryplus.listeners.PlayerLoot;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class InventoryPlus extends JavaPlugin {

    private static InventoryPlus plugin;
    public static InventoryPlus getPlugin(){
        return plugin;
    }


    @Override
    public void onEnable() {
        plugin = this;
        plugin.getLogger().info("Starting");
        getCommand("InventoryPlus").setExecutor(new InventoryPlusCommand());
        getServer().getPluginManager().registerEvents(new PlayerLoot(), this);
        getConfig().options().configuration();
        saveDefaultConfig();
        checkfolder();
    }
    @Override
    public void onDisable() {
        plugin.getLogger().info("Quitting");
    }


    public static void checkfolder(){
        File subfolder = new File(plugin.getDataFolder() + "/data/");
        if( !subfolder.exists() ) subfolder.mkdir();
    }

}



//TODO CHOOSE BETWEEN GENERALIZED IVENTORIES OR ITEM NBT
//TODO : STRUCTURE FICHIER (Player name,mining storage, wood storage, farming storage)
//TODO : Load file, structure every section.
//TODO : Save file
//TODO : Make the Item/GUI system.
//TODO : Loot system, scanning inventory, ...
//TODO : Commands to see it/reload (admin thing)
