package fr.infinitystudios.inventoryplus.utils;

import com.sun.tools.javac.jvm.Items;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class itemUtils {

    public String cc(String string){
        return ChatColor.translateAlternateColorCodes('&', string);}

    public ItemStack Wood(Material material){
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add(cc("&8Put 4 in a crafting table"));
        lore.add(cc("&8to get a log"));


        switch (material) {
            case OAK_LOG:{
                meta.setCustomModelData(2);
                meta.setDisplayName("Oak Log Parts");
                break;
            }
            case SPRUCE_LOG:{
                meta.setCustomModelData(3);
                meta.setDisplayName("Spruce Log Parts");
                break;
            }
            case BIRCH_LOG:{
                meta.setCustomModelData(4);
                meta.setDisplayName("Birch Log Parts");
                break;
            }
            case ACACIA_LOG:{
                meta.setCustomModelData(5);
                meta.setDisplayName("Acacia Log Parts");
                break;
            }
            case CHERRY_LOG:{
                meta.setCustomModelData(6);
                meta.setDisplayName("Cherry Log Parts");
                break;
            }
            case DARK_OAK_LOG: {
                meta.setCustomModelData(7);
                meta.setDisplayName("Dark Oak Log Parts");
                break;
            }
            case JUNGLE_LOG:{
                meta.setCustomModelData(8);
                meta.setDisplayName("Jungle Log Parts");
                break;
            }
            case MANGROVE_LOG:{
                meta.setCustomModelData(9);
                meta.setDisplayName("Mangrove Log Parts");
                break;
            }
            default:{
                return null;
            }
        }

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack Ores(Material material){
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();

        switch (material){
            case RAW_IRON:{
                meta.setCustomModelData(11);
                meta.setDisplayName("Raw Iron Parts");
                lore.add(cc("&8Put 3 in a crafting table"));
                lore.add(cc("&8to get a raw iron"));
                break;
            }
            case RAW_GOLD:{
                meta.setCustomModelData(12);
                meta.setDisplayName("Raw Gold Parts");
                lore.add(cc("&8Put 3 in a crafting table"));
                lore.add(cc("&8to get a raw gold"));
                break;
            }
            case RAW_COPPER:{
                meta.setCustomModelData(13);
                meta.setDisplayName("Raw Copper Parts");
                lore.add(cc("&8Put 3 in a crafting table"));
                lore.add(cc("&8to get a raw copper"));
                break;
            }
            case COAL:{
                meta.setCustomModelData(14);
                meta.setDisplayName("Coal Parts");
                lore.add(cc("&8Put 4 in a crafting table"));
                lore.add(cc("&8to get a coal"));
                break;
            }
            case LAPIS_LAZULI:{
                meta.setCustomModelData(15);
                meta.setDisplayName("Lapis Lazuli Parts");
                lore.add(cc("&8Put 6 in a crafting table"));
                lore.add(cc("&8to get a lapis lazuli"));
                break;
            }
            case REDSTONE:{
                meta.setCustomModelData(16);
                meta.setDisplayName("Redstone Parts");
                lore.add(cc("&8Put 2 in a crafting table"));
                lore.add(cc("&8to get a redstone dust"));
                break;
            }
            case DIAMOND:{
                meta.setCustomModelData(17);
                meta.setDisplayName("Diamond Parts");
                lore.add(cc("&8Put 5 in a crafting table"));
                lore.add(cc("&8to get a diamond"));
                break;
            }
            case QUARTZ:{
                meta.setCustomModelData(18);
                meta.setDisplayName("Quartz Parts");
                lore.add(cc("&8Put 2 in a crafting table"));
                lore.add(cc("&8to get a quartz"));
                break;
            }
            case ANCIENT_DEBRIS:{
                meta.setCustomModelData(19);
                meta.setDisplayName("Ancient Debris Parts");
                lore.add(cc("&8Put 3 in a crafting table"));
                lore.add(cc("&8to get a ancient debris"));
                break;
            }
            default:{
                return null;
            }
        }

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }



    //backpacks

    public ItemStack ItemWoodBackpack(Player p){
        permUtils pu = new permUtils();
        ItemStack backpack = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = backpack.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        int permlevel = pu.whatminingperm(p);
        if(permlevel == 1 || p.isOp()){
            meta.setDisplayName(cc("&c&lWood Backpack"));
            lore.add(cc("&8Tier 1"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &964 per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
        }
        else if(permlevel == 2){
            meta.setDisplayName(cc("&c&lWood Backpack"));
            lore.add(cc("&8Tier 2"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &3128 per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
        }
        else if(permlevel == 3){
            meta.setDisplayName(cc("&c&lWood Backpack"));
            lore.add(cc("&8Tier 3"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &b256 per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
        }

        meta.setCustomModelData(150);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        backpack.setItemMeta(meta);

        return backpack;
    }
    public ItemStack ItemMiningBackpack(Player p){
        permUtils pu = new permUtils();
        ItemStack backpack = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = backpack.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        int permlevel = pu.whatminingperm(p);
        if(permlevel == 1 || p.isOp()){
            meta.setDisplayName(cc("&9&lMining Backpack"));
            lore.add(cc("&8Tier 1"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &964 per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
        }
        else if(permlevel == 2){
            meta.setDisplayName(cc("&3&lMining Backpack"));
            lore.add(cc("&8Tier 2"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &3128 per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
        }
        else if(permlevel == 3){
            meta.setDisplayName(cc("&b&lMining Backpack"));
            lore.add(cc("&8Tier 3"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &b256 per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
        }

        meta.setCustomModelData(151);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        backpack.setItemMeta(meta);

        return backpack;
    }

    public ItemStack ItemFarmingBackpack(Player p){
        permUtils pu = new permUtils();
        ItemStack backpack = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = backpack.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        int permlevel = pu.whatminingperm(p);
        if(permlevel == 1 || p.isOp()){
            meta.setDisplayName(cc("&e&lFarming Backpack"));
            lore.add(cc("&8Tier 1"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &964 per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
        }
        else if(permlevel == 2){
            meta.setDisplayName(cc("&e&lFarming Backpack"));
            lore.add(cc("&8Tier 2"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &3128 per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
        }
        else if(permlevel == 3){
            meta.setDisplayName(cc("&e&lFarming Backpack"));
            lore.add(cc("&8Tier 3"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &b256 per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
        }

        meta.setCustomModelData(152);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        backpack.setItemMeta(meta);

        return backpack;
    }


    //Wood

    public ItemStack itemGuiOak(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.OAK_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("oak");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Oak Log"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
    public ItemStack itemGuiOakPart(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("oakpart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Oak Log Part"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }

        meta.setCustomModelData(2);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiSpruce(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.SPRUCE_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("spruce");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Spruce Log"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
    public ItemStack itemGuiSprucePart(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("sprucepart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Spruce Log Part"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }

        meta.setCustomModelData(3);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiBirch(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.BIRCH_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("birch");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&Birch Log"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
    public ItemStack itemGuiBirchPart(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("birchpart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&Birch Log Part"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }

        meta.setCustomModelData(4);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiAcacia(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.ACACIA_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("acacia");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Acacia Log"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
    public ItemStack itemGuiAcaciaPart(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("acaciapart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Acacia Log Part"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }

        meta.setCustomModelData(5);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiCherry(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.CHERRY_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("cherry");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Cherry Log"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
    public ItemStack itemGuiCherryPart(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("cherrypart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Cherry Log Part"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }

        meta.setCustomModelData(6);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiDarkOak(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.DARK_OAK_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("darkoak");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Dark Oak Log"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
    public ItemStack itemGuiDarkOakPart(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("darkoakpart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Dark Oak Log Part"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }

        meta.setCustomModelData(7);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiJungle(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.JUNGLE_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("jungle");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&Jungle Log"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
    public ItemStack itemGuiJunglePart(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("junglepart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&Jungle Log Part"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }

        meta.setCustomModelData(8);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiMangrove(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.MANGROVE_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("mangrove");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Mangrove Log"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
    public ItemStack itemGuiMangrovePart(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fu.getloadedcontent(p).get("mangrovepart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Mangrove Log Part"));
        lore.add(cc("&8Wood Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.woodpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }

        meta.setCustomModelData(9);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }



    //Mining

    public ItemStack ItemGuiDiamond(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack diamond = new ItemStack(Material.DIAMOND);
        ItemMeta meta = diamond.getItemMeta();
        int diamondamount = fu.getPlayerConfig(p).getInt("mining.diamond");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&bDiamond"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + diamondamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(diamondamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        diamond.setItemMeta(meta);

        return diamond;
    }
    public ItemStack ItemGuiGoldIngot(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack gold = new ItemStack(Material.GOLD_INGOT);
        ItemMeta meta = gold.getItemMeta();
        int goldamount = fu.getPlayerConfig(p).getInt("mining.gold");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Gold Ingot"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + goldamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(goldamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        gold.setItemMeta(meta);

        return gold;
    }
    public ItemStack ItemGuiGoldRaw(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack rawgold = new ItemStack(Material.RAW_GOLD);
        ItemMeta meta = rawgold.getItemMeta();
        int rawgoldamount = fu.getPlayerConfig(p).getInt("mining.rawgold");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Raw Gold"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + rawgoldamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(rawgoldamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        rawgold.setItemMeta(meta);

        return rawgold;
    }
    public ItemStack ItemGuiIronRaw(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack rawiron = new ItemStack(Material.RAW_IRON);
        ItemMeta meta = rawiron.getItemMeta();
        int rawironamount = fu.getPlayerConfig(p).getInt("mining.rawiron");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&fRaw Iron"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + rawironamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(rawironamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        rawiron.setItemMeta(meta);

        return rawiron;
    }
    public ItemStack ItemGuiIronIngot(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack iron = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = iron.getItemMeta();
        int ironamount = fu.getPlayerConfig(p).getInt("mining.iron");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&fIron Ingot"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + ironamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(ironamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        iron.setItemMeta(meta);

        return iron;
    }
    public ItemStack ItemGuiCoal(Player p){
        fileUtils fu = new fileUtils();
        permUtils pu = new permUtils();
        ItemStack coal = new ItemStack(Material.COAL);
        ItemMeta meta = coal.getItemMeta();
        int coalamount = fu.getPlayerConfig(p).getInt("mining.coal");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&7Coal Ingot"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + coalamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(coalamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        coal.setItemMeta(meta);

        return coal;
    }

}
