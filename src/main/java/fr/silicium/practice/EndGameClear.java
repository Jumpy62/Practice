package fr.silicium.practice;

import fr.silicium.manager.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionEffect;


public class EndGameClear {
    public static void endgameclear(Player player) {
        JavaPlugin plugin = Practice.instance;
        FileConfiguration config = plugin.getConfig();

        final String key = "spawn.";

        final World world = Bukkit.getWorld(config.getString(key +"world"));
        final double x = config.getDouble(key +"x");
        final double y = config.getDouble(key +"y");
        final double z = config.getDouble(key +"z");
        final float Yaw = (float) config.getDouble(key +"Yaw");
        final float Pitch = (float) config.getDouble(key +"Pitch");


        final Location spawn = new Location(world, x, y, z, Yaw, Pitch);

        player.getInventory().clear();
        player.getInventory().setArmorContents(new ItemStack[player.getInventory().getArmorContents().length]);
        player.teleport(spawn);
        player.getInventory().setItem(0, ItemManager.UnrankedDuel);
        player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 999999 * 20, 254, true, true));
        player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 999999 * 20, 254, true, true));
        player.setMaximumNoDamageTicks(20);
    }
}