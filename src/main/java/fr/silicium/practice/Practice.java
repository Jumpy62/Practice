package fr.silicium.practice;

import fr.silicium.commands.*;
import fr.silicium.event.*;
import fr.silicium.manager.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Practice extends JavaPlugin{
    public static Practice instance;

    public Practice() {
        instance = this;}


    @Override
    public void onEnable() {

        System.out.println("Plugin On");
        saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents(new UnrankedDuelEvent(), this);
        this.getServer().getPluginManager().registerEvents(new EndGameEvent(), this);
        this.getServer().getPluginManager().registerEvents(new RespawnEvent(), this);
        this.getServer().getPluginManager().registerEvents(new SoupEvent(), this);
        this.getCommand("unrated").setExecutor(new Commands());
        this.getCommand("setspawn").setExecutor(new CommandSetSpawn(this));
        this.getCommand("spawn").setExecutor(new CommandSpawn(this));
        this.getCommand("setarena").setExecutor(new CommandSetArena(this));
        this.getCommand("arena").setExecutor(new CommandArena(this));
        this.getCommand("kit").setExecutor(new CommandKit());



        this.getConfig();



        ItemManager.init();
    }

    @Override
    public void onDisable() {

        System.out.println("Plugin Off");

    }


}
