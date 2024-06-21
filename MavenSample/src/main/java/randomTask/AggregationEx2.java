package randomTask;

public class AggregationEx2 
{
	AggregationEx1 aggregationEx1;
	
	public AggregationEx2 (AggregationEx1 aggregationEx1)
	{
		this.aggregationEx1 =aggregationEx1;
	}
	
	public void Display2()
	{
	System.out.println("Content from AggregationEx2");	
	System.out.println("------Details------");
	aggregationEx1.Display();
	}
	public static void main(String[] args)
	{
		AggregationEx1 obAggregationEx1 = new AggregationEx1();
		AggregationEx2 objAggregationEx2 = new AggregationEx2(obAggregationEx1);
		objAggregationEx2.Display2();
	}

}
