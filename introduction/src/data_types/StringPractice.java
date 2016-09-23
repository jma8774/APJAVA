package data_types;

import java.util.Scanner;

public class StringPractice {
// /n makes it so that it warps the text
	static Scanner input;
	static String user;
	static int lineCount;
	static boolean inLoop;
	static String response;
	
	public static void main(String[] args) {
		createScanner();
		lineCount = 0;
//		demonstrateStringMethod();
//		promptInput();
		promptName();
		talkForever();
	}
	private static void promptName(){
		write("Sup dude, I am a board covered with semiconductors and other such electronic components, what is your name?");
		user = input.nextLine();
		write("Ayy lmao, I will call you " + user + " until you terminate me.");
	}
	private static void promptInput() {
		if(lineCount>3){
			write(user+", try inputting another String.");
		}
		else{
			write(user+", try inputting a String.");
		}
		String userInput = input.nextLine();
		write("You typed, " + "**" + userInput + "**");
	}
	public static void talkForever(){
		inLoop=true;
		while(inLoop){
			write("Greetings, " + user + ". How are you?");
			response = getInput();
			if(response.indexOf("good")>=0){
				write("I'm so happy you're good.");
			}else{
				write("I'm sorry, I don't understand you");
			}
		}
	}
	public static void createScanner(){
		input = new Scanner(System.in);
	}
	public static void demonstrateStringMethod(){
//		String text = new String("hello world");
		String text1 = "hello world"; // same as above, shortcut
		String text2 = "hello ";
		String text3 = "world";
		if(text1 .equals (text2+text3)){ // use .equals for string comparison
			write("These strings are equal.");
		}
		System.out.println(text1);
		System.out.println(text2+text3);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzya";
		if(word1.compareTo(word2)<0){
			write("word1 is before word2," + " lexicongraphically.");
		}
	}
	public static String getInput(){
		return input.nextLine();
	}
	public static void write(String input){
		String printString = "";
		int cutoff = 35;
		while(input.length()>0){
			String currentLine = "";
			String nextWord = "";
			while(currentLine.length()+nextWord.length()<=cutoff && input.length()>0){
				currentLine+=nextWord;
				input = input.substring(nextWord.length());
				int endOfWord = input.indexOf(" ");
				if(endOfWord == -1){
					endOfWord = input.length()-1;
				}
				nextWord = input.substring(0,endOfWord+1);
			}
			printString+=currentLine+"\n";
		}
		lineCount++;
		System.out.println("Line Count "+lineCount+": " + printString);
	}
	private static int indexOf(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}
