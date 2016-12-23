package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.components.Visible;

public abstract class Screen {
	
	private BufferedImage image;
	private ArrayList<Visible> viewObjects;
	
	public Screen(int width, int height){
		viewObjects = new ArrayList<Visible>();
		initObjects(viewObjects);
		initImage(width, height);
	}
	
	public abstract void initObjects(ArrayList<Visible>viewObjects);
	
	public int getWidth(){
		return image.getWidth();
	}
	
	public int getHeight(){
		return image.getHeight();
	}

	public void initImage(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}
	
	public BufferedImage getImage(){
		return image;
	}

	public void update() {
		Graphics2D g = image.createGraphics();
		//smooth graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
//		//setting a "brush" color to use
		g.setColor(Color.black);
//		g.drawString("blackpink", 40, 100);
//		g.drawOval(20, 70, 100, 50);
//		for(int i =0; i <viewObjects.size(); i++){
//			
//		}
		for(Visible v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}
	
	//represents ABILITY to listen to mouse
	//but isn't actually doing something
	public MouseMotionListener getMouseMotionListener() {
		return null;
	}
	
	public MouseListener getMouseListener() {
		return null;
	}
	
	public void remove(Visible v) {
		viewObjects.remove(v);
	}
	
	public void addObjects(Visible v) {
		viewObjects.add(v);
	}
}
