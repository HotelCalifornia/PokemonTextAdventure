Pokemon Text Adventure
======================

AP Computer Science A final project (2014)  
  
Created by  
_Alex Brooke_,  
_Griffin Murray_,  
and _Daniel LeBien_  

Mechanics
=========

#Core Gameplay  
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
  
###Key
- _italics_: attacking type
- __bold__: defending type
- number: damage multiplier  
  
#In-game
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
On every route, there is a random chance for creatures to spawn. Each creature has one of seven types (see above), each of which entails a set of base stats (see above). As the player progresses through the game, the overall 'tier' of newly spawned creatures increases. This is a form of linear progression: as the player progresses, the enemies get stronger.  
The other thing that are spawned on routes are 'trainers,' or computer-controlled players. The same rules apply to the creatures that spawn, in that they get stronger as the player progresses. 
When the player's creatures battle with other creatures, the player's creatures gain experience when the opposing creatures are 'knocked-out,' or lose all of their HP. As creatures gain experience, they level up, which provide stat-increases and a chance to learn newer, more powerful moves, so as to keep up with the progression of the game.  
Another option the player has when battling 'wild,' or not trainer-owned, creatures, is to catch them. This means that the wild creature becomes the player's, and the player can use it in battle.


Legal
=====
The authors (named above) are in no way affiliated with the brand 'Pokémon,' GameFreak, or Nintendo. This project is not intended for commercial use, but for educational purposes. Please do not distribute any of the contents of this repository without the express permission of the authors. 

