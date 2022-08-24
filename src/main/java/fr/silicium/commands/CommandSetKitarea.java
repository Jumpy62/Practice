package fr.silicium.commands;

import fr.silicium.practice.Practice;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class CommandSetKitarea implements CommandExecutor {


    private Practice practice;

    public CommandSetKitarea(Practice practice){
        this.practice = practice;
    }





    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(label.equalsIgnoreCase("setkitarea")){
            if(args.length == 0){

                if(sender instanceof Player){

                    final Player player = (Player) sender;
                    final UUID uuid = player.getUniqueId();

                    final Location location = player.getLocation();

                    final File file = new File(practice.getDataFolder(), "spawn.yml");

                    final YamlConfiguration configuration = YamlConfiguration.loadConfiguration(file);

                    final String key = "kitarea";

                    configuration.set(key + ".world", location.getWorld().getName());
                    configuration.set(key + ".x", location.getX());
                    configuration.set(key + ".y", location.getY());
                    configuration.set(key + ".z", location.getZ());
                    configuration.set(key + ".Yaw", location.getYaw());
                    configuration.set(key + ".Pitch", location.getPitch());
                    player.sendMessage("La kit area est bien définit");



                    try {
                        configuration.save(file);
                    } catch (IOException e){
                        e.printStackTrace();
                    }




                }
                return true;
            }
        }
        return false;
    }
}
