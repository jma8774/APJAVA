package gui.WhackAMole;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import gui.Screens.ClickableScreen;
import gui.components.Action;
import gui.components.TextLabel;
import gui.components.Visible;

public class WhackAMoleScreen extends ClickableScreen implements Runnable, MouseListener{
	
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAnimate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void initAllObjects(ArrayList<Visible> clickables) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350, 100, 100, 40, "");
		timeLabel = new TextLabel(350, 50, 80, 40, "30.0");
		viewObjects.add(player);
		viewObjects.add(label);
		viewObjects.add(timeLabel);
	}
	
	/**
	*to implement later, after Character Team implements PlayerInterface
	*/
	public PlayerInterface getAPlayer() {
		return new Player();
	}

	/**
	*to implement later, after Enemy Team implements MoleInterface
	*/
	public MoleInterface getAMole() {
		return new Mole((int)(Math.random()*getWidth()), (int)(Math.random()*getHeight()));
	}
	
	public void run() {
		changeText("Ready...");
		changeText("Set...");
		changeText("Go!");
		label.setText("");
//		using while loop to countdown
		while(timeLeft>0) {
			updateTimer();
			updateAllMoles();
			appearNewMole();
		}
	}

	private void appearNewMole() {
		double chance = .5*(60-timeLeft)/60;
		if(Math.random() < chance) {
			final MoleInterface mole = getAMole();
//			mole needs to be final because we don't want this mole to change, if we change it then the computer won't understand
//			we need final here to tell the computer that we won't ever have to change it
			mole.setAppearanceTime((int)(500 + Math.random() * 2000));
			mole.setAction(new Action() {
				public void act() {
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
				}
			});
			addObject(mole);
			moles.add(mole);
		}
	}

	private void updateAllMoles() {
		for(int i = 0; i < moles.size(); i ++) {
			MoleInterface m = moles.get(i);
			int screenTime = m.getAppearanceTime() - 100;
			m.setAppearanceTime(screenTime);
			if(m.getAppearanceTime() <= 0) {
				remove(m); 
//				removed from screen
				moles.remove(m);
				i--;
			}
		}
	}

	private void updateTimer() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timeLeft-= .1;
		timeLabel.setText(""+(int)(timeLeft*10) / 10.0);
//		we casted int and do all that stuff to even out the binary numbers so that it would display proper decimal places
	}

	private void changeText(String string) {
		label.setText(string);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		for(int i = 0; i < moles.size(); i ++) {
			if(moles.get(i).isHovered(e.getX(), e.getY())){
				moles.get(i).act();
			}
		}
	}
	
	public MouseListener getMouseListener() {
		return this;
	}

}
