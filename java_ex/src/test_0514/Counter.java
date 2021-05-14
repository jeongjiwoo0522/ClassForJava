package test_0514;

public class Counter {

	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체 finalize()실행");
	}
}
