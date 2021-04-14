package java_ex;

abstract class Phone {
	
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 킵니다");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
}

class SmartPhone extends Phone {
	
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
}

public class ApAbstractClassExample {	
	
	public static void main(String[] args) {
		Phone myPhone = new SmartPhone("samsung");
		myPhone.turnOff();
		myPhone.turnOn();
	}
}
