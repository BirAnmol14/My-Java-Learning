package TaxCalculator;

import java.util.Scanner;

public class TaxOnSalary {
	private double salary;
	private boolean isPANsubmitted;
	public TaxOnSalary() {
		this.salary=0.0;
		this.isPANsubmitted=false;
	}
	public TaxOnSalary(boolean isPANsubmitted) {
		this.isPANsubmitted=isPANsubmitted;
		this.salary=1000.00;
	}
	public double getSalary() {
		return salary;
	}
	public boolean getIsPANsubmitted() {
		return isPANsubmitted;
	}
	public void inputSalary() {
		Scanner s=new Scanner(System.in);
		salary=s.nextDouble();
	}
	public double calculateTax() {
		if(salary<180000&&(isPANsubmitted==true)) {
			return 0.0;
		}
		if(salary<180000&&(isPANsubmitted==false)) {
			return 0.05*salary;
		}
		if(salary>180000&&salary<500000) {
			return 0.1*salary;
		}
		if(salary>500000&&salary<1000000) {
			return 0.2*salary;
		}
		if(salary>1000000) {
			return 0.3*salary;
		}
		return -1.0;
	}
}
