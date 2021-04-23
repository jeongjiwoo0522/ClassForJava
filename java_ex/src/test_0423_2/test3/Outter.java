package test_0423_2.test3;

public class Outter {

	public static void method2(final int arg) {
		final int localValue = 2;
		// arg = 23;
		// localValue = 3;
		class Inner {
			public void method() {
				int result = arg + localValue;
			}
		}
	}
}
