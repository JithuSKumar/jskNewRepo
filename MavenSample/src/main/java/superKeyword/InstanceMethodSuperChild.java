package superKeyword;

public class InstanceMethodSuperChild extends InstanceMethodSuperParent {
	
	public void difference()
	{
		int a=9;
		int b=3;
		int c= a-b;
		System.out.println("difference of "+ a + " and "+ b+ " is " +c);
		super.add();
	}

	public static void main(String[] args) {
		
		InstanceMethodSuperChild objChild = new InstanceMethodSuperChild();
		objChild.difference();
	}

}
