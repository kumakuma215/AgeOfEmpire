package fr.uiytt.ageofempire;

import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.World;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConfigManager {

    private static World world;
    private static int pvpTimer = 20*60;
    private static int assaultTimer = 40*60;

    private static final Set<Material> breakableBlocks = new HashSet<>(List.of(Material.ANDESITE));
    private static final Set<Material> deletedDrops = new HashSet<>(List.of(Material.DIRT));

    public static void init() {
        breakableBlocks.addAll(Tag.OAK_LOGS.getValues());
        breakableBlocks.addAll(Tag.PLANKS.getValues());
        breakableBlocks.add(Material.CAKE);
        deletedDrops.addAll(Tag.WOOL.getValues());
        deletedDrops.addAll(Tag.ITEMS_STONE_TOOL_MATERIALS.getValues());
    }

    public static World getWorld() {
        return world;
    }
    public static void setWorld(World world) {
        ConfigManager.world = world;
    }

    public static int getPvpTimer() {
        return pvpTimer;
    }
    public static void setPvpTimer(int pvpTimer) {
        ConfigManager.pvpTimer = pvpTimer;
    }

    public static int getAssaultTimer() {
        return assaultTimer;
    }
    public static void setAssaultTimer(int assaultTimer) {
        ConfigManager.assaultTimer = assaultTimer;
    }

    public static Set<Material> getBreakableBlocks() {
        return breakableBlocks;
    }

    public static Set<Material> getDeletedDrops() { return deletedDrops; }
}
