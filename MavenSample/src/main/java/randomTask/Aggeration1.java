package randomTask;



public class Aggeration1 {
	
	int a;
	int b;
	int c = a+b;
	
	public Aggeration1()
	{
		int a = 4;
		int b = 4;
		int c = a+b;
		this.a =a;
		this.b =b;
		this.c =c;
			
	}
	
	public void DisplayMode()
	{
		System.out.println("from class 1\nsum: " + c);
	}

}
