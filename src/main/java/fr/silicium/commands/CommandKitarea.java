package fr.silicium.commands;

import fr.silicium.practice.Practice;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class CommandKitarea implements CommandExecutor {


    private Practice practice;

    public CommandKitarea(Practice practice){
        this.practice = practice;
    }





    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(label.equalsIgnoreCase("kitarea")){
            if(args.length == 0){

                if(sender instanceof Player){

                    final Player player = (Player) sender;

                    final File file = new File(practice.getDataFolder(), "spawn.yml");

                    final YamlConfiguration configuration = YamlConfiguration.loadConfiguration(file);

                    final String key = "kitarea.";

                    final World world = Bukkit.getWorld(configuration.getString(key + "world"));
                    final double x = configuration.getDouble(key +"x");
                    final double y = configuration.getDouble(key +"y");
                    final double z = configuration.getDouble(key +"z");
                    final float Yaw = (float) configuration.getDouble(key +"Yaw");
                    final float Pitch = (float) configuration.getDouble(key +"Pitch");

                    final Location spawn = new Location(world, x, y, z, Yaw, Pitch);

                    player.teleport(spawn);
                    player.sendMessage("Vous êtes bien à la kit area");



                }
                return true;
            }
        }
        return false;
    }}
