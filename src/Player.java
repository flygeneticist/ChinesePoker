
public class Player {
	
	// setup vars for Player object
	private String name;
	private int bankroll;
	private int bid;
	public Hand hand;
	
	public Player(String n, int bnk, int bd) {
		name = name;
		bankroll = bnk;
		bid = bd;
		hand = new Hand();
	}

	/**
    * Clear all subhands held by a player.
    */
    public void clear() {
        hand = new Hand();
    }

	// return hand object
	public Card[] getHand(String subhand) {
		return hand.getSubhand(subhand);
	}

	// return bid value for a player
	public int getBid() {
		return bid;
	}

	// return bankroll amount for a player
	public int getBankroll() {
		return bankroll;
	}

	public String getName() {
		return name;
	}
}
