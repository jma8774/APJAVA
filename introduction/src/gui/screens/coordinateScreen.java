package gui.screens;

import java.util.ArrayList;

import gui.Screen;
import gui.components.TextLabel;
import gui.components.Visible;

public class coordinateScreen extends Screen {

	public coordinateScreen(int width, int height) {
		super(width,height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		TextLabel text = new TextLabel(20,200,500,40,"TextLabel");
		
	}

}

