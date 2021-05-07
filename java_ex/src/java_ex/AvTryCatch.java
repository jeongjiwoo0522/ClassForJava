package java_ex;

public class AvTryCatch {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("Not Found Class");
		}
	}
}
