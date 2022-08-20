package fr.silicium.event;

import fr.silicium.manager.ItemManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class UnrankedDuelEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();
        player.getInventory().clear();

        player.getInventory().setItem(0, ItemManager.UnrankedDuel);

    }


    @EventHandler
    public void onInteract(PlayerInteractEvent event){

        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack it = event.getItem();

        if (it == null) return;

        if (it.getType() == Material.IRON_SWORD && Objects.equals(it.getItemMeta().getDisplayName(), "Unranked Duel")){
            if (action == Action.RIGHT_CLICK_AIR){
                player.sendMessage("Salut");
            }
        }
    }
}
