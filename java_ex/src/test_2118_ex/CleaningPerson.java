package test_2118_ex;

public class CleaningPerson {
	
	private ClassRoom classRoom;
	
	public CleaningPerson(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}
		
	public void clean(Tool tool) {
		System.out.println("clean " + this.classRoom.name);
		tool.use();
	}
	
	public void clean(Tool tool1, Tool tool2) {
		System.out.println("clean " + this.classRoom.name);
		tool1.use();
		tool2.use();
	}
}
