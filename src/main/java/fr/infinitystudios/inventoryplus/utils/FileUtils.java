package fr.infinitystudios.inventoryplus.utils;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class FileUtils {

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
        if(miningperm(p) || p.isOp()){
            plugin.getLogger().severe("wsh on est ou la" + content.get("diamond"));
            playerdata.set("mining.diamond", content.get("diamond"));
        }
        try {
            playerdata.save(playerdatafile);}
        catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();}
    }

    public boolean miningperm(Player p){
        return p.hasPermission("inventoryplus.mining.1") ||  p.hasPermission("inventoryplus.mining.2") || p.hasPermission("inventoryplus.mining.3");
    }


}
