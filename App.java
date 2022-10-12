package com.christopherneedham;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		Player userOne = new Player();
		
		System.out.println("Please enter your first name:");
		userOne.setFirstName(myObj.nextLine());
		System.out.println("Please enter your last name:");
		userOne.setLastName(myObj.nextLine());
		System.out.println("Your name is " + userOne.getFirstName() + " " + userOne.getLastName());

		
		Deck newDeck = new Deck();
		ArrayList<String> deck1 = newDeck.getDeck();
		
		deck1 = newDeck.shuffleDeck(deck1);
			ArrayList<String> playerOneDeck = new ArrayList<String>();
			ArrayList<String> playerTwoDeck = new ArrayList<String>();
			for(int i = 0; i < 26; i++){
			playerOneDeck.add(deck1.get(0));
			playerTwoDeck.add(deck1.get(1));
			deck1.remove(0);
			deck1.remove(0);
			}
			System.out.println(playerOneDeck);
			System.out.println(playerTwoDeck);
//		System.out.println(deck1);
//		System.out.println(deck1.size());
	} 
	

		
	
	
	
}
