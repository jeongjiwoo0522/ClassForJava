package java_ex;

//... 오버로딩이 많아지는 걸 막기 위해 생성자에서 또 다른 생성자를 호출한다 

class Car {
	
	String model;
	String color;
	int maxSpeed;
	
	Car() {
		
	}
	
	Car(String model) {
		// this.model = model;
		this(model, "검정", 250);
	}
	
	Car(String model, String color) {
		// this.model = model;
		// this.color = color;
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

public class AkConstructorThisExample {
	
}
