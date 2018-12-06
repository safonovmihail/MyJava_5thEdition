/**
 * 
 */
package creatingclasses;

/**
 * Overload class
 * 
 * @author nialdaly
 *
 */
public class Overload {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// invokes the write method
		System.out.println(write(12));

		// invokes the write method
		System.out.println(write("Twelve"));

		// invokes the write method
		System.out.println(write(4, 16));

	} // end of main method

	/**
	 * write overloaded method
	 * 
	 * @param num
	 * @return
	 */
	public static String write(int num) {

		return ("String passed is " + num);
	} // end of write method

	/**
	 * write overloaded method
	 * 
	 * @param num
	 * @return
	 */
	public static String write(String num) {
		return ("String passed is " + num);
	} // end of write method

	/**
	 * write overloaded method
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static String write(int num1, int num2) {
		return ("Sum Total is " + (num1 + num2));
	} // end of write method
} // end of Overload class
