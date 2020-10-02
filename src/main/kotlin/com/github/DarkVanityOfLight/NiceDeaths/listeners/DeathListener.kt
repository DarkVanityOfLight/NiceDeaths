package com.github.DarkVanityOfLight.NiceDeaths.listeners

import com.github.DarkVanityOfLight.NiceDeaths.Main
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent

class DeathListener(val main : Main) : Listener {

    @EventHandler
    fun onDeath(event: PlayerDeathEvent){

    }
}