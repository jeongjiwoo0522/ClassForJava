package test_0521;

public class SystemClassTest {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		long t1 = System.nanoTime();
		
		int sum = 0;
		for(int i=0; i<=100000; i++) {
			sum += 1;
		}
		
		long time2 = System.currentTimeMillis();
		long t2 = System.nanoTime();
		
		System.out.println(time2 - time1);
		System.out.println(t2 - t1);
	}
}
