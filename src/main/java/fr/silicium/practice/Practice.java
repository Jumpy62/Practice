package fr.silicium.practice;

import fr.silicium.event.EndGameEvent;
import fr.silicium.event.RespawnEvent;
import fr.silicium.event.SoupEvent;
import fr.silicium.event.UnrankedDuelEvent;
import fr.silicium.manager.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Practice extends JavaPlugin{
    public static Practice instance;

    public Practice() {
        instance = this;}


    @Override
    public void onEnable() {

        System.out.println("Plugin On");

        this.getServer().getPluginManager().registerEvents(new UnrankedDuelEvent(), this);
        this.getServer().getPluginManager().registerEvents(new EndGameEvent(), this);
        this.getServer().getPluginManager().registerEvents(new RespawnEvent(), this);
        this.getServer().getPluginManager().registerEvents(new SoupEvent(), this);
        this.getCommand("unrated").setExecutor(new Commands());
        ItemManager.init();
    }

    @Override
    public void onDisable() {

        System.out.println("Plugin Off");

    }


}
