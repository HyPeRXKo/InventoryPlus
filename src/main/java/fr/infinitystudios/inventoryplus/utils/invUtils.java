package fr.infinitystudios.inventoryplus.utils;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class invUtils {

    private static final InventoryPlus plugin = InventoryPlus.getPlugin();

    private static final Map<Material, String> matlist = new HashMap<>();
    private static final Map<Integer, String> fireworklist = new HashMap<>();
    private static final ArrayList<Material> miningitems = new ArrayList<>();
    private static final ArrayList<Material> wooditems = new ArrayList<>();
    private static final ArrayList<Material> farmingitems = new ArrayList<>();

    public Boolean scaninventorybackpack(Player p, String type) {
        itemUtils iu = new itemUtils();
        if(type.equalsIgnoreCase("mining") && p.getInventory().contains(iu.ItemMiningBackpack(p))){return true;}
        else if(type.equalsIgnoreCase("wood") && p.getInventory().contains(iu.ItemWoodBackpack(p))){return true;}
        else if(type.equalsIgnoreCase("farming") && p.getInventory().contains(iu.ItemFarmingBackpack(p))){return true;}
        return false;
    }
    public int tierinventorybackpack(Player p, String type){
        itemUtils iu = new itemUtils();
        if(type.equalsIgnoreCase("mining") && p.getInventory().contains(iu.ItemMiningBackpack(p))){
            for (int slot = 0; slot < p.getInventory().getSize(); slot++) {
                ItemStack item = p.getInventory().getItem(slot);

                if(item != null && item.isSimilar(iu.ItemMiningBackpack(p))){
                    if(item.hasItemMeta()
                    && item.getItemMeta().getPersistentDataContainer().has(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER)){
                        return new permUtils().miningpermstacklmimit(item.getItemMeta().getPersistentDataContainer().get(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER));
                    }
                }
            }
        }
        else if(type.equalsIgnoreCase("wood") && p.getInventory().contains(iu.ItemWoodBackpack(p))){
            for (int slot = 0; slot < p.getInventory().getSize(); slot++) {
                ItemStack item = p.getInventory().getItem(slot);

                if(item != null && item.isSimilar(iu.ItemWoodBackpack(p))){
                    if(item.hasItemMeta()
                            && item.getItemMeta().getPersistentDataContainer().has(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER)){
                        return new permUtils().woodpermstacklmimit(item.getItemMeta().getPersistentDataContainer().get(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER));
                    }
                }
            }
        }
        else if(type.equalsIgnoreCase("farming") && p.getInventory().contains(iu.ItemFarmingBackpack(p))){
            for (int slot = 0; slot < p.getInventory().getSize(); slot++) {
                ItemStack item = p.getInventory().getItem(slot);

                if(item != null && item.isSimilar(iu.ItemFarmingBackpack(p))){
                    if(item.hasItemMeta()
                            && item.getItemMeta().getPersistentDataContainer().has(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER)){
                        return new permUtils().farmingpermstacklmimit(item.getItemMeta().getPersistentDataContainer().get(new NamespacedKey(plugin, "tier"), PersistentDataType.INTEGER));
                    }
                }
            }
        }
        return 0;
    }

    /*public Boolean scaninventorysimple(Player p, String itemstring){
        Map<String, Integer> content = fileUtils.getloadedcontentPlayer(p);
        ItemStack item = new ItemStack(Material.AIR);
        int amount = -1;
        switch (itemstring){
            case "diamond":
                item.setType(Material.DIAMOND);
                amount = content.get("diamond");
                break;
            case "rawgold":
                item.setType(Material.RAW_GOLD);
                amount = content.get("rawgold");
                break;
            case "rawiron":
                item.setType(Material.RAW_IRON);
                amount = content.get("rawiron");
                break;
            case "coal":
                item.setType(Material.COAL);
                amount = content.get("coal");
                break;
            case "gold":
                item.setType(Material.GOLD_INGOT);
                amount = content.get("gold");
                break;
            case "iron":
                item.setType(Material.IRON_INGOT);
                amount = content.get("iron");
                break;
        }
        if(item.getType() == Material.AIR || amount == -1 || amount == 0){return false;}

        ItemStack[] invRef = p.getInventory().getStorageContents();
        for (ItemStack iteminv : invRef) {
            if(iteminv == null || iteminv.getType() == Material.AIR){
                amount = amount - 64;
            }
            else if(iteminv.getType() == item.getType()){
                amount = amount - (64 - iteminv.getAmount());
            }
            if(amount <= 0){return true;}
        }
        return false;
    }*/

    public Boolean scaninventorysimple(Player p, Material mat){
        if(matlist.isEmpty()){
            matlist.put(Material.COAL, "coal");
            matlist.put(Material.RAW_IRON, "rawiron");
            matlist.put(Material.RAW_COPPER, "rawcopper");
            matlist.put(Material.RAW_GOLD, "rawgold");
            matlist.put(Material.DIAMOND, "diamond");
            matlist.put(Material.EMERALD, "emerald");
            matlist.put(Material.LAPIS_LAZULI, "lapis");
            matlist.put(Material.REDSTONE, "redstone");
            matlist.put(Material.QUARTZ, "quartz");
            matlist.put(Material.ANCIENT_DEBRIS, "netherite");
            matlist.put(Material.OAK_LOG, "oak");
            matlist.put(Material.BIRCH_LOG, "birch");
            matlist.put(Material.SPRUCE_LOG, "spruce");
            matlist.put(Material.ACACIA_LOG, "acacia");
            matlist.put(Material.CHERRY_LOG, "cherry");
            matlist.put(Material.JUNGLE_LOG, "jungle");
            matlist.put(Material.DARK_OAK_LOG, "darkoak");
            matlist.put(Material.MANGROVE_LOG, "mangrove");
            matlist.put(Material.WHEAT, "wheat");
            matlist.put(Material.POTATO, "potato");
            matlist.put(Material.CARROT, "carrot");
            matlist.put(Material.BEETROOT, "beetroot");
            matlist.put(Material.SWEET_BERRIES, "sweetberries");
            matlist.put(Material.PUMPKIN, "pumpkin");
            matlist.put(Material.MELON_SLICE, "melon");
            matlist.put(Material.SUGAR_CANE, "sugarcane");
            matlist.put(Material.RED_MUSHROOM, "redmushroom");
            matlist.put(Material.BROWN_MUSHROOM, "brownmushroom");
            matlist.put(Material.NETHER_WART, "netherwart");
        }
        if(miningitems.isEmpty()){
            miningitems.add(Material.COAL);
            miningitems.add(Material.RAW_IRON);
            miningitems.add(Material.RAW_COPPER);
            miningitems.add(Material.RAW_GOLD);
            miningitems.add(Material.DIAMOND);
            miningitems.add(Material.EMERALD);
            miningitems.add(Material.LAPIS_LAZULI);
            miningitems.add(Material.REDSTONE);
            miningitems.add(Material.QUARTZ);
            miningitems.add(Material.ANCIENT_DEBRIS);
        }
        if(wooditems.isEmpty()){
            wooditems.add(Material.OAK_LOG);
            wooditems.add(Material.BIRCH_LOG);
            wooditems.add(Material.SPRUCE_LOG);
            wooditems.add(Material.ACACIA_LOG);
            wooditems.add(Material.CHERRY_LOG);
            wooditems.add(Material.JUNGLE_LOG);
            wooditems.add(Material.DARK_OAK_LOG);
            wooditems.add(Material.MANGROVE_LOG);
        }
        if(farmingitems.isEmpty()){
            farmingitems.add(Material.WHEAT);
            farmingitems.add(Material.POTATO);
            farmingitems.add(Material.CARROT);
            farmingitems.add(Material.BEETROOT);
            farmingitems.add(Material.SWEET_BERRIES);
            farmingitems.add(Material.PUMPKIN);
            farmingitems.add(Material.MELON_SLICE);
            farmingitems.add(Material.SUGAR_CANE);
            farmingitems.add(Material.RED_MUSHROOM);
            farmingitems.add(Material.BROWN_MUSHROOM);
            farmingitems.add(Material.NETHER_WART);
        }
        if(fireworklist.isEmpty()){
            itemUtils iu = new itemUtils();
            for (Material material: wooditems) {
                fireworklist.put(iu.Wood(material).getItemMeta().getCustomModelData(), matlist.get(material) + "part");
            }
            for (Material material: miningitems) {
                if(material == Material.EMERALD){continue;}
                fireworklist.put(iu.Ores(material).getItemMeta().getCustomModelData(), matlist.get(material) + "part");
            }
        }

        ItemStack item = new ItemStack(Material.AIR);
        int amount = -1;

        if(wooditems.contains(mat)){
            item.setType(mat);
            amount = fileUtils.getmaterialint(p, matlist.get(mat));
        }
        else if(miningitems.contains(mat)){
            item.setType(mat);
            amount = fileUtils.getmaterialint(p, matlist.get(mat));
        }
        else if(farmingitems.contains(mat)){
            item.setType(mat);
            amount = fileUtils.getmaterialint(p, matlist.get(mat));
        }

        if(item.getType() == Material.AIR || amount == -1 || amount == 0){return false;}

        ItemStack[] invRef = p.getInventory().getStorageContents();
        for (ItemStack iteminv : invRef) {
            if(iteminv == null || iteminv.getType() == Material.AIR){
                amount = amount - 64;
            }
            else if(iteminv.getType() == item.getType()){
                amount = amount - (64 - iteminv.getAmount());
            }
            if(amount <= 0){return true;}
        }
        return false;
    }
    public boolean scaninventoryfirework(Player p, Integer modeldata){
        if(matlist.isEmpty()){
            matlist.put(Material.COAL, "coal");
            matlist.put(Material.RAW_IRON, "rawiron");
            matlist.put(Material.RAW_COPPER, "rawcopper");
            matlist.put(Material.RAW_GOLD, "rawgold");
            matlist.put(Material.DIAMOND, "diamond");
            matlist.put(Material.EMERALD, "emerald");
            matlist.put(Material.LAPIS_LAZULI, "lapis");
            matlist.put(Material.REDSTONE, "redstone");
            matlist.put(Material.QUARTZ, "quartz");
            matlist.put(Material.ANCIENT_DEBRIS, "netherite");
            matlist.put(Material.OAK_LOG, "oak");
            matlist.put(Material.BIRCH_LOG, "birch");
            matlist.put(Material.SPRUCE_LOG, "spruce");
            matlist.put(Material.ACACIA_LOG, "acacia");
            matlist.put(Material.CHERRY_LOG, "cherry");
            matlist.put(Material.JUNGLE_LOG, "jungle");
            matlist.put(Material.DARK_OAK_LOG, "darkoak");
            matlist.put(Material.MANGROVE_LOG, "mangrove");
            matlist.put(Material.WHEAT, "wheat");
            matlist.put(Material.POTATO, "potato");
            matlist.put(Material.CARROT, "carrot");
            matlist.put(Material.BEETROOT, "beetroot");
            matlist.put(Material.SWEET_BERRIES, "sweetberries");
            matlist.put(Material.PUMPKIN, "pumpkin");
            matlist.put(Material.MELON_SLICE, "melon");
            matlist.put(Material.SUGAR_CANE, "sugarcane");
            matlist.put(Material.RED_MUSHROOM, "redmushroom");
            matlist.put(Material.BROWN_MUSHROOM, "brownmushroom");
            matlist.put(Material.NETHER_WART, "netherwart");
        }
        if(miningitems.isEmpty()){
            miningitems.add(Material.COAL);
            miningitems.add(Material.RAW_IRON);
            miningitems.add(Material.RAW_COPPER);
            miningitems.add(Material.RAW_GOLD);
            miningitems.add(Material.DIAMOND);
            miningitems.add(Material.EMERALD);
            miningitems.add(Material.LAPIS_LAZULI);
            miningitems.add(Material.REDSTONE);
            miningitems.add(Material.QUARTZ);
            miningitems.add(Material.ANCIENT_DEBRIS);
        }
        if(wooditems.isEmpty()){
            wooditems.add(Material.OAK_LOG);
            wooditems.add(Material.BIRCH_LOG);
            wooditems.add(Material.SPRUCE_LOG);
            wooditems.add(Material.ACACIA_LOG);
            wooditems.add(Material.CHERRY_LOG);
            wooditems.add(Material.JUNGLE_LOG);
            wooditems.add(Material.DARK_OAK_LOG);
            wooditems.add(Material.MANGROVE_LOG);
        }
        if(farmingitems.isEmpty()){
            farmingitems.add(Material.WHEAT);
            farmingitems.add(Material.POTATO);
            farmingitems.add(Material.CARROT);
            farmingitems.add(Material.BEETROOT);
            farmingitems.add(Material.SWEET_BERRIES);
            farmingitems.add(Material.PUMPKIN);
            farmingitems.add(Material.MELON_SLICE);
            farmingitems.add(Material.SUGAR_CANE);
            farmingitems.add(Material.RED_MUSHROOM);
            farmingitems.add(Material.BROWN_MUSHROOM);
            farmingitems.add(Material.NETHER_WART);
        }
        if(fireworklist.isEmpty()){
            itemUtils iu = new itemUtils();
            for (Material material: wooditems) {
                fireworklist.put(iu.Wood(material).getItemMeta().getCustomModelData(), matlist.get(material) + "part");
            }
            for (Material material: miningitems) {
                if(material == Material.EMERALD){continue;}
                fireworklist.put(iu.Ores(material).getItemMeta().getCustomModelData(), matlist.get(material) + "part");
            }
        }

        ItemStack item = new ItemStack(Material.AIR);
        int amount = -1;

        if(modeldata >= 2 && modeldata <= 9){
            item.setType(Material.FIREWORK_STAR);
            amount = fileUtils.getmaterialint(p, fireworklist.get(modeldata));
        }
        else if(modeldata >= 11 && modeldata <= 19){
            item.setType(Material.FIREWORK_STAR);
            amount = fileUtils.getmaterialint(p, fireworklist.get(modeldata));
        }

        if(item.getType() == Material.AIR || amount == -1 || amount == 0){return false;}

    }

    public void removeiteminv(Player p, ItemStack itemstack){
        Bukkit.getScheduler().runTaskLater(plugin, () -> p.getInventory().removeItem(itemstack), 1L);
    }


}
