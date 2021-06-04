package test_0604;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "자바킴"), 95);
		map.put(new Student(1, "자바킴"), 95);
		
		System.out.println("총 Entry 수: " + map.size());
	}
}
