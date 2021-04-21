package test_0421_2;

public class MainTest {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
	}
}
