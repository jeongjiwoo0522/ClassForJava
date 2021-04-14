package java_ex;

abstract class Animal {
	 
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉽니다");
	}
	
	public abstract void sound();
}

class Cat extends Animal {
	
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

public class AqAbstractClassExAnimal {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println();
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println();
		
		// 메소드의 다형성 
		animalSound(dog);
		animalSound(animal);
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
