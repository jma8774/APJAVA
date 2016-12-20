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
//		update
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setFont(new Font(getFont(), Font.PLAIN,getSize()));
		
//		draw text
		g.setColor(Color.white);
		if(getText() != null){
			FontMetrics fm = g.getFontMetrics();
			String[] split = getText().split(" ");
			String printStr = "";
			int line = 1;
			for(int i = 0; i < split.length; i ++){
				if(fm.stringWidth(split[i]) + fm.stringWidth(printStr) + fm.stringWidth(" ") < getWidth() && i < split.length-1){
					printStr = printStr + split[i] + " ";
				} else {
					if(i == split.length-1) printStr = printStr + split[i] + " ";
					g.drawString(printStr, (getWidth() - fm.stringWidth(printStr)) / 2, (fm.getAscent() + fm.getDescent()) * line);
//					x could just be something like 2 but i decided to center it according to the width
					printStr = "";
					line++;
					if(((fm.getAscent() + fm.getDescent()) * line) > getHeight()) break; 
//					breaks when we reach the bottom of the box / exceeds height
				}
			}
		}
	}
}
