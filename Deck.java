package com.christopherneedham;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	int cardsInSuit = 13;
	private Card card1 = new Card();
	// this is the method to assign the cards the suits and build the deck
	protected ArrayList<String> getDeck() {
	ArrayList<String> deck = new ArrayList<String>();	
		for(int i = 0; i < cardsInSuit; i++) {
			deck.add(card1.value(i, "Hearts"));
			}
		for(int i = 0; i < cardsInSuit; i++) {
			deck.add(card1.value(i, "Spades"));
			}
		for(int i = 0; i < cardsInSuit; i++) {
			deck.add(card1.value(i, "Diamonds"));
			}
		for(int i = 0; i < cardsInSuit; i++) {
			deck.add(card1.value(i, "Clubs"));
			}
		
		return deck;
	}
	
		protected ArrayList<String> shuffleDeck(ArrayList<String> deck){
		Collections.shuffle(deck);
		return deck;
		
		}
	
}
