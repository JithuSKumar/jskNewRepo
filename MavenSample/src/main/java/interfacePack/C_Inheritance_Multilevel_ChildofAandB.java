package interfacePack;

public class C_Inheritance_Multilevel_ChildofAandB implements C_Inheritance_MultiLevelParentA,C_Inheritance_MultilevelParentB {

	public static void main(String[] args) {
		
		C_Inheritance_Multilevel_ChildofAandB objChildofAandB = new C_Inheritance_Multilevel_ChildofAandB();
		objChildofAandB.parentA_Add();
		objChildofAandB.parentB_Sub();
		objChildofAandB.child_Division();

	}

	@Override
	public void parentB_Sub() {
		
		int a =9 ;
		int b =7;
		int c = a-b;
		System.out.println("\nContent of Parent B\nDifference: " +c);
		
	}

	@Override
	public void parentA_Add() {
		
		int a =9 ;
		int b =7;
		int c = a+b;
		System.out.println("Content of Parent A\nSum: " +c);
		
	}
	
	public void child_Division()
	{
		int a =9 ;
		int b =3;
		int c = a/b;
		System.out.println("\nContent of Child\nQuotient: " +c);
	}

}
