package fr.silicium.practice;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.bukkit.potion.PotionEffect;

public class Kits {


    public static void builduhckit(Player Player) {

        ItemStack BuildUHCsword = new ItemStack(Material.DIAMOND_SWORD, 1);
        BuildUHCsword.addEnchantment(Enchantment.DAMAGE_ALL, 3);

        ItemStack BuildUHCbow = new ItemStack(Material.BOW, 1);
        BuildUHCbow.addEnchantment(Enchantment.ARROW_DAMAGE, 2);

        ItemStack BuildUHChelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
        BuildUHChelmet.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);

        ItemStack BuildUHCchesplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        BuildUHCchesplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack BuildUHCleggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        BuildUHCleggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack BuildUHCboots = new ItemStack(Material.DIAMOND_BOOTS, 1);
        BuildUHCboots.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);


        Player.getInventory().clear();
        Player.getInventory().addItem(BuildUHCsword);
        Player.getInventory().addItem(BuildUHCbow);
        Player.getInventory().setHelmet(BuildUHChelmet);
        Player.getInventory().setChestplate(BuildUHCchesplate);
        Player.getInventory().setLeggings(BuildUHCleggings);
        Player.getInventory().setBoots(BuildUHCboots);
        Player.getInventory().addItem(new ItemStack(Material.FISHING_ROD, 1));
        Player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 8));
        Player.getInventory().addItem(new ItemStack(Material.COBBLESTONE, 64));
        Player.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 64));
        Player.getInventory().addItem(new ItemStack(Material.WATER_BUCKET, 1));
        Player.getInventory().addItem(new ItemStack(Material.LAVA_BUCKET, 1));
        Player.getInventory().addItem(new ItemStack(Material.DIAMOND_PICKAXE, 1));
        Player.getInventory().addItem(new ItemStack(Material.DIAMOND_AXE, 1));
        Player.getInventory().addItem(new ItemStack(Material.ARROW, 20));
        Player.getInventory().addItem(new ItemStack(Material.WOOD, 64));
        Player.getInventory().addItem(new ItemStack(Material.WATER_BUCKET, 1));
        Player.getInventory().addItem(new ItemStack(Material.LAVA_BUCKET, 1));
        Player.updateInventory();
        Player.removePotionEffect(PotionEffectType.SATURATION);
        Player.removePotionEffect(PotionEffectType.HEAL);
        }




    public static void nodebuffkit(Player Player) {

        ItemStack nodebuffsword = new ItemStack(Material.DIAMOND_SWORD, 1);
        nodebuffsword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
        nodebuffsword.addEnchantment(Enchantment.FIRE_ASPECT, 2);

        ItemStack nodebuffhelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
        nodebuffhelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack nodebuffchesplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        nodebuffchesplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack nodebuffleggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        nodebuffleggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack nodebuffboots = new ItemStack(Material.DIAMOND_BOOTS, 1);
        nodebuffboots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        Potion splashheal = new Potion(PotionType.INSTANT_HEAL, 2);
        splashheal.setSplash(true);

        Potion speedII = new Potion(PotionType.SPEED, 2);
        Potion fireres = new Potion(PotionType.FIRE_RESISTANCE, 1);




        Player.getInventory().clear();
        Player.getInventory().addItem(nodebuffsword);
        Player.getInventory().setHelmet(nodebuffhelmet);
        Player.getInventory().setChestplate(nodebuffchesplate);
        Player.getInventory().setLeggings(nodebuffleggings);
        Player.getInventory().setBoots(nodebuffboots);
        Player.getInventory().addItem(new ItemStack(Material.ENDER_PEARL, 16));
        Player.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 64));
        for(int i=1;i<29;i++){
        Player.getInventory().addItem(splashheal.toItemStack(1));}
        for(int i=1;i<5;i++){
        Player.getInventory().addItem(speedII.toItemStack(1));}
        Player.getInventory().addItem(new ItemStack(fireres.toItemStack(1)));
        Player.updateInventory();
        Player.removePotionEffect(PotionEffectType.SATURATION);
        Player.removePotionEffect(PotionEffectType.HEAL);
    }




    public static void debuffkit(Player Player){

        ItemStack debuffsword = new ItemStack(Material.DIAMOND_SWORD, 1);
        debuffsword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
        debuffsword.addEnchantment(Enchantment.FIRE_ASPECT, 2);

        ItemStack debuffhelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
        debuffhelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack debuffchesplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        debuffchesplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack debuffleggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        debuffleggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack debuffboots = new ItemStack(Material.DIAMOND_BOOTS, 1);
        debuffboots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        Potion splashheal = new Potion(PotionType.INSTANT_HEAL, 2);
        splashheal.setSplash(true);

        Potion splashpoison = new Potion(PotionType.POISON, 1);
        splashpoison.setSplash(true);

        Potion splashslow = new Potion(PotionType.SLOWNESS, 1);
        splashslow.setSplash(true);

        Potion speedII = new Potion(PotionType.SPEED, 2);
        Potion fireres = new Potion(PotionType.FIRE_RESISTANCE, 1);

        Player.getInventory().clear();
        Player.getInventory().addItem(debuffsword);
        Player.getInventory().setHelmet(debuffhelmet);
        Player.getInventory().setChestplate(debuffchesplate);
        Player.getInventory().setLeggings(debuffleggings);
        Player.getInventory().setBoots(debuffboots);
        Player.getInventory().addItem(new ItemStack(Material.ENDER_PEARL, 16));
        Player.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 64));
        for (int i=1; i<23;i++) {
            Player.getInventory().addItem(splashheal.toItemStack(1));
        }
        for (int i=1; i<4;i++){
            Player.getInventory().addItem(splashpoison.toItemStack(1));
            Player.getInventory().addItem(splashslow.toItemStack(1));
            Player.getInventory().addItem(speedII.toItemStack(1));
        }
        Player.getInventory().addItem(speedII.toItemStack(1));
        Player.getInventory().addItem(new ItemStack(fireres.toItemStack(1)));
        Player.updateInventory();
        Player.removePotionEffect(PotionEffectType.SATURATION);
        Player.removePotionEffect(PotionEffectType.HEAL);


    }

    public static void bowkit(Player Player){

        ItemStack bow = new ItemStack(Material.BOW, 1);
        bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);

        ItemStack bowhelmet = new ItemStack(Material.LEATHER_HELMET, 1);
        bowhelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack bowchesplate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        bowchesplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack bowleggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        bowleggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack bowboots = new ItemStack(Material.LEATHER_BOOTS, 1);
        bowboots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        Potion nightvision = new Potion(PotionType.NIGHT_VISION, 1);

        Player.getInventory().clear();
        Player.getInventory().addItem(bow);
        Player.getInventory().setHelmet(bowhelmet);
        Player.getInventory().setChestplate(bowchesplate);
        Player.getInventory().setLeggings(bowleggings);
        Player.getInventory().setBoots(bowboots);
        Player.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 64));
        Player.getInventory().addItem(new ItemStack(Material.ARROW, 1));
        Player.getInventory().addItem(nightvision.toItemStack(1));
        Player.updateInventory();
        Player.removePotionEffect(PotionEffectType.SATURATION);
        Player.removePotionEffect(PotionEffectType.HEAL);


    }


    public static void HCFkit(Player Player) {

        ItemStack HCFsword = new ItemStack(Material.DIAMOND_SWORD, 1);
        HCFsword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
        HCFsword.addEnchantment(Enchantment.FIRE_ASPECT, 2);

        ItemStack HCFhelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
        HCFhelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack HCFchesplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        HCFchesplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack HCFleggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        HCFleggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack HCFboots = new ItemStack(Material.DIAMOND_BOOTS, 1);
        HCFboots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        Potion splashheal = new Potion(PotionType.INSTANT_HEAL, 2);
        splashheal.setSplash(true);

        Potion speedII = new Potion(PotionType.SPEED, 2);
        Potion fireres = new Potion(PotionType.FIRE_RESISTANCE, 1);




        Player.getInventory().clear();
        Player.getInventory().addItem(HCFsword);
        Player.getInventory().setHelmet(HCFhelmet);
        Player.getInventory().setChestplate(HCFchesplate);
        Player.getInventory().setLeggings(HCFleggings);
        Player.getInventory().setBoots(HCFboots);
        Player.getInventory().addItem(new ItemStack(Material.ENDER_PEARL, 16));
        Player.getInventory().addItem(new ItemStack(Material.FISHING_ROD, 1));
        Player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 16));
        Player.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 64));
        for (int i=1; i<5;i++){
        Player.getInventory().addItem(speedII.toItemStack(1)); }
        Player.getInventory().addItem(new ItemStack(fireres.toItemStack(1)));
        for (int i=1; i<27;i++) {
            Player.getInventory().addItem(splashheal.toItemStack(1));
        }
        Player.updateInventory();
        Player.removePotionEffect(PotionEffectType.SATURATION);
        Player.removePotionEffect(PotionEffectType.HEAL);
    }


    public static void combokit(Player Player) {

        ItemStack combosword = new ItemStack(Material.DIAMOND_SWORD, 1);
        combosword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
        combosword.addEnchantment(Enchantment.FIRE_ASPECT, 2);
        combosword.addEnchantment(Enchantment.DURABILITY, 3);

        ItemStack combohelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
        combohelmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        combohelmet.addEnchantment(Enchantment.DURABILITY, 3);

        ItemStack combochesplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        combochesplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        combochesplate.addEnchantment(Enchantment.DURABILITY, 3);

        ItemStack comboleggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        comboleggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        comboleggings.addEnchantment(Enchantment.DURABILITY, 3);

        ItemStack comboboots = new ItemStack(Material.DIAMOND_BOOTS, 1);
        comboboots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        comboboots.addEnchantment(Enchantment.DURABILITY, 3);


        Player.getInventory().clear();
        Player.getInventory().addItem(combosword);
        Player.getInventory().setHelmet(combohelmet);
        Player.getInventory().setChestplate(combochesplate);
        Player.getInventory().setLeggings(comboleggings);
        Player.getInventory().setBoots(comboboots);
        Player.getInventory().addItem(combohelmet);
        Player.getInventory().addItem(combochesplate);
        Player.getInventory().addItem(comboleggings);
        Player.getInventory().addItem(comboboots);
        Player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 64, (short)1));
        Player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 14400, 1));
        Player.setMaximumNoDamageTicks(3);


        Player.updateInventory();
        Player.removePotionEffect(PotionEffectType.SATURATION);
        Player.removePotionEffect(PotionEffectType.HEAL);
    }


    public static void bridgekit(Player Player) {

        ItemStack bridgebow = new ItemStack(Material.BOW, 1);
        bridgebow.addEnchantment(Enchantment.DURABILITY, 3);



        Player.getInventory().clear();
        Player.getInventory().addItem(new ItemStack(Material.IRON_SWORD, 1));
        Player.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
        Player.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
        Player.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
        Player.getInventory().addItem(bridgebow);
        Player.getInventory().addItem(new ItemStack(Material.STAINED_CLAY, 128));
        Player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 8));
        Player.getInventory().addItem(new ItemStack(Material.ARROW, 20));
        Player.getInventory().addItem(new ItemStack(Material.DIAMOND_PICKAXE, 1));
        Player.updateInventory();
        Player.removePotionEffect(PotionEffectType.SATURATION);
        Player.removePotionEffect(PotionEffectType.HEAL);
    }


    public static void classickit(Player Player){

        Player.getInventory().clear();
        Player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1));
        Player.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
        Player.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
        Player.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
        Player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
        Player.getInventory().addItem(new ItemStack(Material.BOW, 1));
        Player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 8));
        Player.getInventory().addItem(new ItemStack(Material.ARROW, 20));
        Player.getInventory().addItem(new ItemStack(Material.FISHING_ROD, 1));
        Player.updateInventory();
        Player.removePotionEffect(PotionEffectType.SATURATION);
        Player.removePotionEffect(PotionEffectType.HEAL);



    }

    public static void pvpsoupkit(Player Player){

        Player.getInventory().clear();
        Player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1));
        Player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
        Player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        Player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        Player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
        Player.getInventory().addItem(new ItemStack(Material.WOOD, 32));
        Player.getInventory().addItem(new ItemStack(Material.COBBLE_WALL, 32));
        Player.getInventory().addItem(new ItemStack(Material.LAVA_BUCKET, 1));
        Player.getInventory().addItem(new ItemStack(Material.WATER_BUCKET, 1));
        for (int i=1; i<27;i++) {
            Player.getInventory().addItem(new ItemStack(Material.MUSHROOM_SOUP, 1));
        }
        Player.updateInventory();
        Player.getInventory().addItem(new ItemStack(Material.BOWL, 64));
        Player.getInventory().addItem(new ItemStack(Material.BROWN_MUSHROOM, 64));
        Player.getInventory().addItem(new ItemStack(Material.RED_MUSHROOM, 64));
        Player.removePotionEffect(PotionEffectType.SATURATION);
        Player.removePotionEffect(PotionEffectType.HEAL);



    }

    public static void netheribuskit(Player Player){

        ItemStack BuildUHCsword = new ItemStack(Material.DIAMOND_SWORD, 1);
        BuildUHCsword.addEnchantment(Enchantment.DAMAGE_ALL, 3);

        ItemStack BuildUHCbow = new ItemStack(Material.BOW, 1);
        BuildUHCbow.addEnchantment(Enchantment.ARROW_DAMAGE, 2);

        ItemStack BuildUHChelmet = new ItemStack(Material.DIAMOND_HELMET, 1);
        BuildUHChelmet.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);

        ItemStack BuildUHCchesplate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        BuildUHCchesplate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack BuildUHCleggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        BuildUHCleggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        ItemStack BuildUHCboots = new ItemStack(Material.DIAMOND_BOOTS, 1);
        BuildUHCboots.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);


        Player.getInventory().clear();
        Player.getInventory().addItem(BuildUHCsword);
        Player.getInventory().addItem(BuildUHCbow);
        Player.getInventory().setHelmet(BuildUHChelmet);
        Player.getInventory().setChestplate(BuildUHCchesplate);
        Player.getInventory().setLeggings(BuildUHCleggings);
        Player.getInventory().setBoots(BuildUHCboots);
        Player.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, 8));
        Player.getInventory().addItem(new ItemStack(Material.COBBLESTONE, 64));
        Player.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 64));
        Player.getInventory().addItem(new ItemStack(Material.BED, 1));
        Player.getInventory().addItem(new ItemStack(Material.LAVA_BUCKET, 1));
        Player.getInventory().addItem(new ItemStack(Material.DIAMOND_PICKAXE, 1));
        Player.getInventory().addItem(new ItemStack(Material.DIAMOND_AXE, 1));
        Player.getInventory().addItem(new ItemStack(Material.ARROW, 20));
        Player.getInventory().addItem(new ItemStack(Material.WOOD, 64));
        Player.getInventory().addItem(new ItemStack(Material.LAVA_BUCKET, 1));
        Player.getInventory().addItem(new ItemStack(Material.BED, 1));
        Player.getInventory().addItem(new ItemStack(Material.BED, 1));

        Player.updateInventory();
        Player.removePotionEffect(PotionEffectType.SATURATION);
        Player.removePotionEffect(PotionEffectType.HEAL);



    }


    }
