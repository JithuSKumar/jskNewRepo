package randomTask;


public class AbstarctSecondClass extends AbstarctFirstClass {

public static void main(String[] args) {
		
	AbstarctSecondClass objAbstractChildClass = new AbstarctSecondClass();
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
		System.out.println("Content from non abstract method of"
				+ " child class " +a);
}
}
