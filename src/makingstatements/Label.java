/**
 * 
 */
package makingstatements;

/**
 * @author nialdaly
 *
 */

// Label class
public class Label {

	/**
	 * @param args
	 */

	// main method
	public static void main(String[] args) {

		// outer for loop with a label
		outerLoop: for (int i = 1; i < 4; i++) {

			// inner for loop
			for (int j = 1; j < 4; j++) {

				// if conditions are met the outer loop will continue
				if (i == 1 && j == 1) {

					System.out.println("Continues outerLoop when i = " + i + " j = " + j);

					continue outerLoop;

				}

				// if conditions are met the outer loop will break
				if (i == 2 && j == 3) {

					System.out.println("Breaks outerLoop when i = " + i + " j = " + j);

					break outerLoop;

				}

				System.out.println("Running i = " + i + " j = " + j);

			} // end of inner for loop

		} // end of outer for loop

	} // end of main method

} // end of Label class
