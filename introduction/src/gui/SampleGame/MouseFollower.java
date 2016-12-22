package gui.SampleGame;

import gui.GUIApplication;
import gui.Screens.ButtonScreen;
import gui.Screens.ClickableGraphicsScreen;
import gui.Screens.CoordinateScreen;

public class MouseFollower extends GUIApplication implements Runnable {
	
//	field
	public static MouseFollower game; 
//	only ONE game exists
	
	public static CoordinateScreen cs;
	public static ButtonScreen buttonScreen;
	
	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void initScreen(){
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
		buttonScreen = new ButtonScreen(getWidth(), getHeight());
	}

	public static void main(String[] args) {
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}
	
}
