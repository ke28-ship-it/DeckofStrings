// Card.java ELON

public class Card {
	private String suit;
	private String value;
	private int points;
	public void createCard(String csuit, String cvalue, int cpoints){
		suit = csuit;
		value = cvalue;
		points = cpoints;
	}
	public String getSuit(){
		return suit;
	}
	public String getValue(){
		return value;
	}
	public int getPoints(){
		return points;
	}
}
