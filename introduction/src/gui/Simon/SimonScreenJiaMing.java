package gui.Simon;

import java.awt.Color;
import java.util.ArrayList;

import gui.Screens.ClickableScreen;
import gui.components.Action;
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
	private boolean acceptingInput;
	private int currentSeq;
	
	public SimonScreenJiaMing(int width, int height) {
		super(width, height);
		progress.setRoundNum(0);
		acceptingInput = false;
		currentSeq = 0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> clickables) {
		progress = getAProgress();
		label = new TextMultiLines(20, 20, 100, 125);
		moves = new ArrayList<MoveInterfaceJiaMing>();
		addButtons();
		viewObjects.add(label);
		viewObjects.add(progress);
		
	}
	
	private void addButtons() {
		int numButtons = 6;
		Color[] colors = {Color.BLUE, Color.PINK, Color.RED, Color.GREEN, Color.YELLOW, Color.ORANGE};
		int[] coordX = {400, 400, 200, 200, 600, 600};
		int[] coordY = {200, 600, 300, 400, 300, 400};
		for(int i = 0; i < numButtons; i ++) {
			final ButtonInterfaceJiaMing b = getAButton();
			b.setColor(colors[i]);
			b.setX(coordX[i]);
			b.setY(coordY[i]);
			b.setAction(new Action() {
				
				@Override
				public void act() {
					if(acceptingInput) {
						Thread blink = new Thread(new Runnable() {
							
							@Override
							public void run() {
								b.highlight();
								try {
									Thread.sleep(800);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								b.dim();
							}
						});
						blink.start();
						if(b.equals(moves))
					}
				}
			});
		}
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
