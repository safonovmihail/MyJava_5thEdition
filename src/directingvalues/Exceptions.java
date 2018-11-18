/**
 * 
 */
package directingvalues;

/**
 * Exceptions class
 * 
 * @author nialdaly
 *
 */
public class Exceptions {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = { 1, 2, 5 };
		// try statement
		try {
			int num = array[4];
			System.out.println("You entered: " + num);
		} // end of try statement

		// catch statement to handle the exception
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Integer argument required.");
		} // end of catch statement

		// catch statement to handle the exception caused by a non-integer argument
		catch (NumberFormatException e) {
			System.out.println("Integer argument required.");
		} // end of catch statement

		// finally statement
		finally {
			System.out.println("Program ends.");
		} // end of finally statement

	} // end of main method

} // end of Exceptions class
