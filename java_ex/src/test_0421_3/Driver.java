package test_0421_3;

import test_0421_2.Bus;
import test_0421_2.Vehicle;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
