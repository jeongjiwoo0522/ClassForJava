package test_0709;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		IntPredicate predicateA = a -> a % 2 == 0;
		
		IntPredicate predicateB = a -> a % 3 == 0;
		
		IntPredicate predicateAB;
		boolean result;
		
		final int testBasis = 9;
		
		// and 
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(testBasis);
		System.out.println("2와 3의 배수 " + result);
		
		// or 
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(testBasis);
		System.out.println("2 또는 3의 배수 " + result);
		
		// negate 
		predicateAB = predicateA.negate();
		result = predicateAB.test(testBasis);
		System.out.println("홀수" + result);
	}
}
