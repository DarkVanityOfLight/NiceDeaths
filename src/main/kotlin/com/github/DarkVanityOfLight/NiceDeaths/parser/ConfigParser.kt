package com.github.DarkVanityOfLight.NiceDeaths.parser

import com.github.DarkVanityOfLight.NiceDeaths.Main
import com.github.DarkVanityOfLight.NiceDeaths.enums.DeathCauses
import com.github.DarkVanityOfLight.NiceDeaths.enums.ICauseDeath

class ConfigParser(private val main: Main) {
    var deathMessages : MutableMap<String, MutableMap<ICauseDeath, Array<String>>> = emptyMap<String, MutableMap<ICauseDeath, Array<String>>>().toMutableMap()

    fun read(){
        main.saveDefaultConfig()
        main.reloadConfig()

        val config = main.config


        deathMessages = emptyMap<String, MutableMap<ICauseDeath, Array<String>>>().toMutableMap()
        for(faction : String in config.getConfigurationSection("messageMapping")?.getKeys(false)!!){
            val factionDeathMessage : MutableMap<ICauseDeath, Array<String>> = emptyMap<ICauseDeath, Array<String>>().toMutableMap()
            DeathCauses.values().forEach { deathCause ->
                val messages : Array<String> = config.getStringList("messageMapping$faction.${deathCause.name}").toTypedArray<String>()
                factionDeathMessage[deathCause] = messages
            }
            deathMessages[faction] = factionDeathMessage
        }
    }
}