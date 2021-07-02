package test_0611;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("자바킴", 80);
		map.put("홍길동", 95);
		printMapSizeStatus(map);
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			printMapEntry(key, value);
		}
		
		map.remove("홍길동");
		printMapSizeStatus(map);
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			printMapEntry(key, value);
		}
	}
	
	public static void printMapSizeStatus(Map<?, ?> map) {
		System.out.println("총 Entry 수: " + map.size());
	} 
	
	public static void printMapEntry(String key, int value) {
		System.out.println("\t" + key + " : " + value);
	}
}
