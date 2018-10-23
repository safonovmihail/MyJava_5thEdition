/**
 * 
 */
package performingoperations;

/**
 * @author nialdaly
 *
 */
public class Precedence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//
		int sum = 32 - 8 + 16 * 2;

		System.out.println("Default order: " + sum);

		// provide addition and subtraction precedence over multiplication
		sum = (32 - 8 + 16) * 2;

		System.out.println("Specified order: " + sum);

		// here the operation order of precedence is addition, subtraction and then
		// multiplication
		sum = (32 - (8 + 16)) * 2;
		System.out.println("Nested specific order: " + sum);

	}

}
