package fr.infinitystudios.inventoryplus.utils;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

public class itemUtils {
    private static final InventoryPlus plugin = InventoryPlus.getPlugin();

    public String cc(String string){
        return ChatColor.translateAlternateColorCodes('&', string);}

    public ItemStack Wood(Material mat){
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add(cc("&8Put 4 in a crafting table"));
        lore.add(cc("&8to get a log"));


        switch (mat) {
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
    public ItemStack Wood(int modeldata){
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add(cc("&8Put 4 in a crafting table"));
        lore.add(cc("&8to get a log"));


        switch (modeldata) {
            case 2:{
                meta.setCustomModelData(2);
                meta.setDisplayName("Oak Log Parts");
                break;
            }
            case 3:{
                meta.setCustomModelData(3);
                meta.setDisplayName("Spruce Log Parts");
                break;
            }
            case 4:{
                meta.setCustomModelData(4);
                meta.setDisplayName("Birch Log Parts");
                break;
            }
            case 5:{
                meta.setCustomModelData(5);
                meta.setDisplayName("Acacia Log Parts");
                break;
            }
            case 6:{
                meta.setCustomModelData(6);
                meta.setDisplayName("Cherry Log Parts");
                break;
            }
            case 7:{
                meta.setCustomModelData(7);
                meta.setDisplayName("Dark Oak Log Parts");
                break;
            }
            case 8:{
                meta.setCustomModelData(8);
                meta.setDisplayName("Jungle Log Parts");
                break;
            }
            case 9:{
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
            case COAL:{
                meta.setCustomModelData(14);
                meta.setDisplayName("Coal Parts");
                lore.add(cc("&8Put 4 in a crafting table"));
                lore.add(cc("&8to get a coal"));
                break;
            }
            case RAW_IRON:{
                meta.setCustomModelData(11);
                meta.setDisplayName("Raw Iron Parts");
                lore.add(cc("&8Put 3 in a crafting table"));
                lore.add(cc("&8to get a raw iron"));
                break;
            }
            case RAW_COPPER:{
                meta.setCustomModelData(13);
                meta.setDisplayName("Raw Copper Parts");
                lore.add(cc("&8Put 3 in a crafting table"));
                lore.add(cc("&8to get a raw copper"));
                break;
            }
            case RAW_GOLD:{
                meta.setCustomModelData(12);
                meta.setDisplayName("Raw Gold Parts");
                lore.add(cc("&8Put 3 in a crafting table"));
                lore.add(cc("&8to get a raw gold"));
                break;
            }
            case DIAMOND:{
                meta.setCustomModelData(17);
                meta.setDisplayName("Diamond Parts");
                lore.add(cc("&8Put 5 in a crafting table"));
                lore.add(cc("&8to get a diamond"));
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
    public ItemStack Ores(int modeldata){
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();

        switch (modeldata){
            case 14:{
                meta.setCustomModelData(14);
                meta.setDisplayName("Coal Parts");
                lore.add(cc("&8Put 4 in a crafting table"));
                lore.add(cc("&8to get a coal"));
                break;
            }
            case 11:{
                meta.setCustomModelData(11);
                meta.setDisplayName("Raw Iron Parts");
                lore.add(cc("&8Put 3 in a crafting table"));
                lore.add(cc("&8to get a raw iron"));
                break;
            }
            case 13:{
                meta.setCustomModelData(13);
                meta.setDisplayName("Raw Copper Parts");
                lore.add(cc("&8Put 3 in a crafting table"));
                lore.add(cc("&8to get a raw copper"));
                break;
            }
            case 12:{
                meta.setCustomModelData(12);
                meta.setDisplayName("Raw Gold Parts");
                lore.add(cc("&8Put 3 in a crafting table"));
                lore.add(cc("&8to get a raw gold"));
                break;
            }
            case 17:{
                meta.setCustomModelData(17);
                meta.setDisplayName("Diamond Parts");
                lore.add(cc("&8Put 5 in a crafting table"));
                lore.add(cc("&8to get a diamond"));
                break;
            }
            case 15:{
                meta.setCustomModelData(15);
                meta.setDisplayName("Lapis Lazuli Parts");
                lore.add(cc("&8Put 6 in a crafting table"));
                lore.add(cc("&8to get a lapis lazuli"));
                break;
            }
            case 16:{
                meta.setCustomModelData(16);
                meta.setDisplayName("Redstone Parts");
                lore.add(cc("&8Put 2 in a crafting table"));
                lore.add(cc("&8to get a redstone dust"));
                break;
            }
            case 18:{
                meta.setCustomModelData(18);
                meta.setDisplayName("Quartz Parts");
                lore.add(cc("&8Put 2 in a crafting table"));
                lore.add(cc("&8to get a quartz"));
                break;
            }
            case 19:{
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


    public ItemStack exitBarrier(){
        ItemStack item = new ItemStack(Material.BARRIER);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setDisplayName(cc("&4Exit"));
        lore.add(cc("&cClick to exit"));

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
        int permlevel = pu.whatwoodperm(p);
        if(permlevel == 1){
            meta.setDisplayName(cc("&c&lWood Backpack"));
            lore.add(cc("&8Tier 1"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &9"+pu.woodpermstacklmimit(p)+" per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
            meta.getPersistentDataContainer().set(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER, 1);
        }
        else if(permlevel == 2){
            meta.setDisplayName(cc("&c&lWood Backpack"));
            lore.add(cc("&8Tier 2"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &3"+pu.woodpermstacklmimit(p)+" per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
            meta.getPersistentDataContainer().set(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER, 2);
        }
        else if(permlevel == 3){
            meta.setDisplayName(cc("&c&lWood Backpack"));
            lore.add(cc("&8Tier 3"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &b"+pu.woodpermstacklmimit(p)+" per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
            meta.getPersistentDataContainer().set(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER, 3);
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
        if(permlevel == 1){
            meta.setDisplayName(cc("&9&lMining Backpack"));
            lore.add(cc("&8Tier 1"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &9"+pu.miningpermstacklmimit(p)+" per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
            meta.getPersistentDataContainer().set(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER, 1);
        }
        else if(permlevel == 2){
            meta.setDisplayName(cc("&3&lMining Backpack"));
            lore.add(cc("&8Tier 2"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &3"+pu.miningpermstacklmimit(p)+" per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
            meta.getPersistentDataContainer().set(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER, 2);
        }
        else if(permlevel == 3){
            meta.setDisplayName(cc("&b&lMining Backpack"));
            lore.add(cc("&8Tier 3"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &b"+pu.miningpermstacklmimit(p)+" per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
            meta.getPersistentDataContainer().set(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER, 3);
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
        int permlevel = pu.whatfarmingperm(p);
        if(permlevel == 1){
            meta.setDisplayName(cc("&e&lFarming Backpack"));
            lore.add(cc("&8Tier 1"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &9"+pu.farmingpermstacklmimit(p)+" per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
            meta.getPersistentDataContainer().set(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER, 1);
        }
        else if(permlevel == 2){
            meta.setDisplayName(cc("&e&lFarming Backpack"));
            lore.add(cc("&8Tier 2"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &3"+pu.farmingpermstacklmimit(p)+" per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
            meta.getPersistentDataContainer().set(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER, 2);
        }
        else if(permlevel == 3){
            meta.setDisplayName(cc("&e&lFarming Backpack"));
            lore.add(cc("&8Tier 3"));
            lore.add("");
            lore.add(cc("&7Item pickup directly goes"));
            lore.add(cc("&7into your backpack"));
            lore.add("");
            lore.add(cc("&7Capacity : &b"+pu.farmingpermstacklmimit(p)+" per item"));
            lore.add("");
            lore.add(cc("&6Right click in your hand"));
            lore.add(cc("&6to open it"));
            meta.getPersistentDataContainer().set(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER, 3);
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.OAK_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("oak");
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("oakpart");
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.SPRUCE_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("spruce");
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("sprucepart");
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.BIRCH_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("birch");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Birch Log"));
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("birchpart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Birch Log Part"));
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.ACACIA_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("acacia");
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("acaciapart");
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.CHERRY_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("cherry");
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("cherrypart");
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.DARK_OAK_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("darkoak");
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("darkoakpart");
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.JUNGLE_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("jungle");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Jungle Log"));
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("junglepart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&6Jungle Log Part"));
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.MANGROVE_LOG);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("mangrove");
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
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("mangrovepart");
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

    public ItemStack itemGuiCoal(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.COAL);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("coal");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BCoal"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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
    public ItemStack itemGuiCoalPart(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("coalpart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BCoal Part"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        meta.setCustomModelData(14);

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiIronIngot(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("iron");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BIron"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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
    public ItemStack itemGuiRawIron(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.RAW_IRON);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("rawiron");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BRaw Iron"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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
    public ItemStack itemGuiRawIronPart(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("rawironpart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BRaw Iron Part"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        meta.setCustomModelData(11);

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
    public ItemStack itemGuiGoldIngot(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.GOLD_INGOT);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("gold");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BGold Ingot"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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
    public ItemStack itemGuiRawGold(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.RAW_GOLD);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("rawgold");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BRaw Gold"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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
    public ItemStack itemGuiRawGoldPart(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("rawgoldpart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BRaw Gold Part"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        meta.setCustomModelData(12);

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiCopperIngot(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.COPPER_INGOT);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("copper");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&bCopper Ingot"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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
    public ItemStack itemGuiRawCopper(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.RAW_COPPER);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("rawcopper");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&bRaw Copper"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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
    public ItemStack itemGuiRawCopperPart(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("rawcopperpart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&bRaw Copper Part"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        meta.setCustomModelData(13);

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiDiamond(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.DIAMOND);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("diamond");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BDiamond"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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

    public ItemStack itemGuiDiamondPart(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("diamondpart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BDiamond Part"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }

        meta.setCustomModelData(17);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiLapis(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.LAPIS_LAZULI);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("lapis");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BLapis Lazuli"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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
    public ItemStack itemGuiLapisPart(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("lapispart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BLapis Lazuli Part"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        meta.setCustomModelData(15);

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiRedstone(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.REDSTONE);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("redstone");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BRedstone"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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
    public ItemStack itemGuiRedstonePart(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("redstonepart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BRedstone Part"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        meta.setCustomModelData(16);

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }

    public ItemStack itemGuiQuartz(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.QUARTZ);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("quartz");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BQuartz"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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
    public ItemStack itemGuiQuartzPart(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("quartzpart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BQuartz Part"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        meta.setCustomModelData(18);

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
    public ItemStack itemGuiAncientDebris(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.ANCIENT_DEBRIS);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("netherite");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BAncient Debris"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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
    public ItemStack itemGuiAncientDebrisPart(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.FIREWORK_STAR);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("netheritepart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BAncient Debris Part"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
        lore.add(" ");
        lore.add(cc("&bClick to pickup"));

        meta.setCustomModelData(19);

        if(itemamount > 0) {
            meta.addEnchant(Enchantment.MENDING, 1, true);
        }
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;
    }
    public ItemStack itemGuiEmerald(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.EMERALD);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("emerald");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&BEmerald"));
        lore.add(cc("&8Mining Backpack"));
        lore.add(" ");
        lore.add(cc("&7Stored: &6" + itemamount + "&7/" + pu.miningpermstacklmimit(p)));
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



    //Farming

    public ItemStack itemGuiWheat(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.WHEAT);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("wheat");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&eWheat"));
        lore.add(cc("&8Farming Backpack"));
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
    public ItemStack itemGuiPotato(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.POTATO);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("potato");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&ePotato"));
        lore.add(cc("&8Farming Backpack"));
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
    public ItemStack itemGuiCarrot(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.CARROT);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("carrot");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&eCarrot"));
        lore.add(cc("&8Farming Backpack"));
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
    public ItemStack itemGuiBeetroot(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.BEETROOT);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("beetroot");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&eBeetroot"));
        lore.add(cc("&8Farming Backpack"));
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
    public ItemStack itemGuiSweetberries(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.SWEET_BERRIES);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("sweetberries");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&eSweet Berries"));
        lore.add(cc("&8Farming Backpack"));
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
    public ItemStack itemGuiPumpkin(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.PUMPKIN);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("pumpkin");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&ePumpkin"));
        lore.add(cc("&8Farming Backpack"));
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
    public ItemStack itemGuiMelon(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.MELON_SLICE);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("melon");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&eMelon Slice"));
        lore.add(cc("&8Farming Backpack"));
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
    public ItemStack itemGuiBrownMushroom(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.BROWN_MUSHROOM);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("brownmushroom");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&eBrown Mushroom"));
        lore.add(cc("&8Farming Backpack"));
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
    public ItemStack itemGuiRedMushroom(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.RED_MUSHROOM);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("redmushroom");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&eRed Mushroom"));
        lore.add(cc("&8Farming Backpack"));
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
    public ItemStack itemGuiNetherwart(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.NETHER_WART);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("netherwart");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&eNetherwart"));
        lore.add(cc("&8Farming Backpack"));
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
    public ItemStack itemGuiSugarcane(Player p){
        permUtils pu = new permUtils();
        ItemStack item = new ItemStack(Material.SUGAR_CANE);
        ItemMeta meta = item.getItemMeta();
        int itemamount = fileUtils.getloadedcontentPlayer(p).get("sugarcane");
        ArrayList<String> lore = new ArrayList<>();
        meta.setDisplayName(cc("&eSugar Cane"));
        lore.add(cc("&8Farming Backpack"));
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






}
