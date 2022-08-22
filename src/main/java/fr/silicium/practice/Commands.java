package fr.silicium.practice;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import fr.silicium.manager.ItemManager;

public class Commands  implements CommandExecutor {
    public Commands(){

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command");
            return true;
        } else {
            Player player = (Player) sender;
            if (player.hasPermission("op")){
                if (command.getName().equalsIgnoreCase("unrated")){
                    player.getInventory().addItem(ItemManager.UnrankedDuel);
                }
                 }
        }
        return true;
    }
}