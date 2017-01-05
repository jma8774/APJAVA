package gui.WhackAMole;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.components.Component;

public class Player extends Component implements PlayerInterface {
	
	private int score;
	
	public Player() {
		super(20, 20, 100, 100);
	}

	@Override
	public void increaseScore(int i) {
		score+=i;
		update();
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.black);
		g.drawOval(0, 0, 99, 99);
		g.drawString("Score: " + score, 40, 55);
	}

}
