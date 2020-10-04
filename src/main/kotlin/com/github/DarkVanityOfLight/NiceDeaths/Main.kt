package com.github.DarkVanityOfLight.NiceDeaths

import com.github.DarkVanityOfLight.NiceDeaths.listeners.DeathListener
import com.github.DarkVanityOfLight.NiceDeaths.parser.ConfigParser
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    val configParser: ConfigParser = ConfigParser(this)

    override fun onEnable() {
        configParser.read()
        Bukkit.getPluginManager().registerEvents(DeathListener(configParser), this)
    }
}