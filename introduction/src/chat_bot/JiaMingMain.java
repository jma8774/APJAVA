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
			print("Greetings, " + user + ". How are you?");
			response = getInput();
			if(response.indexOf("good")>=0){
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
	
	private static int indexOf(String string) {
		return 0;
	}

}
