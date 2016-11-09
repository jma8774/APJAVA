package cave_explorer;

import java.util.Scanner;
import java.util.Arrays;

public class CaveExplorer {
	public static CaveRoom[][] caves;
	public static Scanner in;
	public static CaveRoom currentRoom;
	public static Inventory inventory;

	
	public static void main(String[] args){
		in = new Scanner(System.in);
		caves = new CaveRoom[5][5];
		for(int i = 0; i < caves.length; i++){
			for(int j = 0; j < caves[i].length; j++){
				caves[i][j] = new CaveRoom("This cave has coordinates "+i+", "+j);
			}
		}
		currentRoom = caves[0][1];
		currentRoom.enter();
		caves[0][1].setConnection(CaveRoom.EAST,caves[0][2],new Door());
		caves[0][2].setConnection(CaveRoom.SOUTH,caves[1][2],new Door());
		caves[1][2].setConnection(CaveRoom.SOUTH,caves[2][2],new Door());
		inventory = new Inventory();
		startExploring();
	}


	private static void startExploring() {
		
		while(true){
			System.out.println(inventory.getDescription());
			System.out.println(currentRoom.getDescription());
			System.out.println("What would you like to do?");
			String input = in.nextLine();
			currentRoom.interpretInput(input);
		}
	}
	
}
