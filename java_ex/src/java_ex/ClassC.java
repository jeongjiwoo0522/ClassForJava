package java_ex;

public class ClassC {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[] { 1, 4, 5 };
		printArray(arr);
		System.out.println(add(new int[] { 1, 4, 5 }));
		
		int[] newArr = makaArray(3);
		printArray(newArr);
	}	
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int add(int[] arr) {
		int sum = 0;
		for(int i=0; i<3; i++ ) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static int[] makaArray(int length) {
		int[] newArr = new int[length];
		return newArr;
	}
}