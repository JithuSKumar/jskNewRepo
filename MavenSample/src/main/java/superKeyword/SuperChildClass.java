package superKeyword;

public class SuperChildClass extends SuperParentClass {
	
	String wordString = "ball";
	
	public void displayofChildClass()
	{
		System.out.println("Printing the string from child class: " + wordString);
		System.out.println("String from Parent " + super.wordString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildClass objNameChildClass = new SuperChildClass();
		objNameChildClass.displayofChildClass();

	}

}
