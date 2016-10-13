package array;

public class arrays {
	public static void main(String[] args){
		// this is how you time how quickly a computer performs
		long startTime = System.currentTimeMillis();
		String[] someStrings= new String[100];
		populateArray(someStrings);
		changeString(someStrings[99]);
		printArray(someStrings);
		long endTime = System.currentTimeMillis();
		System.out.println("arrayPractice() completed in " +(endTime-startTime) + " milliseconds.");
	}	
private static void changeString(String a){
	a = "This string has been changed";
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