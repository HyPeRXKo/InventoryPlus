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
        PermUtils pu = new PermUtils();
        if(pu.hasminingperm(p) || p.isOp()){
            playerdata.set("mining.diamond", content.get("diamond"));
        }
        try {
            playerdata.save(playerdatafile);}
        catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();}
    }

    public Map<String, Integer> GetConfigContent(FileConfiguration playerfile){
        Map<String, Integer> content = new HashMap<>();
        content.put("diamond", playerfile.getInt("mining.diamond"));



        return content;
    }
}
