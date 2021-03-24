package java_ex;

class ExClass {

	private String sn;

	public String getSn() {
		if (this.sn == null) {
			return "Empty String";
		}
		return this.sn;
	}

	public void setSn(String sn) {
		if(sn.length() > 1000) {
			System.out.println("The string cannot be more than 100 in size.");
			return;
		}
		this.sn = sn;
	}
}

public class AoGettterSetterExample {

	public static void main(String[] args) {
		ExClass ex = new ExClass();
		ex.setSn("Hello World");
		System.out.println(ex.getSn());
	}
}
