package TaxCalculator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxOnSalary tax1=new TaxOnSalary();
		TaxOnSalary tax2=new TaxOnSalary(true);
		System.out.println("For One");
		tax1.inputSalary();
		System.out.println(tax1.calculateTax());
		System.out.println("\nFor Two");
		tax2.inputSalary();
		System.out.println(tax2.calculateTax());	
	}
}
