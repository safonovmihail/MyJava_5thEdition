/**
 * 
 */
package directingvalues;

/**
 * Loops class
 * 
 * @author nialdaly
 *
 */
public class Loops {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		//
		String[] htm = { "HTML5", "in", "easy", "steps" };

		//
		int j = 0;

		// while loop
		while (j < htm.length) {
			System.out.println("htm[" + j + "] + is | " + htm[j]);
			j++;
		} // end of while loop

		//
		String[] xml = { "XML", "in", "easy", "steps" };

		//
		int k = 0;

		//
		if (xml.length > 0)
			do {
				System.out.println("\t\txml[" + k + "] is | " + xml[k]);
				k++;
			} while (k < xml.length); // end of do while

	} // end of main method

} // end of Loops class
