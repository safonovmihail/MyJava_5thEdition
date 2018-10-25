/**
 * 
 */
package makingstatements;

/**
 * @author nialdaly
 *
 */
public class DoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//
		int num = 100;

		// do while loop will always run at least once
		do {
			System.out.println("DoWhile Countup: " + num);

			// updater
			num = num - 10;
		}

		// do while loop will run until this condition is met
		while (num > 0);

	}

}
