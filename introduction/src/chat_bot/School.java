package chat_bot;

public class School implements Topic{
	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk(){
		inSchoolLoop = true;
		while(inSchoolLoop){
			JiaMingMain.print("Tell me about school.");
			schoolResponse = JiaMingMain.getInput();
			if(schoolResponse.indexOf("stop")>=0){
				inSchoolLoop= false;
				JiaMingMain.talkForever();
			}
			JiaMingMain.print("That's my favorite " + "part about school too.");
		}
	}
	public boolean isTriggered(String userInput){
		String[] triggers = {"school", "class", "teacher"};
		if(JiaMingMain.findKeyword(userInput, "school", 0)>=0){
			return true;
		}
		if(JiaMingMain.findKeyword(userInput, "class", 0)>=0){
			return true;
		}
		return false;
	}
}
