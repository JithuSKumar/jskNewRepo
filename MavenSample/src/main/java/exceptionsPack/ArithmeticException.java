package exceptionsPack;

public class ArithmeticException {

	public static void main(String[] args) {
		int a= 10;
		int b=0;
		int c =a/b;//will throw arithmetic exception
		
		System.out.println("Quotient: " + c);
	}

}
