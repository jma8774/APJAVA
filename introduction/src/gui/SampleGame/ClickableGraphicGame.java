package gui.SampleGame;

import gui.GUIApplication;
import gui.Screens.ClickableGraphicsScreen;
import gui.Screens.CoordinateScreen;

public class ClickableGraphicGame extends GUIApplication implements Runnable {
	
	public static ClickableGraphicGame game;
	public static ClickableGraphicsScreen cgs;
	
	public ClickableGraphicGame(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		cgs = new ClickableGraphicsScreen(getWidth(), getHeight());
		setScreen(cgs);
	}
	
	public static void main(String[] args) {
		game = new ClickableGraphicGame(800,600);
		Thread app = new Thread(game);
		app.start();
	}
}
