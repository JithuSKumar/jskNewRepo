package inheritance;

import java.util.Scanner;

public class EmployeeDetails
{
	
	double basicPay;
    double deduction;
    double bonus;

    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Basic Pay: ");
        basicPay = scanner.nextDouble();
        System.out.print("Enter Deduction: ");
        deduction = scanner.nextDouble();
        System.out.print("Enter Bonus: ");
        bonus = scanner.nextDouble();
    }

}
