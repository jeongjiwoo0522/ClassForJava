package test_0609;

public class Person implements Comparable<Person> {

	public int age;
	
	@Override
	public int compareTo(Person o) {
		if(this.age < o.age) return -1;
		else if(this.age == o.age) return 0;
		else return 1;
	}

}
