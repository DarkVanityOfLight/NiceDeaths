package com.github.DarkVanityOfLight.NiceDeaths.enums

interface IHaveAWeapon {
    val weaponRegex : Regex?

    fun findWeapon(deathMessage : String) : String?
}