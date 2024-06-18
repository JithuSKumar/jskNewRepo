package randomTask;

public class InheritanceMultiSecondClassDifference extends InheritanceMultiFirstClassSum{
	
	public void difference(int a, int b)
	{
		int c = a-b;
		System.out.println("\nContent from Second class First method\n Difference of" + a + " and " + b + " is " +c);
	}
	
	public void difference()
	{
		int a =6;
		int b=2;
		int c = b - a;
		System.out.println("\nContent from Second class second method\n Difference of" + b + " and " + a + " is " +c);
	}

}
