package exceptionsPack;

public class TryCatchFinallyBlock {

	public static void main(String[] args) 
	{

		try 
		{
			int a= 10;
			int b=0;
			int c =a/b;//will throw arithmetic exception
			System.out.println("Quotient: " + c);
		}
		catch(ArithmeticException aBlock) //ArithmeticException is the Exception class
		{
			System.out.println("Arithmetic Exception thrown" + aBlock);
		}

		finally
		{
			int a =2;
			int b =8;
			int d = a + b;
			System.out.println("Value of d: "+ d);
		}
	}

}
