
/**
 * An object of type Card represents a playing card from a
 * standard Poker deck, including Jokers.  The card has a suit and 
 * one of the 13 values: ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, 
 * or king.  Note that "ace" is considered to be the smallest value. 
 */
public class Card {
		
	private int value; // ranked from Ace(1) to King (13)
	private int suit;
	private String front; // front card face picture
	private String back = "BACK PICTURE URL GOES HERE!"; // back card face picture
	private boolean isCovered = true; // default the card to be covered
	
	public final static int SPADES = 0;   // Codes for the 4 suits, plus Joker.
	public final static int HEARTS = 1;
	public final static int DIAMONDS = 2;
	public final static int CLUBS = 3;
 
	public final static int ACE = 1;      // Codes for the non-numeric cards.
	public final static int JACK = 11;    //   Cards 2 through 10 have their 
	public final static int QUEEN = 12;   //   numerical values for their codes.
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
	 * Constructor. Empty constructor for array initialization.
	 */
	public Card() {
		value = 0;
		suit = 4;
	}
	
   /**
    * Returns the suit of this card.
    * @returns the suit, which is one of the constants Card.SPADES, 
    * Card.HEARTS, Card.DIAMONDS, Card.CLUBS, or Card.JOKER
    */
   public int getSuit() {
      return suit;
   }
   
   /**
    * Returns the value of this card.
    * @return the value, which is one of the numbers 1 through 13, inclusive for
    * a regular card, and which can be any value for a Joker.
    */
   public int getValue() {
      return value;
   }
   
   /**
    * Returns a String representation of the card's suit.
    * @return one of the strings "Spades", "Hearts", "Diamonds", "Clubs"
    * or "Joker".
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
    * @return for a regular card, one of the strings "Ace", "2",
    * "3", ..., "10", "Jack", "Queen", or "King".  For a Joker, the 
    * string is always numerical.
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
    * Returns a string representation of this card, including both
    * its suit and its value. Sample return values are: "Queen of Hearts", 
    * "10 of Diamonds", "Ace of Spades"
    */
   public String toString() {
         return getValueString() + " of " + getSuitString();
   }
}
