
public class Hand {
	
	/**
     * Constructor. Create a Hand object that is initially empty.
     */
    public Hand() {
    	Card[] pool = Card[13];
    	Card[] top = Card[3];
    	Card[] middle = Card[5];
    	Card[] bottom = Card[5];
    }

    /**
     * Add the card c to the hand. c should be non-null.
     * sub-hand should not be full.
     */
    public void addCard(Card c, Card[] subhand) {
    	
    }

    /**
     * If the specified card is in the hand, it is removed.
     */
    public void removeCard(Card c, Card[] subhand) {
    	
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
