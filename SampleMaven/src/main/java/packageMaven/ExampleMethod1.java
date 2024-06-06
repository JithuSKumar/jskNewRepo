package packageMaven;

import java.awt.SecondaryLoop;

public class ExampleMethod1 {
	
	public static void add(int a, int b)
	{
		int c = a+b;
		System.out.println("first method sum is:  " +c);
	}
	
	public void add()
	{
		int a =6;
		int b =7;
		int c = a+b;
		System.out.println("second method sum is: "+c);
	}

	public static void main(String[] args) {
		add(23, 56);
		ExampleMethod1 objName = new ExampleMethod1();
		objName.add();
	

	}

}
