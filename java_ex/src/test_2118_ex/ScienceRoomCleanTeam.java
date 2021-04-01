package test_2118_ex;

public class ScienceRoomCleanTeam extends ClassRoomCleanTeam {

	CleaningPerson organizationerr;
	
	ScienceRoomCleanTeam() {
		super(new ScienceRoom());
	}
	
	@Override()
	public void cleanRoom() {
		super.cleanRoom();
		this.organizationerr.clean(null);
	}
}
