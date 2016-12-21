package gui.Screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import GUISampleGame.MouseFollower;
import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{
	
	private Button button;
	private TextLabel text;
	private TextArea area;
	private Graphic gastly;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(10, 20, 500, 40, "Mouse at:");
		button = new Button(40,100,300,120,"Button",new Color(0,76,153), new Action(){
			public void act(){
				System.out.println("Button clicked");
//				MouseFollower.game.setScreen(MouseFollower.buttonScreen);
			}
		});
//		area = new TextArea(20, 200, 500, 375, "Whenever I get a package of plain M&Ms, I make it my duty to continue the "
//				+ "strength and robustness of the candy as a species. To this end, I hold M&M duels. Taking two candies between "
//				+ "my thumb and forefinger, I apply pressure, squeezing them together until one of them cracks and splinters. "
//				+ "That is the “loser,” and I eat the inferior one immediately. The winner gets to go another round. I have found "
//				+ "that, in general, the brown and red M&Ms are tougher, and the newer blue ones are genetically inferior. I have "
//				+ "hypothesized that the blue M&Ms as a race cannot survive long in the intense theater of competition that is the "
//				+ "modern candy and snack-food world. Occasionally I will get a mutation, a candy that is misshapen, or pointier, "
//				+ "or flatter than the rest. Almost invariably this proves to be a weakness, but on very rare occasions it gives "
//				+ "the candy extra strength. In this way, the species continues to adapt to its environment. When I reach the end "
//				+ "of the pack, I am left with one M&M, the strongest of the herd. Since it would make no sense to eat this one as "
//				+ "well, I pack it neatly in an envelope and send it to M&M Mars, A Division of Mars, Inc., Hackettstown, "
//				+ "NJ 17840-1503 U.S.A., along with a 3×5 card reading, “Please use this M&M for breeding purposes.” This week they "
//				+ "wrote back to thank me, and sent me a coupon for a free 1/2 pound bag of plain M&Ms. I consider this “grant money.” "
//				+ "I have set aside the weekend for a grand tournament. From a field of hundreds, we will discover the True Champion. "
//				+ "There can be only one. ");
//		gastly = new Graphic(20, 160, "resources/sampleImages/gastly.png", .1);
		viewObjects.add(text);
		viewObjects.add(button);
//		viewObjects.add(area);
//		viewObjects.add(gastly);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		text.setText("Mouse at: " + mx + ", " + my);
	}
	
	public MouseMotionListener getMouseMotionListener() {
		return this;
	}
	
	public MouseListener getMouseListner() {
		return this;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
