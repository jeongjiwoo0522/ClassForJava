package test_2118_ex;

public class CleaningPerson {
	
	ClassRoom classRoom;
	
	CleaningPerson(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}
	
	public void clean(Tool tool) {
		System.out.println("Clean with a " + tool.name);
	}
	
	public void clean(Tool tool1, Tool tool2) {
		System.out.println("Clean with a " + tool1.name + " and " + tool2.name);
	}
}
