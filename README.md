Pokemon Text Adventure
======================

AP Computer Science A final project (2014)  
  
Created by  
_Alex Brooke_,  
_Griffin Murray_,  
and _Daniel LeBien_  

Mechanics
=========

##Core Gameplay  
This section describes how the game works.
  
###Creatures  
This game is based around the existence of 'Pokémon' (hereafter 'creatures,' for legal reasons). These creatures cn be controlled by the player and told to fight other creatures encountered by the player.  
  
###Types  
Each creature has a 'type.' There are seven types in total:  
Fire, Water, Grass, Flying, Electric, Psychic, and Ghost. Each type has a set of strengths and weaknesses against the other types. These strengths and weaknesses are displayed in a chart below.  
  
###Type chart    
  
 | Fire | Water | Grass | Flying | Electric | Psychic | Ghost  
 -------------- | :---------------: | :---------------: | :---------------: | :---------------: | :---------------: | :----------------: | :---------------:  
 _Fire_ | 1/2 | 1/2 | 2 | 1 | 1 | 1 | 1  
 _Water_ | 2 | 1/2 | 1/2 | 1 | 1/2 | 1 | 1  
 _Grass_ | 1/2 | 2 | 1/2 | 1/2 | 2 | 1 | 1  
 _Flying_ | 1 | 1 | 2 | 1/2 | 1/2 | 1 | 1 
 _Electric_ | 1 | 2 | 1/2 | 2 | 1/2 | 1 | 1  
 _Psychic_ | 1 | 1 | 1 | 1 | 1 | 1/2 | 2  
 _Ghost_ | 1 | 1 | 1 | 1 | 1 | 2 | 1/2
  
###Stats  
In addition to a type, each creature has a set of stats: Attack (ATK), Defense (DEF), and Hit-Points (HP). For each type, there are a set of 'base stats.' These are the very lowest a creature's stats can be. The base stats for each type are as follows.  
  
  | Fire | Water | Grass | Flying | Electric | Psychic | Ghost  
  -------------- | :---------------: | :---------------: | :---------------: | :---------------: | :---------------: | :----------------: | :---------------:  
  _HP_ | 30 | 30 | 50 | 20 | 20 | 10 | 20  
  _ATK_ | 50 | 40 | 30 | 30 | 60 | 70 | 10  
  _DEF_ | 40 | 50 | 40 | 60 | 40 | 20 | 70  
  
###Experience  
When a creature is in-battle (see below), and it defeats the opposing creature, it gains a certain amount of experience. As a creature's experience increases, it 'levels-up.'  
  
###Levels  
Each creature has a 'level.' The level of a creature is determined by the amount of experience it has. As a creature's level increases, its stats increase as well, and there is a chance that the creature could learn a new, more powerful move (see below).  
  

###Key
- _italics_: attacking type
- __bold__: defending type
- number: damage multiplier 

###Help commands
- /help: brings up help command list
- /creatures: brings up a list of pokemon in party with names, moves, and stats
- /"playername": brings up how many badges the player has and how much money they have
- /save: saves where the player is in the game and asks the player if they want to quit or continue
- /exit: quits without saving. Ask the player if they are sure


##In-game
The player has long-term memory loss! This means you cannot remember the places you've been. As a result, going more than one route-length away from a town means you've 'forgotten' it, and can no longer go back.  
  
###Routes
A route is a stretch of road between towns. Each route has a chance to be between one and three 'route-lengths,' or segments, long.  
  
X = Player  
~ = Route-length  
T = Town  
  
T ~ ~ ~ T => these towns are three route-lengths away from each other  
X ~ ~ ~ T => the player is in the first town!  
T X ~ ~ T => the player is now one route-length away from the first town, so they can still go back  
T ~ X ~ T => the player has gone another route-length away from the first town. now they've forgotten all about the town!  
  
After the fourth scene in the scenario, the player has traversed two route-lengths away from the town, so the only way is forward.  
  
###Battling
On every route, there is a random chance for creatures to spawn. As the player progresses through the game, the overall 'tier' of newly spawned creatures increases (as do their levels, and stats). This is a form of linear progression: as the player progresses, the enemies get stronger.  
The other thing that are spawned on routes are 'trainers,' or computer-controlled players. The same rules apply to the creatures that spawn, in that they get stronger as the player progresses. 
When the player's creatures battle with other creatures, the player's creatures gain experience when the opposing creatures are 'knocked-out,' or lose all of their HP.   
Another option the player has when battling 'wild,' or not trainer-owned, creatures, is to catch them. This means that the wild creature becomes the player's, and the player can then use it in battle.  
  
###Party
No, not that kind of party (aww). As the player catches creatures throughout their adventure, they get to keep a maximum of six with them at any time. These are the 'party,' or the creatures you may use in battle. However, this doesn't mean the player can't have any more. In fact, there is a system in place that allows for the storage of up to sixty-four more creatures in a 'boxes' network within the world. This can be accessed from the Pokécenters in each town.
  
###Towns  
In the world, there are towns. Each town has a few facilities:
1. Pokécenter: Here is where the player can heal their creatures and access the 'boxes' network discussed above.
2. Pokémart: Here is where you can buy certain items, including pokéballs (used to capture new creatures) and health items (used in-battle to heal your creatures' HP and status problems)
3. Gym: This has a random chance to spawn in a town. Here is where you can win a 'gym badge' (see below) by defeating the Gym Leader. Each gym has a type specialty. To make up for this, they tout creatures that a stronger than the player's.
4. TM House: This has a random chance to spawn in a town. Here is where you can buy special moves that you can teach to your creatures.  

  
###Gyms and Gym Badges— Ticket to the Championship  
After defeating a gym, the player earns a gym badge. These are your ticket to the Pokémon League championship, the final challenge of the game. Once the player has eight gym badges, they are given the option to challenge the Elite Four, four trainers that make up the championship. These trainers are stronger even than Gym Leaders. By defeating all four concurrently, the player successfully 'beats' the game. If the player does not succeed, i.e. all of their creatures are defeated, the player is sent back to the last town they were in, to try again. The player can not try again immediately, however, they must earn another eight badges in order to get another chance at the Championship.  
  
###Have Fun!
That's pretty much all you need to know about the mechanics of this game.  
We hope you enjoy it!  

Legal
=====
The authors (named above) are in no way affiliated with the brand 'Pokémon,' GameFreak, or Nintendo. This project is not intended for commercial use, but for educational purposes. Please do not distribute any of the contents of this repository without the express permission of the authors. 

