package com.AresPainball.core;


import net.minecraft.server.v1_11_R1.ItemStack;
import net.minecraft.server.v1_11_R1.PacketPlayOutWorldParticles;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements CommandExecutor, Listener {

    Utils u = new Utils();

    @Override
    public void onEnable() {
        getLogger().info("AresPaintball has officially been enabled.");
        getServer().getPluginManager().registerEvents(this, this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String l, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Console Cannot Use Worlds Controls. Period!");
            return true;
        }
        Player p = (Player) sender;
        if (args.length == 0) {
            if (cmd.getName().equalsIgnoreCase("pb")) {
                org.bukkit.inventory.ItemStack WoodenHoe = new org.bukkit.inventory.ItemStack(Material.STONE_HOE, 1);
                ItemMeta woodenHoe = WoodenHoe.getItemMeta();
                woodenHoe.setDisplayName("§3§l┠ §b§lStone Hoe§8 (§7Level 1§8)§3§l ┨");
                WoodenHoe.setItemMeta(woodenHoe);

                u.message(p, "&b&lAres&b&lPaintball&8 ┃&7 You've been given a level &b1 Hoe.");
                p.getInventory().setItem(1, WoodenHoe);
                for (int degree = 0; degree < 360; degree++) {
                    double radians = Math.toRadians(degree);
                    double x = Math.cos(radians);
                    double y = Math.PI * radians;
                    double z = Math.sin(radians);
                    Location loc = p.getLocation();
                    loc.add(x, y, z);
                    loc.getWorld().playEffect(loc, Effect.FIREWORKS_SPARK, 1);
                    loc.subtract(x, y, z);
                }
                return true;
            }
        }
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("2")) {
                org.bukkit.inventory.ItemStack WoodenAXE = new org.bukkit.inventory.ItemStack(Material.STONE_AXE, 1);
                ItemMeta woodenAXE = WoodenAXE.getItemMeta();
                woodenAXE.setDisplayName("§3§l┠ §b§lStone Axe§8 (§7Level 2§8)§3§l ┨");
                WoodenAXE.setItemMeta(woodenAXE);

                u.message(p, "&b&lAres&b&lPaintball&8 ┃&7 You've been given a level &b2 Axe.");
                p.getInventory().setItem(1, WoodenAXE);
                for (int degree = 0; degree < 360; degree++) {
                    double radians = Math.toRadians(degree);
                    double x = Math.cos(radians);
                    double y = Math.PI * radians;
                    double z = Math.sin(radians);
                    Location loc = p.getLocation();
                    loc.add(x, y, z);
                    loc.getWorld().playEffect(loc, Effect.FIREWORKS_SPARK, 1);
                    loc.subtract(x, y, z);
                }
            }
           else if (args[0].equalsIgnoreCase("3")) {
                org.bukkit.inventory.ItemStack IronHoe = new org.bukkit.inventory.ItemStack(Material.IRON_HOE, 1);
                ItemMeta ironHoe = IronHoe.getItemMeta();
                ironHoe.setDisplayName("§3§l┠ §b§lIron Hoe§8 (§7Level 3§8)§3§l ┨");
                IronHoe.setItemMeta(ironHoe);

                u.message(p, "&b&lAres&b&lPaintball&8 ┃&7 You've been given a level &b3 Hoe.");
                p.getInventory().setItem(1, IronHoe);
                for (int degree = 0; degree < 360; degree++) {
                    double radians = Math.toRadians(degree);
                    double x = Math.cos(radians);
                    double y = Math.PI * radians;
                    double z = Math.sin(radians);
                    Location loc = p.getLocation();
                    loc.add(x, y, z);
                    loc.getWorld().playEffect(loc, Effect.FIREWORKS_SPARK, 1);
                    loc.subtract(x, y, z);
                }
                            }
            else if (args[0].equalsIgnoreCase("4")) {
                org.bukkit.inventory.ItemStack IronAxe = new org.bukkit.inventory.ItemStack(Material.IRON_AXE, 1);
                ItemMeta ironAxe = IronAxe.getItemMeta();
                ironAxe.setDisplayName("§3§l┠ §b§lIron Axe§8 (§7Level 3§8)§3§l ┨");
                IronAxe.setItemMeta(ironAxe);

                u.message(p, "&b&lAres&b&lPaintball&8 ┃&7 You've been given a level &b4 Axe.");
                p.getInventory().setItem(1, IronAxe);
                for (int degree = 0; degree < 360; degree++) {
                    double radians = Math.toRadians(degree);
                    double x = Math.cos(radians);
                    double y = Math.PI * radians;
                    double z = Math.sin(radians);
                    Location loc = p.getLocation();
                    loc.add(x, y, z);
                    loc.getWorld().playEffect(loc, Effect.FIREWORKS_SPARK, 1);
                    loc.subtract(x, y, z);
                }

            }
            else if (args[0].equalsIgnoreCase("5")) {
                org.bukkit.inventory.ItemStack DiamondHoe = new org.bukkit.inventory.ItemStack(Material.DIAMOND_HOE, 1);
                ItemMeta diamondHoe = DiamondHoe.getItemMeta();
                diamondHoe.setDisplayName("§3§l┠ §b§lDiamond Hoe§8 (§7Level 5§8)§3§l ┨");
                DiamondHoe.setItemMeta(diamondHoe);

                u.message(p, "&b&lAres&b&lPaintball&8 ┃&7 You've been given a level &b5 Hoe.");
                p.getInventory().setItem(1, DiamondHoe);
                for (int degree = 0; degree < 360; degree++) {
                    double radians = Math.toRadians(degree);
                    double x = Math.cos(radians);
                    double y = Math.PI * radians;
                    double z = Math.sin(radians);
                    Location loc = p.getLocation();
                    loc.add(x, y, z);
                    loc.getWorld().playEffect(loc, Effect.FIREWORKS_SPARK, 1);
                    loc.subtract(x, y, z);
                }

            }
            else if (args[0].equalsIgnoreCase("6")) {
                org.bukkit.inventory.ItemStack DiamondAxe = new org.bukkit.inventory.ItemStack(Material.DIAMOND_AXE, 1);
                ItemMeta diamondAxe = DiamondAxe.getItemMeta();
                diamondAxe.setDisplayName("§3§l┠ §b§lDiamond Axe§8 (§7Level 6§8)§3§l ┨");
                DiamondAxe.setItemMeta(diamondAxe);

                u.message(p, "&b&lAres&b&lPaintball&8 ┃&7 You've been given a level &b6 Axe.");
                p.getInventory().setItem(1, DiamondAxe);
                for (int degree = 0; degree < 360; degree++) {
                    double radians = Math.toRadians(degree);
                    double x = Math.cos(radians);
                    double y = Math.PI * radians;
                    double z = Math.sin(radians);
                    Location loc = p.getLocation();
                    loc.add(x, y, z);
                    loc.getWorld().playEffect(loc, Effect.FIREWORKS_SPARK, 1);
                    loc.subtract(x, y, z);
                }

            }
            return false;
        }

    return false;
    }

    @EventHandler
    public void WoodenHoe(PlayerInteractEvent e) {
        if (!(e.getPlayer().getInventory().getItemInHand().getType() == Material.STONE_HOE)) {
            return;
        }
        org.bukkit.inventory.ItemStack iteminhand = e.getPlayer().getInventory().getItemInHand();
        if (!(iteminhand.hasItemMeta())) {
            return;
        }

        if (!(iteminhand.getItemMeta().getDisplayName().equalsIgnoreCase("§3§l┠ §b§lStone Hoe§8 (§7Level 1§8)§3§l ┨"))) {
            return;
        }
        if (e.getItem() != null) {
            if ((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
                if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                    e.getPlayer().launchProjectile(Snowball.class);
                }

                return;
            } else {
                return;
            }

        }


    }
    public void WoodenAxe(PlayerInteractEvent e) {
        if (!(e.getPlayer().getInventory().getItemInHand().getType() == Material.STONE_AXE)) {
            return;
        }
        org.bukkit.inventory.ItemStack iteminhand = e.getPlayer().getInventory().getItemInHand();
        if (!(iteminhand.hasItemMeta())) {
            return;
        }

        if (!(iteminhand.getItemMeta().getDisplayName().equalsIgnoreCase("§3§l┠ §b§lStone Axe§8 (§7Level 2§8)§3§l ┨"))) {
            return;
        }
        if (e.getItem() != null) {
            if ((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
                if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                    e.getPlayer().launchProjectile(Snowball.class);
                }

                return;
            } else {
                return;
            }

        }


    }

            }


