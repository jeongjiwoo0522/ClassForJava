package test_0521;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		int[] score = { 99, 97, 98 };
		Arrays.sort(score);
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = { m1, m2, m3 }; 
		
		Arrays.sort(members);
		
		for(int i=0; i<members.length; i++) {
			System.out.println(members[i].name);
		}
	}
}
