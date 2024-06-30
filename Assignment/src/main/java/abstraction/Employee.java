package abstraction;

public abstract class Employee {
    protected String name;
    protected double paymentPerHour;

    public Employee(String name, double paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    // Abstract method calculateSalary
    public abstract double calculateSalary();
}
