/**
 * 
 */
package intro_unit;

/**
 * @author Student 6
 * This class is used to contrast with ProceduralExample. It embodies the Object-Oriented approach.
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student jillian = new Senior("Jillian","Google");
		Student jordan = new Freshman("Jordan");
		Student jason = new Junior("Jason");
		((Student)jillian).talk();
		jordan.talk();
		jason.talk();
	}

}
