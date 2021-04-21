package test_0421_2;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("run bus");
	}

	public void checkFare() {
		System.out.println("check bus pare");
	}
}
