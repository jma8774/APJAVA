/**
 * 
 */
package intro_unit;

/**
 * @author Student 6
 *
 */
public class Student {

	//fields
	private String name;
	
	//constructor (no return types, it creates students)
	public Student(String name){
		//initialize fields
		this.name=name;
	}
	public void talk(){
		System.out.println("Hi, my name is "+this.name+".");
	}
}
