/**
 * 
 */
package makingstatements;

/**
 * @author nialdaly
 *
 */

// Switch class
public class Switch {

	/**
	 * @param args
	 */

	// main method
	public static void main(String[] args) {

		//
		int month = 2, year = 2016, num = 31;

		// switch statement block
		switch (month) {

		case 4:
		case 6:
		case 9:
		case 11:

			num = 30;
			break;

		case 2:

			// conditional operator
			num = (year % 4 == 0) ? 29 : 28;
			break;

		}

		//
		System.out.println(month + "/" + year + ": " + num + "days");

	} // main method closure

} // Switch class closure
