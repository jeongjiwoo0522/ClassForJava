package test_0521;

public class SystemClassTestGetProperty {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		
		System.out.println(osName);
		System.out.println(userName);
	}
}
