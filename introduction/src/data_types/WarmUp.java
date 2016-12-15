package data_types;

public class WarmUp {
	
	private static boolean[][] grid;
	
	public static void main(String[] args) {
		grid = new boolean[5][5];
		print(grid);
		buttonClick(3,3);
	}
	
	public static void switchRow(boolean[] row, int x) {
		if(x>=0 && x<row.length){
			for(int i=-1; i<2; i++){
				if(x+1 >= 0 && x+i < row.length){
					row[x+i] = !row[x+i];
				}
			}
		}
	}
	
	public static void switchCol(boolean[][] grid, int r, int c) {
		switchIfValid(grid, r-1, c);
		switchIfValid(grid, r+1, c);
	}
	
	public static void switchIfValid(boolean[][] grid, int r, int c) {
		if(r>=0 && r<grid.length && c>=0 && c<grid[r].length) {
			grid[r][c] = !grid[r][c];
		}
	}
	public static void buttonClick(int r, int c) {
		if(r >= 0 && r < grid.length){
			switchRow(grid[r], c);
		}
		switchCol(grid, r, c);
		boolean win = true;
		A: for(boolean[] row: grid){
			for(boolean b: row){
				if(b){
					win = false;
					break A;
				}
			}
		}
		if(win) System.out.println("You have solved the puzzle.");
	}

	public static void print(boolean[][] grid) {
		for(boolean[] row: grid){
			for(boolean b: row){
				if(b)System.out.print("O");
				else System.out.print("X");
			}
			System.out.println("");
		}
	}	
	
}
