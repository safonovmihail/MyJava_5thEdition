/**
 * 
 */
package creatingclasses;

/**
 * Car class
 * 
 * @author nialdaly
 *
 */
class Car {

	// instance vars
	private String maker;
	private String color;
	private String bodyType;

	/**
	 * Car constructor method: initialises each var
	 */
	public Car() {
		maker = "Porsche";
		color = "red";
		bodyType = "Saloon";
	} // end of Car constructor method

	/**
	 * accelerate private method
	 * 
	 * @return
	 */
	private String accelerate() {

		String motion = "Accelerating...";
		return motion;
	} // end of accelerate private method

	/**
	 * SETTER setCar public method: assigns passed arg values to each var
	 * 
	 * @param brand
	 * @param paint
	 * @param style
	 */
	public void setCar(String brand, String paint, String style) {

		maker = brand;
		color = paint;
		bodyType = style;

	} // end of setCar public method

	/**
	 * GETTER getCar public method: retrieves the private vars and calls the private
	 * method
	 */
	public void getCar() {
		System.out.println(maker + " paint is " + color);
		System.out.println(maker + " style is " + bodyType);
		System.out.println(maker + " is " + accelerate() + "\n");
	} // end of getCar public method

}

/**
 * Constructor class
 * 
 * @author nialdaly
 *
 */
class Constructor {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		//
		Car Porsche = new Car();
		Porsche.getCar();

		// creates another instance of the Car class and retrieves the values
		Car Bentley = new Car();
		Bentley.setCar("Bentley", "Blue", "Convertible");
	} // end of main method

} // end of Constructor class
