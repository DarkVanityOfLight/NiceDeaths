package com.github.DarkVanityOfLight.NiceDeaths.enums

interface ICauseDeath {
    public val reg : Regex

    fun getRegex() : Regex
    fun matches(message : String) : Boolean
}