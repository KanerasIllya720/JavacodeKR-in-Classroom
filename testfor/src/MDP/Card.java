package MDP;

import java.util.ArrayList;

public class Card {
	String suit;
	String number;

	public Card(String suit, String number) {
		this.suit = suit;
		this.number = number;
	}

	public String toString() {
		return suit + " " + number;
	}

	public Card deal() {
		return null;
	}
}
