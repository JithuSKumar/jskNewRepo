package superKeyword;

public class InstanceVariableSuperChildClass extends InstanceVariableSuperParentClass {
	
	String wordString = "ball";
	
	public void displayofChildClass()
	{
		System.out.println("Printing the string from child class: " + wordString);
		System.out.println("String from Parent " + super.wordString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableSuperChildClass objNameChildClass = new InstanceVariableSuperChildClass();
		objNameChildClass.displayofChildClass();

	}

}
