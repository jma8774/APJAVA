package gui.Simon;

import gui.components.Visible;

public interface ProgressInterfaceJiaMing extends Visible {

	/**
	 * need fields round num and sequence length
	 * initialize round num to 0 and sequence length to anything
	 */
	void increaseRoundNum(int i);

	String getRoundNum();

	void setRoundNum(int i);

	String getSequenceLength();
	
	void setSequenceLength(int size);
}
