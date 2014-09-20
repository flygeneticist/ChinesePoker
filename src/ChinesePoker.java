
public class ChinesePoker {
	// this is the game enigine
	public static void main(String[] args) {
		System.out.println("Starting Game....");
		System.out.println("Setup Players and Bidding....");
		Player you = new Player("Kevin", 1000, 10);

		boolean run = true;
		while (run) {
			System.out.println("Starting Game....");
			if (you.getBankroll() <= 0) {
				System.out.println("YOU LOOSE!");
				run = false;
			}
		}
	}
}
