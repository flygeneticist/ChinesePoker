import java.util.Random;

public class Deck {

	private Card[] deck = new Card[52]; // deck is a list of 52 Card objects
    private int current_card;
	
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
	
    // shuffle deck into a random order.
	public void shuffle() {
        Random rand = new Random(); // setup random number generator
        for (int i = 0; i < 52; i++) {
            // select random values to swap 
            int pos1 = rand.nextInt(52);
            int pos2 = rand.nextInt(52);

            // flip the values held at the two positions 
             Card helper = deck[pos1]; // holding the value of pos1 while pos2 moves into it's spot
             deck[pos1] = deck[pos2];
             deck[pos2] = helper;
        }
	}
	
	// Deals one card from the deck and returns it.
	public Card dealCard() {
        Card topCard = this.deck[current_card]; // select current top card from the deck
        current_card += 1; // "remove" top card by moving the pointer +1
        return topCard; 
	}
}
