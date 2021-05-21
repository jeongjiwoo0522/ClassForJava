package test_0521;

public class SystemClassTestGetEnv {

	public static void main(String[] args) {
		String name = System.getenv("OS");
		System.out.println(name);
	}
}
