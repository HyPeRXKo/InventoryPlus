package fr.infinitystudios.inventoryplus;

import fr.infinitystudios.inventoryplus.commands.inventoryPlusCommand;
import fr.infinitystudios.inventoryplus.listeners.guiInteraction;
import fr.infinitystudios.inventoryplus.listeners.playerConnect;
import fr.infinitystudios.inventoryplus.listeners.playerLoot;
import fr.infinitystudios.inventoryplus.listeners.rightClickListener;
import fr.infinitystudios.inventoryplus.utils.fileUtils;
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


        //command
        getCommand("InventoryPlus").setExecutor(new inventoryPlusCommand());

        //listeners
        getServer().getPluginManager().registerEvents(new playerLoot(), this);
        getServer().getPluginManager().registerEvents(new guiInteraction(), this);
        getServer().getPluginManager().registerEvents(new playerConnect(), this);
        getServer().getPluginManager().registerEvents(new rightClickListener(), this);

        //configs
        getConfig().options().configuration();
        saveDefaultConfig();
        checkfolder();

        //periodic save
        new fileUtils().periodicsave();
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


//TODO CHOOSE BETWEEN GENERALIZED IVENTORIES OR ITEM NBT (DONE, FIRST OPTION)
//TODO : STRUCTURE FICHIER (Player name,mining storage, wood storage, farming storage, old save system recovery)
//TODO : Load file, structure every section.
//TODO : Save file
//TODO : Make the Item/GUI system.
//TODO : Loot system (check maximum via config), scanning inventory, ...
//TODO : Commands to see it/reload (admin thing)
