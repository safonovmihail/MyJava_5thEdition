/**
 * 
 */
package importingfunctions;

// imports java arrays class
import java.util.Arrays;

public class Sort {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// declares an initialises a String array
		String[] names = { "Mike", "Dave", "Andy" };

		// declares and initialises an int array
		int[] nums = { 200, 300, 100 };

		// invokes the display method
		display(names);

		// invokes the display method
		display(nums);

		// sorts the names array
		Arrays.sort(names);
		// sorts the nums array
		Arrays.sort(nums);

		// displays the contents of each of the arrays after sorting
		display(names);
		display(nums);

	} // end of main method

	/**
	 * display method: method that displays all the elements of a passed String
	 * array
	 * 
	 * @param elems
	 */
	public static void display(String[] elems) {

		//
		System.out.println("\nString Array");

		// for loop that loops through each element in the array
		for (int loop = 0; loop < elems.length; loop++) {

			System.out.println("Element " + loop + " is " + elems[loop]);

		} // end of for loop

	} // end of display method

	/**
	 * Overloaded display method: method that displays all the elements of a passed
	 * int array
	 * 
	 * @param elems
	 */
	public static void display(int[] elems) {

		//
		System.out.println("\nInteger Array");

		// for loop that loops through each element in the array
		for (int loop = 0; loop < elems.length; loop++) {

			System.out.println("Element " + loop + " is " + elems[loop]);

		} // end of for loop

	} // end of Overloaded display method

}
