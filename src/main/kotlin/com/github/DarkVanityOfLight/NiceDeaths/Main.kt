package com.github.DarkVanityOfLight.NiceDeaths

import com.github.DarkVanityOfLight.NiceDeaths.listeners.DeathListener
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(DeathListener(this), this)
    }
}