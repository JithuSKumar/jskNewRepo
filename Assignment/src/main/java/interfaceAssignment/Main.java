package interfaceAssignment;

public class Main
{

	public static void main(String[] args) {
        // Create an instance of HDFC
        HDFC hdfcBank = new HDFC();

        // Example deposit amount and duration
        double depositAmount = 10000; // Rs 10,000
        int duration = 2; // 2 years

        // Calculate the amount after the deposit period
        double finalAmount = hdfcBank.recurringDeposit(depositAmount, duration);

        // Print the result
        System.out.println("Final amount after " + duration + " years: Rs " + finalAmount);
    }

}
