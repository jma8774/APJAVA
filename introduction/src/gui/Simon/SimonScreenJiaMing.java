package gui.Simon;

import java.util.ArrayList;

import gui.Screens.ClickableScreen;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;

public class SimonScreenJiaMing extends ClickableScreen implements Runnable {

//	ProgressInterfaceX
//	ArrayList<MoveInterfaceX>
//	an int to keep track of the roundNumber
//	a boolean to keep track of whether of not input from the user is being accepted
	
	private ProgressInterfaceJiaMing progress;
	private ArrayList<MoveInterfaceJiaMing> moves;
	private int roundNum;
	private boolean accepted;
	private TextLabel label;
	
	public SimonScreenJiaMing(int width, int height) {
		super(width, height);
		roundNum = 1;
		accepted = false;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> clickables) {
		progress = getAProgress();
		label = new TextLabel(20, 20, 100, 80, "");
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
		progress.increaseRound(1);
		progress.setSequenceLength(moves.size());
		progress.updateProgress();
	}
}
