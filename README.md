# NiceDeaths
This is a plugin to customize death messages in combination with a faction plugin.
To get started just download the plugin and a version of SaberFactions.
>*Note: This might work with other factions plugins but is only tested for SaberFactions

Put both Plugins into the plugins folder and start the server, NiceDeaths will now automatically create a new directory 
and a config file.

Put following in the config file:
```yaml
messageMapping:
  faction-you-want-to-customize:
    DEATH_REASON:
      - "A message you want to have displayed"
    ANOTHER_DEATH_REASON:
      - "A death message"
      - "Another death message"
  another-faction:
    DEATH_REASON:
      - "A message you want to have displayed"
```
>*Note: At the moment it is not supported to have more then one death message, you still can add more then one but it just
>displays the first one, in future releases this may change to choosing a random message

There are some placeholders that you can use to display special information in your message,
these placeholders are:
```
{player}
{killer}
{weapon}
```
Your death message string might look like this:
```
"{player} got killed by {killer} using {weapon}"
```
>*Note: Not every death cause might have a killer, or a weapon which he got killed with

Here is a list of death causes you can use to trigger your messages:
* ARROW_WITH_PLAYER
* ARROW_WITH_PLAYER_ITEM
* SNOWBALL_WITH_PLAYER
* SNOWBALL_WITH_ITEM
* CACTUS
* CACTUS_WITH_PLAYER
* DROWNING
* DROWNING_WITH_PLAYER
* ELYTRA
* ELYTRA_WITH_PLAYER
* EXPLOSION
* EXPLOSION_WITH_PLAYER
* EXPLOSION_WITH_PLAYER_WITH_ITEM
* EXPLOSION_WITH_GAMEDESIGN
* FALLING_LESS_THEN_5
* FALLING_WITH_PLAYER
* FALLING_MORE_THEN_5
* FALLING_OFF_LADDER
* FALLING_OFF_VINES
* FALLING_OFF_WEEPING_VINES
* FALLING_OFF_TWISTING_VINES
* FALLING_OFF_SCAFFOLDING
* FALLING_WHILE_CLIMBING
* FALLING_BLOCK_ANVIL
* FALLING_BLOCK_ANVIL_WITH_PLAYER
* FALLING_BLOCK
* FALLING_BLOCK_WITH_PLAYER
* FIRE
* FIRE_WITH_PLAYER
* FIRE_NOT_IN_FIRE
* FIRE_NOT_IN_FIRE_WITH_PLAYER
* FIREWORK
* FIREWORK_WITH_PLAYER_WITH_ITEM
* LAVA
* LAVA_WITH_PLAYER
* LIGHTNING
* LIGHTNING_WITH_PLAYER
* MAGMA_BLOCK
* MAGMA_BLOCK_WITH_PLAYER
* MAGIC
* MAGIC_WITH_PLAYER
* MAGIC_WITH_PLAYER_WITH_ITEM
* OTHER_MAGIC
* PLAYER
* PLAYER_WITH_ITEM
* FIREBALL_WITH_PLAYER
* FIREBALL_WITH_PLAYER_WITH_ITEM
* BEE_STING
* SHOT_SKULL_WITH_PLAYER
* STARVING
* STARVING_WITH_PLAYER
* SUFFOCATED
* SUFFOCATED_WITH_PLAYER
* SQUASHED
* SQUASHED_WITH_PLAYER
* SWEET_BERRY
* SWEET_BERRY_WITH_PLAYER
* THORNS_WITH_PLAYER
* THORNS_WITH_PLAYER_WITH_ITEM
* TRIDENT_WITH_PLAYER
* TRIDENT_WITH_PLAYER_WITH_ITEM
* VOID
* VOID_WITH_PLAYER
* WITHER
* WITHER_WITH_PLAYER
* DIED

WITH_PLAYER indicates that there was another player, or a mob involved in the death,
if this is the case it is safe to call ```{killer}``` in the death message string.

WITH_ITEM indicates that there was an item involved in the death,
 if this is the case it is safe to call ```{weapon}``` in the death message string.
 
 >This plugin is free to use and to modify, but if you wish to use it please contact me ;D