package test_2118_ex;

public class Main {
	
	public static void main(String[] args) {
		Tool defaultTool = new Tool("default tool");
		Broom broomTool = new Broom();
		Duster dusterTool = new Duster();
		System.out.println(defaultTool.name);
		System.out.println(broomTool.name);
		System.out.println(dusterTool.name);
	}
}
