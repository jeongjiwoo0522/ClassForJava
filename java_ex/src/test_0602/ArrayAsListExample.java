package test_0602;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "자바킴");
		
		for(String name : list1) {
			System.out.println(name);;
		}
		
		System.out.println();
		
		List<Integer> list2 = Arrays.<Integer>asList(1, 2, 3);
		for (int value : list2) {
			System.out.println(value);
		}
	}
}
