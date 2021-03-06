
public class Hand {
	Card[] pool;
    Card[] top;
    Card[] middle;
    Card[] bottom;

	/**
     * Constructor. Create a Hand object that is initially empty.
     */
    public Hand() {
    	// "Sub-hands" that cards may exist in at any given point during a round
        pool = new Card[13]; // initial dealing of 13 cards from the deck
        top = new Card[3]; // best 3 
        middle = new Card[5]; // worst 5
        bottom = new Card[5]; // best 5
    }

    /**
     * Add the card c to the hand. c should be non-null.
     * Sub-hand should not be full. 
     */
    public void addCard(Card c, Card[] subhand) { 
        
    }

    /**
     * If the specified card is in the hand, it is removed.
     */
    public void removeCard(Card c, Card[] subhand) {
    	
    }

    /**
     * Return the card array partaining to the subhand passed in by string arg.
     */
    public Card[] getSubhand(String subhand) {
        switch (subhand) {
            case "top":
                return this.top;
            case "middle":
                return this.pool;
            case "bottom":
                return this.bottom;
            default: // return pool
                return this.pool;            
        }
    }

    /**
     * Return the number of cards in the subhand.
     */
    public int getCardCount(Card[] subhand) {
    	return subhand.length;
    }

    /**
     * Sorts the cards in the hand so that cards of the same 
     * suit are grouped together, and within a suit the cards 
     * are sorted by value.
     */
    public void sortBySuit() {
    	
    }

    /**
     * Sorts the cards in the hand so that cards are sorted into
     * order of increasing value.  Cards with the same value 
     * are sorted by suit. Note that aces are considered
     * to have the lowest value.
     */
    public void sortByValue() {
    	
    }
}
