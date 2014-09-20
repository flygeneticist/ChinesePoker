
public class Card {
		
	private int value; // ranked from Ace(1) to King (13)
	private int suit;
	private String front; // front card face picture
	private String back = "BACK PICTURE URL GOES HERE!"; // back card face picture
	private boolean isCovered = true; // default the card to be covered
	
	// Codes for the 4 suits
	public final static int SPADES = 0;
	public final static int HEARTS = 1;
	public final static int DIAMONDS = 2;
	public final static int CLUBS = 3;
	
	// Codes for the non-numeric cards (2-10 have their numerical values)
	public final static int ACE = 1;      
	public final static int JACK = 11;    
	public final static int QUEEN = 12; 
	public final static int KING = 13;
	   
	/**
     * Constructor.  Create an new cards from the rank and suit provided.
     */
	public Card(int v, int s) {
		value = v;
		suit = s;
		front = "./" + v + s + ".jpg";
	}
 
   /**
    * Returns the suit of this card.
    */
   public int getSuit() {
      return suit;
   }
   
   /**
    * Returns the value of this card.
    */
   public int getValue() {
      return value;
   }
   
   /**
    * Returns a String representation of the card's suit.
    */
   public String getSuitString() {
      switch ( suit ) {
	      case SPADES:   return "Spades";
	      case HEARTS:   return "Hearts";
	      case DIAMONDS: return "Diamonds";
	      case CLUBS:    return "Clubs";
	      default:       return ""; 
      }
   }
   
   /**
    * Returns a String representation of the card's value.
    */
   public String getValueString() {
       switch ( value ) {
         case 1:   return "Ace";
         case 2:   return "2";
         case 3:   return "3";
         case 4:   return "4";
         case 5:   return "5";
         case 6:   return "6";
         case 7:   return "7";
         case 8:   return "8";
         case 9:   return "9";
         case 10:  return "10";
         case 11:  return "Jack";
         case 12:  return "Queen";
         default:  return "King";
         }
   }
 
   /**
    * Returns a string representation of this card, including both value and suit.
    */
   public String toString() {
         return getValueString() + " of " + getSuitString();
   }
}
