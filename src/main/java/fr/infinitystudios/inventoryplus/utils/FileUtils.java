package fr.infinitystudios.inventoryplus.utils;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileUtils {

    private static final String[] ores = {"coal", "coalpart", "copper", "rawcopper", "copperpart", "iron", "rawiron", "ironpart", "gold", "rawgold", "goldpart", "redstone", "redstonepart", "lapis", "lapispart", "diamond", "diamondpart", "emerald", "quartz", "quartzpart", "netherite", "netheritepart"};
    private static final String[] woods = {"oak", "oakpart", "spruce", "sprucepart", "birch", "birchpart", "acacia", "acaciapart", "cherry", "cherrypart", "darkoak", "darkoakpart", "jungle", "junglepart", "mangrove", "mangrovepart"};
    private static final String[] farming = {"wheat", "carrot", "potato", "beetroot", "sweetberries", "pumpkin", "melon", "sugarcane", "netherwart", "brownmushroom", "redmushroom"};


    private static final InventoryPlus plugin = InventoryPlus.getPlugin();

    public FileConfiguration GetPlayerConfig(Player p) {
        FileConfiguration playerdata;
        File playerdatafile = new File(plugin.getDataFolder() + "/data/", p.getUniqueId() + ".yml");
        if (!playerdatafile.exists()) {return null;}
        playerdata = new YamlConfiguration();
        try {
            playerdata.load(playerdatafile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
        return playerdata;
    }

    public void SavePlayerConfig(Player p, Map<String, Integer> content){
        FileConfiguration playerdata;
        File playerdatafile = new File(plugin.getDataFolder() + "/data/", p.getUniqueId() + ".yml");
        playerdata = new YamlConfiguration();
        playerdata.set("player", p.getName());
        for(String i: ores){
            playerdata.set("mining." + i, content.get(i));
        }
        for(String i: woods){
            playerdata.set("wood." + i, content.get(i));
        }
        for(String i: farming){
            playerdata.set("farming." + i, content.get(i));
        }

        try {
            playerdata.save(playerdatafile);}
        catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();}
    }

    public Map<String, Integer> GetConfigContent(FileConfiguration playerfile){
        Map<String, Integer> content = new HashMap<>();

        for(String i: ores){
            content.put(i, playerfile.getInt("mining." + i));
        }
        for(String i: woods){
            content.put(i, playerfile.getInt("wood." + i));
        }
        for(String i: farming){
            content.put(i, playerfile.getInt("farming." + i));
        }


        return content;
    }

    public Map<String, Integer> EmptyContent(){
        Map<String, Integer> content = new HashMap<>();

        //ORES

        for (String i: ores) {
            content.put(i, 0);
        }

        //WOOD

        for (String i: woods) {
            content.put(i, 0);
        }

        //Farming

        for (String i: farming) {
            content.put(i, 0);
        }

        return content;
    }
}
