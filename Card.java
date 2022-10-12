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
//	private int suits, values;
//	public Card(int cards) {
//		this.suits=cards/13;
//		this.values=cards%13;
//		
//	}
//
//	public int getSuits() {
//		return suits;
//	
//	}
//
//	public int getValues() {
//		return values;
//	}
//	@Override
//	public String toString() {
//		String[] suitss = {"Hearts", "Clubs", "Spades", "Diamonds"};
//		String[] valuess = {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
//		return "Card [Suits=" + this.getSuits() + ", value=" + this.getValues() + "]";
//	}
}
