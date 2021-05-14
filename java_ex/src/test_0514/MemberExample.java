package test_0514;

public class MemberExample {

	public static void main(String[] args) {
		
		Member original = new Member("12345", 25);
		
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("복제 객체: " + cloned.password);
		System.out.println("원본 객체: " + original.password);
	}
}
