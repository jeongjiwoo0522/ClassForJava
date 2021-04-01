package test_2118_ex;

public class Main {
	
	public static void main(String[] args) {
		
		Tool defaultTool = new Tool("default tool");
		Broom broomTool = new Broom();
		Duster dusterTool = new Duster();
		
		ClassRoom eHakNyeonIllBan = new ClassRoom("2-1");
		ScienceRoom scienceRoom = new ScienceRoom();
		ComputerRoom computerRoom = new ComputerRoom();
		
		CleaningPerson cleaner = new CleaningPerson(eHakNyeonIllBan);
		
		cleaner.clean(broomTool);
		cleaner.clean(dusterTool, defaultTool);
		
		
	}
}
