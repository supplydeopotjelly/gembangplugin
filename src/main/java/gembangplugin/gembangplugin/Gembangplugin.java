package gembangplugin.gembangplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Gembangplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("겜방플긴 스타트");

    }

    @Override
    public void onDisable() {
        getLogger().info("겜방플긴 중지");
    }
}
