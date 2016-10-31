package cave_explorer;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {		
		String[][] arr2D=new String [4][3]; //rows=arr2d.length columns=arr2d[0].length
		for(int row=0;row<arr2D.length;row++){
			for(int column=0;column<arr2D[row].length;column++){
				arr2D[row][column]=("("+row+","+column+")");
			}
		}
		for(String[] row:arr2D){
			System.out.println(Arrays.toString(row));
		}
	}
	
	
}
