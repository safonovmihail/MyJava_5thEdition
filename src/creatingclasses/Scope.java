/**
 * 
 */
package creatingclasses;

/**
 * Scope class
 * 
 * @author nialdaly
 *
 */
public class Scope {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// global class String var
		final String txt = "This is a global variable of the Scope class.";
		System.out.println(txt);

		// txt var as String
		// String txt = "This is a local variable in the main method.";
		// System.out.println(txt);

		// invokes the sub method
		sub();

	} // end of main method

	/**
	 * sub method
	 */
	public static void sub() {
		System.out.println("This is a local variable in the sub method.");
	} // end of sub method

} // end of Scope class
