/**
 * 
 */
package makingstatements;

/**
 * @author nialdaly
 *
 */

// While class
public class While {

	/**
	 * @param args
	 */

	// main method
	public static void main(String[] args) {

		// declaring the num var
		int num = 100;

		// while loop
		while (num > 0) {
			System.out.println("While Countdown: " + num);

			// updater - ensures that the num var will decrease by 10 on each iteration
			// prevent an infinite loop
			num = num - 10;

		} // while loop closure

	} // main method closure

} // While class closure
