package test_2118_ex;

public class Broom extends Tool {
	
	public Broom() {
		super("Broom");
	}
	
	@Override()
	public void use() {
		System.out.println("Sweeping the floor with a Broom");
	}
}
