package fr.silicium.event;

import fr.silicium.manager.ItemManager;
import fr.silicium.practice.AllQueues;
import fr.silicium.practice.Practice;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


import java.util.Arrays;
import java.util.List;
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
            if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK){

                Inventory inv = Bukkit.createInventory(null, 9, "Unranked");

                inv.setItem(0, ItemManager.Nodebuff);
                inv.setItem(1, ItemManager.Debuff);
                inv.setItem(2, ItemManager.buildUHC);
                inv.setItem(3, ItemManager.Bow);
                inv.setItem(4, ItemManager.HCF);
                inv.setItem(5, ItemManager.bridge);
                inv.setItem(6, ItemManager.Combo);
                inv.setItem(7, ItemManager.Classic);

                player.openInventory(inv);
            }
        }
    }

    @EventHandler
    public void onClick(InventoryClickEvent event){

        Inventory inv = event.getInventory();
        Player player = (Player) event.getWhoClicked();
        ItemStack current = event.getCurrentItem();

        if (current == null) return;

        if (inv.getName().equalsIgnoreCase("Unranked")){

            event.setCancelled(true);

            if (current.isSimilar(ItemManager.buildUHC)){
                player.closeInventory();
                player.sendMessage("§e§lTu vas aller en Build UHC");
                AllQueues.builduhcqueue(player);
            }
            if (current.isSimilar(ItemManager.Nodebuff)){
                player.closeInventory();
                player.sendMessage("§e§lTu vas aller en Nodebuff");
                AllQueues.nodebuffqueue(player);
            }

            if (current.isSimilar(ItemManager.Debuff)){
                player.closeInventory();
                player.sendMessage("§e§lTu vas aller en Debuff");
                AllQueues.debuffqueue(player);
            }

            if (current.isSimilar(ItemManager.Bow)){
                player.closeInventory();
                player.sendMessage("§e§lTu vas aller en Bow");
                AllQueues.bowqueue(player);
            }

            if (current.isSimilar(ItemManager.HCF)){
                player.closeInventory();
                player.sendMessage("§e§lTu vas aller en HCF");
                AllQueues.hcfqueue(player);
            }

            if (current.isSimilar(ItemManager.bridge)){
                player.closeInventory();
                player.sendMessage("§e§lTu vas aller en Bridge");
                AllQueues.bridgequeue(player);
            }

            if (current.isSimilar(ItemManager.Combo)){
                player.closeInventory();
                player.sendMessage("§e§lTu vas aller en Combo");
                AllQueues.comboqueue(player);
            }

            if (current.isSimilar(ItemManager.Classic)){
                player.closeInventory();
                player.sendMessage("§e§lTu vas aller en Classic");
                AllQueues.classicqueue(player);
            }
        }
    }
}
