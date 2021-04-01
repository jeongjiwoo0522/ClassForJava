package test_2118_ex;

public class ClassRoomCleanTeam {
	
	ClassRoom classRoom;
	
	CleaningPerson sweeper;
	CleaningPerson wiper;
	
	ClassRoomCleanTeam(ClassRoom classRoom) {
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
