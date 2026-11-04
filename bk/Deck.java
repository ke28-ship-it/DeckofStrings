// Deck.java ELON

public class Deck {
	Card[] deckOfCards; 
	public Deck(String[] dsuits, String[] dvalues, int[] dpoints) {
		int suitLen = dsuits.length;
		int valLen = dvalues.length;
		deckOfCards = new Card[suitLen * valLen];
		int cardpos = 0;
		for(int j=1;j<suitLen;j++){
			for(int i=0;i<valLen;i++){
					 Card card1 = new Card(dsuits[j], dvalues[i], dpoints[i]);
					deckOfCards[cardpos] =card1;
					cardpos++;
				} //inner for
			} //outer for 
        } //close constructor
	
} //close Deck
