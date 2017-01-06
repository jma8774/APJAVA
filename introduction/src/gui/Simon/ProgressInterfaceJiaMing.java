package gui.Simon;

import gui.components.Visible;

public interface ProgressInterfaceJiaMing extends Visible {

	void increaseRound(int i);

	String getRoundNum();

	void setSequenceLength(int size);

	void updateProgress();
}
