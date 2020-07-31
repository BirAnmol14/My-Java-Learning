package exercise_Abstract;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1=new FullTimeWorker("ABC",100,200);
		System.out.println("Salary: "+w1.computePay());
		Worker w2=new HourlyWorker("BAC",50,200);
		System.out.println("Salary: "+w2.computePay());
	}

}
