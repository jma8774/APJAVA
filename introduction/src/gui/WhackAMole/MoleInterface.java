package gui.WhackAMole;

import gui.components.Action;
import gui.components.Clickable;

public interface MoleInterface extends Clickable, Action {

	int getAppearanceTime();
//	this is for my partner, the enemy designer to implement

	void setAppearanceTime(int screenTime);

	void setAction(Action action);


	
}
