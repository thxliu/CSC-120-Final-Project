This file will contain documentation for all commands available in your game.

Note:  It's a good idea to also make this list available inside the game, in response to a `HELP` command.

# SPOILER ALERT

If your game includes challenges that must be overcome to win, also list them below.

POKEMON 
chooseStarterType(): choose your starter Pokémon by its type
evolve(): level up your Pokémon to its first or second evolution once it gains enough XP to evolve 

TRAINER
learn(): increase your Pokémon's XP and battle skills by learning new attacks
start(): start learning new attacks by calling this command to officially train your Pokémon 

BATTLE:
generateOpponent(): generate a randomized opponent to battle your Pokémon 
defend(): allows each battle participant to protect themselves from an attack with a shield -- given two shields per battle 
attack(): attack your opponent with the moves you mastered from learn() to decrease their XP
startBattle(): officially starts the battle by generating your opponent, initiating the battle, and giving you the options to defend and attack
