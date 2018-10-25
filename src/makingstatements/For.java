/**
 * 
 */
package makingstatements;

/**
 * @author nialdaly
 *
 */

// For class
public class For {

	/**
	 * @param args
	 */

	// main method
	public static void main(String[] args) {

		// declares the num var
		int num = 0;

		// outer for loop
		for (int i = 1; i < 4; i++) {
			//
			System.out.println("Outer loop i = " + i);

			// inner for loop
			for (int j = 1; j < 4; ++j) {
				//
				System.out.print("\tInner Loop j = " + j);
				//
				System.out.println("\t\tTotal Num " + (++num));

			} // inner for loop closure

		} // outer for loop closure

	} // main method closure

} // For class closure
