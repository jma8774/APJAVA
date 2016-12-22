package gui.Screens;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.ClickableGraphic;
import gui.components.Graphic;
import gui.components.Visible;

public class ClickableGraphicsScreen extends Screen implements MouseListener, MouseMotionListener{
	
	private ClickableGraphic gastly;
	
	public ClickableGraphicsScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		gastly = new ClickableGraphic((int)(Math.random() * 800), (int)(Math.random() * 600), "resources/sampleImages/gastly.png", .1);
		
		gastly.setAction(new Action() {
			@Override
			public void act() {
				gastly.setX((int)(Math.random() * 700));
				gastly.setY((int)(Math.random() * 500));
			}		
		});
		
		viewObjects.add(gastly);
	}
	
	public MouseListener getMouseListener() {
		return this;
	}
	
	public MouseMotionListener getMouseMotionListener() {
		return this;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(gastly.isHovered(e.getX(), e.getY())){
			gastly.act();
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
