
public class Deck {
	private Card[] deck = new Card[52]; // a deck is an array of 52 Card objects
	
	/**
     * Constructor.  Create an unshuffled deck of cards by adding each of 52 
     * possible cards to an empty array.
     */
	public Deck() {
		int card_counter = 0; // track cards added to the deck
			for (int val = 1; val <= 13; val++) { // Iterate over each rank
				// Make a card for each suit type and push into the 'deck' array
				for (int suit = 0; suit <= 3; suit++) {
					deck[card_counter] = new Card(val, suit);
					card_counter++;
				}
			}
	}
	
    /**
     * Put all the used cards back into the deck,
     * and shuffle it into a random order.
     */
	public void shuffle() {
		
	}
	
	/**
     * Deals one card from the deck and returns it.
     */
	public void dealCard() {

	}
}
