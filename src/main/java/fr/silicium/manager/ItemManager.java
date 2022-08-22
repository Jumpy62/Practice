package fr.silicium.manager;

import fr.silicium.practice.GetItem;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack UnrankedDuel;
    public static ItemStack buildUHC;
    public static ItemStack Nodebuff;
    public static ItemStack Debuff;
    public static ItemStack Bow;
    public static ItemStack HCF;
    public static ItemStack bridge;
    public static ItemStack Combo;
    public static ItemStack Classic;

    public static ItemStack pvpsoup;

    public static void init(){
        createUnrankedDuel();
        buildUHC();
        Nodebuff();
        Debuff();
        Bow();
        hcf();
        Bridge();
        Combo();
        Classic();
        pvpsoup();
    }

    private static void createUnrankedDuel() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Unranked Duel");
        List<String> lore = new ArrayList<>();
        lore.add("Clic droit pour duel");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.spigot().setUnbreakable(true);
        item.setItemMeta(meta);
        UnrankedDuel = item;
    }

    private static void buildUHC(){
        buildUHC = GetItem.getItem(Material.LAVA_BUCKET, "§6§lBuild UHC");
        ItemManager.buildUHC.setAmount(0);
    }

    private static void Nodebuff(){
        ItemStack item = new Potion(PotionType.INSTANT_HEAL, 1, false, false).toItemStack(1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§lNodebuff");
        List<String> lore = new ArrayList<>();
        lore.add("Il y a 0 personnes dans la queue");
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        item.setItemMeta(meta);
        Nodebuff = item;
        ItemManager.Nodebuff.setAmount(0);

    }

    private static void Debuff(){
        ItemStack item = new Potion(PotionType.INSTANT_DAMAGE, 1, false, false).toItemStack(1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§3§lDebuff");
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        item.setItemMeta(meta);
        Debuff = item;
        ItemManager.Debuff.setAmount(0);

    }

    private static void Bow(){
        Bow = GetItem.getItem(Material.BOW, "§b§lBow");
        ItemManager.Bow.setAmount(0);

    }


    private static void hcf(){
        HCF = GetItem.getItem(Material.FISHING_ROD, "§5§lHCF");
        ItemManager.HCF.setAmount(0);

    }

    private static void Bridge(){
        bridge = GetItem.getItem(Material.CLAY, "§c§lBridge");
        ItemManager.bridge.setAmount(0);

    }

    private static void Combo(){
        Combo = GetItem.getItem(Material.GOLDEN_APPLE, "§d§lCombo");
        ItemManager.Combo.setAmount(0);

    }

    private static void Classic(){
        Classic = GetItem.getItem(Material.DIAMOND_SWORD, "§1§lClassic");
        ItemManager.Classic.setAmount(0);

    }

    private static void pvpsoup(){
        pvpsoup = GetItem.getItem(Material.MUSHROOM_SOUP, "§6§lPvP Soup");
        ItemManager.pvpsoup.setAmount(0);
    }

}
