package fr.infinitystudios.inventoryplus.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemUtils {

    public String cc(String string){
        return ChatColor.translateAlternateColorCodes('&', string);}

    public ItemStack ItemMiningBackpack(Player p){
        PermUtils pu = new PermUtils();
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


        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        meta.setLore(lore);
        backpack.setItemMeta(meta);

        return backpack;
    }
    public ItemStack ItemGuiDiamond(Player p){
        FileUtils fu = new FileUtils();
        PermUtils pu = new PermUtils();
        ItemStack diamond = new ItemStack(Material.DIAMOND);
        ItemMeta meta = diamond.getItemMeta();
        int diamondamount = fu.GetPlayerConfig(p).getInt("mining.diamond");
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
        FileUtils fu = new FileUtils();
        PermUtils pu = new PermUtils();
        ItemStack gold = new ItemStack(Material.GOLD_INGOT);
        ItemMeta meta = gold.getItemMeta();
        int goldamount = fu.GetPlayerConfig(p).getInt("mining.gold");
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
        FileUtils fu = new FileUtils();
        PermUtils pu = new PermUtils();
        ItemStack rawgold = new ItemStack(Material.RAW_GOLD);
        ItemMeta meta = rawgold.getItemMeta();
        int rawgoldamount = fu.GetPlayerConfig(p).getInt("mining.rawgold");
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
        FileUtils fu = new FileUtils();
        PermUtils pu = new PermUtils();
        ItemStack rawiron = new ItemStack(Material.RAW_IRON);
        ItemMeta meta = rawiron.getItemMeta();
        int rawironamount = fu.GetPlayerConfig(p).getInt("mining.rawiron");
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
        FileUtils fu = new FileUtils();
        PermUtils pu = new PermUtils();
        ItemStack iron = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = iron.getItemMeta();
        int ironamount = fu.GetPlayerConfig(p).getInt("mining.iron");
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
        FileUtils fu = new FileUtils();
        PermUtils pu = new PermUtils();
        ItemStack coal = new ItemStack(Material.COAL);
        ItemMeta meta = coal.getItemMeta();
        int coalamount = fu.GetPlayerConfig(p).getInt("mining.coal");
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
