package abstraction;

public class Main {
	public static void main(String[] args) {
        Employee contractor = new Contractor("John Doe", 50, 10); // 10 hours worked
        Employee fullTimeEmployee = new FullTimeEmployee("Jane Smith", 60); // 8 hours a day

        System.out.println("Contractor's Salary: " + contractor.calculateSalary());
        System.out.println("Full-Time Employee's Salary: " + fullTimeEmployee.calculateSalary());
    }

}
