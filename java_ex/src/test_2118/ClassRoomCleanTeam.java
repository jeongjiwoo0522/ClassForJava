package test_2118;

public class ClassRoomCleanTeam {

	private ClassRoom classRoom;
	
	private CleaningPerson sweeper;
	private CleaningPerson wiper;
	
	public ClassRoomCleanTeam(ClassRoom classRoom) {
		this.classRoom = classRoom;
		this.sweeper = new CleaningPerson(classRoom);
		this.wiper = new CleaningPerson(classRoom);
	}
	
	public void cleanRoom() {
		System.out.println("start clean " + this.classRoom.name);
		this.sweeper.clean(new Broom());
		this.wiper.clean(new Duster());
	}
}
