package test_0521;

public class ClassClassTest {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println(clazz.getName());
			Constructor[] csts = clazz.getDeclaredConstructor();
			System.out.println(csts[0].getName());
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
}
