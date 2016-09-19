package intro_unit;

public class Senior extends Student {

	private String internship;
	public Senior(String name, String internship) {
		super(name);
		this.internship=internship;
	}
	public void talk(){
		super.talk();
		System.out.println("... I am a senior and I intern at "+internship+".");
	}
}
