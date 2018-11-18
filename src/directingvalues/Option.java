/**
 * 
 */
package directingvalues;

/**
 * Option class
 * 
 * @author nialdaly
 *
 */
public class Option {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		args[0] = "-en";
		
		// if statement
		if (args[0].equals("-en")) {
			System.out.println("English option");
		} // end of if statement

		// else if statement
		else if (args[0].equals("-es")) {
			System.out.println("Spanish option");
		} // end of else if statement

		// else statement
		else
			System.out.println("Unrecognized option");

	} // end of main method 

} // end of option class
