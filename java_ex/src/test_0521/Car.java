package test_0521;

public class Car {

	int num;
	String name;
	
	public Car(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	void run() {
		System.out.println("달립니다.");
	}
	
	void stop() {
		System.out.println("멈춥니다.");
	}
}
