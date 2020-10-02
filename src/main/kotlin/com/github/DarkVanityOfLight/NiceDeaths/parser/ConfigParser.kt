package com.github.DarkVanityOfLight.NiceDeaths.parser

import com.github.DarkVanityOfLight.NiceDeaths.Main

class ConfigParser(private val main: Main) {

    fun read(){
        main.saveDefaultConfig()
        main.reloadConfig()

        val config = main.config
    }
}