package gui.WhackAMole;

import gui.GUIApplication;

public class WhackAMole extends GUIApplication {

	public WhackAMole(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		WhackAMoleScreen wams = new WhackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);
	}
	
	public static void main(String[] args) {
		WhackAMole wamg = new WhackAMole(800,600);
		Thread game = new Thread(wamg);
		game.start();
	}
}
