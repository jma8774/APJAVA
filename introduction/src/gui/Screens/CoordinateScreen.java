package gui.Screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{
	
	private Button button;
	private TextLabel text;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(20, 200, 500, 40, "Text");
		viewObjects.add(text);
		button = new Button(40,50,300,120,"jJ Button with a long long long long name",new Color(0,76,153), new Action(){
			public void act(){
				System.out.println("Button pressed");
			}
		});
		viewObjects.add(button);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		text.setText("Mouse a: " + mx + ", " + my);
	}
	
	public MouseMotionListener getMouseMotionListener() {
		return this;
	}
}
