package gui.components;

import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

public abstract class Component implements Visible {
	
//	fields
	private int x;
	private int y;
	private int w;
	private int h;
	private BufferedImage image;

	public Component(int x, int y, int w, int h) {
		this.x =x;
		this.y =y;
		this.w =w;
		this.h =h;
		this.image = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
		update(image.createGraphics());
	}

	public BufferedImage getImage() {
		return image;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return w;
	}

	public int getHeight() {
		return h;
	}
	
	public void setX(int i) {
		x = i;
	}
	
	public void setY(int i) {
		y = i;
	}
	
	public void setWidth(int i) {
		w = i;
	}
	
	public void setHeight(int i) {
		h = i;
	}
	public boolean isAnimate() {
		return false;
	}

	public void update() {
		update(image.createGraphics());
	}
	
	public abstract void update(Graphics2D g); //Different for every class
	
	public Graphics2D clear(){
		image = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
		return image.createGraphics();
	}

}
