package cave_explorer;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayIntro {
	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;
	
	public static void main(String[] args) {		
		arr2D=new String [4][3]; //rows=arr2d.length columns=arr2d[0].length
		pic=new String[arr2D.length][arr2D[0].length];
		for(int row=0;row<arr2D.length;row++){
			for(int column=0;column<arr2D[row].length;column++){
				arr2D[row][column]=("("+row+","+column+")");
			}
		}
		for(int row=0;row<pic.length;row++){
			for(int column=0;column<pic[row].length;column++){
				pic[row][column]=(" ");
			}
		}
		i=0;
		j=0;
		in=new Scanner(System.in);
		startExploring();
//		for(String[] row:arr2D){
//			System.out.println(Arrays.toString(row));
//		}
//---------------------------------------------------------------------------------------------
//String[][] pic = new String[10][12];
//		
//		for(int i =0; i<pic.length;i++){
//			for(int j=0; j <pic[i].length;j++){
//				pic[i][j] = " ";
//			}
//		}
//
//		for(int i = 0; i<pic.length;i++){
//			for(int j=0; j <pic[i].length;j++){
//				if((int)(Math.random()*10)+1 == 10){
//					pic[i][j] = "v";
//				}
//			}
//		}
//		
//		pic[0][1] ="\\";
//		pic[2][3] ="\\";
//		pic[1][2] ="O";
//		pic[0][2] ="|";
//		pic[2][2] ="|";
//		pic[1][3] ="-";
//		pic[1][1] ="-";
//		pic[0][3] ="/";
//		pic[2][1] ="/";
//				
//		
//		for(int i =7; i<pic.length;i++){
//			for(int j=0; j <pic[i].length;j++){
//				pic[i][j] = "M";
//			}
//		}
//		
//		for(int i =0; i<pic.length;i++){
//			for(int j=0; j <pic[i].length;j+=pic[i].length-1){
//				pic[i][j] = "|";
//			}
//		}
//		
//		for(int i =0; i<pic.length;i+=pic.length-1){
//			for(int j=0; j <pic[i].length;j++){
//				pic[i][j] = "_";
//			}
//		}
//		
//		for(int i =0; i<pic.length;i++){
//			pic[i][0] ="|";
//			pic[i][pic[0].length-1]="|";
//		}
//		
//		printPic(pic);
//	}
//	
		boolean[][] mines=new boolean [20][20];
		createMines(mines,10);
		String[][] field=new String[mines.length][mines[0].length];
		matchValues(field, mines);
		printPic(field);
	}
	private static void startExploring() {
		while(true){
			pic[i][j]="x";
			printPic(pic);
			System.out.println("You are in room "+arr2D[i][j]);
			System.out.println("What do you want do do?");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter w, a , s or d.");
				input = in.nextLine();
			}
			interpretInput(input.toLowerCase());
		}
		
	}
	private static void interpretInput(String input) {
		pic[i][j]=" ";
		int iOrig=i;
		int jOrig=j;
		if(input.equals("w")&&i>0)i--;  //i=rows
		else if(input.equals("a")&&j>0)j--; //j=col
		else if(input.equals("s")&&i<arr2D.length)i++;
		else if(input.equals("d")&&j<arr2D[0].length)j++;
		if(iOrig==i&&jOrig==j){
			System.out.println("End of the universe.");
		}

	}
	private static boolean isValid(String in) {
		String input = in.toLowerCase();
		if(input.equals("w") || input.equals("a")|| input.equals("s") || input.equals("d")){
			return true;
		}
		return false;
	}
	private static void createMines(boolean[][] mines, int numberOfMines){
		while(numberOfMines>0){
			int row=(int)(Math.random()*mines.length);
			int col=(int)(Math.random()*mines[0].length);
			if(!mines[row][col]){
				mines[row][col]=true;
				numberOfMines--;
			}
		}
	}
	private static void matchValues(String[][] field, boolean[][] mines){
		for(int row=0;row<field.length;row++){
			for(int col=0;col<field[row].length;col++){
				if(mines[row][col])field[row][col]="X";
				else{
					field[row][col]=countAdjacent(mines,row,col);
				}
			}
		}
	}
	private static String countAdjacent(boolean[][] mines, int r,int c){
		int count=0;
//		for(int row=r-1;row<=r+1;row++){//top to bottom
//			for(int col=c-1;col<=c+1;col++){//left to right
//				if(row!=r&&col!=c){
//					if(row>=0 && row<mines.length && col>=0 && col<mines[row].length){
//						
//					}
//				}
//			}
//		}
//-----------------------------------------------------------------------------------------------------------------------
//		for(int row=0;row<mines.length;row++){ // the method above is faster because it doesn't check for everything
//			for(int col=0;col<mines[row].length;col++){ //it just checks the 8 values adjacent to the chosen coord
//				if(Math.abs(row-r)+Math.abs(col-c)==1&&mines[row][col]){
//					count++;
//				}
//			}
//		}
		//this one is helpful when you want to be super specific
		//above
		count+=ValidAndTrue(mines,r-1,c);
		//below
		count+=ValidAndTrue(mines,r+1,c);
		//right
		count+=ValidAndTrue(mines,r,c+1);
		//left
		count+=ValidAndTrue(mines,r,c-1);
		count+=ValidAndTrue(mines,r+1,c-1);
		count+=ValidAndTrue(mines,r-1,c-1);
		count+=ValidAndTrue(mines,r+1,c+1);
		count+=ValidAndTrue(mines,r-1,c+1);
		return count+"";
	}
	private static int ValidAndTrue(boolean[][] mines, int i, int j) {
		//checks if its valid and not out of bound
		if(i>=0 && i<mines.length && j>=0 && j<mines[0].length && mines[i][j]){
			return 1;
		}
		return 0;
	}
	public static void printPic(String[][] arr){
		for(int i =0; i<arr.length;i++){
			for(int j=0; j <arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
}
