package cave_explorer;

import java.util.Scanner;
import java.util.Arrays;

public class CaveExplorer {
	public static Scanner in;
	public static CaveRoom caves[][];
	public static CaveRoom currentRoom;
	public static Inventory inventory;
	
	public static void main(String[]args){
		caves=new CaveRoom [5][5];
		for(int row=0;row<caves.length;row++){
			for(int column=0;column<caves[row].length;column++){
				caves[row][column]=new CaveRoom("This cave has coordinates"+row+","+column);
			}
		}
		currentRoom=caves[0][1];
		currentRoom.enter();
		caves[0][1].setConnection(caves[0][2]);
	}
}
