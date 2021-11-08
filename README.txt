# Legends_Monsters_and_Heros
Object Oriented Design Pattern Project for BU CS 611

Name: Matthew Gilgo
BUID: U43413276

How to run program --> Call the Main.java file to run program, then play game as prompted in script.

Classes:
Utility - class to handle error checking for user inputs.
TxtParse - class to handle all txt file read-ins and initialize Items/Characters
Main - Contains main method for running total program.
LMHSession - Contains methods for interacting with and updating at the game session level. startSession() function is where game logic lives.
Fight - Contains methods for performing Hero vs. Monster battles.
World - Contains methods to initialize game board and store information about the board for use during session.
Market - Contains all methods relating to a Market, include constructor method, random inventory initialization, and removing items from inventory.
Item - Superclass in Factory design pattern, contains variables and methods for Item level.
Holdable - Interface for items held in the field of battle (Weapons for this project).
Weapon - extends Item implements Holdable, Subclass in Factory design pattern, contains variables and methods for Weapon level.
Wearable - Interface for items worn in the field of battle (Armor for this project).
Armor - extends Item implements Wearable, Subclass in Factory design pattern, contains variables and methods for Armor level.
Potion - extends Item, Subclass in Factory design pattern, contains variables and methods for Potion level.
Spell - extends Item, Subclass and parent in Factory design pattern, contains variables and methods for Spell level.
FireSpell - extends Spell, Subclass in Factory design pattern, contains variables and methods for FireSpell level.
IceSpell - extends Spell, Subclass in Factory design pattern, contains variables and methods for IceSpell level.
LightningSpell - extends Spell, Subclass in Factory design pattern, contains variables and methods for LightningSpell level.
Character - Superclass in Factory design pattern, contains variables and methods for Character level.
Hero - extends Character, Subclass and parent in Factory design pattern, contains variables and methods for Hero level.
Warrior - extends Hero, Subclass in Factory design pattern, contains variables and methods for Warrior level.
Sorcerer - extends Hero, Subclass in Factory design pattern, contains variables and methods for Sorcerer level.
Paladin - extends Hero, Subclass in Factory design pattern, contains variables and methods for Paladin level.
Monster - extends Character, Subclass and parent in Factory design pattern, contains variables and methods for Monster level.
Dragon - extends Monster, Subclass in Factory design pattern, contains variables and methods for Dragon level.
Exoskeleton - extends Monster, Subclass in Factory design pattern, contains variables and methods for Exoskeleton level.
Spirit - extends Monster, Subclass in Factory design pattern, contains variables and methods for Spirit level.