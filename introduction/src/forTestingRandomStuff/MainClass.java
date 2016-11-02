package forTestingRandomStuff;

public class MainClass
{  
    public static void main(String args[])
    {
        System.out.println("Hello, World!");
        //step1 : first create array of 10 elements that holds object addresses.
        Emp[] employees = new Emp[10];
        //step2 : now create objects in a loop.
        for(int i=0; i<employees.length; i++){
            employees[i] = new Emp(i);//this will call constructor.
            System.out.println(employees[i].returnEno());
            employees[i].changeValue(1);
            System.out.println(employees[i].returnEno());
        }
    }
}

class Emp{
    int eno;
    public Emp(int no){
        eno = no;
    }
    public int returnEno(){
    	return eno;
    }
    public void changeValue(int incr){
    	eno+=incr;
    }
}
