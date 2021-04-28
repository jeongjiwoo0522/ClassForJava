package test_0428_4;

public class Anonymous {

	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		// arg1 = 3;
		// arg2 = 3;
		// var1 = 3;
		// var2 = 3;
		
		Calculatalbe calc = new Calculatalbe() {

			@Override
			public int sum() {
				int result = field + arg1  + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
