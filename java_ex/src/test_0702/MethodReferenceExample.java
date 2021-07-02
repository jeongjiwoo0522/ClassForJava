package test_0702;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println(operator.applyAsInt(1, 2));
		
		operator = Calculator::staticMethod;
		System.out.println(operator.applyAsInt(3, 4));
		
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println(operator.applyAsInt(5, 6));
		
		operator = obj::instanceMethod;
		System.out.println(operator.applyAsInt(7, 8));
	}
}
