package cave_explorer;

public class CreateMap {

	public static void main(String[] args) {
		createMap(5,5);
	}
	
	public static void createMap(int row, int col){
		createCol(col);
		for(int r=0;r<row;r++){
			createRow(col);
			createCol(col);
		}
	}
	
	public static void createCol(int col){
		System.out.print(" ");
		while(col>0){
			System.out.print("____");
			col--;
		}
		System.out.println("");
	}
	
	public static void createRow(int col){
		for(int i=0; i<3; i++){
			for(int c=0; c<=col;c++){
				System.out.print("|   ");
			}
			System.out.println("");
		}
	}
}
