package test_0421_5;

public class MainTest {
	
	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {
			
			@Override
			public void method1() {}
			
			@Override
			public void method3() {}
		};
		
		ChildInterface2 ci2 = new ChildInterface2() {
			
			@Override
			public void method1() {}
			
			@Override
			public void method3() {}
		};
		
		ChildInterface3 ci3 = new ChildInterface3() {
			
			@Override
			public void method1() {}
			
			@Override
			public void method2() {}
			
			@Override
			public void method3() {}
		};
	}
}
