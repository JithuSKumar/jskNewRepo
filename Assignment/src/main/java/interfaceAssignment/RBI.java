package interfaceAssignment;

public interface RBI 
{
	// Interest rate defined as a constant
    double INTEREST_RATE = 5.0; // 5% annual interest rate

    // Method to calculate the recurring deposit
    double recurringDeposit(double amount, int duration);
}
