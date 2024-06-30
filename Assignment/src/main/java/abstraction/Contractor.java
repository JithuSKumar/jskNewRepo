package abstraction;

public class Contractor extends Employee {
    private int hoursWorked;

    public Contractor(String name, double paymentPerHour, int hoursWorked) {
        super(name, paymentPerHour);
        this.hoursWorked = hoursWorked;
    }

    // Implementation of calculateSalary for Contractor
    @Override
    public double calculateSalary() {
        return paymentPerHour * hoursWorked;
    }
}

