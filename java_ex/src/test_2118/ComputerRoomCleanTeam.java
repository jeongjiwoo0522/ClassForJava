package test_2118;

public class ComputerRoomCleanTeam extends ClassRoomCleanTeam {

	private CleaningPerson gwanriza;
	
	public ComputerRoomCleanTeam() {
		super(new ComputerRoom());
		this.gwanriza = new CleaningPerson(new ComputerRoom());
	}
	
	@Override()
	public void cleanRoom() {
		super.cleanRoom();
		this.gwanriza.clean(new Broom());
	}
}
