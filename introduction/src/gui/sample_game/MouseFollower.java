package gui.sample_game;

import gui.GUIApplication;
import gui.screens.coordinateScreen;

public class MouseFollower extends GUIApplication {
	private coordinateScreen cs;
	public MouseFollower(int width, int height) {
		super(width, height);

	}

	public void initScreen() {
		cs = new coordinateScreen(getWidth(),getHeight());
		setScreen(cs);
	}

	public static void main(String[] args) {
		new MouseFollower(800,600);
	}

}
