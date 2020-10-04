package com.github.DarkVanityOfLight.NiceDeaths.listeners

import com.github.DarkVanityOfLight.NiceDeaths.Main
import com.github.DarkVanityOfLight.NiceDeaths.enums.DeathCauses
import com.github.DarkVanityOfLight.NiceDeaths.parser.ConfigParser
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent

class DeathListener(val configParser: ConfigParser) : Listener {

    @EventHandler
    fun onDeath(event: PlayerDeathEvent){

        DeathCauses.values().forEach { DeathCause ->
            event.deathMessage?.let { deathMessage ->
                if (DeathCause.matches(deathMessage)){

                }
            }
        }

    }
}