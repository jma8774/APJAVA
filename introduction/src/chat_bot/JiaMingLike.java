package chat_bot;

public class JiaMingLike implements Topic {
	private boolean inLikeLoop;
	private String likeResponse;
	
	public void talk() {
			JiaMingMain.print("What are some things that you like?");
			inLikeLoop=true;
			while(inLikeLoop){
				likeResponse=JiaMingMain.getInput();
				int likePsn = JiaMingMain.findKeyword(likeResponse, "like", 0);
				if(likePsn>=0){ //checks if the input has "like" in it
					String thingsLiked=likeResponse.substring(likePsn+5);
					System.out.println("You are such an interesting person because you like "+thingsLiked+".");
					if(JiaMingMain.findKeyword(thingsLiked,"school",0)>=0){
						inLikeLoop = false;
						JiaMingMain.school.talk();
					}else{
					inLikeLoop=false;
					JiaMingMain.talkForever();
					}
				}
				else{
					System.out.println("I'm sorry, I don't understand you");
				}
			}
	}
	public boolean isTriggered(String userInput){
		if(JiaMingMain.findKeyword(userInput, "like", 0)>=0){
			return true;
		}
		return false;
	}

}
