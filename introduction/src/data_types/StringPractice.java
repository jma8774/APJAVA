package data_types;

public class StringPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String text = new String("hello world");
		String text1 = "hello world"; // same as above, shortcut
		String text2 = "hello ";
		String text3 = "world";
		if(text1 .equals (text2+text3)){ // use .equals for string comparison
			System.out.println("These strings are equal.");
		}
		System.out.println(text1);
		System.out.println(text2+text3);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzya";
		if(word1.compareTo(word2)<0){
			System.out.println("word1 is before word2," + " lexicongraphically.");
		}
	}

}
