package gui.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {
	
//	field, no width and height because its defined by the size of the image
	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;
	
	public Graphic(int x, int y, String imageLocation, int w, int h) {
//		custom size constructor
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation,w,h);
	}
	
	public Graphic(int x, int y, String imageLocation) {
//		full size constructor
		this(x,y,imageLocation,0,0);
	}
	
	public Graphic(int x, int y, String imageLocation, double scale) {
//		scale size constructor
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation,scale);
	}
	
	private void loadImages(String imageLocation, int w, int h) {
		try {
			ImageIcon icon = new ImageIcon(imageLocation);
			if(w <= 0 && h <= 0) {
//				full size icon
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
//				image is equal to the size of the transparent box that will hold the image
				Graphics2D g = image.createGraphics();
//				draws the transparent box
				g.drawImage(icon.getImage(), 0, 0, null);
//				draws the image inside the box at x=0, y=0
			}else {
//				custom size icon
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, w, h, 0, 0, icon.getIconWidth(), icon.getIconHeight(), null);
//				if you want to crop an image, parameters are:
//				image to draw, xCoord of destination, yCoord of destination, width of destination, height of destination, xCoord of target, yCoord o
			}
			loadedImages = true;
		}catch(Exception e) {
//			this happens when you don't name the image correctly
			e.printStackTrace();
		}
	}
	
	private void loadImages(String imageLocation, double scale) {
		try {
//			scale size icon
			ImageIcon icon = new ImageIcon(imageLocation);
//			icon = the image
			int newWidth = (int)(icon.getIconWidth() * scale);
			int newHeight = (int)(icon.getIconHeight() * scale);
//			new scaled w and h
			image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(icon.getImage(), 0, 0, newWidth, newHeight, 0, 0, icon.getIconWidth(), icon.getIconHeight(), null);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public BufferedImage getImage() {
		return image;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int getWidth() {
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		return image.getHeight();
	}

	@Override
	public boolean isAnimate() {
		return false;
	}

	@Override
	public void update() {
//	nothing happens cause image stays the same
	}

}
