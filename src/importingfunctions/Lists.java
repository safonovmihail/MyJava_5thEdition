/**
 * 
 */
package importingfunctions;

// imports the java ArrayList Class
import java.util.ArrayList;

/**
 * Lists class
 * 
 * @author nialdaly
 *
 */
public class Lists {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// creates a String ArrayList object called list
		ArrayList<String> list = new ArrayList<String>();

		// add statements to populate the list elements
		list.add("Alpha");
		list.add("Delta");
		list.add("Charlie");

		// prints out the entire list
		System.out.println("List: " + list);

		// identifies the value in the second element in the list
		System.out.println("Replacing: " + list.get(1) + "\n");
		list.set(1, "Bravo");

		// iterates through the list and displays the String stored in each element
		list.forEach((x) -> System.out.println("Item: " + x));

	} // end of main method

} // end of Lists class
