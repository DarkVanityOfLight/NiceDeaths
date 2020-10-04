package com.github.DarkVanityOfLight.NiceDeaths.enums

interface IHaveAKiller {
    val killerRegex : Regex?

    fun findKiller(deathMessage : String) : String?

}