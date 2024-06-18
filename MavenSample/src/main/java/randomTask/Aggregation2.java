package randomTask;

public class Aggregation2 {
	
	String nameString;
	
	Aggeration1 aggeration1;
	
	public Aggregation2(Aggeration1 aggeration1)
	{
		this.aggeration1 =aggeration1;
	}
	
	public void display()
	{
		System.out.println("Content from 2nd class\n");
		aggeration1.DisplayMode();
		
	}

	public static void main(String[] args) {
		Aggeration1 objAggeration1 = new Aggeration1();
		Aggregation2 objAggregation2 = new Aggregation2(objAggeration1);
		objAggregation2.display();
	}

}
