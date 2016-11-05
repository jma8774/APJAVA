package cave_explorer;

public class CreateMap {

	public static void main(String[] args) {
		createMap(5,5);
	}
	
	public static void createMap(int row, int col){
		createTopCol(col);
		for(int r=0;r<row;r++){
			createRow(col);
		}
	}
	
	public static void createTopCol(int col){
		for(int i=0;i<col;i++){
			System.out.print(" ___");
		}
		System.out.println("");
	}
	
	public static void createRow(int col){
		for(int i=0; i<3; i++){
			for(int c=0; c<=col;c++){
				if(i==2 && c!=col){
					System.out.print("|___");
				}
				else if(i==2 && c==col){
					System.out.print("|");
				}
				else System.out.print("|   ");
			}
			System.out.println("");
		}
	}
}
