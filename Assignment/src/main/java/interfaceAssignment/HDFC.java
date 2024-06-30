package interfaceAssignment;

public class HDFC implements RBI
{
	// Implement the recurringDeposit method
    @Override
    public double recurringDeposit(double amount, int duration) {
        // Simple interest formula: A = P * (1 + rt)
        // Where A = final amount, P = initial principal balance, r = rate of interest per period, t = time
        double finalAmount = amount * (1 + (INTEREST_RATE / 100) * duration);
        return finalAmount;
    }
}
