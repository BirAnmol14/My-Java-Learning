package exercise_Abstract;

public class FullTimeWorker extends Worker{
	private int hours_worked;
	public FullTimeWorker(String name, double salary_rate,int hours_worked) {
		super(name, 100);
		if(hours_worked<240) {
		this.hours_worked=hours_worked;}
		else {
			this.hours_worked=240;
		}
	}
	@Override
	public double computePay() {
		return getSalary()*hours_worked;
	}
	
}
