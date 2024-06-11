package inheritance;

public class HierarchicalInheritanceChildC extends HierarchicalIneheritanceParentA {
	
	public void displayFromC()
	{
		System.out.println("Properties of child c");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalInheritanceChildC objC = new HierarchicalInheritanceChildC();
		objC.displayFromC();
		objC.displayFromParentA();

	}

}
