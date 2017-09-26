
public class application {
	public static void main(String[] args) {
		System.out.println("Car datatype");

		Car c1 = new Car();
		String porshe;
		c1.name = "porshe";
		c1.numberofwheels = 4;
		c1.horsepower = 234;
		c1.start();
		c1.stop();

		Car c2 = new Car();
		String BMW;
		c2.name ="BMW";
		c2.numberofwheels = 4;
		c2.horsepower = 345;
		c2.start();
		c2.stop();

	}
}