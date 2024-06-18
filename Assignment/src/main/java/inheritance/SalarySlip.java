package inheritance;

public class SalarySlip extends SalaryCalculations

{
	
	double totalSalary;

    public void calculateTotalSalary() {
        calculateHraPf();
        totalSalary = basicPay + hra - pf - deduction + bonus;
    }

    public void displaySalarySlip() {
        System.out.println("\n----- Salary Slip -----");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Deduction: " + deduction);
        System.out.println("Bonus: " + bonus);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Total Salary: " + totalSalary);
    }

	public static void main(String[] args) 
	{
		SalarySlip employee = new SalarySlip();
        employee.getDetails();
        employee.calculateTotalSalary();
        employee.displaySalarySlip();

	}

}
