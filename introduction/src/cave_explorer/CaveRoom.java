package cave_explorer;

public class CaveRoom {
	public CaveRoom(String description) {
		// TODO Auto-generated constructor stub
	}
	//final=constant, public and all caps
	public static final int NORTH=0;
	public static final int EAST=1;
	public static final int SOUTH=2;
	public static final int WEST=3;
	
	private String description;
	private String directions;
	private String contents;
	private String defaultContents;
	
	private CaveRoom[] borderingRooms;
	private Door[] doors;
	
	public void enter() { //sets up cave for when entered
		
	}
}
