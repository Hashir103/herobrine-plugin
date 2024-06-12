package org.hashir.herobrine;
import org.bukkit.plugin.java.JavaPlugin;

public class herobrine extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Herobrine has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Herobrine has been disabled!");
    }
}
