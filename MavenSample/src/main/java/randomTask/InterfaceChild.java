package randomTask;

public class InterfaceChild implements InterfaceParentB{

	public static void main(String[] args)
	{
		InterfaceChild objChild = new InterfaceChild();
		objChild.sub();
		objChild.add();
	}

	@Override
	public void add()
	{
		int a= 7;
		int b= 8;
		int c= a+b;
		System.out.println("Sum: " +c);
	}

	@Override
	public void sub()
	{
		int a =9;
		int b =3;
		int c= a-b;
		System.out.println("Difference: " +c);
	}

}
