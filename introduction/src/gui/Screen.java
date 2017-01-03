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
		for(int i = 0 ; i < viewObjects.size(); i++){
			Visible v = viewObjects.get(i);
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
	}
	
//	represents ABILITY to listen to mouse
//	but isn't actually doing something
	public MouseMotionListener getMouseMotionListener() {
		return null;
	}
	
	public MouseListener getMouseListener() {
		return null;
	}
	
	public void remove(Visible v) {
//		we have a very simple command : remove(v)
//		however, this is a very big deal on the AP exam
//		because when an object is removed from a list, every other object AFTER that object is moved up in order
//		therefore, all of their respected indices have changed, you MUST be aware of this
//		
//		EXAMPLE: List<Integer> {4,8,7,1} and you want to remove all Integers greater than 5, you do this:
//		for(int i = 0; i < list.size(); i ++ {
//			if(list.get(i) > 5) list.remove(i);
//		}
//		THIS IS WRONG!
//		you have to subtract i by 1 or else every time you remove an item in the loop, 
//		you will skip over one because the indices have changed
//		
//		EXAMPLE 2:
//		for(int i = 0; i < list.size(); i ++ {
//			while(list.get(i) > 5) list.remove(i);
//	}
//		THIS IS CORRECT! OR you can do this:
//		
//		EXAMPLE 3:
//		for(int i = 0; i < list.size(); i ++ {
//			if(list.get(i) > 5) {
//				list.remove(i);
//				i--;
//		{
//	}
//		ONE MORE NOTE: if you call list.remove(int), it will return the objects being removed at that index
		viewObjects.remove(v);
	}
	
	public void addObjects(Visible v) {
		viewObjects.add(v);
	}
	
	public void moveToBackground(Visible v) {
		if(viewObjects.contains(v)) {
			viewObjects.remove(v);
			viewObjects.add(0,v);
		}
	}
	
	public void moveToFront(Visible v) {
		if(viewObjects.contains(v)) {
			viewObjects.remove(v);
			viewObjects.add(v);
		}
	}
}
