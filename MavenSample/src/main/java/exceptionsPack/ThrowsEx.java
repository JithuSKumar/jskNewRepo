package exceptionsPack;

public class ThrowsEx {
	
	public void AgeCheck(int age) throws LicenceException
	{
		if (age > 18) 
		{
			System.out.println("Eligible for Liciense");
		}
		
		else
		{
			throw new LicenceException("Not Eligible");
		}
	}

	public static void main(String[] args) throws LicenceException
	{
		ThrowsEx objEx = new ThrowsEx();
		objEx.AgeCheck(8);
	}

}
