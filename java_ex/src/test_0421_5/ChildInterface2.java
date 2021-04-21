package test_0421_5;

public interface ChildInterface2 extends ParentInterface {
	
	@Override
	public default void method2() {
		System.out.println("C2_method2() run");
	}
	
	public void method3();
}
