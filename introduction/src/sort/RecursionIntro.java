package sort;

public class RecursionIntro {
	public static void main(String[] args) {
//		System.out.println("Using a for loop...");
//		for(int i=0;i<5;i++){
//			System.out.println("Hello everyone!");
//		}
//		System.out.println("Using recursion...");
//		int numberOfTimes=5;
//		forLoop(numberOfTimes,new Action() {
//			public void act() {
//				System.out.println("Hello everyone!");
//			}
//		});
		hanoi(3,"A","B","C");
	}
	public static void hanoi(int numberOfDiscs, String from, String mid, String to) {
		if(numberOfDiscs<=1){
			print("Move from "+from+" to "+to);
		}else{
			//move all but the last one to peg B
			hanoi(numberOfDiscs-1,from,to,mid);
			//move the last one to C
			hanoi(1,from,mid,to);
			//move all but he last one to C
			hanoi(numberOfDiscs-1,mid,from,to);
		}
	}
	private static int moveCount=1;
	private static void print(String string) {
		System.out.println("Move #"+moveCount+": "+string);
		moveCount++;
	}
	private static void forLoop(int numberOfTimes, Action action) {
		if(numberOfTimes<=1) {
			action.act();
		}else {
			action.act();
			forLoop(numberOfTimes-1,action);
		}
	}
}
