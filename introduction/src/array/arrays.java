package array;

public class arrays {
	public static void main(String[] args){
		// this is how you time how quickly a computer performs
		long startTime = System.currentTimeMillis();
		arrayPractice();
		long endTime = System.currentTimeMillis();
		System.out.println("arrayPractice() completed in " +(endTime-startTime) + " milliseconds.");
	}	

private static void arrayPractice(){
	// primitive(int, double, boolean) type arrays fill in the ZEROES
			int[] zero1 = {0,0,0}; // these 2 methods do the same thing
			int[] zero2 = new int[3];// these 2 methods do the same thing
			
			String[] strings1 = {"","",""}; // these 2 constructors are different
			String[] strings2 = new String[3]; // these 2 constructors are different
			
			boolean[] booleans = new boolean[3];
			// FOR LOOP
			// you use for loop when the index of the data is important to reference and when you need to customize how you iterate
				// increase by 2, decrease by 2 and etc
			for(int i=0;i<booleans.length;i++){ // arr.length does not need () because arrs are not objects
				System.out.println(i+": "+booleans[i]);
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