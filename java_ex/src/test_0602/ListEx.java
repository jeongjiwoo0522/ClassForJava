package test_0602;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Spring");
		list.add("Network");
		list.add("OS");
		
		int size = list.size();
		System.out.println(size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(String str : list) {
			System.out.println(list.indexOf(str) + " " + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("Spring");
		
		for(String str : list) {
			System.out.println(list.indexOf(str) + " " + str);
		}
		System.out.println();
	}
}