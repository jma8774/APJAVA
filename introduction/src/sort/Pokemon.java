package sort;

public class Pokemon {
	
private int level;
private int hp;
private String name;
private boolean poisoned;

	public Pokemon(String name, int level) {
		this.name=name;
		this.level=level;
		hp=100;
		poisoned=false;
	}
	public String getName() {
		return name;
	}
	public int getHP() {
		return hp;
	}
	public void lapse() {
		if(poisoned) hp-=15;
	}
	public void setHP(int newHP){
		hp=newHP;
	}
	public void setPoisoned(boolean b){
		poisoned=b;
	}
	public void iChooseYou() {
		System.out.println(name+", I choose you!");
	}

}
