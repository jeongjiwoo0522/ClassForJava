package test_0421_5;

public interface ParentInterface {
	
	public void method1();
	
	public default void method2() {
		System.out.println("P_method2() run");
	}
}
