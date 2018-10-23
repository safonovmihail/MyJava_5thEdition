/**
 * 
 */
package performingoperations;

/**
 * @author nialdaly
 *
 */
public class Escape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//
		String header = "\n \t NEW YORK 3-DAY FORECAST: \n";

		header += "\n \t Day \t \t High \t Low \t Conditions \n";

		header += "\t --- \t \t ---- \t ---------- \n";

		// add these lines to build a String containing formatted table cell data
		String forecast = "\t Sunday \t \t 68F \t 48F \t sunny \n ";

		forecast += "\t Monday \t \t 69F \t 57F \t Sunny \n ";

		forecast += "\t Tuesday \t \t 71F \t 50F \t Cloudy \n";

		System.out.print(header + forecast);

	}

}
