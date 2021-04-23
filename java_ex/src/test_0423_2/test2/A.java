package test_0423_2.test2;

public class A {

	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {} 
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 3;
			method2();
		}
	}
	
	static class C {
		void method() {
			// field1 = 20;
			// method1();
			
			field2 = 1;
			method2();
		}
	}
}
