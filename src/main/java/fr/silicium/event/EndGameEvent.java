package fr.silicium.event;

import fr.silicium.practice.Kits;
import fr.silicium.manager.ItemManager;
import fr.silicium.practice.EndGameClear;
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
import org.bukkit.event.player.PlayerItemHeldEvent;
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


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class EndGameEvent implements Listener {

    public static List<Player> endgamequeue = new ArrayList<Player>();




    @EventHandler
    public void onKill(PlayerDeathEvent event) {
        int x = 0;
        Player killed = event.getEntity();
            for (Player i : endgamequeue) {
                if (i.equals(killed)) {
                    if(x%2 == 0){
                        Player killer = endgamequeue.get(x+1);
                        EndGameClear.endgameclear(killer);

                    }
                    else{
                        Player killer = endgamequeue.get(x-1);
                        EndGameClear.endgameclear(killer);

                    }
                }
                x += 1;

            }






    }


}
