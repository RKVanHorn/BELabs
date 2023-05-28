package week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	
	List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		//String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		List<String> names = Collections.emptyList();
		Collections.addAll(names = new ArrayList<String>(), "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
		String[] suits = {"♥", "♦", "♣", "♠"};
		for(String suit : suits) {
			for (String name : names) {
				cards.add(new Card(name, suit, (names.indexOf(name)+2)));
			}
		}
	}
	
	public void describe() {
		for (Card card :cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);		
	}
	
	public Card draw(){
		Card drawnCard = cards.remove(0);		
		return drawnCard;
		
	}
}
