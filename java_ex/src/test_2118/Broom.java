package test_2118;

public class Broom extends Tool {

	public Broom() {
		super("Broom");
	}
	
	@Override()
	public void use() {
		System.out.println("Sweeping the floor with a " + this.name);
	}
}
