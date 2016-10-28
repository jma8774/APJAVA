package array;

public class Arrays {
	public static void main(String[] args){
		// this is how you time how quickly a computer performs
		testPrimes(100);
	}	
private static void passByValueDemonstration(){
	String[] someStrings= new String[100];
	populateArray(someStrings);
	int ten = 10;
	increase(ten);
	System.out.println("Ten, increased is " + ten);
	System.out.println("Before " + someStrings[99]);
	changeString(someStrings[99]);
	System.out.println("After \"changeString\" method " + someStrings[99]);
	changeArray(someStrings);
	System.out.println("After \"changeArray\" method " + someStrings[99]);
	changeArrayElement(someStrings,99);
	System.out.println("After \"changeArrayElement\" method " + someStrings[99]);
}
private static void testPrimes(int numberToTest){//false=not prime, true=prime
	int lastToCheck=(int)(Math.sqrt(numberToTest));
	boolean[] theNumbers= new boolean[numberToTest];
	for(int i=0;i<numberToTest;i++){
		theNumbers[i]=true;
	}
	theNumbers[0]=false;
	theNumbers[1]=false;
	int increment=2;
	while(increment!=lastToCheck){
		if(theNumbers[increment]){
			boolean first=true;
			for(int test=increment;test<numberToTest;test+=increment){
				if(!first){
					System.out.print(test+",");
					theNumbers[test]=false;
				}else{
					first=false;
				}
			}
		}
		increment++;
	}
		for(int i=0;i<theNumbers.length;i++){
			if(theNumbers[i]){
				System.out.println(i+" is prime.");
			}
	}
}
private static void changeArrayElement(String[] someStrings, int i) {
		someStrings[i] = "new item"+(i+1);
		
	}
private static void changeArray(String[] someStrings) {
		someStrings = new String[100]; // doesn't work, it works if we remove this because without this line, the parameter would point
		// at the global variable someStrings, however because we use someStrings = ???, we are changing the local variable to equal
		// a new different array, so it doesn't change when we println because what was changed was another array that was just created
		for(int i=0;i<someStrings.length;i++){
			someStrings[i] = "new item "+(i+1);
		}
	}
private static void increase(int x){
	x = x+1; // its not adding to the original, it is making a new local variable in the method
}
private static void changeString(String a){
	a = "This string has been changed.";
}
private static void printArray(String[] a) {
		for(String b: a){
			System.out.println(b);
		}
	}

private static void populateArray(String[] a) {
		for(int i=0;i<a.length;i++){
			a[i]="value "+(i+1);
		}
	}

private static void arrayPractice(){
	// primitive(int, double, boolean) type arrays fill in the ZEROES
			int[] zero1 = {0,0,0}; // these 2 methods do the same thing
			int[] zero2 = new int[3];// these 2 methods do the same thing
			
			String[] strings1 = {"","",""}; // these 2 constructors are different
			String[] strings2 = new String[3]; // these 2 constructors are different
			strings2[0]="value 1";
			strings2[1]="value 2";
			strings2[2]="value 3";
			boolean[] booleans = new boolean[3];
			// FOR LOOP
			// you use for loop when the index of the data is important to reference and when you need to customize how you iterate
				// increase by 2, decrease by 2 and etc
			for(int i=0;i<booleans.length;i++){ // arr.length does not need () because arrs are not objects
				System.out.println(i+": "+booleans[i]);
			}
			// this loop instantiates the strings
			for(int i=0;i<strings2.length;i++){
				strings2[i]="value "+(i+1);
			}
			// FOR EACH LOOP
			// always goes in order, does not keep track of index, easiest to type
			for(boolean b: booleans){
				System.out.println(b);
			}
			
			for(String s: strings1){
				System.out.println(s);
			}
			for(String s: strings2){
				System.out.println(s);
			}
	}
}