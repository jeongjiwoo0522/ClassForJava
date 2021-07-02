package test_0702;

@FunctionalInterface
interface B {
	public void run(int x, int y);
}

public class A {

	public static void main(String[] args) {
		B b = (x, y) -> { System.out.println(x + y); };
		b.run(1, 2);
		b = (x, y) -> System.out.println(x + y);
		b.run(1, 2);
	}
}
