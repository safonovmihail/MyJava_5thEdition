/**
 * 
 */
package gettingstarted;

/**
 * @author nialdaly
 * a program to demonstrate constant variables.
 *
 */

// Constants class
public class Constants {

	/**
	 * @param args
	 */
	
	// main method
	public static void main(String[] args) {
		
		// declares and assigns values to the constant vars
		// constant score values
		final int TOUCHDOWN = 6;
		final int CONVERSION = 1;
		final int FIELDGOAL = 3;
		
		// declares the vars
		int td, pat, fg, total;
		
		// initialises the vars
		// calculates the points scored
		td = 4 * TOUCHDOWN;
		pat = 3 * CONVERSION ;
		fg = 2 * FIELDGOAL;
		
		// adds up all the values
		total = (td + pat + fg);
		
		// outputs the calculated total score
		System.out.println("Score: " + total);
		

	} // main method closure

} // Constants class closure
