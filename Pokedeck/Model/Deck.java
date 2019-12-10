package Model;

import java.util.ArrayList;

public class Deck {
	
	// variables declaration
	private ArrayList<Card> listCards = new ArrayList<Card>();
	
	// accessors
	public Card getId(int id) {
		for(int i = 0; i < listCards.size(); i++) {
			Card card = listCards.get(i);
			if (card.getId() == id) {
				return card;
			}
		}
		return null; // otherwise it would be void function
	}
	
	public ArrayList<Card> getDeck() {
		if(listCards.isEmpty()) {
			System.out.println("The deck is empty. There's nothing to display.");
		}
		return this.listCards;
	}
	
	// methods
	public void addCard(Card card) {
		this.listCards.add(card);
	}
	
	public void deleteCard(int id) {
		Card cardBis = null;
		for(int i = 0; i < listCards.size(); i++) {
			Card card = listCards.get(i);
			if (card.getId() == id) {
				cardBis = card;
			}
		}
		if(cardBis != null) {
			listCards.remove(cardBis);
		}
	}
	
}
