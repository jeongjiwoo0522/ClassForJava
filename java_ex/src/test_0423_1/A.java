package test_0423_1;

public class A {

	A() {
		System.out.println("A 객체 생성");
	}
	
	class B {
		B() {
			System.out.println("B 객체 생성");
		}
		
		int field1;
		void method1() {}
		
		// static int field2; //정적 멤버를 넣을 수 없음
	}
	
	static class C {
		C() {
			System.out.println("C 객체 생성");
		}
		
		int field1;
		void method1() {}
		
		static int field2;
		static void method() {}
	}
	
	void method() {
		class D {
			D() {
				System.out.println("D 객체 생성");
			}
			
			int field;
			void method() {}
		}
		D d = new D();
		d.field = 3;
		d.method();
	}
	
	static void method2() {
		class E {
			E() {
				System.out.println("E 객체 생성");
			}
		}
		E e = new E();
		
	}
}
