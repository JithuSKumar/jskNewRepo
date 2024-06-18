package randomTask;

public class InheritanceMultiThirdClassCallingClass extends InheritanceMultiSecondClassDifference {
	
	public void display() {
		System.out.println("Multi Level Inheritance");
		
	}

	public static void main(String[] args) {
		
		InheritanceMultiThirdClassCallingClass objCallingClass = new InheritanceMultiThirdClassCallingClass();
		objCallingClass.display();
		objCallingClass.add(3,4);
		objCallingClass.add();
		objCallingClass.difference(9, 5);
		objCallingClass.difference();

	}

}
