package java_ex;

public class AmMethodExample {
	
	// variable length parameter 
	static int sum(int ...x) {
		int s = 0;
		for(int i=0; i<x.length; i++) {
			s += x[i];
		}
		return s;
	}
	
	static String sum(String ...x) {
		String s = "";
		for(int i=0; i<x.length; i++) {
			s += x[i];
		}
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3));
		System.out.println(sum("hello", " ", "world"));
	}
}
	