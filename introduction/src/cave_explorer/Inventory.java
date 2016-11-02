package cave_explorer;

public class Inventory {
	private boolean hasMap;
	private String map;
	
	public Inventory(){
		hasMap = true;
		updateMap();
	}
	
	private void updateMap() {
		// TODO Auto-generated method stub
		
	}


	public String getDescription() {
		// TODO Auto-generated method stub
		if(hasMap){
			return map;
		}
		else{
			return "There is nothing in your inventory";
		}
	}
	
	public void setMap(boolean b){
		hasMap = b;
	}
}
