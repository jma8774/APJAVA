package gui.components;

public interface Clickable extends Visible {
	
	public void act();
	public boolean isHovered(int x, int y);
	
}
