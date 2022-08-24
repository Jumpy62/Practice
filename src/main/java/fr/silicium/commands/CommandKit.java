package fr.silicium.commands;

import fr.silicium.practice.Practice;
import fr.silicium.practice.Kits;
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

public class CommandKit implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(label.equalsIgnoreCase("kit")){
            if(args.length == 1){
                sender.sendMessage("Le joueur n'est pas définit");
                }
            }
            if(args.length == 2){
                String kit = args[0];
                Player player = Bukkit.getPlayer(args[1]);
                if(player == null){
                    sender.sendMessage("Le jouer n'existe pas");
                    return true;
                }
                if(kit.equalsIgnoreCase("builduhc")){
                    Kits.builduhckit(player);
                    player.sendMessage("Votre kit a bien été give");
                    return true;
                }
                if(kit.equalsIgnoreCase("nodebuff")){
                    Kits.nodebuffkit(player);
                    player.sendMessage("Votre kit a bien été give");
                    return true;
                }
                if(kit.equalsIgnoreCase("debuff")){
                    Kits.debuffkit(player);
                    player.sendMessage("Votre kit a bien été give");
                    return true;
                }
                if(kit.equalsIgnoreCase("classic")){
                    Kits.classickit(player);
                    player.sendMessage("Votre kit a bien été give");
                    return true;
                }
                if(kit.equalsIgnoreCase("bow")){
                    Kits.bowkit(player);
                    player.sendMessage("Votre kit a bien été give");
                    return true;
                }
                if(kit.equalsIgnoreCase("combo")){
                    Kits.combokit(player);
                    player.sendMessage("Votre kit a bien été give");
                    return true;
                }
                if(kit.equalsIgnoreCase("bridge")){
                    Kits.bridgekit(player);
                    player.sendMessage("Votre kit a bien été give");
                    return true;
                }
                if(kit.equalsIgnoreCase("hcf")){
                    Kits.HCFkit(player);
                    player.sendMessage("Votre kit a bien été give");
                    return true;
                }
                if(kit.equalsIgnoreCase("pvpsoup")){
                    Kits.pvpsoupkit(player);
                    player.sendMessage("Votre kit a bien été give");
                    return true;
                }
                if(kit.equalsIgnoreCase("netheribus")){
                    Kits.netheribuskit(player);
                    player.sendMessage("Votre kit a bien été give");
                    return true;
                }
                else{
                    player.sendMessage("Le kit n'a pas été trouvé");
                }

            }


        return true;
    }
            }






