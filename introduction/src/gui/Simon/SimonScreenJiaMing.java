package gui.Simon;

import java.util.ArrayList;

import gui.Screens.ClickableScreen;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.TextMultiLines;
import gui.components.Visible;

public class SimonScreenJiaMing extends ClickableScreen implements Runnable {

//	ProgressInterfaceX
//	ArrayList<MoveInterfaceX>
//	an int to keep track of the roundNumber
//	a boolean to keep track of whether of not input from the user is being accepted
	
	private ProgressInterfaceJiaMing progress;
	private ArrayList<MoveInterfaceJiaMing> moves;
	private TextMultiLines label;
	private boolean acceptedInput;
	
	public SimonScreenJiaMing(int width, int height) {
		super(width, height);
		progress.setRoundNum(0);
		acceptedInput = false;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> clickables) {
		progress = getAProgress();
		label = new TextMultiLines(20, 20, 100, 125);
		moves = new ArrayList<MoveInterfaceJiaMing>();
		viewObjects.add(label);
		viewObjects.add(progress);
		
	}
	
	public ButtonInterfaceJiaMing getAButton() {
		return null;
	}
	
	public MoveInterfaceJiaMing getAMove() {
		return null;
	}
	
	public ProgressInterfaceJiaMing getAProgress() {
		return null;
	}
	
	public void run() {
		progress.increaseRoundNum(1);
		progress.setSequenceLength(moves.size());
		updateLabel();
		
	}

	private void updateLabel() {
		while(label.getStringList().size() > 0) label.remove(0);
		label.addString("Round " + progress.getRoundNum());
		label.addString("Sequence Number " + progress.getSequenceLength());
	}
}
