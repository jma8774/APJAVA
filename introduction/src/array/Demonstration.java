package array;

public class Demonstration {
	
	public static void main(String[] args) {
		int[] oneTo50 = new int[50];
		populate1to50(oneTo50);
		int[] randoms = new int[(int) (Math.random()*1000)];
		populateWithRandoms(randoms);
		int[] diceRolls = new int[1000];
		populateWith2DiceRolls(diceRolls);
		verifyMathRandom(diceRolls);
		String[] deckOfCards = new String[52];
		populateWithDeck(deckOfCards);
	}
	private static void populateWithDeck(String[] deckOfCards) {
		// TODO Auto-generated method stub
		
	}
	private static void populateWith2DiceRolls(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]=((int)(Math.random()*6)+1)+((int)(Math.random()*6)+1);
		}
	}
	private static void populateWithRandoms(int[] arr) {
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*1000);
		}
	}
	private static void populate1to50(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]=i+1;
		}
	}
	private static void verifyMathRandom(int[] arr){
		int[] possibilities= new int[12];
		for(int i=0;i<arr.length;i++){
			possibilities[arr[i]-1]++;
		}
		for(int i=0;i<possibilities.length;i++){
			System.out.println(i+1+" appeared "+((double)(possibilities[i])/1000)*100+"% of the time.");
		}
	}
	private static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
