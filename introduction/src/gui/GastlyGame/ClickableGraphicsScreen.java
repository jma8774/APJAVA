package gui.GastlyGame;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.ClickableGraphic;
import gui.components.Graphic;
import gui.components.MovingComponent;
import gui.components.TextMultiLines;
import gui.components.Visible;

public class ClickableGraphicsScreen extends Screen implements MouseListener, MouseMotionListener{
	
	private ClickableGraphic[] gastlys;
	private TextMultiLines test;
	
	public ClickableGraphicsScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		gastlys = new ClickableGraphic[10];
		for(int i = 0; i < gastlys.length; i++) {
			gastlys[i] = new ClickableGraphic((int)(Math.random() * 800), (int)(Math.random() * 600), "resources/sampleImages/gastly.png", .1);
			gastlys[i].setAction(new Action() {
				@Override
				public void act() {
					for(int i = 0; i < gastlys.length; i++) {
						gastlys[i].setX((int)(Math.random() * 800));
						gastlys[i].setY((int)(Math.random() * 600));
					}
				}		
			});
			viewObjects.add(gastlys[i]);
		}
		test = new TextMultiLines(40, 40, 150, 100, Color.GREEN, Color.BLACK);
		test.addString("Round 5");
		test.addString("Sequence Number 8");
		viewObjects.add(test);
		MovingComponent c = new MovingComponent(20, 20, 100, 100);
		viewObjects.add(c);
		c.setVx(3);
		c.setVy(5);
		c.play();
		
	}
	
	public MouseListener getMouseListener() {
		return this;
	}
	
	public MouseMotionListener getMouseMotionListener() {
		return this;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		for(int i = 0; i < gastlys.length; i++) {
			if(gastlys[i].isHovered(e.getX(), e.getY())){
				gastlys[i].act();
				test.setBGColor(Color.red);
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
