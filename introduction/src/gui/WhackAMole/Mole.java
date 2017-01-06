package gui.WhackAMole;

import gui.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {

	private int aTime;
	
	public Mole(int x, int y) {
		super(x, y, "resources/whackAMoleImages/diglett.png", .9);
	}

	@Override
	public int getAppearanceTime() {
		return aTime;
	}

	@Override
	public void setAppearanceTime(int screenTime) {
		aTime = screenTime;
	}

}
