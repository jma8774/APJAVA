package gui.components;

import java.awt.Color;
import java.awt.Graphics2D;

public class MovingComponent extends Component implements Runnable {

	private long moveTime; //time when the image last moved
	private double vx; //the horizontal velocity
	private double vy; //the vertical velocity
	private double posx; //the actual x-coordinate of the object
	private double posy; //the actual y-coordinate of the object
	private boolean running;
	
	public static final int REFRESH_RATE = 20;
	
	public MovingComponent(int x, int y, int w, int h) {
		super(x, y, w, h);
		vx = 0;
		vy = 0;
	}
	
	public void setX(int x) {
		super.setX(x);
		posx = x;
	}
	
	public void setY(int y) {
		super.setY(y);
		posy = y;
	}
	
	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	public boolean isAnimated() {
		return true;
	}
	
	@Override
	public void run() {
		posx = getX();
		posy = getY();
		running = true;
		moveTime = System.currentTimeMillis();
		while(running) {
			try {
				Thread.sleep(REFRESH_RATE);
				checkBehaviors();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			update();
		}
	}

	private void checkBehaviors() {
		if(getY() > 300) {
			setY(300);
			setVy(-vy);
		}
		if(getY() < 0) {
			setY(0);
			setVy(-vy);
		}
		if(getX() < 0) {
			setX(0);
			setVx(-vx);
		}
		if(getX() > 300) {
			setX(300);
			setVx(-vx);
		}
	}

	@Override
	public void update(Graphics2D g) {
		long currentTime = System.currentTimeMillis();
		int difference = (int)(currentTime - moveTime);
		if(difference > REFRESH_RATE) {
			moveTime = currentTime;
			posx += vx * (double) difference/REFRESH_RATE; 
			posy += vy * (double) difference/REFRESH_RATE;
//			for very low velocity, position may not change much
//			so if you round it into an int instead of double, it may seem like it didn't move at all
			super.setX((int)posx);
			super.setY((int)posy);
			drawImage(g);
 		}
	}
	
	public void play() {
		if(!running) {
			Thread go = new Thread(this);
			go.start();
		}
	}
	private void drawImage(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fillOval(0, 0, getWidth(), getHeight());					
	}

}
