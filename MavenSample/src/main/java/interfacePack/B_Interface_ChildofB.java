package interfacePack;

public class B_Interface_ChildofB implements B_Interface_parentB{

	public static void main(String[] args) {
		B_Interface_ChildofB objB = new B_Interface_ChildofB();
		objB.display();
		objB.add();
		objB.sub();
	}

	@Override
	public void add() {
		int a =9 ;
		int b =7;
		int c = a+b;
		System.out.println("\nContent of Parent A\nSum: " +c);
		
	}

	@Override
	public void sub() {
		int a =9 ;
		int b =7;
		int c = a-b;
		System.out.println("\nContent of Parent B\nDifference: " +c);
		
	}
	
	public void display() {
		System.out.println("Execution Class Child C");
		
	}

}
