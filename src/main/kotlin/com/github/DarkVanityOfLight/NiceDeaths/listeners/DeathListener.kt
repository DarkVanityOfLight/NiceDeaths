package com.github.DarkVanityOfLight.NiceDeaths.listeners


import com.github.DarkVanityOfLight.NiceDeaths.enums.DeathCauses
import com.github.DarkVanityOfLight.NiceDeaths.parser.ConfigParser
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent

class DeathListener(val configParser: ConfigParser) : Listener {

    @EventHandler
    fun onDeath(event: PlayerDeathEvent){

        DeathCauses.values().forEach { deathCause ->
            event.deathMessage?.let { deathMessage ->
                if (deathCause.matches(deathMessage)){
                    var deathMessage = configParser.deathMessages[deathCause]?.get(0)

                    if (deathMessage != null) {
                    // Check if deadPlayer is null and if yes just replace with ""
                    val deadPlayer : String = if (deathCause.findDeadPlayer(event.deathMessage) == null) ""
                    else deathCause.findDeadPlayer(event.deathMessage)!!
                    deathMessage = deathMessage.replace("{player}", deadPlayer)

                    val killer : String = if (deathCause.findKiller(event.deathMessage) == null) ""
                    else deathCause.findKiller(event.deathMessage)!!
                        deathMessage.replace("{killer}", killer)

                    val weapon : String = if (deathCause.findWeapon(event.deathMessage) == null) ""
                    else deathCause.findWeapon(event.deathMessage)!!
                        deathMessage.replace("{weapon}", weapon)

                    event.deathMessage = deathMessage
                    return
                    }else{
                        return
                    }
                }
            }
        }
        Bukkit.getLogger().info("Could not find the death cause for the death of player ${event.entity.name}")
    }
}