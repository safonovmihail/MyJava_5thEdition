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
		String result1, result2;

		// determine whether the first integer value is an odd or even number
		result1 = (num1 % 2 != 0) ? "Odd" : "Even";
		System.out.println("num1 is " + result1);

		// determine whether the second integer value is an odd or even number
		result2 = (num2 % 2 != 0) ? "Odd" : "Even";
		System.out.println("num2 is " + result2);

	}

}
