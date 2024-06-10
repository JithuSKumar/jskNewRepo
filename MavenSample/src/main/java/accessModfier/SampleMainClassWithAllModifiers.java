package accessModfier;

public class SampleMainClassWithAllModifiers {
	
	public void Display1() {
		System.out.println("Public Access Modifier");
	}
	
	private void Display2() {
		System.out.println("Private Access Modifier");
	}
	
	void Display3()
	{
		System.out.println("Default Access Modifer");
	}
	
	protected void Display4()
	{
		System.out.println("Protected Access Modifer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleMainClassWithAllModifiers objName = new SampleMainClassWithAllModifiers();
		objName.Display1();
		objName.Display2();
		objName.Display3();
		objName.Display4();
		System.out.println("Completed");
	}

}
