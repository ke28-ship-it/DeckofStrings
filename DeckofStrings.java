// DeckofStrings.java ELON

public class DeckofStrings {
	
	public void organize() {
		char[] kind = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
		String[] suit = {" of Diamonds", " of Hearts", " of Clubs", " of Spades"};
		String[] deck = new String[52];
		// Loop thru suits
		for(int j=0;j<4;j++){
			// Loop thru card kinds
			for(int i=0;i<13;i++){
				deck[i]=kind[i]+suit[j];
				System.out.println(deck[i]);
			}
        }
    }
}
