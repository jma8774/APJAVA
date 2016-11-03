package cave_explorer;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {		
//		String[][] arr2D=new String [4][3]; //rows=arr2d.length columns=arr2d[0].length
//		for(int row=0;row<arr2D.length;row++){
//			for(int column=0;column<arr2D[row].length;column++){
//				arr2D[row][column]=("("+row+","+column+")");
//			}
//		}
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
		boolean[][] mines=new boolean [6][6];
		createMines(mines,10);
		String[][] field=new String[mines.length][mines[0].length];
		matchValues(field, mines);
		printPic(field);
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
		for(int row=r-1;row<=r+1;row++){//top to bottom
			for(int col=c-1;col<=c+1;col++){//left to right
				if(row!=r&&col!=c){
					if(row>=0 && row<mines.length)
				}
			}
		}
		return null;
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
