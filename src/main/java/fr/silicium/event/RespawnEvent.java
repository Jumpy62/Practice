package fr.silicium.event;

import fr.silicium.manager.ItemManager;
import fr.silicium.practice.Practice;
import fr.silicium.practice.EndGameClear;
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



    @EventHandler
    public void onRespawn(PlayerRespawnEvent event){
        Player respawn = event.getPlayer();
        Practice.instance.getServer().getScheduler().scheduleSyncDelayedTask(Practice.instance, () -> EndGameClear.endgameclear(respawn) , 2L);
    }

}
