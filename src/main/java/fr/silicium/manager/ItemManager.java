package fr.silicium.manager;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack UnrankedDuel;

    public static void init(){
        createUnrankedDuel();
    }

    private static void createUnrankedDuel(){
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Unranked Duel");
        List<String> lore = new ArrayList<>();
        lore.add("Clic droit pour duel");
        meta.setLore(lore);
        item.setItemMeta(meta);
        UnrankedDuel = item;
    }
}
