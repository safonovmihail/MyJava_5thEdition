/**
 * 
 */
package directingvalues;

/**
 * Args class
 * 
 * @author nialdaly
 *
 */
public class Args {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// if statement
		if (args.length != 3) {
			System.out.println("Wrong number of arguments");

			return;
		} // end of if statement

		// two int vars initialised with the values
		// of the first and third argument values
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);

		// initialises a String var as a concatenation of each of the arguments
		String msg = args[0] + args[1] + args[2] + "=";

		//
		if (args[1].equals("+")) {
			msg += (num1 + num2);
		}

		else if (args[1].equals("-")) {
			msg += (num1 - num2);
		}

		else if (args[1].equals("-")) {
			msg += (num1 - num2);
		}

		else if (args[1].equals("-")) {
			msg += (num1 - num2);
		}

		else
			msg = "Incorrect operator";

		//
		System.out.println(msg);

	} // end of main method

} // end of Args class
