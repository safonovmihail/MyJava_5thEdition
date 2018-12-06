/**
 * 
 */
package creatingclasses;

/**
 * SuperClass class
 * 
 * @author nialdaly
 *
 */
public class SuperClass {

	/**
	 * hello method
	 */
	public static void hello() {

		System.out.println("Hello from the Super Class.");

	} // end of hello method

	/**
	 * echo method
	 * 
	 * @param arg
	 */
	public static void echo(String arg) {

		{
			try {
				System.out.println("You entered: " + arg);
			} catch (Exception e) {
				System.out.println("Argument required.");
			}
		}
	} // end of echo class

} // end of SuperClass class
