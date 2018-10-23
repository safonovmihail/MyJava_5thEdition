/**
 * 
 */
package performingoperations;

/**
 * @author nialdaly
 *
 */
public class Comparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//
		String txt = "Fantastic";
		String lang = "Java";
		
		// compare to strings for equality
		boolean state = ( txt == lang );
		System.out.println("String Equality Test: " + state);
		
		// compare for inequality
		state = ( txt != lang );
		System.out.println("String Inequality Test : " + state);
		
		
		
		// compare two integer values
		int dozen = 12;
		int score = 20;
		
		state = ( dozen > score );
		System.out.println("Greater Than Test: " + state);
		
		// compare two integer values once more
		state = ( dozen < score );
		System.out.println("Less Than Test: " + state);
		

	}

}
