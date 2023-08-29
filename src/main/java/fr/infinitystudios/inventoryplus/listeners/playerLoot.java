package fr.infinitystudios.inventoryplus.listeners;

import fr.infinitystudios.inventoryplus.InventoryPlus;
import fr.infinitystudios.inventoryplus.utils.fileUtils;
import fr.infinitystudios.inventoryplus.utils.invUtils;
import fr.infinitystudios.inventoryplus.utils.itemUtils;
import fr.infinitystudios.inventoryplus.utils.permUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class playerLoot implements Listener {

    private static final InventoryPlus plugin = InventoryPlus.getPlugin();


    private static final Map<Material, String> matlist = new HashMap<>();
    private static final Map<Integer, String> fireworklist = new HashMap<>();
    ArrayList<Material> miningitems = new ArrayList<>();
    ArrayList<Material> wooditems = new ArrayList<>();
    ArrayList<Material> farmingitems = new ArrayList<>();



    @EventHandler
    public void PlayerLootEvent(EntityPickupItemEvent e){
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
            for (Material mat: wooditems) {
                fireworklist.put(iu.Wood(mat).getItemMeta().getCustomModelData(), matlist.get(mat) + "part");
            }
            for (Material mat: miningitems) {
                if(mat == Material.EMERALD){continue;}
                fireworklist.put(iu.Ores(mat).getItemMeta().getCustomModelData(), matlist.get(mat) + "part");
            }
        }


        if(e.getEntity().getType() == EntityType.PLAYER){
            Player p = (Player) e.getEntity();
            if(!e.isCancelled()){
                Material itemtype = e.getItem().getItemStack().getType();
                if(wooditems.contains(itemtype)){
                    invUtils iu = new invUtils();
                    if(iu.scaninventorybackpack(p, "wood")){
                        fileUtils fu = new fileUtils();
                        permUtils pu = new permUtils();
                        int newint = fu.getmaterialint(p, matlist.get(itemtype)) + e.getItem().getItemStack().getAmount();
                        if(newint > pu.woodpermstacklmimit(p)) {return;}
                        fu.setmaterialint(p, matlist.get(itemtype), newint);
                        iu.removeiteminv(p,e.getItem().getItemStack());                    }
                }
                else if(miningitems.contains(itemtype)){
                    invUtils iu = new invUtils();
                    if(iu.scaninventorybackpack(p, "mining")){
                        fileUtils fu = new fileUtils();
                        permUtils pu = new permUtils();
                        int newint = fu.getmaterialint(p, matlist.get(itemtype)) + e.getItem().getItemStack().getAmount();
                        if(newint > pu.woodpermstacklmimit(p)) {return;}
                        fu.setmaterialint(p, matlist.get(itemtype), newint);
                        iu.removeiteminv(p,e.getItem().getItemStack());                    }
                }
                else if(farmingitems.contains(itemtype)){
                    invUtils iu = new invUtils();
                    if(iu.scaninventorybackpack(p, "farming")){
                        fileUtils fu = new fileUtils();
                        permUtils pu = new permUtils();
                        int newint = fu.getmaterialint(p, matlist.get(itemtype)) + e.getItem().getItemStack().getAmount();
                        if(newint > pu.woodpermstacklmimit(p)) {return;}
                        fu.setmaterialint(p, matlist.get(itemtype), newint);
                        iu.removeiteminv(p,e.getItem().getItemStack());
                    }
                }
                else if(itemtype == Material.FIREWORK_STAR) {
                    ItemStack item = e.getItem().getItemStack();
                    if (item.hasItemMeta() && item.getItemMeta().hasCustomModelData()) {
                        int modeldata = e.getItem().getItemStack().getItemMeta().getCustomModelData();
                        if(modeldata >= 2 && modeldata <= 9){
                            invUtils iu = new invUtils();
                            if(iu.scaninventorybackpack(p, "wood")){
                                fileUtils fu = new fileUtils();
                                permUtils pu = new permUtils();
                                int newint = fu.getmaterialint(p, fireworklist.get(modeldata)) + e.getItem().getItemStack().getAmount();
                                if(newint > pu.woodpermstacklmimit(p)) {return;}
                                fu.setmaterialint(p, fireworklist.get(modeldata), newint);
                                iu.removeiteminv(p,e.getItem().getItemStack());                    }
                        }
                        else if(modeldata >= 11 && modeldata <= 19){
                            invUtils iu = new invUtils();
                            if(iu.scaninventorybackpack(p, "mining")){
                                fileUtils fu = new fileUtils();
                                permUtils pu = new permUtils();
                                int newint = fu.getmaterialint(p, fireworklist.get(modeldata)) + e.getItem().getItemStack().getAmount();
                                if(newint > pu.woodpermstacklmimit(p)) {return;}
                                fu.setmaterialint(p, fireworklist.get(modeldata), newint);
                                iu.removeiteminv(p,e.getItem().getItemStack());
                            }
                        }
                    }
                }
            }
        }
    }



}
