package fr.infinitystudios.inventoryplus;

import fr.infinitystudios.inventoryplus.commands.inventoryPlusCommand;
import fr.infinitystudios.inventoryplus.listeners.guiInteraction;
import fr.infinitystudios.inventoryplus.listeners.playerConnect;
import fr.infinitystudios.inventoryplus.listeners.playerLoot;
import fr.infinitystudios.inventoryplus.listeners.rightClickListener;
import fr.infinitystudios.inventoryplus.utils.fileUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Map;
import java.util.UUID;

public final class InventoryPlus extends JavaPlugin {

    private static InventoryPlus plugin;
    public static InventoryPlus getPlugin(){
        return plugin;
    }


    @Override
    public void onEnable() {
        plugin = this;


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

        //re-populate the backpack caches
        backpackReload();

        //periodic save
        new fileUtils().periodicsave();

        //create/update backup
        new fileUtils().updateBackups();

        plugin.getLogger().info("InventoryPlus is correctly initialized");
    }
    @Override
    public void onDisable() {
        fileUtils fu = new fileUtils();
        Map<UUID, Map<String, Integer>> contentsavedasync = fileUtils.getloadedcontent();
        contentsavedasync.forEach((k, v) -> fu.savePlayerConfig(k, v));

        plugin.getLogger().info("InventoryPlus did a correct save");
    }


    public static void checkfolder(){
        File subfolder = new File(plugin.getDataFolder() + "/data/");
        if( !subfolder.exists() ) subfolder.mkdir();
        File backupfolder = new File(plugin.getDataFolder() + "/data/backup");
        if( !backupfolder.exists() ) backupfolder.mkdir();
    }

    public void backpackReload(){
        fileUtils fu = new fileUtils();
        if(!Bukkit.getOnlinePlayers().isEmpty()){
            for(Player p: Bukkit.getOnlinePlayers()){
                if(!fileUtils.playerContentExist(p)){

                    fileUtils.setloadedcontent(p,fu.getConfigContent(fu.getPlayerConfig(p)));
                }
            }
        }
    }

}


//TODO CHOOSE BETWEEN GENERALIZED IVENTORIES OR ITEM NBT (DONE, FIRST OPTION)
//TODO : STRUCTURE FICHIER (Player name,mining storage, wood storage, farming storage, old save system recovery)
//TODO : Load file, structure every section.
//TODO : Save file
//TODO : Make the Item/GUI system.
//TODO : Loot system (check maximum via config), scanning inventory, ...
//TODO : Commands to see it/reload (admin thing)
