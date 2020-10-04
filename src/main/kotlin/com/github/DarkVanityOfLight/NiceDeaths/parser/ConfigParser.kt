package com.github.DarkVanityOfLight.NiceDeaths.parser

import com.github.DarkVanityOfLight.NiceDeaths.Main
import com.github.DarkVanityOfLight.NiceDeaths.enums.DeathCauses
import com.github.DarkVanityOfLight.NiceDeaths.enums.ICauseDeath

class ConfigParser(private val main: Main) {
    var deathMessages : MutableMap<ICauseDeath, Array<String>> = emptyMap<ICauseDeath, Array<String>>().toMutableMap()

    fun read(){
        main.saveDefaultConfig()
        main.reloadConfig()

        val config = main.config

        deathMessages = emptyMap<ICauseDeath, Array<String>>().toMutableMap()
        DeathCauses.values().forEach { deathCause ->
            val messages: Array<String> = config.getStringList(deathCause.name).toTypedArray<String>()
            if (messages.isNotEmpty()){
                deathMessages[deathCause] = messages
            }
        }
    }
}