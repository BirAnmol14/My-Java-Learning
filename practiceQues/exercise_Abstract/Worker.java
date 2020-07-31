package exercise_Abstract;

public abstract class Worker {
	private String name;
	private double salary_rate;
	public Worker(String name,double salary_rate) {
		this.name=name;
		this.salary_rate=salary_rate;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary_rate;
	}
	public abstract double computePay() ;
}
