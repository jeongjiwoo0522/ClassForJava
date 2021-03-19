package java_ex;

public class AlConstructorPractice {
	
	String a, b;
	
	public static void main(String[] args) {
		
	}
	
	AlConstructorPractice() {
		this("hello", "world");
	}
	
	AlConstructorPractice(String a) {
		this(a, "world");
	}
	
	AlConstructorPractice(String a, String b) {
		this.a = a;
		this.b = b;
	}
}
