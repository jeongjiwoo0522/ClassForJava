package java_ex;

public class AnStaticBlock {

	static String name, name2;
	
	static {
		name = "suwan";
	}
	
	public static void main(String[] args) {
		name2 = "hello";
		System.out.println(name + name2);
	}
}
