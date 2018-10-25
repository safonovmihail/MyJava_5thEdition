/**
 * 
 */
package makingstatements;

/**
 * @author nialdaly
 *
 */

// Break class
public class Break {

	/**
	 * @param args
	 */

	// main method
	public static void main(String[] args) {

		// outer for loop
		for (int i = 1; i < 4; i++) {

			// inner for loop
			for (int j = 1; j < 4; j++) {
				System.out.println("Running i=" + i + " j = " + j);

				// if statement to continue the inner loop
				if (i == 1 && j == 1) {

					System.out.println("Continues inner loop when i = " + i + " j = " + j);

					continue;

				} // end of if statement

				// if statement to break the inner loop
				if (i == 2 && j == 1) {

					System.out.println("Breaks inner loop when i = " + i + " j = " + j);

					break;
				} // end of if statement

			} // end of inner for loop

		} // end of outer for loop

	} // end of main method

} // end of Break class
