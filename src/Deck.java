
public class Deck {

	private Card[] deck = new Card[52]; // deck is a list of 52 Card objects
	
	/**
     * Constructor. Create an unshuffled deck of cards by adding each of 52 
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
     * shuffle deck into a random order.
     */
	public void shuffle() {
        for (int i = 0; i < 52; i++) {

        }
	}
	
	/**
     * Deals one card from the deck and returns it.
     */
	public Card dealCard() {
		Card topCard = this.deck[0];
        // remove the top card from the deck
		return topCard;
	}
}
