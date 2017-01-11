package gui.components;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

public class TextMultiLines extends Component {
	/**
	 * This is a class that I made for my own use
	 * It takes Strings from ArrayList stringList and draws it
	 * Each string/item from the ArrayList gets its own line
	 * There is also an option to center all the text or to not center all the text
	 * There's also an option to change the color of the background 
	 *
	 * EX: ArrayList text {"Hello", "World"};
	 * calling update() with boolean centered = true will draw something like this:
	 *  ___________
	 * |   Hello   |
	 * |   World   | <---- centered
	 * |___________|
	 */
	
	private Color bgC;
	private Color fontC;
	private ArrayList<String> stringList;
	private boolean centered;
	
	public TextMultiLines(int x, int y, int w, int h, Color bgC, Color fontC) {
		super(x, y, w, h);
		stringList = new ArrayList<String>();
		centered = true;
		this.bgC = bgC;
		this.fontC = fontC;
	}
	
	public void setBGColor(Color color) {
		bgC = color;
		update();
	}
	
	public void setFontColor(Color color) {
		fontC = color;
		update();
	}
	
	public ArrayList<String> getStringList() {
		return stringList;
	}

	public void setStringList(ArrayList<String> stringList) {
		this.stringList = stringList;
		update();
	}
	
	public void addString(String string) {
		this.stringList.add(string);
		update();
	}
	
	public void remove(int i) {
		if(stringList.size() > 0) stringList.remove(i);
		update();
	}
	
	public boolean isCentered() {
		return centered;
	}

	public void setCentered(boolean centered) {
		this.centered = centered;
		update();
	}
	
	@Override
	public void update(Graphics2D g) {
		g = clear();
		
//		draw label
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(bgC);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(fontC);
		g.drawRect(0, 0, getWidth()-1, getHeight()-1);
		
//		draw text
		FontMetrics fm = g.getFontMetrics();
		int x = 0;
		if(stringList != null && stringList.size() > 0) {
			for(int i = 0; i < stringList.size(); i ++) {
				if(centered) x = (getWidth()-fm.stringWidth(stringList.get(i))) / 2;
				g.drawString(stringList.get(i), x, (fm.getAscent() + fm.getDescent()) * (i+1));
			}
		}
	}

}
