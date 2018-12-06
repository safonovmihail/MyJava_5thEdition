/**
 * 
 */
package creatingclasses;

/**
 * Multi class
 * 
 * @author nialdaly
 *
 */
public class Multi {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		//
		String msg = "This is a local variable in the Multi class.";
		System.out.println(msg);

		//
		System.out.println(Data.txt);

		// calls the greeting method from Data class
		Data.greeting();

		// calls the line method from Draw class
		Draw.line();

	} // end of main method

} // end of Multi class
