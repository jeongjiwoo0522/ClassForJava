package java_ex;

public class AdArrayExample2 {
	public static void main(String[] args) {
		int[] arr = new int[10]; 
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
		}
		System.out.println(add(arr));
	}
	
	public static int add(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
