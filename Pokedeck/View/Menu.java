package View;

import java.util.Scanner;
import Model.*;

public class Menu {
	
	/*
	 * NOTES:
	 * I am aware that this isn't following the whole rules from this Pokedeck project but I have chosen to make something easier and that I can
	 * do rather than using things I don't really know.
	 * Indeed, I for example didn't put graphic interface but I'm using console. 
	 * Here's the class diagram: https://i.ibb.co/ysTm0YB/Capture.jpg
	 * 
	 * I implemented multiples functions (add, remove and seek for a card, display deck, edit a card and leave the application).
	 * I also added a bonus function: a game. It works like that:
     * user picks two cards, the one that has the highest attack points wins the game.
	 */
	
	// variables declaration
	private int choice;
	private int id;
	private String name;
	private String type;
	private String description;
	private int hp;
	private int stage;
	private int attackPoints;
	private Scanner sc = new Scanner(System.in);
	private Card card;
	private Card cardBis; // pour le jeu
	private Deck deck = new Deck();
	
	// method
	public void launchMenu() {
		System.out.println("Welcome to your Pokedeck! What would you like to do?");
	while(choice != 7) {
		System.out.println("************************************************");
        System.out.println("1 - Add a card");
        System.out.println("2 - Remove a card");
        System.out.println("3 - Seek for a card");
        System.out.println("4 - Display deck");
        System.out.println("5 - Edit an existing card");
        System.out.println("6 - Play");
        System.out.println("7 - Leave");
        choice = Integer.parseInt(sc.nextLine());
        switch(choice) {
         case 1:
        	 System.out.println("What kind of card would you like to create?");
        	 System.out.println("1 - Pokemon card");
        	 System.out.println("2 - Energy card");
        	 System.out.println("3 - Trainer card");
        	 choice = Integer.parseInt(sc.nextLine());
        	 switch(choice) {
        	 case 1:
        		 System.out.println("Name:");
        		 name = sc.nextLine();
            	 type = "Pokemon";
            	 System.out.println("Description:");
            	 description = sc.nextLine();
            	 System.out.println("HP:");
            	 hp = Integer.parseInt(sc.nextLine());
            	 System.out.println("Stage:");
            	 stage = Integer.parseInt(sc.nextLine());
            	 System.out.println("Attack points?");
            	 attackPoints = Integer.parseInt(sc.nextLine());
            	 Card pokemonCard = new PokemonCard(id, name, type, description, hp, stage, attackPoints);
            	 deck.addCard(pokemonCard);
            	 System.out.println("The card has been created.");
            	break;
        	 case 2:
        		System.out.println("Name:");
    		 	name = sc.nextLine();
        		System.out.println("Energy type:");
        		type = sc.nextLine();
        		System.out.println("Description:");
        		description = sc.nextLine();
        		Card energyCard = new EnergyCard(id, name, type, description);
        		deck.addCard(energyCard);
        		System.out.println("The energy card has been created.");
        	   break;
        	 case 3:
       		 	System.out.println("Name:");
       		 	name = sc.nextLine();
        		System.out.println("Trainer type:");
        		type = sc.nextLine();
        		System.out.println("Description:");
        		description = sc.nextLine();
        		Card trainerCard = new TrainerCard(id, name, type, description);
        		deck.addCard(trainerCard);
        		System.out.println("The trainer card has been created.");
        	   break;
        	 }
        	break;
         case 2:
        	 System.out.println("Which card do you want to delete? Enter id:");
        	 id = Integer.parseInt(sc.nextLine());	
        	 card = deck.getId(id); 
        	 if(card != null) { // checking if the card exists
        		 deck.deleteCard(id);
        		 System.out.println("The removal has successfully occurred.");
        	 } else {
        		 System.out.println("This id doesn't match with any card from deck. The removal has been canceled.");
        	 }	 
        	break;
         case 3:
        	 System.out.println("Which card are you seeking for? Enter id:");
    		 id = Integer.parseInt(sc.nextLine());
    		 card = deck.getId(id);
    		 if(card != null) { // checking if the card exists
	    		 System.out.println("Card: " + card.getName());
	    		 System.out.println("Type: " + card.getType());
	    		 if(card.getType().equals("Pokemon")) { // if it's a pokemon card, we show up more informations (hp, stage, description)
	    			 PokemonCard pokemonCard = new PokemonCard(id, name, type, description, hp, stage, attackPoints);
	    			 System.out.println("Card: " + pokemonCard.getHp());
	        		 System.out.println("Type: " + pokemonCard.getStage());
	        		 System.out.println("Attack points: " + pokemonCard.getAttackPoints());
	    		 }
	    		 System.out.println("Description: " + card.getDescription());
    		 } else {
    			 System.out.println("This id doesn't match with any card from the deck.");
    		 }
        	break;
         case 4:
        	 for(Card card : deck.getDeck()) {
        		 System.out.println("Id: " + card.getId());
        		 System.out.println("Name: " + card.getName());
        		 System.out.println("Type: " + card.getType());
        		 if(card.getType().equals("Pokemon")) { // if it's a pokemon card, we show up more informations (hp, stage, description)
        			 PokemonCard pokemonCard = new PokemonCard(id, name, type, description, hp, stage, attackPoints);
        			 System.out.println("Card: " + pokemonCard.getHp());
            		 System.out.println("Type: " + pokemonCard.getStage());
            		 System.out.println("Attack points: " + pokemonCard.getAttackPoints());
        		 }
        		 System.out.println("Description: " + card.getDescription());
        	 }
        	 break;
         case 5:
        	 System.out.println("Which card do you want to edit? Enter id:");
    		 id = Integer.parseInt(sc.nextLine());
    		 card = deck.getId(id);
    		 if(card != null) { // checking if the card exists
	    		 System.out.println("Enter new type (Pokemon, Trainer or Energy):");
	    		 type = sc.nextLine();
	    		 card.setType(type);
	    		 if(type.equals("Pokemon")) { // if it's a pokemon card, we need more informations (hp, stage, description)
	    			 PokemonCard pokemonCard = new PokemonCard(id, name, type, description, hp, stage, attackPoints);
	    			 System.out.println("Enter new name:");
	        		 name = sc.nextLine();
	        		 pokemonCard.setName(name);
	        		 System.out.println("Enter new description:");
	        		 description = sc.nextLine();
	        		 pokemonCard.setDescription(description);
	    			 System.out.println("Enter new HP:");
	        		 hp = Integer.parseInt(sc.nextLine());
	        		 pokemonCard.setHp(hp);
	        		 System.out.println("Enter new stage:");
	        		 stage = Integer.parseInt(sc.nextLine());
	        		 pokemonCard.setStage(stage);
	        		 System.out.println("Enter new attackPoints:");
	        		 attackPoints = Integer.parseInt(sc.nextLine());
	        		 pokemonCard.setAttackPoints(attackPoints);
	    		 } else {
		    		 System.out.println("Enter new name:");
		    		 name = sc.nextLine();
		    		 card.setName(name);
		    		 System.out.println("Enter new description:");
		    		 description = sc.nextLine();
		    		 card.setDescription(description);
	    		 }
    		 } else {
    			 System.out.println("This id doesn't match with any card from the deck. The editing has been canceled.");
    		 }
    		break; 
         case 6:
        	 System.out.println("The game works like this: you pick two pokemon cards. The one who has the highest attack points wins the game.");
        	 System.out.println("What's the first card id?");
    		 id = Integer.parseInt(sc.nextLine());
    		 card = deck.getId(id);
    		 if(card != null) { // checking if the card exists
	    		 if(card.getType().equals("Pokemon")) {
	    			 PokemonCard pokemonCard = new PokemonCard(id, name, type, description, hp, stage, attackPoints);
	        		 System.out.println("Attack points: " + pokemonCard.getAttackPoints());
	        		 System.out.println("What's the second card id?");
	        		 id = Integer.parseInt(sc.nextLine());
	        		 cardBis = deck.getId(id);
	        		 if(cardBis != null) { // checking if the card exists
	    	    		 if(cardBis.getType().equals("Pokemon")) {
	    	    			 PokemonCard pokemonCardBis = new PokemonCard(id, name, type, description, hp, stage, attackPoints);
	    	        		 System.out.println("Attack points: " + pokemonCardBis.getAttackPoints());
	    	        		 if(pokemonCard.getAttackPoints() > pokemonCardBis.getAttackPoints()) {
	    	        			 System.out.println("The card of name " + pokemonCard.getName() + " wins the game.");
	    	        		 } else if(pokemonCard.getAttackPoints() > pokemonCardBis.getAttackPoints()) {
	    	        			 System.out.println("The card of name " + pokemonCardBis.getName() + " wins the game.");
	    	        		 } else {
	    	        			 System.out.println("Nobody wins the game. Both cards have the same attack points.");
	    	        		 }
	    	    		 } else {
	    	    			 System.out.println("This card isn't a Pokemon card.");
	    	    		 }
	        		 } else {
	        			 System.out.println("This id doesn't match with any card from the deck.");
	        		 }
	    		 } else {
	    			 System.out.println("This card isn't a Pokemon card.");
	    		 }
    		 } else {
    			 System.out.println("This id doesn't match with any card from the deck.");
    		 }
        	break;
         case 7:
        	 System.out.println("See you soon.");
        	 break;
        }
	}
	System.exit(0); // leaving console
}

}
