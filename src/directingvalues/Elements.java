/**
 * 
 */
package directingvalues;

/**
 * Elements class
 * 
 * @author nialdaly
 *
 */
public class Elements {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		//
		int[] kiosk_q1 = { 42000, 48000, 50000 };
		int[] kiosk_q2 = { 52000, 58000, 60000 };
		int[] kiosk_q3 = { 46000, 49000, 61000 };
		int[] kiosk_q4 = { 50000, 51000, 61000 };

		//
		int[] outlet_q1 = { 57000, 63000, 60000 };
		int[] outlet_q2 = { 70000, 67000, 73000 };
		int[] outlet_q3 = { 67000, 65000, 62000 };
		int[] outlet_q4 = { 72000, 69000, 75000 };

		//
		int[] sum = new int[12];

		// int var used to record the total value
		int total = 0;

		// first for loop
		for (int loop = 0; loop < kiosk_q1.length; loop++) {

			//
			sum[loop] = kiosk_q1[loop] + outlet_q1[loop];
			sum[loop + 3] = kiosk_q2[loop] + outlet_q2[loop];
			sum[loop + 6] = kiosk_q3[loop] + outlet_q3[loop];
			sum[loop + 9] = kiosk_q4[loop] + outlet_q4[loop];

		} // end of first for loop

		// second for loop
		for (int loop = 0; loop < outlet_q1.length; loop++) {

			// prints out the monthly sales totals
			System.out.println("Month " + (loop + 1) + " Sales:\t" + sum[loop]);

			total += sum[loop];

		} // end of second for loop

		// prints out the total sales value
		System.out.println("Total Year Sales: " + total);
	} // end of main method

} // end of Elements class