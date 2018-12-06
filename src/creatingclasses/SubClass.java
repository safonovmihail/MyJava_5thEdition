/**
 * 
 */
package creatingclasses;

/**
 * SubClass that extends the SuperClass
 * 
 * @author nialdaly
 *
 */
public class SubClass extends SuperClass {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// invokes the hello method
		hello();
		// calls the hello method from the SuperClass
		SuperClass.hello();
		// adds a call to the echo method inherited from the SuperClass
		try {
			echo(args[0]);
		} catch (Exception e) {
			System.out.println("Argument required.");
		}

	} // end of main method

	/**
	 * hello method
	 */
	public static void hello() {
		System.out.println("Hello from the Sub Class.");
	} // end of hello method

} // end of SubClass
