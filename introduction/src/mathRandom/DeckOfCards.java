package mathRandom;

public class DeckOfCards {

	public static void main(String[] args) {
		System.out.println(pickOneCard());
	}
	public static String pickOneCard(){
		String[] arr1 = {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] arr2 = {"Diamonds","Hearts","Clubs","Spades"};
		String card = "The "+ arr1[(int) (Math.random()*(arr1.length))] + " of " + arr2[(int) (Math.random()*arr2.length)] + ".";
		return card;
	}
}
