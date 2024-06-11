package inheritance;


public class MultiInheritanceChildofB extends MultiInheritanceParentB {
	
	public void displayofChildC() {
		System.out.println("Content from c");
		
	}
	public static void main(String[] args) {
		MultiInheritanceChildofB objNameB = new MultiInheritanceChildofB();
		objNameB.displayFromParentA();
		objNameB.displayFromParentB();
		objNameB.displayofChildC();
		
	}

}
