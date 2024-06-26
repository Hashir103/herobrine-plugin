package org.hashir.herobrine;
import org.bukkit.plugin.java.JavaPlugin;

public class herobrine extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Herobrine has been enabled!");

        if (getServer().getPluginManager().getPlugin("Citizens") == null
        || !getServer().getPluginManager().getPlugin("Citizens").isEnabled()) {
            getLogger().severe("Citizens 2.0 not found or not enabled. Disabling Herobrine.");
            }
    }

    @Override
    public void onDisable() {
        getLogger().info("Herobrine has been disabled!");
    }
}
