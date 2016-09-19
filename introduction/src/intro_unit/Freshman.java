package intro_unit;

public class Freshman extends Student {

	public Freshman(String name) {
		super(name);
	}
	public void talk(){
		super.talk();
		System.out.println("... I am a freshman.");
	}
}
