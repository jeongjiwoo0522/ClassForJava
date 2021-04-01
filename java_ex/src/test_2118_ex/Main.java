package test_2118_ex;

public class Main {
	
	public static void main(String[] args) {
		
		Tool defaultTool = new Tool("default tool");
		Broom broomTool = new Broom();
		Duster dusterTool = new Duster();
		
		ClassRoom firstClassOfSecondGrade = new ClassRoom("2-1");
		ScienceRoom scienceRoom = new ScienceRoom();
		ComputerRoom computerRoom = new ComputerRoom();
		
		CleaningPerson jiwoo = new CleaningPerson(firstClassOfSecondGrade);
		CleaningPerson junseo = new CleaningPerson(scienceRoom);
		
		jiwoo.clean(broomTool);
		System.out.println("----------------------------");
		jiwoo.clean(dusterTool, broomTool);
		System.out.println("----------------------------");
		junseo.clean(dusterTool);
		System.out.println("----------------------------");
		
		ClassRoomCleanTeam firstClassOfSecondGradeCleanTeam = new ClassRoomCleanTeam(firstClassOfSecondGrade);
		firstClassOfSecondGradeCleanTeam.cleanRoom();
		
		System.out.println("----------------------------");
		
		ScienceRoomCleanTeam scienceRoomCleanTeam = new ScienceRoomCleanTeam();
		scienceRoomCleanTeam.cleanRoom();
	}
}
