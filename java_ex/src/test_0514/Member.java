package test_0514;

public class Member implements Cloneable {
	
	public String password;
	public int age;
	
	public Member(String password, int age) {
		this.password = password;
		this.age = age;
	}
	
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member) clone();
		} catch(CloneNotSupportedException e) {
			
		}
		return cloned;
	}
}
