package runTimePolymorphism;

public class ChildWithSameMethod extends ParentWithSameMethod {
	
	public void display ()
	{
		super.display();
		System.out.println("Welcome Statement");
		
	}
	
	public void add(int c)
	{
		super.add(3);
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		
		ChildWithSameMethod objChild = new ChildWithSameMethod();
		objChild.display();
		objChild.add(7);
	}

}
