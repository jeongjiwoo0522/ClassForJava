package test;

public class MainTest {
	
	public static void main(String[] args) {
		B bTest = new B("java", 100, 1);
		C cTest = new C("javac", 101, 2);
		
		bTest.run();
		cTest.run();
	}
}
