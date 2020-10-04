package com.github.DarkVanityOfLight.NiceDeaths.enums

/*
    Playername = \\w{3,16}
    Itemname = \\w{4,35}

*/

enum class DeathCauses : ICauseDeath, IHaveADeadPlayer {

    ARROW_WITH_PLAYER {
        override val reg: Regex = Regex("^\\w{3,16} was shot by \\w{3,16}$")
    },
    ARROW_WITH_PLAYER_ITEM {
        override val reg: Regex = Regex("^\\w{3,16} was shot by \\w{3,16} using \\w{4,35}$")
    },

    SNOWBALL_WITH_PLAYER {
        override val reg: Regex = Regex("^\\w{3,16} was pummeled by \\w{3,16}$")
    },
    SNOWBALL_WITH_ITEM {
        override val reg: Regex = Regex("^\\w{3,16} was pummeled by \\w{3,16} using \\w{4,35}$")
    },

    CACTUS {
        override val reg: Regex = Regex("^\\w{3,16} was pricked to death$")
    },
    CACTUS_WITH_PLAYER {
        override val reg: Regex = Regex("^\\w{3,16} walked into a cactus whilst trying to escape \\w{3,16}$")
    },

    DROWNING {
        override val reg: Regex = Regex("^\\w{3,16} drowned$")
    },
    DROWNING_WITH_PLAYER {
        override val reg: Regex = Regex("^\\w{3,16} drowned whilst trying to escape \\w{3,16}$")
    },

    ELYTRA {
        override val reg: Regex = Regex("^\\w{3,16} experienced kinetic energy$")
    },
    ELYTRA_WITH_PLAYER {
        override val reg: Regex = Regex("^\\w{3,16} experienced kinetic energy whilst trying to escape \\w{3,16}$")
    },

    EXPLOSION {
        override val reg: Regex = Regex("^\\w{3,16} blew up$")
    },
    EXPLOSION_WITH_PLAYER {
        override val reg: Regex = Regex("^\\w{3,16} was blown up by \\w{3,16}$")
    },
    EXPLOSION_WITH_PLAYER_WITH_ITEM {
        override val reg: Regex = Regex("^\\w{3,16} was blown up by \\w{3,16} using \\w{4,35}$")
    },
    EXPLOSION_WITH_GAMEDESIGN {
        override val reg: Regex = Regex("^\\w{3,16} was killed by \\[Intentional Game Design]$")
    },

    FALLING_LESS_THEN_5 {
        override val reg: Regex = Regex("^\\w{3,16} hit the ground too hard$")
    },
    FALLING_WITH_PLAYER {
        override val reg: Regex = Regex("^\\w{3,16} hit the ground too hard whilst trying to escape \\w{3,16}$")
    },
    FALLING_MORE_THEN_5 {
        override val reg: Regex = Regex("^\\w{3,16} fell from a high place$")
    },
    FALLING_OFF_LADDER {
        override val reg: Regex = Regex("^\\w{3,16} fell off a ladder$")
    },
    FALLING_OFF_VINES {
        override val reg: Regex = Regex("^\\w{3,16} fell off some vines$")
    },
    FALLING_OFF_WEEPING_VINES {
        override val reg: Regex = Regex("^\\w{3,16} fell off some weeping vines$")
    },
    FALLING_OFF_TWISTING_VINES {
        override val reg: Regex = Regex("^\\w{3,16} fell off some twisting vines$")
    },
    FALLING_OFF_SCAFFOLDING {
        override val reg: Regex = Regex("^\\w{3,16} fell off scaffolding$")
    },
    FALLING_WHILE_CLIMBING {
        override val reg: Regex = Regex("^\\w{3,16} fell while climbing$")
    },

    FALLING_BLOCK_ANVIL {
        override val reg: Regex = Regex("^\\w{3,16} was squashed by a falling anvil$")
    },
    FALLING_BLOCK_ANVIL_WITH_PLAYER {
        override val reg: Regex = Regex("^\\w{3,16} was squashed by a falling anvil whilst fighting \\w{3,16}$")
    },
    FALLING_BLOCK {
        override val reg: Regex = Regex("^\\w{3,16} was squashed by a falling block$")
    },
    FALLING_BLOCK_WITH_PLAYER {
        override val reg: Regex = Regex("^\\w{3,16} was squashed by a falling block whilst fighting \\w{3,16}$")
    },

    FIRE {
        override val reg: Regex = Regex("^\\w{3,16} went up in flames$")
    },
    FIRE_WITH_PLAYER {
        override val reg: Regex = Regex("^\\w{3,16} walked into fire whilst fighting \\w{3,16}$")
    },
    FIRE_NOT_IN_FIRE {
        override val reg: Regex = Regex("^\\w{3,16} burned to death$")
    },
    FIRE_NOT_IN_FIRE_WITH_PLAYER {
        override val reg: Regex = Regex("^\\w{3,16} was burnt to a crisp whilst fighting \\w{3,16}$")
    },

    FIREWORK {
        override val reg: Regex = Regex("\\w{3,16} went off with a bang")
    },
    FIREWORK_WITH_PLAYER_WITH_ITEM {
        override val reg: Regex =
            Regex("\\w{3,16} went off with a bang due to a firework fired from \\w{4,35} by \\w{3,16}")
    },

    LAVA {
        override val reg: Regex = Regex("\\w{3,16} tried to swim in lava$")
    },
    LAVA_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} tried to swim in lava to escape \\w{3,16}$")
    },

    LIGHTNING {
        override val reg: Regex = Regex("\\w{3,16} was struck by lightning$")
    },
    LIGHTNING_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} was struck by lightning whilst fighting \\w{3,16}$")
    },

    MAGMA_BLOCK {
        override val reg: Regex = Regex("\\w{3,16} discovered the floor was lava$")
    },
    MAGMA_BLOCK_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} walked into danger zone due to \\w{3,16}$")
    },

    MAGIC {
        override val reg: Regex = Regex("\\w{3,16} was killed by magic$")
    },
    MAGIC_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} was killed by \\w{3,16} using magic$")
    },
    MAGIC_WITH_PLAYER_WITH_ITEM {
        override val reg: Regex = Regex("\\w{3,16} was killed by \\w{3,16} using \\w{4,35}$")
    },
    OTHER_MAGIC {
        override val reg: Regex = Regex("\\w{3,16} was killed by magic using \\w{4,35}$")
    },

    PLAYER {
        override val reg: Regex = Regex("\\w{3,16} was slain by \\w{3,16}$")
    },
    PLAYER_WITH_ITEM {
        override val reg: Regex = Regex("\\w{3,16} was slain by \\w{3,16} using \\w{4,35}$")
    },

    FIREBALL_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} was fireballed by \\w{3,16}$")
    },
    FIREBALL_WITH_PLAYER_WITH_ITEM {
        override val reg: Regex = Regex("\\w{3,16} was fireballed by \\w{3,16} using \\w{4,35}$")
    },

    BEE_STING {
        override val reg: Regex = Regex("\\w{3,16} was stung to death$")
    },

    SHOT_SKULL_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} was shot by a skull from \\w{3,16}$")
    },

    STARVING {
        override val reg: Regex = Regex("\\w{3,16} starved to death$")
    },
    STARVING_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} starved to death whilst fighting \\w{3,16}$")
    },

    SUFFOCATED {
        override val reg: Regex = Regex("\\w{3,16} suffocated in wall$")
    },
    SUFFOCATED_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} suffocated in wall whilst fighting \\w{3,16}$")
    },
    SQUASHED {
        override val reg: Regex = Regex("\\w{3,16} was squished too much$")
    },
    SQUASHED_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} was squashed by \\w{3,16}$")
    },

    SWEET_BERRY {
        override val reg: Regex = Regex("\\w{3,16} was poked to death by a sweet berry bush$")
    },
    SWEET_BERRY_WITH_PLAYER {
        override val reg: Regex =
            Regex("\\w{3,16} was poked to death by a sweet berry bush whilst trying to escape \\w{3,16}$")
    },

    THORNS_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} was killed trying to hurt \\w{3,16}$")
    },
    THORNS_WITH_PLAYER_WITH_ITEM {
        override val reg: Regex = Regex("\\w{3,16} was killed by \\w{4,35} trying to hurt \\w{3,16}$")
    },

    TRIDENT_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} was impaled by \\w{3,16}$")
    },
    TRIDENT_WITH_PLAYER_WITH_ITEM {
        override val reg: Regex = Regex("\\w{3,16} was impaled by \\w{3,16} with \\w{4,35}$")
    },

    VOID {
        override val reg: Regex = Regex("\\w{3,16} fell out of the world$")
    },
    VOID_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} didn't want to live in the same world as \\w{3,16}$")
    },

    WITHER {
        override val reg: Regex = Regex("\\w{3,16} withered away$")
    },
    WITHER_WITH_PLAYER {
        override val reg: Regex = Regex("\\w{3,16} withered away whilst fighting \\w{3,16}$")
    },

    DIED {
        override val reg: Regex = Regex("^\\w{3,16} died$")
    };

    override fun matches(message: String): Boolean {
        return match(getRegex(), message)
    }

    override fun getRegex(): Regex {
        return reg
    }

    override fun findDeadPlayer(deathMessage: String): String? {
        return findFirstOccurence(deadPlayerRegex, deathMessage)
    }

    companion object {
        fun match(reg: Regex, message: String): Boolean {
            return reg.matches(message)
        }

        fun findFirstOccurence(reg: Regex, message: String) : String?{
            return reg.find(message)?.value
        }

    }

}