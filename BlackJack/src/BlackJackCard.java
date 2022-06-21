//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class BlackJackCard extends Card
{
	int face = 0;
	String suit = "";
	public BlackJackCard(){

	}
  	public BlackJackCard(int face, String suit){
  		super(face, suit);
  		this.face = super.getValue();
  		this.suit = super.getSuit();
	}



  	public int getValue()
  	{
		if(super.FACES[face].equals("KING") || super.FACES[face].equals("QUEEN") || super.FACES[face].equals("JACK")){
			return 10;
		}
		if(super.FACES[face].equals("ACE")){
			return 11;
	}

		return super.getValue();
  	}
  	
 }