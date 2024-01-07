package com.dev.blacksmith;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Blacksmith extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(getCommand("blacksmith")).setExecutor(new Blacksmith());
    }
}
