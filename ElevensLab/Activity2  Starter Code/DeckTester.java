/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	    String[] ranks = new String[52];
	    String[] suits = new String[52];
	    int[] values = new int[52];
		Deck deck1 = new Deck(ranks, suits, values);
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.size());
// 		System.out.println(deck1.shuffle());
		System.out.println(deck1.deal());
		System.out.println(deck1.toString());
	}
}
