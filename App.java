package com.christopherneedham;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		Player userOne = new Player();
		String playerOneCard = "";
		String playerTwoCard = "";
		Card one = new Card();
		Card two = new Card();
		int postConvertCard1 = 0;
		int postConvertCard2 = 0;
		int playerScore = 0;
		int computerScore = 0;
		int response = 0;
		String caseResponse = "";
		
		System.out.println("Please enter your first name:");
		userOne.setFirstName(myObj.nextLine());
		System.out.println("Please enter your last name:");
		userOne.setLastName(myObj.nextLine());
		System.out.println("Nice to meet you " + userOne.getFirstName() + " " + userOne.getLastName());
		// loop to ensure that the case option works properly.
		do {
		System.out.println("Would you like to play War?");
		System.out.println("(1) Yes:");
		System.out.println("(2) No:");
		response = myObj.nextInt();
		// option for player to select if they want to play
		switch(response) {
			case 1:
				caseResponse = "Good, let us begin";
					System.out.println(caseResponse);
				break;
			case 2:
				caseResponse = "That is very sad, have a nice day!";
					System.out.println(caseResponse);
					System.exit(0);
				break;
			default:
				caseResponse = "That is not a correct option, please try again.";
					System.out.println(caseResponse);
				break;
			}	
		}while(response != 1 && response != 2);
		//creates the deck of cards to play with
		Deck newDeck = new Deck();
		ArrayList<String> deck1 = newDeck.getDeck();
		// shuffles the deck
		deck1 = newDeck.shuffleDeck(deck1);
		// this creates the two player decks, and deals out the decks.
		ArrayList<String> playerOneDeck = new ArrayList<String>();
		ArrayList<String> playerTwoDeck = new ArrayList<String>();
		
			for(int i = 0; i < 26; i++){
			playerOneDeck.add(deck1.get(0));
			playerTwoDeck.add(deck1.get(1));
			deck1.remove(0);
			deck1.remove(0);
			}	
		//this runs the game, it plays each card and compares them together.
		for(int i =0;i<26;i++) {
			playerOneCard = playerOneDeck.get(0);
			playerTwoCard = playerTwoDeck.get(0);
			System.out.println("You play " + playerOneCard + "!");
			System.out.println("The computer plays " + playerTwoCard + "!");
			//convertCardToInt will change the card (which is a string) to an int to be compared
			postConvertCard1 = one.convertCardToInt(playerOneCard);
			postConvertCard2 = two.convertCardToInt(playerTwoCard);
				if(postConvertCard1 > postConvertCard2) {
					System.out.println("You gain one point!");
					playerScore = playerScore+1;
				} else if (postConvertCard1 < postConvertCard2) {
					System.out.println("The computer gains one point!");
					computerScore = computerScore+1;
				} else {
					System.out.println("You have tied, no points awarded");
				}
			System.out.println("New score is:");
			System.out.println(userOne.getFirstName() + " " + userOne.lastName + ": " + playerScore + " The Computer: " + computerScore);
			playerOneDeck.remove(0);
			playerTwoDeck.remove(0);
		}
		//Text to write depending on who wins. 
		if(playerScore > computerScore) {
			System.out.println("Congratulations, You Won!");
		} else if (playerScore < computerScore) {
			System.out.println("Seems like you lost, better luck next time.");
		} else {
			System.out.println("Thats weird, seems to be a tie,");
			System.out.println("we will settle this next time!");
		}
		
	}
}