package abstraction;

public class FullTimeEmployee extends Employee {
    private static final int WORKING_HOURS_PER_DAY = 8;

    public FullTimeEmployee(String name, double paymentPerHour) {
        super(name, paymentPerHour);
    }

    // Implementation of calculateSalary for FullTimeEmployee
    @Override
    public double calculateSalary() {
        return paymentPerHour * WORKING_HOURS_PER_DAY;
    }
}