package randomTask;

public class CustomExceptionMainClass
{

	public void checkAge(int age) throws InvalidAgeException 
	{
		if (age < 18) 
		{
			throw new InvalidAgeException("Age must be 18 or above to be eligible.");
		} 
		else
		{
			System.out.println("Age is valid.");
		}
	}

	public static void main(String[] args) throws InvalidAgeException
	{
		CustomExceptionMainClass example = new CustomExceptionMainClass();
		int age = 13; // Test with an invalid age

		example.checkAge(12);


	}

}
