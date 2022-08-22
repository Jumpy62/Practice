package fr.silicium.practice;

import fr.silicium.practice.Kits;
import fr.silicium.manager.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

public class AllQueues {
    public static List<Player> builduhc = new ArrayList<Player>();
    public static List<Player> debuff = new ArrayList<Player>();
    public static List<Player> nodebuff = new ArrayList<Player>();

    public static List<Player> classic = new ArrayList<Player>();
    public static List<Player> bow = new ArrayList<Player>();
    public static List<Player> hcf = new ArrayList<Player>();
    public static List<Player> bridge = new ArrayList<Player>();
    public static List<Player> combo = new ArrayList<Player>();

    public static List<Player> pvpsoup = new ArrayList<Player>();






    public static void builduhcqueue(Player Player) {
        if (builduhc.contains(Player)) {
            Player.sendMessage("Vous êtes déjà dans la queue");
        } else {
            int stack = ItemManager.buildUHC.getAmount();
            ItemManager.buildUHC.setAmount(stack + 1);
            builduhc.add(Player);
            if (builduhc.size() >= 2) {
                int newstack = ItemManager.buildUHC.getAmount();
                ItemManager.buildUHC.setAmount(newstack -2);
                Player Player1 = builduhc.get(0);
                Player Player2 = builduhc.get(1);
                Location location = new Location(Bukkit.getWorld("world"), 116, 151, 190);
                Player1.teleport(location);
                Player2.teleport(location);
                builduhc.remove(Player1);
                builduhc.remove(Player2);
                Kits.builduhckit(Player1);
                Kits.builduhckit(Player2);
            }
        }
    }
    public static void debuffqueue(Player Player){
        if (debuff.contains(Player)) {
            Player.sendMessage("Vous êtes déjà dans la queue");
        } else {
            int stack = ItemManager.Debuff.getAmount();
            ItemManager.Debuff.setAmount(stack + 1);
        debuff.add(Player);
        if( debuff.size() >= 2){
            int newstack = ItemManager.Debuff.getAmount();
            ItemManager.Debuff.setAmount(newstack -2);
            Player Player1 = debuff.get(0);
            Player Player2 = debuff.get(1);
            Location location = new Location(Bukkit.getWorld("world"), 116, 151, 190);
            Player1.teleport(location);
            Player2.teleport(location);
            debuff.remove(Player1);
            debuff.remove(Player2);
            Kits.debuffkit(Player1);
            Kits.debuffkit(Player2);
        }
    }}
    public static void nodebuffqueue(Player Player) {
        if (nodebuff.contains(Player)) {
            Player.sendMessage("Vous êtes déjà dans la queue");
        } else {
            int stack = ItemManager.Nodebuff.getAmount();
            ItemManager.Nodebuff.setAmount(stack + 1);
            nodebuff.add(Player);
            if (nodebuff.size() >= 2) {
                int newstack = ItemManager.Nodebuff.getAmount();
                ItemManager.Nodebuff.setAmount(newstack -2);
                Player Player1 = nodebuff.get(0);
                Player Player2 = nodebuff.get(1);
                Location location = new Location(Bukkit.getWorld("world"), 116, 151, 190);
                Player1.teleport(location);
                Player2.teleport(location);
                nodebuff.remove(Player1);
                nodebuff.remove(Player2);
                Kits.nodebuffkit(Player1);
                Kits.nodebuffkit(Player2);
            }
        }
    }
    public static void bowqueue(Player Player){
        if (bow.contains(Player)) {
            Player.sendMessage("Vous êtes déjà dans la queue");
        } else {
            int stack = ItemManager.Bow.getAmount();
            ItemManager.Bow.setAmount(stack + 1);
        bow.add(Player);
        if( bow.size() >= 2){
            int newstack = ItemManager.Bow.getAmount();
            ItemManager.Bow.setAmount(newstack -2);
            Player Player1 = bow.get(0);
            Player Player2 = bow.get(1);
            Location location = new Location(Bukkit.getWorld("world"), 116, 151, 190);
            Player1.teleport(location);
            Player2.teleport(location);
            bow.remove(Player1);
            bow.remove(Player2);
            Kits.bowkit(Player1);
            Kits.bowkit(Player2);
        }
    }}

    public static void hcfqueue(Player Player) {
        if (builduhc.contains(Player)) {
            Player.sendMessage("Vous êtes déjà dans la queue");
        } else {
            int stack = ItemManager.HCF.getAmount();
            ItemManager.HCF.setAmount(stack + 1);
            hcf.add(Player);
            if (hcf.size() >= 2) {
                int newstack = ItemManager.HCF.getAmount();
                ItemManager.HCF.setAmount(newstack -2);
                Player Player1 = hcf.get(0);
                Player Player2 = hcf.get(1);
                Location location = new Location(Bukkit.getWorld("world"), 116, 151, 190);
                Player1.teleport(location);
                Player2.teleport(location);
                hcf.remove(Player1);
                hcf.remove(Player2);
                Kits.HCFkit(Player1);
                Kits.HCFkit(Player2);
            }
        }
    }
    public static void bridgequeue(Player Player) {
        if (bridge.contains(Player)) {
            Player.sendMessage("Vous êtes déjà dans la queue");
        } else {
            int stack = ItemManager.bridge.getAmount();
            ItemManager.bridge.setAmount(stack + 1);
            bridge.add(Player);
            if (bridge.size() >= 2) {
                int newstack = ItemManager.bridge.getAmount();
                ItemManager.bridge.setAmount(newstack -2);
                Player Player1 = bridge.get(0);
                Player Player2 = bridge.get(1);
                Location location = new Location(Bukkit.getWorld("world"), 116, 151, 190);
                Player1.teleport(location);
                Player2.teleport(location);
                bridge.remove(Player1);
                bridge.remove(Player2);
                Kits.bridgekit(Player1);
                Kits.bridgekit(Player2);
            }
        }
    }
    public static void comboqueue(Player Player) {
        if (combo.contains(Player)) {
            Player.sendMessage("Vous êtes déjà dans la queue");
        } else {
            int stack = ItemManager.Combo.getAmount();
            ItemManager.Combo.setAmount(stack + 1);
            combo.add(Player);
            if (combo.size() >= 2) {
                int newstack = ItemManager.Combo.getAmount();
                ItemManager.Combo.setAmount(newstack -2);
                Player Player1 = combo.get(0);
                Player Player2 = combo.get(1);
                Location location = new Location(Bukkit.getWorld("world"), 116, 151, 190);
                Player1.teleport(location);
                Player2.teleport(location);
                combo.remove(Player1);
                combo.remove(Player2);
                Kits.combokit(Player1);
                Kits.combokit(Player2);
            }
        }
    }
    public static void classicqueue(Player Player) {
        if (builduhc.contains(Player)) {
            Player.sendMessage("Vous êtes déjà dans la queue");
        } else {
            int stack = ItemManager.Classic.getAmount();
            ItemManager.Classic.setAmount(stack + 1);
            classic.add(Player);
            if (classic.size() >= 2) {
                int newstack = ItemManager.Classic.getAmount();
                ItemManager.Classic.setAmount(newstack -2);
                Player Player1 = classic.get(0);
                Player Player2 = classic.get(1);
                Location location = new Location(Bukkit.getWorld("world"), 116, 151, 190);
                Player1.teleport(location);
                Player2.teleport(location);
                classic.remove(Player1);
                classic.remove(Player2);
                Kits.classickit(Player1);
                Kits.classickit(Player2);

            }
        }
    }

    public static void pvpsoupqueue(Player Player) {
        if (pvpsoup.contains(Player)) {
            Player.sendMessage("Vous êtes déjà dans la queue");
        } else {
            int stack = ItemManager.pvpsoup.getAmount();
            ItemManager.pvpsoup.setAmount(stack + 1);
            pvpsoup.add(Player);
            if (pvpsoup.size() >= 2) {
                int newstack = ItemManager.pvpsoup.getAmount();
                ItemManager.pvpsoup.setAmount(newstack -2);
                Player Player1 = pvpsoup.get(0);
                Player Player2 = pvpsoup.get(1);
                Location location = new Location(Bukkit.getWorld("world"), 116, 151, 190);
                Player1.teleport(location);
                Player2.teleport(location);
                pvpsoup.remove(Player1);
                pvpsoup.remove(Player2);
                Kits.pvpsoupkit(Player1);
                Kits.pvpsoupkit(Player2);
            }
        }
    }



}
