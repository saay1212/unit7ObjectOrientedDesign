/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	  {
		Card c1 = new Card("Seven","Clubs",7);
		Card c2 = new Card("Queen","Spades",12);
		Card c3 = new Card("Four","Diamonds",4);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.matches(c3));
		System.out.println(c1.matches(c2));
	}
	}
}
