package test_2118;

public class Duster extends Tool {

	public Duster() {
		super("Duster");
	}
	
	@Override()
	public void use() {
		System.out.println("Wipe the floor with a " + this.name);
	}
}
