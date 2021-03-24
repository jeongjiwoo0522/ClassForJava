package test;

public class C extends B {

	C(String name, int age, int num) {
		super(name, age, num);
	}
	
	public void run() {
		System.out.println("C 실행중");
	}
}
