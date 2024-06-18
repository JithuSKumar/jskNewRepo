package superKeyword;

public class Division extends Addition
{
	 public void isDivisibleBy10(int a, int b)
	 {
	        int sum = super.add(a, b);
	        if (sum % 10 == 0) 
	        {
	            System.out.println("The sum " + sum + " is divisible by 10.");
	        }
	        else
	        {
	            System.out.println("The sum " + sum + " is not divisible by 10.");
	        }
	 }

	public static void main(String[] args) {
		Division objDivision = new Division();
		
		int num1 = 15; 
        int num2 = 25; 
        
        objDivision.isDivisibleBy10(num1, num2);
	}

}
