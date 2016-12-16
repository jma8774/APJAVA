package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
	}
	
	@Override
	public void update(Graphics2D g) {
		FontMetrics fm = g.getFontMetrics();
		String[] words = getText().split(" ");
		for(int i = 0; i < words.length; i ++){
			String line = null;
			if(words[i].length() + line.length() <= this.getWidth()){
				line = line + " " + words[i];
			} else {
				//to do
			}
		}
	}
}
