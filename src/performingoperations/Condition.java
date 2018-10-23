/**
 * 
 */
package performingoperations;

/**
 * @author nialdaly
 *
 */
public class Condition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// initialise two integer variables
		int num1 = 1357;
		int num2 = 2468;

		// declare the result variable as string
		String result;

		// determine whether the first integer value is an odd or even number
		result = (num1 % 2 != 0) ? "Odd" : "Even";
		System.out.println("num1 is " + result);

		// determine whether the second integer value is an odd or even number
		System.out.println("num2 is " + result);

	}

}
