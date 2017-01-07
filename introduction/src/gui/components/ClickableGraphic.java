package gui.components;

import java.util.ArrayList;

import gui.GastlyGame.ClickableGraphicGame;

public class ClickableGraphic extends Graphic implements Clickable{

	private Action action;
	
	public ClickableGraphic(int x, int y, String imageLocation, int w, int h) {
		super(x, y, imageLocation, w, h);
//		custom size

	}

	public ClickableGraphic(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
//		normal size

	}

	public ClickableGraphic(int x, int y, String imageLocation, double scale) {
		super(x, y, imageLocation, scale);
//		scale size
	}

	@Override
	public void act() {
		if(this.action != null) this.action.act();
	}

	@Override
	public boolean isHovered(int x, int y) {
		return x>this.getX() && x<this.getX()+this.getWidth() && y > this.getY() && y<this.getY()+this.getHeight();
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action a) {
		this.action = a;
	}

}
