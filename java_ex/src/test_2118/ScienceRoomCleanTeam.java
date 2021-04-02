package test_2118;

public class ScienceRoomCleanTeam extends ClassRoomCleanTeam {

	private CleaningPerson organizationerr;
	
	public ScienceRoomCleanTeam() {
		super(new ScienceRoom());
		this.organizationerr = new CleaningPerson(new ScienceRoom());
	}
	
	@Override()
	public void cleanRoom() {
		super.cleanRoom();
		this.organizationerr.clean(new Duster());
	}
}
