package test;

public class B extends A {

	private String name;
	private int age;
	
	B(String name, int age, int num) {
		super(num);
		this.name = name;
		this.age = age;
	}
	
	public void run() {
		System.out.println("B 실행중");
	}
}
