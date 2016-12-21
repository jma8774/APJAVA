package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable{
	
	private Color color;
	private Action action;
	
	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.color=color;
		this.action=action;
		update();
	}

	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		
		//rectangle
		g.setColor(color);
		g.fillRoundRect(0, 0, this.getWidth(), this.getHeight(), 50, 50);
		g.setColor(Color.black);
		g.drawRoundRect(0, 0, this.getWidth()-1, this.getHeight()-1, 50, 50);
		
		//text
		g.setColor(Color.white);
		g.setFont(new Font(this.getFont(), Font.PLAIN,this.getSize()));
		FontMetrics fm = g.getFontMetrics();
		if(this.getText() != null){
			g.setColor(Color.white);
			String t = getText();
			int cutoff = t.length();
			while(cutoff > 0 && fm.stringWidth(t) > getWidth()){
				cutoff --;
				t = t.substring(0,cutoff); 
			}
			g.drawString(t, (getWidth()-fm.stringWidth(t))/2, (getHeight()+fm.getHeight()-fm.getDescent())/2);
		}
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
		update();
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
		update();
	}

	@Override
	public void act() {
		this.action.act();
	}

	@Override
	public boolean isHovered(int x, int y) {
		return x>getX() && x<getX()+getWidth() && y > getY() && y<getY()+getHeight();
	}
}
