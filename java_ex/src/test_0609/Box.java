package test_0609;

public class Box<T> {
	
	private T t;
	
	public T get() {
		return this.t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
