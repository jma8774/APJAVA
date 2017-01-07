package gui.components;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

public class TextMultiLines extends Component {
	
	private ArrayList<String> text;
	private boolean centered;
	
	public TextMultiLines(int x, int y, int w, int h) {
		super(x, y, w, h);
		text = new ArrayList<String>();
		centered = true;
	}
	
	public ArrayList<String> getText() {
		return text;
	}

	public void setText(ArrayList<String> text) {
		this.text = text;
		update();
	}
	
	public void addText(String text) {
		this.text.add(text);
		update();
	}
	
	public boolean isCentered() {
		return centered;
	}

	public void setCentered(boolean centered) {
		this.centered = centered;
	}

	@Override
	public void update(Graphics2D g) {
//		clear
		g = clear();
		
//		draw label
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		Color limeGreen = new Color(125, 255, 100);
		g.setColor(limeGreen);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, getWidth()-1, getHeight()-1);
		
//		draw text
		FontMetrics fm = g.getFontMetrics();
		int x = 0;
		if(text != null) {
			for(int i = 0; i < text.size(); i ++) {
				if(centered) x = (getWidth()-fm.stringWidth(text.get(i))) / 2;
				g.drawString(text.get(i), x, (fm.getAscent() + fm.getDescent()) * (i+1));
			}
		}
	}

}
