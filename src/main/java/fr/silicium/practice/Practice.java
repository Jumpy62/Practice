package fr.silicium.practice;

import fr.silicium.event.UnrankedDuelEvent;
import fr.silicium.manager.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Practice extends JavaPlugin{

    @Override
    public void onEnable() {

        System.out.println("Plugin On");

        this.getServer().getPluginManager().registerEvents(new UnrankedDuelEvent(), this);


        ItemManager.init();
    }
}
