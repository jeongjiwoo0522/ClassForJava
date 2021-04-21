package test_0421_3;

import test_0421_2.Bus;
import test_0421_2.Vehicle;

public class MainTest {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		System.out.println();
		
		driver.drive(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("taxi run");
			}
		});
	}
}
