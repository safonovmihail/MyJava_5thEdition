/**
 * 
 */
package directingvalues;

/**
 * Dimensions class
 * 
 * @author nialdaly
 *
 */
public class Dimensions {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// 2d array to store the XY coordinates
		boolean[][] points = new boolean[5][20];

		// defines 1 Y point on each X axis
		points[0][5] = true;
		points[1][6] = true;
		points[2][7] = true;
		points[3][8] = true;
		points[4][9] = true;

		// outer for loop
		for (int loop = 0; loop < points.length; loop++) {

			// inner for loop
			for (int loop2 = 0; loop2 < points.length; loop2++) {

				char mark = (points[loop][loop2]) ? 'X' : '-';

				System.out.print(mark);

			} // end of inner for loop

			// adds new line
			System.out.print("\n");

		} // end of outer for loop

	} // end of main method

} // end of Dimensions class
