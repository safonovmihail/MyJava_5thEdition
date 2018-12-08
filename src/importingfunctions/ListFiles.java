/**
 * 
 */
package importingfunctions;

//
import java.io.*;

/**
 * @author nialdaly
 *
 */
public class ListFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// creates a file object
		File dir = new File("data");

		//
		if (dir.exists()) {

			String[] files = dir.list();
			System.out.println(files.length + "files found...");

			//
			for (int loop = 0; loop < files.length; loop++) {
				System.out.println(files[loop]);
			}

		} else {
			System.out.println("Folder not found.f");
		}

	} // main method

} // end of ListFiles class
