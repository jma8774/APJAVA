package chat_bot;

import java.util.Scanner;

public class JiaMingMain {
	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response;
	static Topic school;
	static Topic like;
	
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
			if(findKeyword(response, "good", 0)>=0){
				print("I'm so happy you're good.");
				}else if(findKeyword(response, "school", 0)>=0){
					inLoop = false;
					school.talk();
					}else if(findKeyword(response, "like", 0)>=0){
						inLoop = false;
						like.talk();
					}
						else{
							print("I'm sorry, I don't understand you");
						}
		}
	}
	
	public static int findKeyword(String searchString, String key, int startIndex) {
		String phrase = searchString.trim(); // returns a copy of the string, removes white spaces at beginning and end
		phrase = phrase.toLowerCase(); // makes the string lower case
		key = key.toLowerCase();
		int psn = phrase.indexOf(key); // psn = position
		while(psn>=0){ // to check if the key word exists
			String before = " ";
			String after = " ";
			if(psn + key.length() < phrase.length()){ // checks if word is the last word
				after = phrase.substring(psn + key.length(), psn + key.length() + 1);
			}
			if(psn>0){ // checks if the word is the first word
				before = phrase.substring(psn-1,psn);
			}
			if(before.compareTo("a")<0 && after.compareTo("a")<0){ // checks for space after and before
				if(noNegations(phrase, psn)){
					return psn;
				}
				return -1;
			}
			
			psn = phrase.indexOf(key,psn+1);
		}
		return -1;
	}
	//helper method, a method that contributes functionality to another method
	//common when you need to repeat the same method over and over again
	private static boolean noNegations(String phrase, int index){
		//check to see if there is space for no in the front of the key
		if(index-3>=0 && phrase.substring(index-3,index)=="no"){
			return false;
		}
		if(index-4>=0 && phrase.substring(index-4,index)=="not"){
			return false;
		}
		if(index-6>=0 && phrase.substring(index-6,index)=="never"){
			return false;
		}
		if(index-4>=0 && phrase.substring(index-4,index)=="n't"){
			return false;
		}
		return true;
	}
	public static void createTopic(){
		input = new Scanner(System.in);
		school = new School();
		like = new JiaMingLike();
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
