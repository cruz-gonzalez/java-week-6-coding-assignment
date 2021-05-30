import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	
	private static List<Cards> cards;
	
	public Deck() {
		
		cards = new ArrayList<Cards>();
		
		Cards card1 = new Cards(); card1.setName("Two of Spades"); card1.setValue(2); cards.add(card1);
		Cards card2 = new Cards(); card2.setName("Three of Spades"); card2.setValue(3); cards.add(card2);
		Cards card3 = new Cards(); card3.setName("Four of Spades"); card3.setValue(4); cards.add(card3);
		Cards card4 = new Cards(); card4.setName("Five of Spades"); card4.setValue(5); cards.add(card4);
		Cards card5 = new Cards(); card5.setName("Six of Spades"); card5.setValue(6); cards.add(card5);
		Cards card6 = new Cards(); card6.setName("Seven of Spades"); card6.setValue(7); cards.add(card6);
		Cards card7 = new Cards(); card7.setName("Eight of Spades"); card7.setValue(8); cards.add(card7);
		Cards card8 = new Cards(); card8.setName("Nine of Spades"); card8.setValue(9); cards.add(card8);
		Cards card9 = new Cards(); card9.setName("Ten of Spades"); card9.setValue(10); cards.add(card9);
		Cards card10 = new Cards(); card10.setName("Jack of Spades"); card10.setValue(11); cards.add(card10);
		Cards card11 = new Cards(); card11.setName("Queen of Spades"); card11.setValue(12); cards.add(card11);
		Cards card12 = new Cards(); card12.setName("King of Spades"); card12.setValue(13); cards.add(card12);
		Cards card13 = new Cards(); card13.setName("Ace of Spades"); card13.setValue(14); cards.add(card13);
	
		Cards card14 = new Cards(); card14.setName("Two of Diamonds"); card14.setValue(2); cards.add(card14);
		Cards card15 = new Cards(); card15.setName("Three of Diamonds"); card15.setValue(3); cards.add(card15);
		Cards card16 = new Cards(); card16.setName("Four of Diamonds"); card16.setValue(4); cards.add(card16);
		Cards card17 = new Cards(); card17.setName("Five of Diamonds"); card17.setValue(5); cards.add(card17);
		Cards card18 = new Cards(); card18.setName("Six of Diamonds"); card18.setValue(6); cards.add(card18);
		Cards card19 = new Cards(); card19.setName("Seven of Diamonds"); card19.setValue(7); cards.add(card19);
		Cards card20 = new Cards(); card20.setName("Eight of Diamonds"); card20.setValue(8); cards.add(card20);
		Cards card21 = new Cards(); card21.setName("Nine of Diamonds"); card21.setValue(9); cards.add(card21);
		Cards card22 = new Cards(); card22.setName("Ten of Diamonds"); card22.setValue(10); cards.add(card22);
		Cards card23 = new Cards(); card23.setName("Jack of Diamonds"); card23.setValue(11); cards.add(card23);
		Cards card24 = new Cards(); card24.setName("Queen of Diamonds"); card24.setValue(12); cards.add(card24);
		Cards card25 = new Cards(); card25.setName("King of Diamonds"); card25.setValue(13); cards.add(card25);
		Cards card26 = new Cards(); card26.setName("Ace of Diamonds"); card26.setValue(14); cards.add(card26);
		
		Cards card27 = new Cards(); card27.setName("Two of Clubs"); card27.setValue(2); cards.add(card27);
		Cards card28 = new Cards(); card28.setName("Three of Clubs"); card28.setValue(3); cards.add(card28);
		Cards card29 = new Cards(); card29.setName("Four of Clubs"); card29.setValue(4); cards.add(card29);
		Cards card30 = new Cards(); card30.setName("Five of Clubs"); card30.setValue(5); cards.add(card30);
		Cards card31 = new Cards(); card31.setName("Six of Clubs"); card31.setValue(6); cards.add(card31);
		Cards card32 = new Cards(); card32.setName("Seven of Clubs"); card32.setValue(7); cards.add(card32);
		Cards card33 = new Cards(); card33.setName("Eight of Clubs"); card33.setValue(8); cards.add(card33);
		Cards card34 = new Cards(); card34.setName("Nine of Clubs"); card34.setValue(9); cards.add(card34);
		Cards card35 = new Cards(); card35.setName("Ten of Clubs"); card35.setValue(10); cards.add(card35);
		Cards card36 = new Cards(); card36.setName("Jack of Clubs"); card36.setValue(11); cards.add(card36);
		Cards card37 = new Cards(); card37.setName("Queen of Clubs"); card37.setValue(12); cards.add(card37);
		Cards card38 = new Cards(); card38.setName("King of Clubs"); card38.setValue(13); cards.add(card38);
		Cards card39 = new Cards(); card39.setName("Ace of Clubs"); card39.setValue(14); cards.add(card39);
		
		Cards card40 = new Cards(); card40.setName("Two of Hearts"); card40.setValue(2); cards.add(card40);
		Cards card41 = new Cards(); card41.setName("Three of Hearts"); card41.setValue(3); cards.add(card41);
		Cards card42 = new Cards(); card42.setName("Four of Hearts"); card42.setValue(4); cards.add(card42);
		Cards card43 = new Cards(); card43.setName("Five of Hearts"); card43.setValue(5); cards.add(card43);
		Cards card44 = new Cards(); card44.setName("Six of Hearts"); card44.setValue(6); cards.add(card44);
		Cards card45 = new Cards(); card45.setName("Seven of Hearts"); card45.setValue(7); cards.add(card45);
		Cards card46 = new Cards(); card46.setName("Eight of Hearts"); card46.setValue(8); cards.add(card46);
		Cards card47 = new Cards(); card47.setName("Nine of Hearts"); card47.setValue(9); cards.add(card47);
		Cards card48 = new Cards(); card48.setName("Ten of Hearts"); card48.setValue(10); cards.add(card48);
		Cards card49 = new Cards(); card49.setName("Jack of Hearts"); card49.setValue(11); cards.add(card49);
		Cards card50 = new Cards(); card50.setName("Queen of Hearts"); card50.setValue(12); cards.add(card50);
		Cards card51 = new Cards(); card51.setName("King of Hearts"); card51.setValue(13); cards.add(card51);
		Cards card52 = new Cards(); card52.setName("Ace of Hearts"); card52.setValue(14); cards.add(card52);
	}
	
	public List<Cards> getCards() {
		return cards;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public void setCards(List<Cards> cards1) {
		cards = cards1;
	}
	
	public static Cards draw() {
		return cards.remove(0);
	}
	

}
