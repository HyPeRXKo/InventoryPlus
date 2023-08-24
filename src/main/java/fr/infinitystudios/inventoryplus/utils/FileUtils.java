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
            playerdata.set("mining.coal", content.get("coal"));
            playerdata.set("mining.rawgold", content.get("rawgold"));
            playerdata.set("mining.goldingot", content.get("gold"));
            playerdata.set("mining.rawiron", content.get("rawiron"));
            playerdata.set("mining.ironingot", content.get("iron"));
        }
        try {
            playerdata.save(playerdatafile);}
        catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();}
    }

    public Map<String, Integer> GetConfigContent(FileConfiguration playerfile){
        Map<String, Integer> content = new HashMap<>();
        content.put("diamond", playerfile.getInt("mining.diamond"));
        content.put("coal", playerfile.getInt("mining.coal"));
        content.put("rawgold", playerfile.getInt("mining.rawgold"));
        content.put("gold", playerfile.getInt("mining.goldingot"));
        content.put("rawiron", playerfile.getInt("mining.rawiron"));
        content.put("iron", playerfile.getInt("mining.iron"));



        return content;
    }

    public Map<String, Integer> EmptyContent(){
        Map<String, Integer> content = new HashMap<>();

        //ORES

        content.put("coal", 0);
        content.put("coalpart", 0);

        content.put("copper", 0);
        content.put("rawcopper", 0);
        content.put("copperpart", 0);

        content.put("iron", 0);
        content.put("rawiron", 0);
        content.put("ironpart", 0);

        content.put("gold", 0);
        content.put("rawgold", 0);
        content.put("goldpart", 0);

        content.put("redstone", 0);
        content.put("redstonepart", 0);

        content.put("lapis", 0);
        content.put("lapispart", 0);

        content.put("diamond", 0);
        content.put("diamondpart", 0);

        content.put("quartz", 0);
        content.put("quartzpart", 0);

        content.put("netherite", 0);
        content.put("netheritepart", 0);

        //WOOD

        content.put("oak", 0);
        content.put("oakpart", 0);

        content.put("spruce", 0);
        content.put("sprucepart", 0);

        content.put("birch", 0);
        content.put("birchpart", 0);

        content.put("acacia", 0);
        content.put("acaciapart", 0);

        content.put("cherry", 0);
        content.put("cherrypart", 0);

        content.put("darkoak", 0);
        content.put("darkoakpart", 0);

        content.put("jungle", 0);
        content.put("junglepart", 0);

        content.put("mangrove", 0);
        content.put("mangrovepart", 0);

        //Farming


        return content;
    }
}
