package com.github.DarkVanityOfLight.NiceDeaths.enums

interface IHaveADeadPlayer {
    val deadPlayerRegex : Regex

    fun findDeadPlayer(deathMessage : String) : String?
}