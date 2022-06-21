//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;
	public Card(){

	}

  	public Card(int face, String suit){
  		this.face = face;
  		this.suit = suit;
	}


	public void setSuit(String suit){
  		this.suit = suit;
	}
	public void setFace(int face){
		this.face = face;
	}

  	public String getSuit(){
  		return suit;
	}

  	public int getValue()
  	{
  		return face;
  	}


  	public String toString(){
		return FACES[face] + " of " + getSuit() + " | value = " + getValue();
	}
  	
 }