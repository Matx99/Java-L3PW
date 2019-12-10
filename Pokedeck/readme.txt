Report:

I am aware that this isn't following the whole rules from this Pokedeck project but I have chosen to make 
something easier and that I can do rather than using things I don't really know.
Indeed, I for example didn't put graphic interface but I'm using console. 

Here's the class diagram: https://i.ibb.co/ysTm0YB/Capture.jpg

Card is the parent class of PokemonCard, EnergyCard and TrainerCard. These three classes inherit from the Card properties and have their specificities that differentiate deck's cards by their type.
The Deck class allows to add and remove cards from the ArrayList containing the cards.
The menu is the view allowing to interact with the user (modification, search of cards etc ...).
The menu is called in the Main class with the launchMenu () method.

I implemented multiples functions (add, remove and seek for a card, display deck, edit a card and leave the application).
I also added a bonus function: a game. It works like that:
user picks two cards, the one that has the highest attack points wins the game.
