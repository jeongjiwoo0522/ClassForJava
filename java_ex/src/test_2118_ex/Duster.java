package test_2118_ex;

public class Duster extends Tool {

	public Duster() {
		super("Duster");
	}
	
	@Override()
	public void use() {
		System.out.println("Wipe the floor with a Duster");
	}
}