package abstarction;

public class AbstractChildClass extends AbstractClass {

	public static void main(String[] args) {
		
		AbstractChildClass objAbstractChildClass = new AbstractChildClass();
		objAbstractChildClass.details();
		objAbstractChildClass.display();
		objAbstractChildClass.details(5);
		
		
	}

	@Override
	public void details() {
		 
		System.out.println("Content of abstarct method");
		
	}
	
	public void details(int a)
	{
		System.out.println(a);
	}

}
