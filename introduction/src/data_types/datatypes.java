package data_types;

public class datatypes {

	public static void main(String[] args) {
		System.out.println(5.0/2);
		System.out.println((double) 5/2);
		System.out.println(5/2);
		// the third one returns a different answer because it is not a double
		// therefore the answer that it returns is also not double(meaning in decimal form)
		System.out.println(3+5.0/2+5*2);
		System.out.println(3.0+5/2+5*2);
		// it is different because if 5 is not doubled, then 5/2 wouldn't return 2.5
		// instead it would return 2
		System.out.println((int)(3.0 + 5)/(2 + 5 * 2));
		// its all because of their data type, you have to change it to match whatever answer you need
		if(42 == 42.0) System.out.println("42 equals 42.0");
	}

}
