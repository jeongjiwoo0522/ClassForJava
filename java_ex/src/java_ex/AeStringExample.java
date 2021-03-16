package java_ex;

public class AeStringExample {
	public static void main(String[] args) {
		String[] array = new String[3];
		array[0] = "JAVA";
		array[1] = "JAVA";
		array[2] = new String("JAVA");
		
		System.out.println(array[0] == array[1]);
		System.out.println(array[0] == array[2]);
		System.out.println(array[1].equals(array[2]));
	}
}
