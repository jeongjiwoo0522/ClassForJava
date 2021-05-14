package test_0514;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "test");
		hashMap.put(new Key(1), "정지우");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
