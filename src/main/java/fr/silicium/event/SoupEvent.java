package fr.silicium.event;

import fr.silicium.practice.Practice;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class SoupEvent implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack item = player.getInventory().getItemInHand();
        double health = player.getHealth();
        if (item.getType().compareTo(Material.MUSHROOM_SOUP) == 0 && (event.getAction().compareTo(Action.RIGHT_CLICK_AIR) == 0 || event.getAction().compareTo(Action.RIGHT_CLICK_BLOCK) == 0)) {
            if(health < 20){
            Practice.instance.getServer().getScheduler().scheduleSyncDelayedTask(Practice.instance, () -> player.getInventory().setItemInHand(new ItemStack(Material.BOWL)), 2L);
            player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 1, 1, true, true));
            player.setFoodLevel(20);}

            }
        }
    }
