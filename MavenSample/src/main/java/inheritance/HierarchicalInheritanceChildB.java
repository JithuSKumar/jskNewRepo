package inheritance;

public class HierarchicalInheritanceChildB extends HierarchicalIneheritanceParentA{
	
	public void displayFromB() {
		System.out.println("Property of child B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalInheritanceChildB objNameB = new HierarchicalInheritanceChildB();
		objNameB.displayFromParentA();
		objNameB.displayFromB();
		

	}

}
