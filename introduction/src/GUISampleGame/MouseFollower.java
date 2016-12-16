package GUISampleGame;

import gui.GUIApplication;
import gui.Screens.CoordinateScreen;

public class MouseFollower extends GUIApplication implements Runnable {
	
	//FIELDS
	public static MouseFollower game; // only ONE game exists
	private CoordinateScreen cs;

	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void initScreen(){
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
	}

	public static void main(String[] args) {
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}
