package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setFont(new Font(getFont(), Font.PLAIN,getSize()));
		
		g.setColor(Color.white);
		if(getText() != null){
			FontMetrics fm = g.getFontMetrics();
			String[] split = getText().split(" ");
			String stringToDraw = "";
			int numLines = 1;
			for(int i = 0; i < split.length; i ++){
				if(fm.stringWidth(split[i]) + fm.stringWidth(stringToDraw) + fm.stringWidth(" ") <= getWidth() && i < split.length-1){
					stringToDraw = stringToDraw + split[i] + " ";
				} else {
					if(i == split.length-1) stringToDraw = stringToDraw + split[i] + " ";
					g.drawString(stringToDraw, (getWidth() - fm.stringWidth(stringToDraw)) / 2, (fm.getAscent() + fm.getDescent()) * numLines);
					stringToDraw = "";
					numLines++;
				}
			}
		}
	}
}
