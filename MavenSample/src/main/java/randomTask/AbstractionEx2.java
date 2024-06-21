package randomTask;

public class AbstractionEx2 extends AbstarctionEx1
{

	public static void main(String[] args)
	{
		AbstractionEx2 objAbstractionEx2 = new AbstractionEx2();
		objAbstractionEx2.display();
		objAbstractionEx2.details();
		objAbstractionEx2.details(3);
	}

	@Override
	public void details() {
		 
		System.out.println("Content of abstarct method");
		
	}
	
	public void details(int a)
	{
		System.out.println("Content from non abstract method of"
				+ " child class " +a);
}

}
