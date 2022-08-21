package fr.silicium.practice;

import fr.silicium.manager.ItemManager;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GetItem {

    public static ItemStack getItem(Material material, String name){
        ItemStack item = new ItemStack(material, 1);
        ItemMeta meta = item.getItemMeta();
        if (name != null) meta.setDisplayName(name);
        item.setItemMeta(meta);

        return item;

    }
}
