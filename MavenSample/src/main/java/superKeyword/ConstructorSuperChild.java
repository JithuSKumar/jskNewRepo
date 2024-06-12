package superKeyword;

public class ConstructorSuperChild extends ConstructorSuperParent{
	
	public ConstructorSuperChild()
	{
		super(3,4);
		System.out.println("Hello");
		
	}

	public static void main(String[] args) {
		
		ConstructorSuperChild objChild = new ConstructorSuperChild();
	
	}

}
