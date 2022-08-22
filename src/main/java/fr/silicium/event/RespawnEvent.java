package fr.silicium.event;

import fr.silicium.manager.ItemManager;
import fr.silicium.practice.Practice;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class RespawnEvent implements Listener {


    Location spawn = new Location(Bukkit.getWorld("world"), 50, 70, 50);

    @EventHandler
    public void onRespawn(PlayerRespawnEvent event){
        Player respawn = event.getPlayer();
        Practice.instance.getServer().getScheduler().scheduleSyncDelayedTask(Practice.instance, () -> respawn.teleport(spawn), 2L);
        respawn.getInventory().clear();
        respawn.getInventory().setArmorContents(new ItemStack[respawn.getInventory().getArmorContents().length]);
        respawn.getInventory().setItem(0, ItemManager.UnrankedDuel);
        respawn.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 999999*20, 254, true , true));
        respawn.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 999999*20, 254, true, true));
        respawn.setMaximumNoDamageTicks(20);


    }

}
