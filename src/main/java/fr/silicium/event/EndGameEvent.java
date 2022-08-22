package fr.silicium.event;

import fr.silicium.practice.Kits;
import fr.silicium.manager.ItemManager;
import fr.silicium.practice.AllQueues;
import fr.silicium.practice.Practice;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class EndGameEvent implements Listener {

    Location spawn = new Location(Bukkit.getWorld("world"), 50, 70, 50);


    @EventHandler
    public void onKill(PlayerDeathEvent event) {
        Player killer = event.getEntity().getKiller();
        killer.getInventory().clear();
        killer.getInventory().setArmorContents(new ItemStack[killer.getInventory().getArmorContents().length]);
        killer.teleport(spawn);
        killer.getInventory().setItem(0, ItemManager.UnrankedDuel);
        killer.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 999999*20, 254, true , true));
        killer.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 999999*20, 254, true, true));
        killer.setMaximumNoDamageTicks(20);



    }


}
