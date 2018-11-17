/**
 * 
 */
package directingvalues;

/**
 * @author nialdaly
 *
 */
public class Convert {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		//
		float daysFloat = 365.25f;
		String weeksString = "52";

		// casts the float var into an int var
		int daysInt = (int) daysFloat;

		// converts the String value into an int var
		int weekInt = Integer.parseInt(weeksString);

		// calculates the week value
		int week = (daysInt / weekInt);

		// prints out the result
		System.out.println("Days per week: " + week);

	} // end of main method

} // end of Convert class
