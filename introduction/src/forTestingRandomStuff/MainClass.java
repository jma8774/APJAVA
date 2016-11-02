package forTestingRandomStuff;

public class MainClass
{  
    public static void main(String args[])
    {
       /* System.out.println("Hello, World!");
        Emp[] employees = new Emp[10];
        for(int i=0; i<employees.length; i++){
            employees[i] = new Emp(i);//this will call constructor.
            System.out.println(employees[i].returnEno());
            employees[i].changeValue(1);
            System.out.println(employees[i].returnEno());
        }*/
    	
    	//now try it with 2d arrays
    	Emp[][] employees=new Emp[5][5];
    	for(int i=0;i<employees.length;i++){
    		for(int j=0;j<employees[i].length;j++){
    			employees[i][j]=new Emp(i,j);
    			System.out.print(employees[i][j].returnXY());
    		}
    		System.out.println("\n");
    	}
    	System.out.println(employees[0][0].x+","+employees[0][0].y);
    }
}

class Emp{
   /* int eno;
    public Emp(int no){
        eno = no;
    }
    public int returnEno(){
    	return eno;
    }
    public void changeValue(int incr){
    	eno+=incr;
    }*/
	int x;
	int y;
	public Emp(int xCoord, int yCoord){
		x=xCoord;
		y=yCoord;
	}
	public String returnXY(){
		return ("("+x+","+y+")");
	}
}
