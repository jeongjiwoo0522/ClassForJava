package test_0616;

class Animal {
	String name = "동물";
	
	void iAm() {
		System.out.println("동물");
	}
}

class Dog extends Animal {
	String name = "강아지";
	
	void iAm() {
		System.out.println("강아지");
	}
}

public class Test {

	public static void main(String[] args) {
		Animal animal = new Dog();
		System.out.println(animal.name);
		animal.iAm();
		
		Dog dog = (Dog) animal;
		
		System.out.println(dog.name);
		dog.iAm();
	}
}
