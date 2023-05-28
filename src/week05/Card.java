package week05;

public class Card {
	
	String name;
	String suit;
	int value;
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	public void describe() {
		System.out.println(name + " of " + suit + " - " + value);
	}
	
	
}
