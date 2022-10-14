package com.christopherneedham;

public class Card {
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	private String suit;
	private String value = "";
	int x = 0;
	
	//this is the case statement to determine the cards in the deck
	public String value(int x, String suit){
		
		switch(x){
			case 0:
				value = "Ace" + " OF " + suit;
				break;
			case 1:
				value = "Two" + " OF " + suit;
				break;
			case 2:
				value = "Three" + " OF " + suit;
				break;
			case 3:
				value = "Four" + " OF " + suit;
				break;
			case 4:
				value = "Five" + " OF " + suit;
				break;
			case 5:
				value = "Six" + " OF " + suit;
				break;
			case 6:
				value = "Seven" + " OF " + suit;
				break;
			case 7:
				value = "Eight" + " OF " + suit;
				break;
			case 8:
				value = "Nine" + " OF " + suit;
				break;
			case 9:
				value = "Ten" + " OF " + suit;
				break;
			case 10:
				value = "Jack" + " OF " + suit;
				break;
			case 11:
				value = "Queen" + " OF " + suit;
				break;
			case 12:
				value = "King" + " OF " + suit;
				break;
			default:
				value = "Error";
				}
		return value;
	}
	//this is the if statement to change the card from a string (Ace of Spades) 
	//to an int to be compared
	protected int convertCardToInt(String value) {
		int card = 0;
		if(value.charAt(0) == 'A' && value.charAt(1) == 'c') { 
			card = 0;
		} else if(value.charAt(0) == 'T' && value.charAt(1) == 'w') {
			card = 1;
		} else if(value.charAt(0) == 'T' && value.charAt(1) == 'h') {
			card = 2;
		} else if(value.charAt(0) == 'F' && value.charAt(1) == 'o') {
			card = 3;
		} else if(value.charAt(0) == 'F' && value.charAt(1) == 'i') {
			card = 4;
		} else if(value.charAt(0) == 'S' && value.charAt(1) == 'i') {
			card = 5;
		} else if(value.charAt(0) == 'S' && value.charAt(1) == 'e') {
			card = 6;
		} else if(value.charAt(0) == 'E' && value.charAt(1) == 'i') {
			card = 7;
		} else if(value.charAt(0) == 'N' && value.charAt(1) == 'i') {
			card = 8;
		} else if(value.charAt(0) == 'T' && value.charAt(1) == 'e') {
			card = 9;
		} else if(value.charAt(0) == 'J' && value.charAt(1) == 'a') {
			card = 10;
		} else if(value.charAt(0) == 'Q' && value.charAt(1) == 'u') {
			card = 11;
		} else if(value.charAt(0) == 'K' && value.charAt(1) == 'i') {
			card = 12;
		}
		return card;
		
	}
}