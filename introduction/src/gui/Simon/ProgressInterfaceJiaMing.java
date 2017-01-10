package gui.Simon;

import gui.components.Visible;

public interface ProgressInterfaceJiaMing extends Visible {

	/**
	 * need fields round num and sequence length
	 * initialize round num to 0 and sequence length to anything
	 */
	void increaseRoundNum(int i);

	int getRoundNum();

	void setRoundNum(int i);

	int getSequenceLength();
	
	void setSequenceLength(int size);

	void gameOver();
}
