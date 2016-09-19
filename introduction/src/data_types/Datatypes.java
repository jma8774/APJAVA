package data_types;

public class Datatypes {

	public static void main(String[] args) {
		// Task
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
		// returns 0 because int can only display whole numbers, and 8/14 is not a whole number
		// its all because of their data type, you have to change it to match whatever answer you need
		if(42 == 42.0) System.out.println("42 equals 42.0");
		
		// Test Precision
		double d1 = 4.64; 
		double d2 = 2.0;
		double d3 = 2.64;

		System.out.println("d1 : " + d1); 
		System.out.println("d2 : " + d2); 
		System.out.println("d3 : " + d3);  
		System.out.println("d1 - d2 : " + (d1 - d2));
		// it probably has something to do with the way binary numbers work, they are both double so idk why
		
		
	}

}
