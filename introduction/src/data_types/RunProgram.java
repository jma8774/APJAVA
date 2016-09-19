package data_types;

public class RunProgram {

	public static void main(String[] args) {
		SuperClass msg1 = new SuperClass();
		SuperClass msg2 = new SubClass();
		
		((SuperClass)msg1).talk();
		((SuperClass)msg2).talk();
	}

}
