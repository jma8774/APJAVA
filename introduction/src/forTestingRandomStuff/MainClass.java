package forTestingRandomStuff;

public class MainClass {
	private static ClassOne className;
	private static ClassOne classGrade;
	private static ClassOne numStudents;
	
	public static void main(String[] args) {
		System.out.println(ClassOne.className);
		System.out.println(ClassOne.classGrade);
		ClassOne.classGrade=ClassOne.changeValue(11);
		System.out.println(ClassOne.classGrade)
	}
		
}
