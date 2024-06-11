package inheritance;


public class SingleInheritanceChild extends SingleInheritanceParent {
	
	public void difference()
	{
	int a = 5;
	int b= 2;
	int c= a-b;
	System.out.println("Difference of " + a + " and " + b + " is: " + c);
	}

	public static void main(String[] args) {
		SingleInheritanceChild objNameChild = new SingleInheritanceChild();
		objNameChild.difference();
		objNameChild.add();

	}

}
