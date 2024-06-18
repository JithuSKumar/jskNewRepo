package inheritance;

public class SalaryCalculations extends EmployeeDetails
{
	double hra;
    double pf;

    public void calculateHraPf() {
        hra = basicPay * 0.05; // HRA is 5% of basic pay
        pf = basicPay * 0.20; // PF is 20% of basic pay
    }

}
