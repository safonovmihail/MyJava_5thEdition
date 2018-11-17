package directingvalues;

public class Array {

	/**
	 * main method
	 */
	public static void main(String[] args) {

		// declares and initialises a string array
		String[] str = { "Much ", "More", " Java" };

		// declares an empty integer array with 3 elements
		int[] num = new int[3];

		// assigns values to the first two integer array elements
		num[0] = 100;
		num[1] = 200;

		// assigns a new value to the second string array element
		str[1] = "Better";

		// outputs the length of each array and
		// the content of all the elements in each array
		System.out.println("str array length: " + str.length);
		System.out.println("num array length: " + num.length);

		System.out.println(num[0] + "," + num[1] + "," + num[2]);
		System.out.println(str[0] + str[1] + str[2]);

	} // end of main method
} // end of Array class
