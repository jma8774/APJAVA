package chat_bot;

import java.util.Scanner;

public class JiaMingMain {
	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response;
	static Topic school;
	
	public static void main(String[] args) {
		createTopic();
		promptName();
		talkForever();
	}
	
	private static void promptName(){
		print("Sup dude, I am a board covered with semiconductors and other such electronic components, what is your name?");
		user = input.nextLine();
		print("Ayy lmao, I will call you " + user + " until you terminate me.");
	}
	
	public static void talkForever(){
		inLoop=true;
		while(inLoop){
			print("Greetings, " + user + ". How are you? What's up?");
			response = getInput();
			if(findKeyword(response, "good", 0)){
				print("I'm so happy you're good.");
				}else if(response.indexOf("school")>=0){
					inLoop = false;
					school.talk();
				}
					else{
						print("I'm sorry, I don't understand you");
					}
		}
	}
	
	public static boolean findKeyword(String searchString, String key, int startIndex) {
		String phrase = searchString.trim(); // returns a copy of the string, removes white spaces
		phrase = phrase.toLowerCase(); // makes the string lower case
		key = key.toLowerCase();
		int psn = phrase.indexOf(key); // psn = position
		while(psn>=0){ // to check if the key word exists
			String before = " ";
			String after = " ";
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length() + 1).toLowerCase();
			}
			if(psn>0){
				before = phrase.substring(psn-1,psn).toLowerCase();
			}
			if(before.compareTo("a")<0 && after.compareTo("a")<0){
				return true;
			}
			psn = phrase.indexOf(key,psn+1);
		}
		return false;
	}

	public static void createTopic(){
		input = new Scanner(System.in);
		school = new School();
	}
	
	public static String getInput(){
		return input.nextLine();
	}
	
	public static void print(String input){
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
		System.out.println(printString);
	}
}
