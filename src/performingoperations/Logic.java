/**
 * 
 */
package performingoperations;

/**
 * @author nialdaly
 *
 */
public class Logic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// initialise two boolean value
		boolean yes = false;
		boolean no = true;
		
		// to test if both of the two conditions are true
		System.out.println("Both YesYes True: " + ( yes && yes ));
		System.out.println("Both NoNo True: " + ( no && no ));
		
		// to test if either of the to conditions are true
		System.out.println("Either YesYes True: " + ( yes || yes ));
		System.out.println(("Either NoNo True: " + ( no || no )));
		
		// shows an original and inverse value
		System.out.println("Original Yes Value: " + yes );
		System.out.println("Inverse Yes Value: " + !yes);
		

	}

}
