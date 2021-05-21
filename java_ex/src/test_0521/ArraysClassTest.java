package test_0521;

import java.util.Arrays;

public class ArraysClassTest {

	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };
		
		char[] arr2 = Arrays.copyOf(arr1, 4);
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]);
		}
	}
}
