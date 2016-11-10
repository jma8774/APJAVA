package cave_explorer;

public class Event_Room extends CaveRoom{
	private Event event;
	private boolean eventOccured;
	//same as caveroom, but this one has an event
	public Event_Room(String description, Event event) {
		super(description);
		eventOccured=false;
		this.event=event;
	}
	public void enter(){
		super.enter(); // does the normal enter
		if(!eventOccured){
			eventOccured=true;
			event.play();
		}
	}
}
