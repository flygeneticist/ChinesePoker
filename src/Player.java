
public class Player {
	
	// setup vars for Player object
	private String name;
	private int bankroll;
	private int bid;
	private Hand hand;
	
	public Player(String n, int bnk, int bd) {
		name = name;
		bankroll = bnk;
		bid = bd;
		hand = new Hand();
	}

	/**
	* Quick print out of the player's stats in one method
	*/
	public void playerStats() {
		System.out.println("Name: "  + name);
		System.out.println("bankroll: "  + bankroll);
		System.out.println("Bid: "  + bid);
	}

	// return hand object
	public Hand getHand() {
		return hand;
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
